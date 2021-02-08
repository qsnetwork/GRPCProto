from flask import Flask, request, make_response, jsonify
import flask.json
from flask_cors import CORS
from pprint import pprint
import decimal
import json
import re
import random
import time 
import pymongo
from config import *

from functools import wraps
from gevent import monkey
from gevent.pywsgi import WSGIServer

import grpc

import AccountRpc_pb2
import AccountRpc_pb2_grpc
import BlockRpc_pb2
import BlockRpc_pb2_grpc
import TransactionRpc_pb2
import TransactionRpc_pb2_grpc
from qsn.entity.request import AccountRequests_pb2, BlockRequests_pb2, TransactionRequests_pb2
from qsn.entity.common import BaseRequest_pb2
from qsn.entity.customized import BlockRewardTxDataDto_pb2
from google.protobuf.any_pb2 import Any


class MyJSONEncoder(flask.json.JSONEncoder):

    def default(self, obj):
        if isinstance(obj, decimal.Decimal):
            # Convert decimal instances to strings.
            return str(obj)
        return super(MyJSONEncoder, self).default(obj)

monkey.patch_all()

app = Flask(__name__)
app.debug = True
app.json_encoder = MyJSONEncoder
CORS(app, resources=r'/*')


@app.route("/getAccount")
def getAccount():
    account = request.args.get("account", "")
    if not account:
        return make_response(jsonify({"msg": "no account!", "code":400}))
    if len(account) != 40:
        return make_response(jsonify({"msg": "param error!", "code":1003}))

    address = bytes.fromhex(account)
    channel = grpc.insecure_channel(node_address)
    stub1 = AccountRpc_pb2_grpc.AccountRpcStub(channel)
    # response = stub.getAccount(AccountRequests_pb2.GetAccountRequest(address=bytes.fromhex("deadbeef")))
    # response = stub.getAccount(AccountRequests_pb2.GetAccountRequest(baseRequest=BaseRequest_pb2.BaseRequest(version="1"), address=bytes.fromhex("70e85308ef0502397cac5632bd7307c1dc391c49")))
    try:
        response = stub1.getAccount(AccountRequests_pb2.GetAccountRequest(baseRequest=BaseRequest_pb2.BaseRequest(version="1"), address=address))
    except:
        return make_response(jsonify({"msg": "the account address error!", "code":1004}))

    nonce = int.from_bytes(response.account.nonce.value, byteorder="big")
    print("nonce", nonce)
    balance = int.from_bytes(response.account.balance.value, byteorder="big")
    print("balance", balance)

    data = {"nonce": nonce, "balance": balance}

    return make_response(jsonify({"msg": "select successful!", "code": 200, "data": data}))


