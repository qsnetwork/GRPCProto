import pymongo
import json
import logging
import sys
import time
from config import *

import grpc

import AccountRpc_pb2
import AccountRpc_pb2_grpc
import BlockRpc_pb2
import BlockRpc_pb2_grpc
import TransactionRpc_pb2
import TransactionRpc_pb2_grpc
from qsn.entity.request import AccountRequests_pb2, BlockRequests_pb2, TransactionRequests_pb2
from qsn.entity.common import BaseRequest_pb2
from qsn.entity.customized import BlockRewardTxDataDto_pb2, TransferTxDataDto_pb2, FileUploadTxDataDto_pb2
from google.protobuf.any_pb2 import Any

class Config():
    logger = logging.getLogger("mongo_replay_info")
    logger.setLevel(logging.DEBUG)

    fh = logging.FileHandler('mongo_replay.log')
    fh.setLevel(logging.DEBUG)

    ch = logging.StreamHandler()
    ch.setLevel(logging.DEBUG)

    formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
    fh.setFormatter(formatter)
    ch.setFormatter(formatter)

    logger.addHandler(fh)
    logger.addHandler(ch)

    def getLog(self):
        return self.logger


def replay_block_transaction(start, stop):

    channel = grpc.insecure_channel(node_address)
    stub3 = BlockRpc_pb2_grpc.BlockRpcStub(channel)
    
    mongo_client2 = pymongo.MongoClient(**mongodb_params)
    mongo_db2 = mongo_client2[mongodb_name]

    if not "block" in mongo_db2.collection_names():
        #mongo_db2["block"].create_index([("block_hash", 1), ("block_height", -1)])
        mongo_db2["block"].create_index([("block_hash", 1)])
        mongo_db2["block"].create_index([("block_height", -1)])
    if not "transaction" in mongo_db2.collection_names():
        #mongo_db2["transaction"].create_index([("tx_hash", 1), ("block_height", -1)])
        mongo_db2["transaction"].create_index([("tx_hash", 1)])
        mongo_db2["transaction"].create_index([("tx_type", 1)])
        mongo_db2["transaction"].create_index([("block_height", -1)])
    if not "history" in mongo_db2.collection_names():
        #mongo_db2["history"].create_index([("account", 1), ("tx_type", 1), ("block_height", -1)])
        mongo_db2["history"].create_index([("account", 1)])
        mongo_db2["history"].create_index([("tx_type", 1)])
        mongo_db2["history"].create_index([("block_height", -1)])
    
    for block_height in range(start, stop-1, -1):
        print("replay--{}".format(block_height))
        while 1:
            try:
                response4 = stub3.getBlockByHeight(BlockRequests_pb2.GetBlockByHeightRequest(baseRequest=BaseRequest_pb2.BaseRequest(version="1"),height=block_height))
            except Exception as e:
                print(repr(e))
                continue
            else:
                break

        resp_block = response4.block
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
            tx_data = None
            if tx_type == 2:
                sender = tx_d.sender.hex()
                nonce = tx_d.nonce
                nonce_value = int.from_bytes(nonce.value, byteorder="big")
                data = tx_d.data
                non = {
                    "value": nonce_value
                }
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
                    # print("coin", coin_base, "value", value)
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
            if tx_type == 20:
                sender = tx_d.sender.hex()
                nonce = tx_d.nonce
                nonce_value = int.from_bytes(nonce.value, byteorder="big")
                data = tx_d.data
                non = {
                    "value": nonce_value
                }
                any_data = Any()
                any_data.CopyFrom(data)
                unpacked_data = TransferTxDataDto_pb2.TransferTxDataDto()
                any_data.Unpack(unpacked_data)
                # print("unpack", unpacked_data)
                to = unpacked_data.to.hex()
                t_value = int.from_bytes(unpacked_data.value.value, byteorder="big")

                
                tx_data = {
                    "sender": sender,
                    "nonce": non,
                    "data": {
                        "to": to,
                        "value": t_value
                    }
                }
            if tx_type == 40:
                sender = tx_d.sender.hex()
                nonce = tx_d.nonce
                nonce_value = int.from_bytes(nonce.value, byteorder="big")
                data = tx_d.data
                non = {
                    "value": nonce_value
                }
                any_data = Any()
                any_data.CopyFrom(data)
                unpacked_data = FileUploadTxDataDto_pb2.FileUploadTxDataDto()
                any_data.Unpack(unpacked_data)
                # print("unpack", unpacked_data)
                file_hash = unpacked_data.fileHash.hex()
                
                tx_data = {
                    "sender": sender,
                    "nonce": non,
                    "data": {
                        "fileHash": file_hash
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

            transactions_data = None
            if tx_type == 2:
                transactions_data = {
                    "txType": tx_type,
                    "txData": tx_data,
                    "fee": fee_data,
                    "signatures": sign_list,
                    "hash": tx_hash
                }
            if tx_type == 20:
                t_info = transactions[i].info.hex()
                atta_dataHash = transactions[i].attachment.dataHash.hex()
                atta_signture = transactions[i].attachment.signature.hex()
                attachment = {
                    "dataHash": atta_dataHash,
                    "signature": atta_signture
                }
                transactions_data = {
                    "txType": tx_type,
                    "txData": tx_data,
                    "info": t_info,
                    "attachment": attachment,
                    "fee": fee_data,
                    "signatures": sign_list,
                    "hash": tx_hash
                }
            if tx_type == 40:
                t_info = transactions[i].info.hex()
                atta_dataHash = transactions[i].attachment.dataHash.hex()
                atta_signture = transactions[i].attachment.signature.hex()
                attachment = {
                    "dataHash": atta_dataHash,
                    "signature": atta_signture
                }
                smart_contract_name = transactions[i].smartContractName
                smart_contract_action = transactions[i].smartContractAction
                smart_contract_arguments = transactions[i].smartContractArguments
                arg_list = []
                for each_arg in smart_contract_arguments:
                    arg_list.append(each_arg.hex())
                transactions_data = {
                    "txType": tx_type,
                    "txData": tx_data,
                    "smartContractName": smart_contract_name,
                    "smartContractAction": smart_contract_action,
                    "smartContractArguments": arg_list,
                    "info": t_info,
                    "attachment": attachment,
                    "fee": fee_data,
                    "signatures": sign_list,
                    "hash": tx_hash
                }

            trx_list.append(transactions_data)

            tx_info = {
                "block_height": block_height,
                "tx_hash": tx_hash,
                "tx_type": tx_type,
                "time": time_format,
                "transaction_data": transactions_data
            }

            mongo_db2["transaction"].insert_one(tx_info)

            if tx_type == 2:
                history_info = {
                    "account": sender,
                    "block_height": block_height,
                    "tx_type": tx_type,
                    "tx_info": tx_info
                }
                mongo_db2["history"].insert_one(history_info)
            if tx_type == 20:
                history_info1 = {
                    "account": sender,
                    "block_height": block_height,
                    "tx_type": tx_type,
                    "tx_info": tx_info
                }
                mongo_db2["history"].insert_one(history_info1)
                history_info2 = {
                    "account": to,
                    "block_height": block_height,
                    "tx_type": tx_type,
                    "tx_info": tx_info
                }
                mongo_db2["history"].insert_one(history_info2)
            if tx_type == 40:
                history_info = {
                    "account": sender,
                    "block_height": block_height,
                    "tx_type": tx_type,
                    "tx_info": tx_info
                }
                mongo_db2["history"].insert_one(history_info)

            
            
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

        block_info = {
            "block_height": height,
            "block_hash": block_hash,
            "time": time_format,
            "data": block
        }

        mongo_db2["block"].insert_one(block_info)
    
    print("replay ok!")





if __name__ == "__main__":
    conf = Config()
    logger = conf.getLog()

    start = int(sys.argv[1])
    stop = int(sys.argv[2])
    
    replay_block_transaction(start, stop)
