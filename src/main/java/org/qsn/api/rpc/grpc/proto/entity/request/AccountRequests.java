// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/request/AccountRequests.proto

package org.qsn.api.rpc.grpc.proto.entity.request;

public final class AccountRequests {
  private AccountRequests() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_GetAccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_GetAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_GetAccountBalanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_GetAccountBalanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_GetAccountNonceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_GetAccountNonceRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(qsn/entity/request/AccountRequests.pro" +
      "to\022\020org.qsn.protobuf\032#qsn/entity/common/" +
      "BaseRequest.proto\"X\n\021GetAccountRequest\0222" +
      "\n\013baseRequest\030\001 \001(\0132\035.org.qsn.protobuf.B" +
      "aseRequest\022\017\n\007address\030\002 \001(\014\"_\n\030GetAccoun" +
      "tBalanceRequest\0222\n\013baseRequest\030\001 \001(\0132\035.o" +
      "rg.qsn.protobuf.BaseRequest\022\017\n\007address\030\002" +
      " \001(\014\"]\n\026GetAccountNonceRequest\0222\n\013baseRe" +
      "quest\030\001 \001(\0132\035.org.qsn.protobuf.BaseReque" +
      "st\022\017\n\007address\030\002 \001(\014B-\n)org.qsn.api.rpc.g" +
      "rpc.proto.entity.requestP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.qsn.api.rpc.grpc.proto.entity.common.BaseRequestOuterClass.getDescriptor(),
        });
    internal_static_org_qsn_protobuf_GetAccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_qsn_protobuf_GetAccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_GetAccountRequest_descriptor,
        new java.lang.String[] { "BaseRequest", "Address", });
    internal_static_org_qsn_protobuf_GetAccountBalanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_qsn_protobuf_GetAccountBalanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_GetAccountBalanceRequest_descriptor,
        new java.lang.String[] { "BaseRequest", "Address", });
    internal_static_org_qsn_protobuf_GetAccountNonceRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_qsn_protobuf_GetAccountNonceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_GetAccountNonceRequest_descriptor,
        new java.lang.String[] { "BaseRequest", "Address", });
    org.qsn.api.rpc.grpc.proto.entity.common.BaseRequestOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
