// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/response/BlockResponses.proto

package org.qsn.api.rpc.grpc.proto.entity.response;

public interface GetDoneHeightResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.qsn.protobuf.GetDoneHeightResponse)
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
   * <code>int64 height = 2;</code>
   * @return The height.
   */
  long getHeight();
}
