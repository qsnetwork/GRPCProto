// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/common/transaction/TransactionSignatureDto.proto

package org.qsn.api.rpc.grpc.proto.entity.common.transaction;

public interface TransactionSignatureDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.qsn.protobuf.TransactionSignatureDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes pubKey = 1;</code>
   * @return The pubKey.
   */
  com.google.protobuf.ByteString getPubKey();

  /**
   * <code>bytes signed = 2;</code>
   * @return The signed.
   */
  com.google.protobuf.ByteString getSigned();
}
