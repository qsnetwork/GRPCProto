# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: qsn/entity/response/SmartContractResponses.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from qsn.entity.common import Result_pb2 as qsn_dot_entity_dot_common_dot_Result__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='qsn/entity/response/SmartContractResponses.proto',
  package='org.qsn.protobuf',
  syntax='proto3',
  serialized_options=b'\n*org.qsn.api.rpc.grpc.proto.entity.responseP\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n0qsn/entity/response/SmartContractResponses.proto\x12\x10org.qsn.protobuf\x1a\x1eqsn/entity/common/Result.proto\"[\n\x1dSmartContractViewOnlyResponse\x12(\n\x06result\x18\x01 \x01(\x0b\x32\x18.org.qsn.protobuf.Result\x12\x10\n\x08response\x18\x02 \x01(\x0c\x42.\n*org.qsn.api.rpc.grpc.proto.entity.responseP\x01\x62\x06proto3'
  ,
  dependencies=[qsn_dot_entity_dot_common_dot_Result__pb2.DESCRIPTOR,])




_SMARTCONTRACTVIEWONLYRESPONSE = _descriptor.Descriptor(
  name='SmartContractViewOnlyResponse',
  full_name='org.qsn.protobuf.SmartContractViewOnlyResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='org.qsn.protobuf.SmartContractViewOnlyResponse.result', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='response', full_name='org.qsn.protobuf.SmartContractViewOnlyResponse.response', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=102,
  serialized_end=193,
)

_SMARTCONTRACTVIEWONLYRESPONSE.fields_by_name['result'].message_type = qsn_dot_entity_dot_common_dot_Result__pb2._RESULT
DESCRIPTOR.message_types_by_name['SmartContractViewOnlyResponse'] = _SMARTCONTRACTVIEWONLYRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SmartContractViewOnlyResponse = _reflection.GeneratedProtocolMessageType('SmartContractViewOnlyResponse', (_message.Message,), {
  'DESCRIPTOR' : _SMARTCONTRACTVIEWONLYRESPONSE,
  '__module__' : 'qsn.entity.response.SmartContractResponses_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.SmartContractViewOnlyResponse)
  })
_sym_db.RegisterMessage(SmartContractViewOnlyResponse)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
