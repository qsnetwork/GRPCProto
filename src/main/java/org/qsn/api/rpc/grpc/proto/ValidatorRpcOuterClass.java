// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ValidatorRpc.proto

package org.qsn.api.rpc.grpc.proto;

public final class ValidatorRpcOuterClass {
  private ValidatorRpcOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022ValidatorRpc.proto\022\020org.qsn.protobuf\032*" +
      "qsn/entity/request/ValidatorRequests.pro" +
      "to\032,qsn/entity/response/ValidatorRespons" +
      "es.proto2\361\001\n\014ValidatorRpc\022]\n\014getValidato" +
      "r\022%.org.qsn.protobuf.GetValidatorRequest" +
      "\032&.org.qsn.protobuf.GetValidatorResponse" +
      "\022\201\001\n\030getValidatorsByBlockHash\0221.org.qsn." +
      "protobuf.GetValidatorsByBlockHashRequest" +
      "\0322.org.qsn.protobuf.GetValidatorsByBlock" +
      "HashResponseB\036\n\032org.qsn.api.rpc.grpc.pro" +
      "toP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.qsn.api.rpc.grpc.proto.entity.request.ValidatorRequests.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.response.ValidatorResponses.getDescriptor(),
        });
    org.qsn.api.rpc.grpc.proto.entity.request.ValidatorRequests.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.response.ValidatorResponses.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
