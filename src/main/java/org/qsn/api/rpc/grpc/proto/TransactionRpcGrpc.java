package org.qsn.api.rpc.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.0)",
    comments = "Source: TransactionRpc.proto")
public final class TransactionRpcGrpc {

  private TransactionRpcGrpc() {}

  public static final String SERVICE_NAME = "org.qsn.protobuf.TransactionRpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponse> getSendTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendTransaction",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponse> getSendTransactionMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest, org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponse> getSendTransactionMethod;
    if ((getSendTransactionMethod = TransactionRpcGrpc.getSendTransactionMethod) == null) {
      synchronized (TransactionRpcGrpc.class) {
        if ((getSendTransactionMethod = TransactionRpcGrpc.getSendTransactionMethod) == null) {
          TransactionRpcGrpc.getSendTransactionMethod = getSendTransactionMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest, org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionRpcMethodDescriptorSupplier("sendTransaction"))
              .build();
        }
      }
    }
    return getSendTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse> getGetTransactionReceiptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTransactionReceipt",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse> getGetTransactionReceiptMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse> getGetTransactionReceiptMethod;
    if ((getGetTransactionReceiptMethod = TransactionRpcGrpc.getGetTransactionReceiptMethod) == null) {
      synchronized (TransactionRpcGrpc.class) {
        if ((getGetTransactionReceiptMethod = TransactionRpcGrpc.getGetTransactionReceiptMethod) == null) {
          TransactionRpcGrpc.getGetTransactionReceiptMethod = getGetTransactionReceiptMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTransactionReceipt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionRpcMethodDescriptorSupplier("getTransactionReceipt"))
              .build();
        }
      }
    }
    return getGetTransactionReceiptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionResponse> getGetTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTransaction",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionResponse> getGetTransactionMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionResponse> getGetTransactionMethod;
    if ((getGetTransactionMethod = TransactionRpcGrpc.getGetTransactionMethod) == null) {
      synchronized (TransactionRpcGrpc.class) {
        if ((getGetTransactionMethod = TransactionRpcGrpc.getGetTransactionMethod) == null) {
          TransactionRpcGrpc.getGetTransactionMethod = getGetTransactionMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionRpcMethodDescriptorSupplier("getTransaction"))
              .build();
        }
      }
    }
    return getGetTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawTransferTxRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.CreateRawTransferTxResponse> getCreateRawTransferTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createRawTransferTx",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.CreateRawTransferTxRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.CreateRawTransferTxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawTransferTxRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.CreateRawTransferTxResponse> getCreateRawTransferTxMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawTransferTxRequest, org.qsn.api.rpc.grpc.proto.entity.response.CreateRawTransferTxResponse> getCreateRawTransferTxMethod;
    if ((getCreateRawTransferTxMethod = TransactionRpcGrpc.getCreateRawTransferTxMethod) == null) {
      synchronized (TransactionRpcGrpc.class) {
        if ((getCreateRawTransferTxMethod = TransactionRpcGrpc.getCreateRawTransferTxMethod) == null) {
          TransactionRpcGrpc.getCreateRawTransferTxMethod = getCreateRawTransferTxMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawTransferTxRequest, org.qsn.api.rpc.grpc.proto.entity.response.CreateRawTransferTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createRawTransferTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.CreateRawTransferTxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.CreateRawTransferTxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionRpcMethodDescriptorSupplier("createRawTransferTx"))
              .build();
        }
      }
    }
    return getCreateRawTransferTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawDeployContractTxRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.CreateRawDeployContractTxResponse> getCreateRawDeployContractTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createRawDeployContractTx",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.CreateRawDeployContractTxRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.CreateRawDeployContractTxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawDeployContractTxRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.CreateRawDeployContractTxResponse> getCreateRawDeployContractTxMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawDeployContractTxRequest, org.qsn.api.rpc.grpc.proto.entity.response.CreateRawDeployContractTxResponse> getCreateRawDeployContractTxMethod;
    if ((getCreateRawDeployContractTxMethod = TransactionRpcGrpc.getCreateRawDeployContractTxMethod) == null) {
      synchronized (TransactionRpcGrpc.class) {
        if ((getCreateRawDeployContractTxMethod = TransactionRpcGrpc.getCreateRawDeployContractTxMethod) == null) {
          TransactionRpcGrpc.getCreateRawDeployContractTxMethod = getCreateRawDeployContractTxMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawDeployContractTxRequest, org.qsn.api.rpc.grpc.proto.entity.response.CreateRawDeployContractTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createRawDeployContractTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.CreateRawDeployContractTxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.CreateRawDeployContractTxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionRpcMethodDescriptorSupplier("createRawDeployContractTx"))
              .build();
        }
      }
    }
    return getCreateRawDeployContractTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawValidatorTxRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.CreateRawValidatorTxResponse> getCreateRawValidatorTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createRawValidatorTx",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.CreateRawValidatorTxRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.CreateRawValidatorTxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawValidatorTxRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.CreateRawValidatorTxResponse> getCreateRawValidatorTxMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawValidatorTxRequest, org.qsn.api.rpc.grpc.proto.entity.response.CreateRawValidatorTxResponse> getCreateRawValidatorTxMethod;
    if ((getCreateRawValidatorTxMethod = TransactionRpcGrpc.getCreateRawValidatorTxMethod) == null) {
      synchronized (TransactionRpcGrpc.class) {
        if ((getCreateRawValidatorTxMethod = TransactionRpcGrpc.getCreateRawValidatorTxMethod) == null) {
          TransactionRpcGrpc.getCreateRawValidatorTxMethod = getCreateRawValidatorTxMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawValidatorTxRequest, org.qsn.api.rpc.grpc.proto.entity.response.CreateRawValidatorTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createRawValidatorTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.CreateRawValidatorTxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.CreateRawValidatorTxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionRpcMethodDescriptorSupplier("createRawValidatorTx"))
              .build();
        }
      }
    }
    return getCreateRawValidatorTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawWithdrawTxRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.CreateRawWithdrawTxResponse> getCreateRawWithdrawTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createRawWithdrawTx",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.CreateRawWithdrawTxRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.CreateRawWithdrawTxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawWithdrawTxRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.CreateRawWithdrawTxResponse> getCreateRawWithdrawTxMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawWithdrawTxRequest, org.qsn.api.rpc.grpc.proto.entity.response.CreateRawWithdrawTxResponse> getCreateRawWithdrawTxMethod;
    if ((getCreateRawWithdrawTxMethod = TransactionRpcGrpc.getCreateRawWithdrawTxMethod) == null) {
      synchronized (TransactionRpcGrpc.class) {
        if ((getCreateRawWithdrawTxMethod = TransactionRpcGrpc.getCreateRawWithdrawTxMethod) == null) {
          TransactionRpcGrpc.getCreateRawWithdrawTxMethod = getCreateRawWithdrawTxMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.CreateRawWithdrawTxRequest, org.qsn.api.rpc.grpc.proto.entity.response.CreateRawWithdrawTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createRawWithdrawTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.CreateRawWithdrawTxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.CreateRawWithdrawTxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionRpcMethodDescriptorSupplier("createRawWithdrawTx"))
              .build();
        }
      }
    }
    return getCreateRawWithdrawTxMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransactionRpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionRpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionRpcStub>() {
        @java.lang.Override
        public TransactionRpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionRpcStub(channel, callOptions);
        }
      };
    return TransactionRpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransactionRpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionRpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionRpcBlockingStub>() {
        @java.lang.Override
        public TransactionRpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionRpcBlockingStub(channel, callOptions);
        }
      };
    return TransactionRpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransactionRpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionRpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionRpcFutureStub>() {
        @java.lang.Override
        public TransactionRpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionRpcFutureStub(channel, callOptions);
        }
      };
    return TransactionRpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TransactionRpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendTransaction(org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendTransactionMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionReceipt(org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionReceiptMethod(), responseObserver);
    }

    /**
     */
    public void getTransaction(org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionMethod(), responseObserver);
    }

    /**
     */
    public void createRawTransferTx(org.qsn.api.rpc.grpc.proto.entity.request.CreateRawTransferTxRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawTransferTxResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRawTransferTxMethod(), responseObserver);
    }

    /**
     */
    public void createRawDeployContractTx(org.qsn.api.rpc.grpc.proto.entity.request.CreateRawDeployContractTxRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawDeployContractTxResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRawDeployContractTxMethod(), responseObserver);
    }

    /**
     */
    public void createRawValidatorTx(org.qsn.api.rpc.grpc.proto.entity.request.CreateRawValidatorTxRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawValidatorTxResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRawValidatorTxMethod(), responseObserver);
    }

    /**
     */
    public void createRawWithdrawTx(org.qsn.api.rpc.grpc.proto.entity.request.CreateRawWithdrawTxRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawWithdrawTxResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRawWithdrawTxMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponse>(
                  this, METHODID_SEND_TRANSACTION)))
          .addMethod(
            getGetTransactionReceiptMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse>(
                  this, METHODID_GET_TRANSACTION_RECEIPT)))
          .addMethod(
            getGetTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionResponse>(
                  this, METHODID_GET_TRANSACTION)))
          .addMethod(
            getCreateRawTransferTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.CreateRawTransferTxRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.CreateRawTransferTxResponse>(
                  this, METHODID_CREATE_RAW_TRANSFER_TX)))
          .addMethod(
            getCreateRawDeployContractTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.CreateRawDeployContractTxRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.CreateRawDeployContractTxResponse>(
                  this, METHODID_CREATE_RAW_DEPLOY_CONTRACT_TX)))
          .addMethod(
            getCreateRawValidatorTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.CreateRawValidatorTxRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.CreateRawValidatorTxResponse>(
                  this, METHODID_CREATE_RAW_VALIDATOR_TX)))
          .addMethod(
            getCreateRawWithdrawTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.CreateRawWithdrawTxRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.CreateRawWithdrawTxResponse>(
                  this, METHODID_CREATE_RAW_WITHDRAW_TX)))
          .build();
    }
  }

  /**
   */
  public static final class TransactionRpcStub extends io.grpc.stub.AbstractAsyncStub<TransactionRpcStub> {
    private TransactionRpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionRpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionRpcStub(channel, callOptions);
    }

    /**
     */
    public void sendTransaction(org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionReceipt(org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionReceiptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransaction(org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRawTransferTx(org.qsn.api.rpc.grpc.proto.entity.request.CreateRawTransferTxRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawTransferTxResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRawTransferTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRawDeployContractTx(org.qsn.api.rpc.grpc.proto.entity.request.CreateRawDeployContractTxRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawDeployContractTxResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRawDeployContractTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRawValidatorTx(org.qsn.api.rpc.grpc.proto.entity.request.CreateRawValidatorTxRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawValidatorTxResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRawValidatorTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRawWithdrawTx(org.qsn.api.rpc.grpc.proto.entity.request.CreateRawWithdrawTxRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawWithdrawTxResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRawWithdrawTxMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TransactionRpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<TransactionRpcBlockingStub> {
    private TransactionRpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionRpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionRpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponse sendTransaction(org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse getTransactionReceipt(org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionReceiptMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionResponse getTransaction(org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.CreateRawTransferTxResponse createRawTransferTx(org.qsn.api.rpc.grpc.proto.entity.request.CreateRawTransferTxRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateRawTransferTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.CreateRawDeployContractTxResponse createRawDeployContractTx(org.qsn.api.rpc.grpc.proto.entity.request.CreateRawDeployContractTxRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateRawDeployContractTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.CreateRawValidatorTxResponse createRawValidatorTx(org.qsn.api.rpc.grpc.proto.entity.request.CreateRawValidatorTxRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateRawValidatorTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.CreateRawWithdrawTxResponse createRawWithdrawTx(org.qsn.api.rpc.grpc.proto.entity.request.CreateRawWithdrawTxRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateRawWithdrawTxMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TransactionRpcFutureStub extends io.grpc.stub.AbstractFutureStub<TransactionRpcFutureStub> {
    private TransactionRpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionRpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionRpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponse> sendTransaction(
        org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse> getTransactionReceipt(
        org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionReceiptMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionResponse> getTransaction(
        org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawTransferTxResponse> createRawTransferTx(
        org.qsn.api.rpc.grpc.proto.entity.request.CreateRawTransferTxRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRawTransferTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawDeployContractTxResponse> createRawDeployContractTx(
        org.qsn.api.rpc.grpc.proto.entity.request.CreateRawDeployContractTxRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRawDeployContractTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawValidatorTxResponse> createRawValidatorTx(
        org.qsn.api.rpc.grpc.proto.entity.request.CreateRawValidatorTxRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRawValidatorTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawWithdrawTxResponse> createRawWithdrawTx(
        org.qsn.api.rpc.grpc.proto.entity.request.CreateRawWithdrawTxRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRawWithdrawTxMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_TRANSACTION = 0;
  private static final int METHODID_GET_TRANSACTION_RECEIPT = 1;
  private static final int METHODID_GET_TRANSACTION = 2;
  private static final int METHODID_CREATE_RAW_TRANSFER_TX = 3;
  private static final int METHODID_CREATE_RAW_DEPLOY_CONTRACT_TX = 4;
  private static final int METHODID_CREATE_RAW_VALIDATOR_TX = 5;
  private static final int METHODID_CREATE_RAW_WITHDRAW_TX = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TransactionRpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TransactionRpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_TRANSACTION:
          serviceImpl.sendTransaction((org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_RECEIPT:
          serviceImpl.getTransactionReceipt((org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION:
          serviceImpl.getTransaction((org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionResponse>) responseObserver);
          break;
        case METHODID_CREATE_RAW_TRANSFER_TX:
          serviceImpl.createRawTransferTx((org.qsn.api.rpc.grpc.proto.entity.request.CreateRawTransferTxRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawTransferTxResponse>) responseObserver);
          break;
        case METHODID_CREATE_RAW_DEPLOY_CONTRACT_TX:
          serviceImpl.createRawDeployContractTx((org.qsn.api.rpc.grpc.proto.entity.request.CreateRawDeployContractTxRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawDeployContractTxResponse>) responseObserver);
          break;
        case METHODID_CREATE_RAW_VALIDATOR_TX:
          serviceImpl.createRawValidatorTx((org.qsn.api.rpc.grpc.proto.entity.request.CreateRawValidatorTxRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawValidatorTxResponse>) responseObserver);
          break;
        case METHODID_CREATE_RAW_WITHDRAW_TX:
          serviceImpl.createRawWithdrawTx((org.qsn.api.rpc.grpc.proto.entity.request.CreateRawWithdrawTxRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.CreateRawWithdrawTxResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TransactionRpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransactionRpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.qsn.api.rpc.grpc.proto.TransactionRpcOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransactionRpc");
    }
  }

  private static final class TransactionRpcFileDescriptorSupplier
      extends TransactionRpcBaseDescriptorSupplier {
    TransactionRpcFileDescriptorSupplier() {}
  }

  private static final class TransactionRpcMethodDescriptorSupplier
      extends TransactionRpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TransactionRpcMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TransactionRpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransactionRpcFileDescriptorSupplier())
              .addMethod(getSendTransactionMethod())
              .addMethod(getGetTransactionReceiptMethod())
              .addMethod(getGetTransactionMethod())
              .addMethod(getCreateRawTransferTxMethod())
              .addMethod(getCreateRawDeployContractTxMethod())
              .addMethod(getCreateRawValidatorTxMethod())
              .addMethod(getCreateRawWithdrawTxMethod())
              .build();
        }
      }
    }
    return result;
  }
}
