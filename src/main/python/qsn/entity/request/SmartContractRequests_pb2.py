# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: qsn/entity/request/SmartContractRequests.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from qsn.entity.common import BaseRequest_pb2 as qsn_dot_entity_dot_common_dot_BaseRequest__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='qsn/entity/request/SmartContractRequests.proto',
  package='org.qsn.protobuf',
  syntax='proto3',
  serialized_options=b'\n)org.qsn.api.rpc.grpc.proto.entity.requestP\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n.qsn/entity/request/SmartContractRequests.proto\x12\x10org.qsn.protobuf\x1a#qsn/entity/common/BaseRequest.proto\"\x9b\x01\n\x1cSmartContractViewOnlyRequest\x12\x32\n\x0b\x62\x61seRequest\x18\x01 \x01(\x0b\x32\x1d.org.qsn.protobuf.BaseRequest\x12\x14\n\x0c\x63ontractName\x18\x02 \x01(\t\x12\x16\n\x0e\x63ontractAction\x18\x03 \x01(\t\x12\x19\n\x11\x63ontractArguments\x18\x04 \x03(\x0c\x42-\n)org.qsn.api.rpc.grpc.proto.entity.requestP\x01\x62\x06proto3'
  ,
  dependencies=[qsn_dot_entity_dot_common_dot_BaseRequest__pb2.DESCRIPTOR,])




_SMARTCONTRACTVIEWONLYREQUEST = _descriptor.Descriptor(
  name='SmartContractViewOnlyRequest',
  full_name='org.qsn.protobuf.SmartContractViewOnlyRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='baseRequest', full_name='org.qsn.protobuf.SmartContractViewOnlyRequest.baseRequest', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='contractName', full_name='org.qsn.protobuf.SmartContractViewOnlyRequest.contractName', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='contractAction', full_name='org.qsn.protobuf.SmartContractViewOnlyRequest.contractAction', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='contractArguments', full_name='org.qsn.protobuf.SmartContractViewOnlyRequest.contractArguments', index=3,
      number=4, type=12, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=106,
  serialized_end=261,
)

_SMARTCONTRACTVIEWONLYREQUEST.fields_by_name['baseRequest'].message_type = qsn_dot_entity_dot_common_dot_BaseRequest__pb2._BASEREQUEST
DESCRIPTOR.message_types_by_name['SmartContractViewOnlyRequest'] = _SMARTCONTRACTVIEWONLYREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SmartContractViewOnlyRequest = _reflection.GeneratedProtocolMessageType('SmartContractViewOnlyRequest', (_message.Message,), {
  'DESCRIPTOR' : _SMARTCONTRACTVIEWONLYREQUEST,
  '__module__' : 'qsn.entity.request.SmartContractRequests_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.SmartContractViewOnlyRequest)
  })
_sym_db.RegisterMessage(SmartContractViewOnlyRequest)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)