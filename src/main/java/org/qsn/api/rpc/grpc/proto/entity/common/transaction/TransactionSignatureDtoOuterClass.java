// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/common/transaction/TransactionSignatureDto.proto

package org.qsn.api.rpc.grpc.proto.entity.common.transaction;

public final class TransactionSignatureDtoOuterClass {
  private TransactionSignatureDtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_TransactionSignatureDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_TransactionSignatureDto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;qsn/entity/common/transaction/Transact" +
      "ionSignatureDto.proto\022\020org.qsn.protobuf\"" +
      "9\n\027TransactionSignatureDto\022\016\n\006pubKey\030\001 \001" +
      "(\014\022\016\n\006signed\030\002 \001(\014B8\n4org.qsn.api.rpc.gr" +
      "pc.proto.entity.common.transactionP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_qsn_protobuf_TransactionSignatureDto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_qsn_protobuf_TransactionSignatureDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_TransactionSignatureDto_descriptor,
        new java.lang.String[] { "PubKey", "Signed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
