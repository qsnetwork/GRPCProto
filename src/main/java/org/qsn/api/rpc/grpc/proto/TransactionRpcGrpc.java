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

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponse>(
                  this, METHODID_SEND_TRANSACTION)))
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
  }

  private static final int METHODID_SEND_TRANSACTION = 0;

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
              .build();
        }
      }
    }
    return result;
  }
}
