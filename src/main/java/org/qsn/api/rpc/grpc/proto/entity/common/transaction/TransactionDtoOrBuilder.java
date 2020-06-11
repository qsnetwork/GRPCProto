// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/common/transaction/TransactionDto.proto

package org.qsn.api.rpc.grpc.proto.entity.common.transaction;

public interface TransactionDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.qsn.protobuf.TransactionDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 txType = 1;</code>
   * @return The txType.
   */
  int getTxType();

  /**
   * <pre>
   *    google.protobuf.Any txData = 2;
   * </pre>
   *
   * <code>.org.qsn.protobuf.TransactionDataDto txData = 2;</code>
   * @return Whether the txData field is set.
   */
  boolean hasTxData();
  /**
   * <pre>
   *    google.protobuf.Any txData = 2;
   * </pre>
   *
   * <code>.org.qsn.protobuf.TransactionDataDto txData = 2;</code>
   * @return The txData.
   */
  org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDataDto getTxData();
  /**
   * <pre>
   *    google.protobuf.Any txData = 2;
   * </pre>
   *
   * <code>.org.qsn.protobuf.TransactionDataDto txData = 2;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDataDtoOrBuilder getTxDataOrBuilder();

  /**
   * <code>bytes smartContractName = 3;</code>
   * @return The smartContractName.
   */
  com.google.protobuf.ByteString getSmartContractName();

  /**
   * <code>bytes smartContractAction = 4;</code>
   * @return The smartContractAction.
   */
  com.google.protobuf.ByteString getSmartContractAction();

  /**
   * <code>.org.qsn.protobuf.TransactionFeeDto fee = 5;</code>
   * @return Whether the fee field is set.
   */
  boolean hasFee();
  /**
   * <code>.org.qsn.protobuf.TransactionFeeDto fee = 5;</code>
   * @return The fee.
   */
  org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionFeeDto getFee();
  /**
   * <code>.org.qsn.protobuf.TransactionFeeDto fee = 5;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionFeeDtoOrBuilder getFeeOrBuilder();

  /**
   * <code>bytes memo = 6;</code>
   * @return The memo.
   */
  com.google.protobuf.ByteString getMemo();

  /**
   * <code>repeated .org.qsn.protobuf.TransactionSignatureDto signatures = 7;</code>
   */
  java.util.List<org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionSignatureDto> 
      getSignaturesList();
  /**
   * <code>repeated .org.qsn.protobuf.TransactionSignatureDto signatures = 7;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionSignatureDto getSignatures(int index);
  /**
   * <code>repeated .org.qsn.protobuf.TransactionSignatureDto signatures = 7;</code>
   */
  int getSignaturesCount();
  /**
   * <code>repeated .org.qsn.protobuf.TransactionSignatureDto signatures = 7;</code>
   */
  java.util.List<? extends org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionSignatureDtoOrBuilder> 
      getSignaturesOrBuilderList();
  /**
   * <code>repeated .org.qsn.protobuf.TransactionSignatureDto signatures = 7;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionSignatureDtoOrBuilder getSignaturesOrBuilder(
      int index);
}
