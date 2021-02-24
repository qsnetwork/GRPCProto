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
    comments = "Source: ValidatorRpc.proto")
public final class ValidatorRpcGrpc {

  private ValidatorRpcGrpc() {}

  public static final String SERVICE_NAME = "org.qsn.protobuf.ValidatorRpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorResponse> getGetValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getValidator",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorResponse> getGetValidatorMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorResponse> getGetValidatorMethod;
    if ((getGetValidatorMethod = ValidatorRpcGrpc.getGetValidatorMethod) == null) {
      synchronized (ValidatorRpcGrpc.class) {
        if ((getGetValidatorMethod = ValidatorRpcGrpc.getGetValidatorMethod) == null) {
          ValidatorRpcGrpc.getGetValidatorMethod = getGetValidatorMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValidatorRpcMethodDescriptorSupplier("getValidator"))
              .build();
        }
      }
    }
    return getGetValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorsByBlockHashRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorsByBlockHashResponse> getGetValidatorsByBlockHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getValidatorsByBlockHash",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorsByBlockHashRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorsByBlockHashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorsByBlockHashRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorsByBlockHashResponse> getGetValidatorsByBlockHashMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorsByBlockHashRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorsByBlockHashResponse> getGetValidatorsByBlockHashMethod;
    if ((getGetValidatorsByBlockHashMethod = ValidatorRpcGrpc.getGetValidatorsByBlockHashMethod) == null) {
      synchronized (ValidatorRpcGrpc.class) {
        if ((getGetValidatorsByBlockHashMethod = ValidatorRpcGrpc.getGetValidatorsByBlockHashMethod) == null) {
          ValidatorRpcGrpc.getGetValidatorsByBlockHashMethod = getGetValidatorsByBlockHashMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorsByBlockHashRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorsByBlockHashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getValidatorsByBlockHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorsByBlockHashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorsByBlockHashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValidatorRpcMethodDescriptorSupplier("getValidatorsByBlockHash"))
              .build();
        }
      }
    }
    return getGetValidatorsByBlockHashMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ValidatorRpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValidatorRpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValidatorRpcStub>() {
        @java.lang.Override
        public ValidatorRpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValidatorRpcStub(channel, callOptions);
        }
      };
    return ValidatorRpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ValidatorRpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValidatorRpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValidatorRpcBlockingStub>() {
        @java.lang.Override
        public ValidatorRpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValidatorRpcBlockingStub(channel, callOptions);
        }
      };
    return ValidatorRpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ValidatorRpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValidatorRpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValidatorRpcFutureStub>() {
        @java.lang.Override
        public ValidatorRpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValidatorRpcFutureStub(channel, callOptions);
        }
      };
    return ValidatorRpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ValidatorRpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void getValidator(org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetValidatorMethod(), responseObserver);
    }

    /**
     */
    public void getValidatorsByBlockHash(org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorsByBlockHashRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorsByBlockHashResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetValidatorsByBlockHashMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetValidatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorResponse>(
                  this, METHODID_GET_VALIDATOR)))
          .addMethod(
            getGetValidatorsByBlockHashMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorsByBlockHashRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorsByBlockHashResponse>(
                  this, METHODID_GET_VALIDATORS_BY_BLOCK_HASH)))
          .build();
    }
  }

  /**
   */
  public static final class ValidatorRpcStub extends io.grpc.stub.AbstractAsyncStub<ValidatorRpcStub> {
    private ValidatorRpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidatorRpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValidatorRpcStub(channel, callOptions);
    }

    /**
     */
    public void getValidator(org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getValidatorsByBlockHash(org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorsByBlockHashRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorsByBlockHashResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetValidatorsByBlockHashMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ValidatorRpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<ValidatorRpcBlockingStub> {
    private ValidatorRpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidatorRpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValidatorRpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorResponse getValidator(org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetValidatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorsByBlockHashResponse getValidatorsByBlockHash(org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorsByBlockHashRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetValidatorsByBlockHashMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ValidatorRpcFutureStub extends io.grpc.stub.AbstractFutureStub<ValidatorRpcFutureStub> {
    private ValidatorRpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidatorRpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValidatorRpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorResponse> getValidator(
        org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetValidatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorsByBlockHashResponse> getValidatorsByBlockHash(
        org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorsByBlockHashRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetValidatorsByBlockHashMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VALIDATOR = 0;
  private static final int METHODID_GET_VALIDATORS_BY_BLOCK_HASH = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ValidatorRpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ValidatorRpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VALIDATOR:
          serviceImpl.getValidator((org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorResponse>) responseObserver);
          break;
        case METHODID_GET_VALIDATORS_BY_BLOCK_HASH:
          serviceImpl.getValidatorsByBlockHash((org.qsn.api.rpc.grpc.proto.entity.request.GetValidatorsByBlockHashRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetValidatorsByBlockHashResponse>) responseObserver);
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

  private static abstract class ValidatorRpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ValidatorRpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.qsn.api.rpc.grpc.proto.ValidatorRpcOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ValidatorRpc");
    }
  }

  private static final class ValidatorRpcFileDescriptorSupplier
      extends ValidatorRpcBaseDescriptorSupplier {
    ValidatorRpcFileDescriptorSupplier() {}
  }

  private static final class ValidatorRpcMethodDescriptorSupplier
      extends ValidatorRpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ValidatorRpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (ValidatorRpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ValidatorRpcFileDescriptorSupplier())
              .addMethod(getGetValidatorMethod())
              .addMethod(getGetValidatorsByBlockHashMethod())
              .build();
        }
      }
    }
    return result;
  }
}
