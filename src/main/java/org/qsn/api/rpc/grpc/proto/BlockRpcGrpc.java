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
    comments = "Source: BlockRpc.proto")
public final class BlockRpcGrpc {

  private BlockRpcGrpc() {}

  public static final String SERVICE_NAME = "org.qsn.protobuf.BlockRpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHashRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHashResponse> getGetBlockHeaderByHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBlockHeaderByHash",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHashRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHashRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHashResponse> getGetBlockHeaderByHashMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHashRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHashResponse> getGetBlockHeaderByHashMethod;
    if ((getGetBlockHeaderByHashMethod = BlockRpcGrpc.getGetBlockHeaderByHashMethod) == null) {
      synchronized (BlockRpcGrpc.class) {
        if ((getGetBlockHeaderByHashMethod = BlockRpcGrpc.getGetBlockHeaderByHashMethod) == null) {
          BlockRpcGrpc.getGetBlockHeaderByHashMethod = getGetBlockHeaderByHashMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHashRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBlockHeaderByHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlockRpcMethodDescriptorSupplier("getBlockHeaderByHash"))
              .build();
        }
      }
    }
    return getGetBlockHeaderByHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHeightRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHeightResponse> getGetBlockHeaderByHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBlockHeaderByHeight",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHeightRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHeightRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHeightResponse> getGetBlockHeaderByHeightMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHeightRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHeightResponse> getGetBlockHeaderByHeightMethod;
    if ((getGetBlockHeaderByHeightMethod = BlockRpcGrpc.getGetBlockHeaderByHeightMethod) == null) {
      synchronized (BlockRpcGrpc.class) {
        if ((getGetBlockHeaderByHeightMethod = BlockRpcGrpc.getGetBlockHeaderByHeightMethod) == null) {
          BlockRpcGrpc.getGetBlockHeaderByHeightMethod = getGetBlockHeaderByHeightMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHeightRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBlockHeaderByHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlockRpcMethodDescriptorSupplier("getBlockHeaderByHeight"))
              .build();
        }
      }
    }
    return getGetBlockHeaderByHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHashRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHashResponse> getGetBlockByHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBlockByHash",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHashRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHashRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHashResponse> getGetBlockByHashMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHashRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHashResponse> getGetBlockByHashMethod;
    if ((getGetBlockByHashMethod = BlockRpcGrpc.getGetBlockByHashMethod) == null) {
      synchronized (BlockRpcGrpc.class) {
        if ((getGetBlockByHashMethod = BlockRpcGrpc.getGetBlockByHashMethod) == null) {
          BlockRpcGrpc.getGetBlockByHashMethod = getGetBlockByHashMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHashRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBlockByHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlockRpcMethodDescriptorSupplier("getBlockByHash"))
              .build();
        }
      }
    }
    return getGetBlockByHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHeightRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHeightResponse> getGetBlockByHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBlockByHeight",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHeightRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHeightRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHeightResponse> getGetBlockByHeightMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHeightRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHeightResponse> getGetBlockByHeightMethod;
    if ((getGetBlockByHeightMethod = BlockRpcGrpc.getGetBlockByHeightMethod) == null) {
      synchronized (BlockRpcGrpc.class) {
        if ((getGetBlockByHeightMethod = BlockRpcGrpc.getGetBlockByHeightMethod) == null) {
          BlockRpcGrpc.getGetBlockByHeightMethod = getGetBlockByHeightMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHeightRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBlockByHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlockRpcMethodDescriptorSupplier("getBlockByHeight"))
              .build();
        }
      }
    }
    return getGetBlockByHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeightRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeightResponse> getGetBlockHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBlockHeight",
      requestType = org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeightRequest.class,
      responseType = org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeightRequest,
      org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeightResponse> getGetBlockHeightMethod() {
    io.grpc.MethodDescriptor<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeightRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeightResponse> getGetBlockHeightMethod;
    if ((getGetBlockHeightMethod = BlockRpcGrpc.getGetBlockHeightMethod) == null) {
      synchronized (BlockRpcGrpc.class) {
        if ((getGetBlockHeightMethod = BlockRpcGrpc.getGetBlockHeightMethod) == null) {
          BlockRpcGrpc.getGetBlockHeightMethod = getGetBlockHeightMethod =
              io.grpc.MethodDescriptor.<org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeightRequest, org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBlockHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlockRpcMethodDescriptorSupplier("getBlockHeight"))
              .build();
        }
      }
    }
    return getGetBlockHeightMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BlockRpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlockRpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlockRpcStub>() {
        @java.lang.Override
        public BlockRpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlockRpcStub(channel, callOptions);
        }
      };
    return BlockRpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BlockRpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlockRpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlockRpcBlockingStub>() {
        @java.lang.Override
        public BlockRpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlockRpcBlockingStub(channel, callOptions);
        }
      };
    return BlockRpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BlockRpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlockRpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlockRpcFutureStub>() {
        @java.lang.Override
        public BlockRpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlockRpcFutureStub(channel, callOptions);
        }
      };
    return BlockRpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BlockRpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBlockHeaderByHash(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHashRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHashResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockHeaderByHashMethod(), responseObserver);
    }

    /**
     */
    public void getBlockHeaderByHeight(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHeightRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHeightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockHeaderByHeightMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByHash(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHashRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHashResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByHashMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByHeight(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHeightRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHeightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByHeightMethod(), responseObserver);
    }

    /**
     */
    public void getBlockHeight(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeightRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockHeightMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBlockHeaderByHashMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHashRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHashResponse>(
                  this, METHODID_GET_BLOCK_HEADER_BY_HASH)))
          .addMethod(
            getGetBlockHeaderByHeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHeightRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHeightResponse>(
                  this, METHODID_GET_BLOCK_HEADER_BY_HEIGHT)))
          .addMethod(
            getGetBlockByHashMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHashRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHashResponse>(
                  this, METHODID_GET_BLOCK_BY_HASH)))
          .addMethod(
            getGetBlockByHeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHeightRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHeightResponse>(
                  this, METHODID_GET_BLOCK_BY_HEIGHT)))
          .addMethod(
            getGetBlockHeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeightRequest,
                org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeightResponse>(
                  this, METHODID_GET_BLOCK_HEIGHT)))
          .build();
    }
  }

  /**
   */
  public static final class BlockRpcStub extends io.grpc.stub.AbstractAsyncStub<BlockRpcStub> {
    private BlockRpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockRpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlockRpcStub(channel, callOptions);
    }

    /**
     */
    public void getBlockHeaderByHash(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHashRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHashResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockHeaderByHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockHeaderByHeight(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHeightRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHeightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockHeaderByHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByHash(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHashRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHashResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByHeight(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHeightRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHeightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockHeight(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeightRequest request,
        io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockHeightMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BlockRpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<BlockRpcBlockingStub> {
    private BlockRpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockRpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlockRpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHashResponse getBlockHeaderByHash(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHashRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockHeaderByHashMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHeightResponse getBlockHeaderByHeight(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHeightRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockHeaderByHeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHashResponse getBlockByHash(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHashRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByHashMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHeightResponse getBlockByHeight(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHeightRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByHeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeightResponse getBlockHeight(org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeightRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockHeightMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BlockRpcFutureStub extends io.grpc.stub.AbstractFutureStub<BlockRpcFutureStub> {
    private BlockRpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockRpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlockRpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHashResponse> getBlockHeaderByHash(
        org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHashRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockHeaderByHashMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHeightResponse> getBlockHeaderByHeight(
        org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockHeaderByHeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHashResponse> getBlockByHash(
        org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHashRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByHashMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHeightResponse> getBlockByHeight(
        org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByHeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeightResponse> getBlockHeight(
        org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockHeightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BLOCK_HEADER_BY_HASH = 0;
  private static final int METHODID_GET_BLOCK_HEADER_BY_HEIGHT = 1;
  private static final int METHODID_GET_BLOCK_BY_HASH = 2;
  private static final int METHODID_GET_BLOCK_BY_HEIGHT = 3;
  private static final int METHODID_GET_BLOCK_HEIGHT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BlockRpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BlockRpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BLOCK_HEADER_BY_HASH:
          serviceImpl.getBlockHeaderByHash((org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHashRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHashResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_HEADER_BY_HEIGHT:
          serviceImpl.getBlockHeaderByHeight((org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeaderByHeightRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeaderByHeightResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_HASH:
          serviceImpl.getBlockByHash((org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHashRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHashResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_HEIGHT:
          serviceImpl.getBlockByHeight((org.qsn.api.rpc.grpc.proto.entity.request.GetBlockByHeightRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockByHeightResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_HEIGHT:
          serviceImpl.getBlockHeight((org.qsn.api.rpc.grpc.proto.entity.request.GetBlockHeightRequest) request,
              (io.grpc.stub.StreamObserver<org.qsn.api.rpc.grpc.proto.entity.response.GetBlockHeightResponse>) responseObserver);
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

  private static abstract class BlockRpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BlockRpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.qsn.api.rpc.grpc.proto.BlockRpcOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BlockRpc");
    }
  }

  private static final class BlockRpcFileDescriptorSupplier
      extends BlockRpcBaseDescriptorSupplier {
    BlockRpcFileDescriptorSupplier() {}
  }

  private static final class BlockRpcMethodDescriptorSupplier
      extends BlockRpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BlockRpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (BlockRpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BlockRpcFileDescriptorSupplier())
              .addMethod(getGetBlockHeaderByHashMethod())
              .addMethod(getGetBlockHeaderByHeightMethod())
              .addMethod(getGetBlockByHashMethod())
              .addMethod(getGetBlockByHeightMethod())
              .addMethod(getGetBlockHeightMethod())
              .build();
        }
      }
    }
    return result;
  }
}
