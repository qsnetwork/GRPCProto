// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/request/TransactionRequests.proto

package org.qsn.api.rpc.grpc.proto.entity.request;

public final class TransactionRequests {
  private TransactionRequests() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_SendTransactionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_SendTransactionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_GetTransactionReceiptRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_GetTransactionReceiptRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_GetTransactionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_GetTransactionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_CreateRawTransferTxRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_CreateRawTransferTxRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_CreateRawDeployContractTxRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_CreateRawDeployContractTxRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_CreateRawValidatorTxRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_CreateRawValidatorTxRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_CreateRawWithdrawTxRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_CreateRawWithdrawTxRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,qsn/entity/request/TransactionRequests" +
      ".proto\022\020org.qsn.protobuf\032#qsn/entity/com" +
      "mon/BaseRequest.proto\032 qsn/entity/common" +
      "/BInteger.proto\0322qsn/entity/common/trans" +
      "action/TransactionDto.proto\"\206\001\n\026SendTran" +
      "sactionRequest\0222\n\013baseRequest\030\001 \001(\0132\035.or" +
      "g.qsn.protobuf.BaseRequest\0228\n\016transactio" +
      "nDto\030\002 \001(\0132 .org.qsn.protobuf.Transactio" +
      "nDto\"k\n\034GetTransactionReceiptRequest\0222\n\013" +
      "baseRequest\030\001 \001(\0132\035.org.qsn.protobuf.Bas" +
      "eRequest\022\027\n\017transactionHash\030\002 \001(\014\"d\n\025Get" +
      "TransactionRequest\0222\n\013baseRequest\030\001 \001(\0132" +
      "\035.org.qsn.protobuf.BaseRequest\022\027\n\017transa" +
      "ctionHash\030\002 \001(\014\"\226\001\n\032CreateRawTransferTxR" +
      "equest\0222\n\013baseRequest\030\001 \001(\0132\035.org.qsn.pr" +
      "otobuf.BaseRequest\022\014\n\004from\030\002 \001(\014\022\n\n\002to\030\003" +
      " \001(\014\022*\n\006amount\030\004 \001(\0132\032.org.qsn.protobuf." +
      "BInteger\"\255\001\n CreateRawDeployContractTxRe" +
      "quest\0222\n\013baseRequest\030\001 \001(\0132\035.org.qsn.pro" +
      "tobuf.BaseRequest\022\016\n\006sender\030\002 \001(\014\022\024\n\014con" +
      "tractCode\030\003 \001(\014\022\024\n\014contractName\030\004 \001(\t\022\031\n" +
      "\021contractClassName\030\005 \001(\t\"\346\001\n\033CreateRawVa" +
      "lidatorTxRequest\0222\n\013baseRequest\030\001 \001(\0132\035." +
      "org.qsn.protobuf.BaseRequest\022\014\n\004type\030\002 \001" +
      "(\010\022\030\n\020validatorAddress\030\003 \001(\014\022\027\n\017validato" +
      "rPubKey\030\004 \001(\014\022\031\n\021delegationAddress\030\005 \001(\014" +
      "\022)\n\005stake\030\006 \001(\0132\032.org.qsn.protobuf.BInte" +
      "ger\022\014\n\004name\030\007 \001(\t\"\215\001\n\032CreateRawWithdrawT" +
      "xRequest\0222\n\013baseRequest\030\001 \001(\0132\035.org.qsn." +
      "protobuf.BaseRequest\022\020\n\010coinBase\030\002 \001(\014\022)" +
      "\n\005value\030\003 \001(\0132\032.org.qsn.protobuf.BIntege" +
      "rB-\n)org.qsn.api.rpc.grpc.proto.entity.r" +
      "equestP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.qsn.api.rpc.grpc.proto.entity.common.BaseRequestOuterClass.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOuterClass.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDtoOuterClass.getDescriptor(),
        });
    internal_static_org_qsn_protobuf_SendTransactionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_qsn_protobuf_SendTransactionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_SendTransactionRequest_descriptor,
        new java.lang.String[] { "BaseRequest", "TransactionDto", });
    internal_static_org_qsn_protobuf_GetTransactionReceiptRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_qsn_protobuf_GetTransactionReceiptRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_GetTransactionReceiptRequest_descriptor,
        new java.lang.String[] { "BaseRequest", "TransactionHash", });
    internal_static_org_qsn_protobuf_GetTransactionRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_qsn_protobuf_GetTransactionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_GetTransactionRequest_descriptor,
        new java.lang.String[] { "BaseRequest", "TransactionHash", });
    internal_static_org_qsn_protobuf_CreateRawTransferTxRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_qsn_protobuf_CreateRawTransferTxRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_CreateRawTransferTxRequest_descriptor,
        new java.lang.String[] { "BaseRequest", "From", "To", "Amount", });
    internal_static_org_qsn_protobuf_CreateRawDeployContractTxRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_qsn_protobuf_CreateRawDeployContractTxRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_CreateRawDeployContractTxRequest_descriptor,
        new java.lang.String[] { "BaseRequest", "Sender", "ContractCode", "ContractName", "ContractClassName", });
    internal_static_org_qsn_protobuf_CreateRawValidatorTxRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_org_qsn_protobuf_CreateRawValidatorTxRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_CreateRawValidatorTxRequest_descriptor,
        new java.lang.String[] { "BaseRequest", "Type", "ValidatorAddress", "ValidatorPubKey", "DelegationAddress", "Stake", "Name", });
    internal_static_org_qsn_protobuf_CreateRawWithdrawTxRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_org_qsn_protobuf_CreateRawWithdrawTxRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_CreateRawWithdrawTxRequest_descriptor,
        new java.lang.String[] { "BaseRequest", "CoinBase", "Value", });
    org.qsn.api.rpc.grpc.proto.entity.common.BaseRequestOuterClass.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOuterClass.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDtoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
