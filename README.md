# GRPCProto
QSN gRPC proto, used for client access to qsn node.

Please reference to https://grpc.io/docs/languages/ for tutorial of using gRPC in different languages 

## Services

* [Account](#Account)
* [Block](#block)
* [Transaction](#Transaction)


All the request include a BaseRequest 
Right now, only version="1" is allowed in all requests.
<pre><code>
message BaseRequest {
    string version = 1; 
}
</code></pre>

and all response also include default Result as 
<pre><code>
message Result {
    int32 respCode = 1;
    string respMsg = 2;
}

// possible default result
{ respCode: 0, 
  respMsg: "success"
 ),
{ respCode: 1,
  respMsg: "error"
)
</code></pre>

### Account
Acccount related rpc functions

#### `getAccountBalance` 
* query the account balance by address
<pre>
    # required variable
    address : account address 
</pre>

#### `getAccountNonce`
* query the account current nonce by address
<pre>
    # required variable
    address : account address
</pre>

#### `getAccount`
* query the account object by address, combine of [getAccountBalance](#getAccountBalance) and [getAccountNonce](#getAccountNonce)
<pre>
    # required variable
    address: account address
</pre>

### Block

Block related rpc functions

#### `getBlockHeaderByHash`
* query Block Header by Block Hash
* Block Hash is the sha3 hash of Block Header
<pre>
    # required variable
    hash: block hash
</pre>


#### `getBlockHeaderByHeight`
* query Block Header by Block Height
<pre>
    # required variable
    height : block height
</pre>


#### `getBlockByHash`
* query the whole Block by Block Hash
<pre>
    # required variable
    hash: block hash
</pre>


#### `getBlockByHeight`
* query the whole block by Block Height
<pre>
    # required variable
    height : block height
</pre>


#### `getBlockHeight`
* query the latest block height
<pre>
    # required variable
    none
</pre>


### Transaction 

#### `sendTransaction`
* broadcast a tx to qsn node 
<pre>
    # required variable
    transactionDto : the TransactionDto message
</pre>


#### `getTransaction`
* query transaction by hash
<pre>
    # required variable
    transactionHash : the transaction hash, sha3 hashed tx rlp encoded bytes
</pre> 

#### `getTransactionReceipt`
* query Transaction Receipt by hash
<pre>
    # required variable
    transactionHash : the transaction hash, sha3 hashed tx rlp encoded bytes
</pre> 

#### `createRawTransferTx`
* create a raw "Transfer" transaction with default fee field and empty signature
<pre>
    # required variable
    from: sender address
    to: receiver address
    amount: the value of transfer in big integer
    
</pre> 

#### `createRawDeployContractTx`
* not ready
* create a raw "Deploy Contract" transaction with default fee field and empty signature

#### `createRawValidatorTx`
* not ready 
* create a raw "Validator" transaction with default fee field and empty signature
* with "Validator" transaction, a validator node can stake to increase the staking token or unstake to decrease the staking token

#### `createRawWithdrawTx`
* not ready
* create a raw "Withdraw" transaction with default fee field and empty signature
* Withdraw will let user to withdraw all matured block reward or fee or unstaked token to the address specified


### Client code Example

example for Account RPC client
<pre>// Java code example <code>

public class AccountRpcClientImpl implements AccountRpcClient {

    private final AccountRpcGrpc.AccountRpcBlockingStub stub;

    public AccountRpcClientImpl(Channel channel){
        stub = AccountRpcGrpc.newBlockingStub(channel);
    }

    @Override
    public BigInteger getAccountBalance(byte[] addr) {
        GetAccountBalanceRequest req = GetAccountBalanceRequest.newBuilder()
                .setBaseRequest(BaseRequest.newBuilder().setVersion("1").build())
                .setAddress(ByteString.copyFrom(addr))
                .build();
        GetAccountBalanceResponse resp = stub.getAccountBalance(req);
        BigInteger balance = TypeUtil.transBInteger2BigInteger(resp.getBalance());
    }


}
</code></pre>

example code for Transaction RPC client
<pre>// Java code example <code>
public class TransactionRpcClientImpl implements TransactionRpcClient {

    private final TransactionRpcGrpc.TransactionRpcBlockingStub stub;

    public TransactionRpcClientImpl(Channel channel){
        stub = TransactionRpcGrpc.newBlockingStub(channel);
    }
    @Override
    public TransactionReceiptDto getTransactionReceipt(byte[] transactionHash) {
        GetTransactionReceiptRequest req = GetTransactionReceiptRequest.newBuilder()
                .setBaseRequest(BaseRequest.newBuilder().setVersion("1").build())
                .setTransactionHash(ByteString.copyFrom(transactionHash))
                .build();
        GetTransactionReceiptResponse resp = stub.getTransactionReceipt(req);
        return resp.getTransactionReceipt();
    }
}
</code></pre>


___

### Client code Example for python

to build the python package, refer to [compile-python.sh](https://github.com/qsnetwork/GRPCProto/tree/master/jenkins/compile-python.sh)

<pre>//python code example, the same logic for block rpc and transaction rpc<code>
import grpc
import AccountRpc_pb2
import AccountRpc_pb2_grpc
from qsn.entity.request import AccountRequests_pb2
from qsn.entity.common import BaseRequest_pb2
import BlockRpc_pb2
import BlockRpc_pb2_grpc
from qsn.entity.request import BlockRequests_pb2
import TransactionRpc_pb2
import TransactionRpc_pb2_grpc
from qsn.entity.request import TransactionRequests_pb2


channel = grpc.insecure_channel('ip:port')

def account(addr):
    stub = AccountRpc_pb2_grpc.AccountRpcStub(channel)
    response = stub.getAccount(AccountRequests_pb2.GetAccountRequest( baseRequest=BaseRequest_pb2.BaseRequest(version="1"), address=bytes.fromhex(addr)))

    print(response)
    balance = int.from_bytes(response.account.balance.value, byteorder="big")
    print(balance)

def block(height):
    stub = BlockRpc_pb2_grpc.BlockRpcStub(channel)
    response = stub.getBlockByHeight(BlockRequests_pb2.GetBlockByHeightRequest(baseRequest=BaseRequest_pb2.BaseRequest(version="1"), height=height))
    print(response)

def current():
    stub = BlockRpc_pb2_grpc.BlockRpcStub(channel)
    response = stub.getBlockHeight(BlockRequests_pb2.GetBlockHeightRequest(baseRequest=BaseRequest_pb2.BaseRequest(version="1")))
    print(response)
    

if __name__ == "__main__":
    account("70e85308ef0502397cac5632bd7307c1dc391c49")
    current()
    block(30000) 
    
</code></pre>
