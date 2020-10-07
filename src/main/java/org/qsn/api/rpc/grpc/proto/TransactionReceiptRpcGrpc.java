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
    value = "by gRPC proto compiler (version 1.30.0)",
    comments = "Source: TransactionReceiptRpc.proto")
public final class TransactionReceiptRpcGrpc {

  private TransactionReceiptRpcGrpc() {}

  public static final String SERVICE_NAME = "org.qsn.protobuf.TransactionReceiptRpc";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getGetTransactionReceiptMethod = TransactionReceiptRpcGrpc.getGetTransactionReceiptMethod) == null) {
      synchronized (TransactionReceiptRpcGrpc.class) {
        if ((getGetTransactionReceiptMethod = TransactionReceiptRpcGrpc.getGetTransactionReceiptMethod) == null) {
          TransactionReceiptRpcGrpc.getGetTransactionReceiptMethod = getGetTransactionReceiptMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTransactionReceipt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionReceiptRpcMethodDescriptorSupplier("getTransactionReceipt"))
              .build();
        }
      }
    }
    return getGetTransactionReceiptMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransactionReceiptRpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionReceiptRpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionReceiptRpcStub>() {
        @java.lang.Override
        public TransactionReceiptRpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionReceiptRpcStub(channel, callOptions);
        }
      };
    return TransactionReceiptRpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransactionReceiptRpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionReceiptRpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionReceiptRpcBlockingStub>() {
        @java.lang.Override
        public TransactionReceiptRpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionReceiptRpcBlockingStub(channel, callOptions);
        }
      };
    return TransactionReceiptRpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransactionReceiptRpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionReceiptRpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionReceiptRpcFutureStub>() {
        @java.lang.Override
        public TransactionReceiptRpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionReceiptRpcFutureStub(channel, callOptions);
        }
      };
    return TransactionReceiptRpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TransactionReceiptRpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTransactionReceipt(org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionReceiptMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTransactionReceiptMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse>(
                  this, METHODID_GET_TRANSACTION_RECEIPT)))
          .build();
    }
  }

  /**
   */
  public static final class TransactionReceiptRpcStub extends io.grpc.stub.AbstractAsyncStub<TransactionReceiptRpcStub> {
    private TransactionReceiptRpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionReceiptRpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionReceiptRpcStub(channel, callOptions);
    }

    /**
     */
    public void getTransactionReceipt(org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionReceiptMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TransactionReceiptRpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<TransactionReceiptRpcBlockingStub> {
    private TransactionReceiptRpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionReceiptRpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionReceiptRpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse getTransactionReceipt(org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionReceiptMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TransactionReceiptRpcFutureStub extends io.grpc.stub.AbstractFutureStub<TransactionReceiptRpcFutureStub> {
    private TransactionReceiptRpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionReceiptRpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionReceiptRpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse> getTransactionReceipt(
        org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionReceiptMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TRANSACTION_RECEIPT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TransactionReceiptRpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TransactionReceiptRpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TRANSACTION_RECEIPT:
          serviceImpl.getTransactionReceipt((org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse>) responseObserver);
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

  private static abstract class TransactionReceiptRpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransactionReceiptRpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.qsn.api.rpc.grpc.proto.TransactionReceiptRpcOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransactionReceiptRpc");
    }
  }

  private static final class TransactionReceiptRpcFileDescriptorSupplier
      extends TransactionReceiptRpcBaseDescriptorSupplier {
    TransactionReceiptRpcFileDescriptorSupplier() {}
  }

  private static final class TransactionReceiptRpcMethodDescriptorSupplier
      extends TransactionReceiptRpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TransactionReceiptRpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (TransactionReceiptRpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransactionReceiptRpcFileDescriptorSupplier())
              .addMethod(getGetTransactionReceiptMethod())
              .build();
        }
      }
    }
    return result;
  }
}