@app.route("/getBlock")
def getBlock():
    height = request.args.get("height", "")
    block_hash = request.args.get("hash", "")
    
    channel = grpc.insecure_channel(node_address)
    stub2 = BlockRpc_pb2_grpc.BlockRpcStub(channel)

    if height:
        try:
            response2 = stub2.getBlockByHeight(BlockRequests_pb2.GetBlockByHeightRequest(baseRequest=BaseRequest_pb2.BaseRequest(version="1"),height=int(height)))
        except:
            return make_response(jsonify({"msg": "the block height error!", "code":1005}))
    elif block_hash:
        try:
            response2 = stub2.getBlockByHash(BlockRequests_pb2.GetBlockByHashRequest(baseRequest=BaseRequest_pb2.BaseRequest(version="1"),hash=bytes.fromhex(block_hash)))
        except:
            return make_response(jsonify({"msg": "the block hash error!", "code":1006}))

    else:
        return make_response(jsonify({"msg": "no block heght or block hash!", "code": 1001}))
    
    resp_block = response2.block
    resp_block_header = resp_block.header
    resp_block_data = resp_block.data
    resp_block_lastcommit = resp_block.lastCommit

    block_address = resp_block_header.blockAddress.hex()
    chain_id = resp_block_header.chainId
    height = resp_block_header.height
    timestamp = resp_block_header.time
    time_format = time.strftime("%Y-%m-%dT%H:%M:%S", time.gmtime(timestamp/1000))
    num_txs = resp_block_header.numTxs
    total_txs = resp_block_header.totalTxs
    proposer_sequence_number = resp_block_header.proposerSequenceNumber
    last_block_hash = resp_block_header.lastBlockhash.hex()
    last_commit_hash = resp_block_header.lastCommitHash.hex()
    validators_hash = resp_block_header.validatorsHash.hex()
    next_validators_hash = resp_block_header.nextValidatorsHash.hex()
    account_hash = resp_block_header.accountHash.hex()
    contract_hash = resp_block_header.contractHash.hex()
    storage_hash = resp_block_header.storageHash.hex()
    transaction_hash = resp_block_header.transactionHash.hex()
    transaction_receipt_hash = resp_block_header.transactionReceiptHash.hex()
    block_reward_hash = resp_block_header.blockRewardHash.hex()

    header = {
        "blockAddress": block_address,
        "chainId": chain_id,
        "height": height,
        "time": time_format,
        "numTxs": num_txs,
        "totalTxs": total_txs,
        "proposerSequenceNumber": proposer_sequence_number,
        "lastBlockhash": last_block_hash,
        "lastCommitHash": last_commit_hash,
        "validatorsHash": validators_hash,
        "nextValidatorsHash": next_validators_hash,
        "accountHash": account_hash,
        "contractHash": contract_hash,
        "storageHash": storage_hash,
        "transactionHash": transaction_hash,
        "transactionReceiptHash": transaction_receipt_hash,
        "blockRewardHash": block_reward_hash
    }

    # pprint(header)

    transactions = resp_block_data.transactions
    trx_list = []
    for i in range(len(transactions)):
        tx_type = transactions[i].txType
        
        tx_d = transactions[i].txData
        sender = tx_d.sender.hex()
        nonce = tx_d.nonce
        nonce_value = int.from_bytes(nonce.value, byteorder="big")
        data = tx_d.data
        type_url = data.type_url
        data_value =data.value.hex()
        non = {
            "value": nonce_value
        }
        # d = {
        #     "type_url": type_url,
        #     "value": data_value
        # }
        any_data = Any()
        any_data.CopyFrom(data)
        unpacked_data = BlockRewardTxDataDto_pb2.BlockRewardTxDataDto()
        any_data.Unpack(unpacked_data)
        # print("unpack", unpacked_data)
        block_reward = unpacked_data.blockReward
        # print("reward", unpacked_data.blockReward.blockHeight)
        b_height = block_reward.blockHeight
        mature_height = block_reward.matureHeight
        block_reward_data_list = block_reward.blockRewardDataList
        reward_list = []
        for j in block_reward_data_list:
            coin_base = j.coinBase.hex()
            reward = j.reward
            reward_value = int.from_bytes(reward.value, byteorder="big")
            # print("coin", coin_base, "value", reward_value, type(reward_value))
            reward_list.append({"coinBase": coin_base, "reward": {"value": reward_value}})

        unpack_data = {
            "blockHeight": b_height,
            "matureHeight": mature_height,
            "blockRewardDataList": reward_list
        }

        tx_data = {
            "sender": sender,
            "nonce": non,
            "data": {
                "blockReward": unpack_data
            }
        }

        fee = transactions[i].fee
        max_charge = fee.maxCharge
        value = int.from_bytes(max_charge.value, byteorder="big")
        fee_data = {
            "maxCharge": {
                "value": value
            }
        }

        signatures = transactions[i].signatures
        sign_list = []
        for k in range(len(signatures)):
            pub_key = signatures[k].pubKey.hex()
            singed = signatures[k].signed.hex()
            signatures_data = {
                "pubKey": pub_key,
                "signed": singed
            }
            sign_list.append(signatures_data)

        tx_hash = transactions[i].hash.hex()

        transactions_data = {
            "txType": tx_type,
            "txData": tx_data,
            "fee": fee_data,
            "signatures": sign_list,
            "hash": tx_hash
        }

        trx_list.append(transactions_data)

    data = {
        "transactions": trx_list
    }

    block_hash = resp_block_lastcommit.blockHash.hex()

    last_commit = {
        "height": resp_block_lastcommit.height,
        "blockHash": block_hash
    }


    block = {
        "header": header,
        "data": data,
        "lastCommit": last_commit
    }



    return make_response(jsonify({"msg": "select successful!", "block_data": block, "code": 200}))


