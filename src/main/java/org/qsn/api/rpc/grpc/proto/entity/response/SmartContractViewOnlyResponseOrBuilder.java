// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/response/SmartContractResponses.proto

package org.qsn.api.rpc.grpc.proto.entity.response;

public interface SmartContractViewOnlyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.qsn.protobuf.SmartContractViewOnlyResponse)
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
   * <code>bytes response = 2;</code>
   * @return The response.
   */
  com.google.protobuf.ByteString getResponse();
}
