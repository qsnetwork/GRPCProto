// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/response/ValidatorResponses.proto

package org.qsn.api.rpc.grpc.proto.entity.response;

public interface GetValidatorResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.qsn.protobuf.GetValidatorResponse)
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
   * <code>.org.qsn.protobuf.ValidatorDto validator = 2;</code>
   * @return Whether the validator field is set.
   */
  boolean hasValidator();
  /**
   * <code>.org.qsn.protobuf.ValidatorDto validator = 2;</code>
   * @return The validator.
   */
  org.qsn.api.rpc.grpc.proto.entity.common.validator.ValidatorDto getValidator();
  /**
   * <code>.org.qsn.protobuf.ValidatorDto validator = 2;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.validator.ValidatorDtoOrBuilder getValidatorOrBuilder();
}