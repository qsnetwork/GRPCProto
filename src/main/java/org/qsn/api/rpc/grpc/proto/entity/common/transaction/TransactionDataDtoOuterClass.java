// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/common/transaction/TransactionDataDto.proto

package org.qsn.api.rpc.grpc.proto.entity.common.transaction;

public final class TransactionDataDtoOuterClass {
  private TransactionDataDtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_TransactionDataDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_TransactionDataDto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6qsn/entity/common/transaction/Transact" +
      "ionDataDto.proto\022\020org.qsn.protobuf\032 qsn/" +
      "entity/common/BInteger.proto\032\031google/pro" +
      "tobuf/any.proto\"s\n\022TransactionDataDto\022\016\n" +
      "\006sender\030\001 \001(\014\022)\n\005nonce\030\002 \001(\0132\032.org.qsn.p" +
      "rotobuf.BInteger\022\"\n\004data\030\003 \001(\0132\024.google." +
      "protobuf.AnyB8\n4org.qsn.api.rpc.grpc.pro" +
      "to.entity.common.transactionP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOuterClass.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_org_qsn_protobuf_TransactionDataDto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_qsn_protobuf_TransactionDataDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_TransactionDataDto_descriptor,
        new java.lang.String[] { "Sender", "Nonce", "Data", });
    org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOuterClass.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