@app.route("/getTransaction")
def getTransaction():
    tx_hash = request.args.get("hash", "")
    if not tx_hash:
        return make_response(jsonify({"msg": "no transaction hash!", "code":400}))
    transaction_hash = bytes.fromhex(tx_hash)

    channel = grpc.insecure_channel(node_address)
    stub3 = TransactionRpc_pb2_grpc.TransactionRpcStub(channel)
    # response = stub.getAccount(AccountRequests_pb2.GetAccountRequest(address=bytes.fromhex("deadbeef")))
    # response = stub.getAccount(AccountRequests_pb2.GetAccountRequest(baseRequest=BaseRequest_pb2.BaseRequest(version="1"), address=bytes.fromhex("70e85308ef0502397cac5632bd7307c1dc391c49")))
    response = stub3.getTransaction(TransactionRequests_pb2.GetTransactionRequest(baseRequest=BaseRequest_pb2.BaseRequest(version="1"),transactionHash=transaction_hash))
    transaction = response.transaction
    # for i in range(len(transactions)):
    tx_type = transaction.txType
    
    tx_d = transaction.txData
    sender = tx_d.sender.hex()
    nonce = tx_d.nonce
    nonce_value = int.from_bytes(nonce.value, byteorder="big")
    data = tx_d.data
    type_url = data.type_url
    data_value =data.value.hex()
    non = {
        "value": nonce_value
    }
    # d = {
    #     "type_url": type_url,
    #     "value": data_value
    # }
    any_data = Any()
    any_data.CopyFrom(data)
    unpacked_data = BlockRewardTxDataDto_pb2.BlockRewardTxDataDto()
    any_data.Unpack(unpacked_data)
    # print("unpack", unpacked_data)
    block_reward = unpacked_data.blockReward
    # print("reward", unpacked_data.blockReward.blockHeight)
    b_height = block_reward.blockHeight
    mature_height = block_reward.matureHeight
    block_reward_data_list = block_reward.blockRewardDataList
    reward_list = []
    for j in block_reward_data_list:
        coin_base = j.coinBase.hex()
        reward = j.reward
        reward_value = int.from_bytes(reward.value, byteorder="big")
        # print("coin", coin_base, "value", reward_value, type(reward_value))
        reward_list.append({"coinBase": coin_base, "reward": {"value": reward_value}})

    unpack_data = {
        "blockHeight": b_height,
        "matureHeight": mature_height,
        "blockRewardDataList": reward_list
    }

    tx_data = {
        "sender": sender,
        "nonce": non,
        "data": {
            "blockReward": unpack_data
        }
    }

    fee = transaction.fee
    max_charge = fee.maxCharge
    value = int.from_bytes(max_charge.value, byteorder="big")
    fee_data = {
        "maxCharge": {
            "value": value
        }
    }

    signatures = transaction.signatures
    sign_list = []
    for k in range(len(signatures)):
        pub_key = signatures[k].pubKey.hex()
        singed = signatures[k].signed.hex()
        signatures_data = {
            "pubKey": pub_key,
            "signed": singed
        }
        sign_list.append(signatures_data)

    tx_hash = transaction.hash.hex()

    transaction_data = {
        "txType": tx_type,
        "txData": tx_data,
        "fee": fee_data,
        "signatures": sign_list,
        "hash": tx_hash
    }


    data = {
        "transaction": transaction_data
    }


    return make_response(jsonify({"msg": "select successful!", "code": 200, "data": data}))


