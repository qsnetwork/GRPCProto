// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/response/BlockResponses.proto

package org.qsn.api.rpc.grpc.proto.entity.response;

public interface GetBlockListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.qsn.protobuf.GetBlockListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.org.qsn.protobuf.Result result = 1;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.org.qsn.protobuf.Result result = 1;</code>
   * @return The result.
   */
  org.qsn.api.rpc.grpc.proto.entity.common.Result getResult();
  /**
   * <code>.org.qsn.protobuf.Result result = 1;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.ResultOrBuilder getResultOrBuilder();

  /**
   * <code>repeated .org.qsn.protobuf.BlockDto blockList = 2;</code>
   */
  java.util.List<org.qsn.api.rpc.grpc.proto.entity.common.block.BlockDto> 
      getBlockListList();
  /**
   * <code>repeated .org.qsn.protobuf.BlockDto blockList = 2;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.block.BlockDto getBlockList(int index);
  /**
   * <code>repeated .org.qsn.protobuf.BlockDto blockList = 2;</code>
   */
  int getBlockListCount();
  /**
   * <code>repeated .org.qsn.protobuf.BlockDto blockList = 2;</code>
   */
  java.util.List<? extends org.qsn.api.rpc.grpc.proto.entity.common.block.BlockDtoOrBuilder> 
      getBlockListOrBuilderList();
  /**
   * <code>repeated .org.qsn.protobuf.BlockDto blockList = 2;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.block.BlockDtoOrBuilder getBlockListOrBuilder(
      int index);
}
