// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/common/BInteger.proto

package org.qsn.api.rpc.grpc.proto.entity.common;

public final class BIntegerOuterClass {
  private BIntegerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_BInteger_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_BInteger_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n qsn/entity/common/BInteger.proto\022\020org." +
      "qsn.protobuf\"\031\n\010BInteger\022\r\n\005value\030\001 \001(\014B" +
      ",\n(org.qsn.api.rpc.grpc.proto.entity.com" +
      "monP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_qsn_protobuf_BInteger_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_qsn_protobuf_BInteger_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_BInteger_descriptor,
        new java.lang.String[] { "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
