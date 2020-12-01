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
    comments = "Source: AccountRpc.proto")
public final class AccountRpcGrpc {

  private AccountRpcGrpc() {}

  public static final String SERVICE_NAME = "org.qsn.protobuf.AccountRpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetAccountBalanceRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse> getGetAccountBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAccountBalance",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.GetAccountBalanceRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetAccountBalanceRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse> getGetAccountBalanceMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetAccountBalanceRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse> getGetAccountBalanceMethod;
    if ((getGetAccountBalanceMethod = AccountRpcGrpc.getGetAccountBalanceMethod) == null) {
      synchronized (AccountRpcGrpc.class) {
        if ((getGetAccountBalanceMethod = AccountRpcGrpc.getGetAccountBalanceMethod) == null) {
          AccountRpcGrpc.getGetAccountBalanceMethod = getGetAccountBalanceMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.GetAccountBalanceRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAccountBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.GetAccountBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountRpcMethodDescriptorSupplier("getAccountBalance"))
              .build();
        }
      }
    }
    return getGetAccountBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetAccountNonceRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetAccountNonceResponse> getGetAccountNonceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAccountNonce",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.GetAccountNonceRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.GetAccountNonceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetAccountNonceRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetAccountNonceResponse> getGetAccountNonceMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetAccountNonceRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetAccountNonceResponse> getGetAccountNonceMethod;
    if ((getGetAccountNonceMethod = AccountRpcGrpc.getGetAccountNonceMethod) == null) {
      synchronized (AccountRpcGrpc.class) {
        if ((getGetAccountNonceMethod = AccountRpcGrpc.getGetAccountNonceMethod) == null) {
          AccountRpcGrpc.getGetAccountNonceMethod = getGetAccountNonceMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.GetAccountNonceRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetAccountNonceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAccountNonce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.GetAccountNonceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.GetAccountNonceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountRpcMethodDescriptorSupplier("getAccountNonce"))
              .build();
        }
      }
    }
    return getGetAccountNonceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetAccountRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetAccountResponse> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAccount",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.GetAccountRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.GetAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetAccountRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetAccountResponse> getGetAccountMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetAccountRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetAccountResponse> getGetAccountMethod;
    if ((getGetAccountMethod = AccountRpcGrpc.getGetAccountMethod) == null) {
      synchronized (AccountRpcGrpc.class) {
        if ((getGetAccountMethod = AccountRpcGrpc.getGetAccountMethod) == null) {
          AccountRpcGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.GetAccountRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.GetAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountRpcMethodDescriptorSupplier("getAccount"))
              .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountRpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountRpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountRpcStub>() {
        @java.lang.Override
        public AccountRpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountRpcStub(channel, callOptions);
        }
      };
    return AccountRpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountRpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountRpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountRpcBlockingStub>() {
        @java.lang.Override
        public AccountRpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountRpcBlockingStub(channel, callOptions);
        }
      };
    return AccountRpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountRpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountRpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountRpcFutureStub>() {
        @java.lang.Override
        public AccountRpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountRpcFutureStub(channel, callOptions);
        }
      };
    return AccountRpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AccountRpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAccountBalance(org.qsn.api.rpc.grpc.proto.entity.request.GetAccountBalanceRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountBalanceMethod(), responseObserver);
    }

    /**
     */
    public void getAccountNonce(org.qsn.api.rpc.grpc.proto.entity.request.GetAccountNonceRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetAccountNonceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountNonceMethod(), responseObserver);
    }

    /**
     */
    public void getAccount(org.qsn.api.rpc.grpc.proto.entity.request.GetAccountRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAccountBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.GetAccountBalanceRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse>(
                  this, METHODID_GET_ACCOUNT_BALANCE)))
          .addMethod(
            getGetAccountNonceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.GetAccountNonceRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.GetAccountNonceResponse>(
                  this, METHODID_GET_ACCOUNT_NONCE)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.GetAccountRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.GetAccountResponse>(
                  this, METHODID_GET_ACCOUNT)))
          .build();
    }
  }

  /**
   */
  public static final class AccountRpcStub extends io.grpc.stub.AbstractAsyncStub<AccountRpcStub> {
    private AccountRpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountRpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountRpcStub(channel, callOptions);
    }

    /**
     */
    public void getAccountBalance(org.qsn.api.rpc.grpc.proto.entity.request.GetAccountBalanceRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountNonce(org.qsn.api.rpc.grpc.proto.entity.request.GetAccountNonceRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetAccountNonceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountNonceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccount(org.qsn.api.rpc.grpc.proto.entity.request.GetAccountRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountRpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountRpcBlockingStub> {
    private AccountRpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountRpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountRpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse getAccountBalance(org.qsn.api.rpc.grpc.proto.entity.request.GetAccountBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.GetAccountNonceResponse getAccountNonce(org.qsn.api.rpc.grpc.proto.entity.request.GetAccountNonceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountNonceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.GetAccountResponse getAccount(org.qsn.api.rpc.grpc.proto.entity.request.GetAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountRpcFutureStub extends io.grpc.stub.AbstractFutureStub<AccountRpcFutureStub> {
    private AccountRpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountRpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountRpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse> getAccountBalance(
        org.qsn.api.rpc.grpc.proto.entity.request.GetAccountBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.GetAccountNonceResponse> getAccountNonce(
        org.qsn.api.rpc.grpc.proto.entity.request.GetAccountNonceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountNonceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.GetAccountResponse> getAccount(
        org.qsn.api.rpc.grpc.proto.entity.request.GetAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNT_BALANCE = 0;
  private static final int METHODID_GET_ACCOUNT_NONCE = 1;
  private static final int METHODID_GET_ACCOUNT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountRpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountRpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACCOUNT_BALANCE:
          serviceImpl.getAccountBalance((org.qsn.api.rpc.grpc.proto.entity.request.GetAccountBalanceRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_NONCE:
          serviceImpl.getAccountNonce((org.qsn.api.rpc.grpc.proto.entity.request.GetAccountNonceRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetAccountNonceResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((org.qsn.api.rpc.grpc.proto.entity.request.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetAccountResponse>) responseObserver);
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

  private static abstract class AccountRpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountRpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.qsn.api.rpc.grpc.proto.AccountRpcOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountRpc");
    }
  }

  private static final class AccountRpcFileDescriptorSupplier
      extends AccountRpcBaseDescriptorSupplier {
    AccountRpcFileDescriptorSupplier() {}
  }

  private static final class AccountRpcMethodDescriptorSupplier
      extends AccountRpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountRpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountRpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountRpcFileDescriptorSupplier())
              .addMethod(getGetAccountBalanceMethod())
              .addMethod(getGetAccountNonceMethod())
              .addMethod(getGetAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
