// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/customized/DeployContractTxDataDto.proto

package org.qsn.api.rpc.grpc.proto.entity.customized;

public final class DeployContractTxDataDtoOuterClass {
  private DeployContractTxDataDtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_DeployContractTxDataDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_DeployContractTxDataDto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3qsn/entity/customized/DeployContractTx" +
      "DataDto.proto\022\020org.qsn.protobuf\"`\n\027Deplo" +
      "yContractTxDataDto\022\024\n\014contractCode\030\001 \001(\014" +
      "\022\024\n\014contractName\030\002 \001(\t\022\031\n\021contractClassN" +
      "ame\030\003 \001(\tB0\n,org.qsn.api.rpc.grpc.proto." +
      "entity.customizedP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_qsn_protobuf_DeployContractTxDataDto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_qsn_protobuf_DeployContractTxDataDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_DeployContractTxDataDto_descriptor,
        new java.lang.String[] { "ContractCode", "ContractName", "ContractClassName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