@app.route("/getRecentBlock")
def getRecentBlock():
    page = int(request.args.get("page", 1))
    per_page_record = int(request.args.get("limit", 20))
    start = (page-1) * per_page_record
    data_list = []
    # redis_db3 = redis.Redis(**redis_db_params3)
    mongo_client = pymongo.MongoClient(**mongodb_params)
    mongo_db = mongo_client[mongodb_name]

    mongo_data = mongo_db.get_collection("block").find({},{"_id":0}).sort("block_height", -1).limit(per_page_record).skip(start)
    total = mongo_db.get_collection("block").count()

    for each_data in mongo_data:
        data_list.append(each_data)


    return make_response(jsonify({"msg": "select successful!", "code": 200, "data": data_list, "total": total}))


@app.route("/getRecentTx")
def getRecentTx():
    operation = request.args.get("operation", "")
    page = int(request.args.get("page", 1))
    per_page_record = int(request.args.get("limit", 20))
    start = (page-1) * per_page_record
    data_list = []
    # redis_db3 = redis.Redis(**redis_db_params3)
    mongo_client = pymongo.MongoClient(**mongodb_params)
    mongo_db = mongo_client[mongodb_name]
    if not operation:
        mongo_data = mongo_db.get_collection("transaction").find({},{"_id":0}).sort("block_height", -1).limit(per_page_record).skip(start)
        total = mongo_db.get_collection("transaction").count()
    else:
        mongo_data = mongo_db.get_collection("transaction").find({"tx_type": int(operation)},{"_id":0}).sort("block_height", -1).limit(per_page_record).skip(start)
        total = mongo_db.get_collection("transaction").find({"tx_type": int(operation)},{"_id":0}).count()

    for each_data in mongo_data:
        data_list.append(each_data)


    return make_response(jsonify({"msg": "select successful!", "code": 200, "data": data_list, "total": total}))


@app.route("/getAccountHistory")
def getAccountHistory():
    operation = request.args.get("operation", "")
    account = request.args.get("account", "")
    if not account:
        return make_response(jsonify({"msg": "no account address!", "code":400}))
    if len(account) != 40:
        return make_response(jsonify({"msg": "param error!", "code":1007}))
    page = int(request.args.get("page", 1))
    per_page_record = int(request.args.get("limit", 20))
    start = (page-1) * per_page_record
    data_list = []
    # redis_db3 = redis.Redis(**redis_db_params3)
    mongo_client = pymongo.MongoClient(**mongodb_params)
    mongo_db = mongo_client[mongodb_name]
    if not operation:
        mongo_data = mongo_db.get_collection("history").find({"account": account},{"_id": 0, "tx_info._id": 0}).sort("block_height", -1).limit(per_page_record).skip(start)
        total = mongo_db.get_collection("history").find({"account": account}).count()
    else:
        mongo_data = mongo_db.get_collection("history").find({"account": account, "tx_type": int(operation)},{"_id": 0, "tx_info._id": 0}).sort("block_height", -1).limit(per_page_record).skip(start)
        total = mongo_db.get_collection("history").find({"account": account, "tx_type": int(operation)}).count()

    for each_data in mongo_data:
        data_list.append(each_data)


    return make_response(jsonify({"msg": "select successful!", "code": 200, "data": data_list, "total": total}))


