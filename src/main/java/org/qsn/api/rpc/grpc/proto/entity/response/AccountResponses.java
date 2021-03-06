// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/response/AccountResponses.proto

package org.qsn.api.rpc.grpc.proto.entity.response;

public final class AccountResponses {
  private AccountResponses() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_GetAccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_GetAccountResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_GetAccountBalanceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_GetAccountBalanceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_GetAccountNonceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_GetAccountNonceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*qsn/entity/response/AccountResponses.p" +
      "roto\022\020org.qsn.protobuf\032\036qsn/entity/commo" +
      "n/Result.proto\032 qsn/entity/common/BInteg" +
      "er.proto\032*qsn/entity/common/account/Acco" +
      "untDto.proto\"m\n\022GetAccountResponse\022(\n\006re" +
      "sult\030\001 \001(\0132\030.org.qsn.protobuf.Result\022-\n\007" +
      "account\030\002 \001(\0132\034.org.qsn.protobuf.Account" +
      "Dto\"r\n\031GetAccountBalanceResponse\022(\n\006resu" +
      "lt\030\001 \001(\0132\030.org.qsn.protobuf.Result\022+\n\007ba" +
      "lance\030\002 \001(\0132\032.org.qsn.protobuf.BInteger\"" +
      "n\n\027GetAccountNonceResponse\022(\n\006result\030\001 \001" +
      "(\0132\030.org.qsn.protobuf.Result\022)\n\005nonce\030\002 " +
      "\001(\0132\032.org.qsn.protobuf.BIntegerB.\n*org.q" +
      "sn.api.rpc.grpc.proto.entity.responseP\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.qsn.api.rpc.grpc.proto.entity.common.ResultOuterClass.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOuterClass.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.common.account.AccountDtoOuterClass.getDescriptor(),
        });
    internal_static_org_qsn_protobuf_GetAccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_qsn_protobuf_GetAccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_GetAccountResponse_descriptor,
        new java.lang.String[] { "Result", "Account", });
    internal_static_org_qsn_protobuf_GetAccountBalanceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_qsn_protobuf_GetAccountBalanceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_GetAccountBalanceResponse_descriptor,
        new java.lang.String[] { "Result", "Balance", });
    internal_static_org_qsn_protobuf_GetAccountNonceResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_qsn_protobuf_GetAccountNonceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_GetAccountNonceResponse_descriptor,
        new java.lang.String[] { "Result", "Nonce", });
    org.qsn.api.rpc.grpc.proto.entity.common.ResultOuterClass.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOuterClass.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.common.account.AccountDtoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
