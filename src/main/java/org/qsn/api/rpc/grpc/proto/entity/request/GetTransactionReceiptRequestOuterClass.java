// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/request/GetTransactionReceiptRequest.proto

package org.qsn.api.rpc.grpc.proto.entity.request;

public final class GetTransactionReceiptRequestOuterClass {
  private GetTransactionReceiptRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_GetTransactionReceiptRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_GetTransactionReceiptRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5qsn/entity/request/GetTransactionRecei" +
      "ptRequest.proto\022\020org.qsn.protobuf\032#qsn/e" +
      "ntity/common/BaseRequest.proto\0322qsn/enti" +
      "ty/common/transaction/TransactionDto.pro" +
      "to\"k\n\034GetTransactionReceiptRequest\0222\n\013ba" +
      "seRequest\030\001 \001(\0132\035.org.qsn.protobuf.BaseR" +
      "equest\022\027\n\017transactionHash\030\002 \001(\014B-\n)org.q" +
      "sn.api.rpc.grpc.proto.entity.requestP\001b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.qsn.api.rpc.grpc.proto.entity.common.BaseRequestOuterClass.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDtoOuterClass.getDescriptor(),
        });
    internal_static_org_qsn_protobuf_GetTransactionReceiptRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_qsn_protobuf_GetTransactionReceiptRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_GetTransactionReceiptRequest_descriptor,
        new java.lang.String[] { "BaseRequest", "TransactionHash", });
    org.qsn.api.rpc.grpc.proto.entity.common.BaseRequestOuterClass.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDtoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}