@app.route("/getAccountHistory2")
def getAccountHistory2():
    operation = request.args.get("operation", "")
    account = request.args.get("account", "")
    if not account:
        return make_response(jsonify({"msg": "no account address!", "code":400}))
    if len(account) != 40:
        return make_response(jsonify({"msg": "param error!", "code":1007}))
    page = int(request.args.get("page", 1))
    per_page_record = int(request.args.get("limit", 20))
    start = (page-1) * per_page_record
    data_list = []
    # redis_db3 = redis.Redis(**redis_db_params3)
    mongo_client = pymongo.MongoClient(**mongodb_params)
    mongo_db = mongo_client["qsn_test1"]
    if not operation:
        mongo_data = mongo_db.get_collection("history").find({"account": account},{"_id": 0, "tx_info._id": 0}).sort("block_height", -1).limit(per_page_record).skip(start)
        total = mongo_db.get_collection("history").find({"account": account}).count()
    else:
        mongo_data = mongo_db.get_collection("history").find({"account": account, "tx_type": int(operation)},{"_id": 0, "tx_info._id": 0}).sort("block_height", -1).limit(per_page_record).skip(start)
        total = mongo_db.get_collection("history").find({"account": account, "tx_type": int(operation)}).count()

    for each_data in mongo_data:
        data_list.append(each_data)


    return make_response(jsonify({"msg": "select successful!", "code": 200, "data": data_list, "total": total}))


@app.route("/queryBlock")
def queryBlock():
    height = request.args.get("height", "")
    block_hash = request.args.get("hash", "")

    mongo_client = pymongo.MongoClient(**mongodb_params)
    mongo_db = mongo_client[mongodb_name]

    if height:
        mongo_data = mongo_db.get_collection("block").find({"block_height": int(height)},{"_id":0})
    elif block_hash:
        mongo_data = mongo_db.get_collection("block").find({"block_hash": block_hash},{"_id":0})
    else:
        return make_response(jsonify({"msg": "no block heght or block hash!", "code": 1001}))
    data = None
    if mongo_data.count() != 0:
        for each_data in mongo_data:
            data = each_data
    else:
        return make_response(jsonify({"msg": "the hieght or hash is not exists!", "code": 1002}))


    return make_response(jsonify({"msg": "select successful!", "code": 200, "data": data}))


@app.route("/queryTransaction")
def queryTransaction():
    tx_hash = request.args.get("hash", "")
    if not tx_hash:
        return make_response(jsonify({"msg": "no transaction hash!", "code":400}))

    mongo_client = pymongo.MongoClient(**mongodb_params)
    mongo_db = mongo_client[mongodb_name]

    mongo_data = mongo_db.get_collection("transaction").find({"tx_hash": tx_hash},{"_id":0})
    data = None
    if mongo_data.count() != 0:
        for each_data in mongo_data:
            data = each_data
    else:
        return make_response(jsonify({"msg": "the transaction hash is not exists!", "code": 1002}))


    return make_response(jsonify({"msg": "select successful!", "code": 200, "data": data}))


@app.route("/culAnalysis")
def culAnalysis():

    mongo_client = pymongo.MongoClient(**mongodb_params)
    mongo_db = mongo_client[mongodb_name]

    #mongo_data = mongo_db.get_collection("history").aggregate([{"$group": {"_id":"$account","count":{"$sum":1}}},{"$count": "total"}])
    mongo_data = mongo_db.get_collection("history").aggregate([{"$group": {"_id":"$account","count":{"$sum":1}}},{"$group":{"_id":None, "total":{"$sum":1}}}])

    total = 0
    for i in mongo_data:
        total = i["total"]

    return make_response(jsonify({"msg": "select successful!", "code": 200, "total": total}))

@app.route("/activeAccount")
def activeAccount():

    page = int(request.args.get("page", 1))
    per_page_record = int(request.args.get("limit", 20))
    start = (page-1) * per_page_record
    data_list = []

    mongo_client = pymongo.MongoClient(**mongodb_params)
    mongo_db = mongo_client[mongodb_name]

    mongo_data = mongo_db.get_collection("history").aggregate([{"$group": {"_id":"$account","count":{"$sum":1}}}, {"$sort": {"count": -1}}, {"$skip":start}, {"$limit": per_page_record}])

    for i in mongo_data:
        data_list.append({
            "account": i["_id"],
            "count": i["count"]
        })

    return make_response(jsonify({"msg": "select successful!", "code": 200, "data": data_list}))


if __name__ == "__main__":
    http_server = WSGIServer(('0.0.0.0', 8001), app)
    http_server.serve_forever()

