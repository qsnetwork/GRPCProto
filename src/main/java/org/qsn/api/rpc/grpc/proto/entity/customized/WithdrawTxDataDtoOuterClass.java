// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/customized/WithdrawTxDataDto.proto

package org.qsn.api.rpc.grpc.proto.entity.customized;

public final class WithdrawTxDataDtoOuterClass {
  private WithdrawTxDataDtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_WithdrawTxDataDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_WithdrawTxDataDto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-qsn/entity/customized/WithdrawTxDataDt" +
      "o.proto\022\020org.qsn.protobuf\032 qsn/entity/co" +
      "mmon/BInteger.proto\"`\n\021WithdrawTxDataDto" +
      "\022\020\n\010coinBase\030\001 \001(\014\022)\n\005value\030\002 \001(\0132\032.org." +
      "qsn.protobuf.BInteger\022\016\n\006pubKey\030\003 \001(\014B0\n" +
      ",org.qsn.api.rpc.grpc.proto.entity.custo" +
      "mizedP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOuterClass.getDescriptor(),
        });
    internal_static_org_qsn_protobuf_WithdrawTxDataDto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_qsn_protobuf_WithdrawTxDataDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_WithdrawTxDataDto_descriptor,
        new java.lang.String[] { "CoinBase", "Value", "PubKey", });
    org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
