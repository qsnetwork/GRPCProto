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
    comments = "Source: SmartContractRpc.proto")
public final class SmartContractRpcGrpc {

  private SmartContractRpcGrpc() {}

  public static final String SERVICE_NAME = "org.qsn.protobuf.SmartContractRpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.SmartContractViewOnlyRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.SmartContractViewOnlyResponse> getExecuteViewOnlyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "executeViewOnly",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.SmartContractViewOnlyRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.SmartContractViewOnlyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.SmartContractViewOnlyRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.SmartContractViewOnlyResponse> getExecuteViewOnlyMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.SmartContractViewOnlyRequest, org.qsn.api.rpc.grpc.proto.entity.response.SmartContractViewOnlyResponse> getExecuteViewOnlyMethod;
    if ((getExecuteViewOnlyMethod = SmartContractRpcGrpc.getExecuteViewOnlyMethod) == null) {
      synchronized (SmartContractRpcGrpc.class) {
        if ((getExecuteViewOnlyMethod = SmartContractRpcGrpc.getExecuteViewOnlyMethod) == null) {
          SmartContractRpcGrpc.getExecuteViewOnlyMethod = getExecuteViewOnlyMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.SmartContractViewOnlyRequest, org.qsn.api.rpc.grpc.proto.entity.response.SmartContractViewOnlyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "executeViewOnly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.SmartContractViewOnlyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.SmartContractViewOnlyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartContractRpcMethodDescriptorSupplier("executeViewOnly"))
              .build();
        }
      }
    }
    return getExecuteViewOnlyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartContractRpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartContractRpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartContractRpcStub>() {
        @java.lang.Override
        public SmartContractRpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartContractRpcStub(channel, callOptions);
        }
      };
    return SmartContractRpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartContractRpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartContractRpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartContractRpcBlockingStub>() {
        @java.lang.Override
        public SmartContractRpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartContractRpcBlockingStub(channel, callOptions);
        }
      };
    return SmartContractRpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartContractRpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartContractRpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartContractRpcFutureStub>() {
        @java.lang.Override
        public SmartContractRpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartContractRpcFutureStub(channel, callOptions);
        }
      };
    return SmartContractRpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SmartContractRpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void executeViewOnly(org.qsn.api.rpc.grpc.proto.entity.request.SmartContractViewOnlyRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.SmartContractViewOnlyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteViewOnlyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExecuteViewOnlyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.SmartContractViewOnlyRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.SmartContractViewOnlyResponse>(
                  this, METHODID_EXECUTE_VIEW_ONLY)))
          .build();
    }
  }

  /**
   */
  public static final class SmartContractRpcStub extends io.grpc.stub.AbstractAsyncStub<SmartContractRpcStub> {
    private SmartContractRpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartContractRpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartContractRpcStub(channel, callOptions);
    }

    /**
     */
    public void executeViewOnly(org.qsn.api.rpc.grpc.proto.entity.request.SmartContractViewOnlyRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.SmartContractViewOnlyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteViewOnlyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartContractRpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<SmartContractRpcBlockingStub> {
    private SmartContractRpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartContractRpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartContractRpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.SmartContractViewOnlyResponse executeViewOnly(org.qsn.api.rpc.grpc.proto.entity.request.SmartContractViewOnlyRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecuteViewOnlyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartContractRpcFutureStub extends io.grpc.stub.AbstractFutureStub<SmartContractRpcFutureStub> {
    private SmartContractRpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartContractRpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartContractRpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.SmartContractViewOnlyResponse> executeViewOnly(
        org.qsn.api.rpc.grpc.proto.entity.request.SmartContractViewOnlyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteViewOnlyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXECUTE_VIEW_ONLY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartContractRpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartContractRpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE_VIEW_ONLY:
          serviceImpl.executeViewOnly((org.qsn.api.rpc.grpc.proto.entity.request.SmartContractViewOnlyRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.SmartContractViewOnlyResponse>) responseObserver);
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

  private static abstract class SmartContractRpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartContractRpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.qsn.api.rpc.grpc.proto.SmartContractRpcOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartContractRpc");
    }
  }

  private static final class SmartContractRpcFileDescriptorSupplier
      extends SmartContractRpcBaseDescriptorSupplier {
    SmartContractRpcFileDescriptorSupplier() {}
  }

  private static final class SmartContractRpcMethodDescriptorSupplier
      extends SmartContractRpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartContractRpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartContractRpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartContractRpcFileDescriptorSupplier())
              .addMethod(getExecuteViewOnlyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
