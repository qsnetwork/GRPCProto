# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: qsn/entity/customized/ValidatorTxDataDto.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from qsn.entity.common import BInteger_pb2 as qsn_dot_entity_dot_common_dot_BInteger__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='qsn/entity/customized/ValidatorTxDataDto.proto',
  package='org.qsn.protobuf',
  syntax='proto3',
  serialized_options=b'\n,org.qsn.api.rpc.grpc.proto.entity.customizedP\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n.qsn/entity/customized/ValidatorTxDataDto.proto\x12\x10org.qsn.protobuf\x1a qsn/entity/common/BInteger.proto\"\x9b\x01\n\x12ValidatorTxDataDto\x12\x18\n\x10validatorAddress\x18\x01 \x01(\x0c\x12\x17\n\x0fvalidatorPubKey\x18\x02 \x01(\x0c\x12\x19\n\x11\x64\x65legationAddress\x18\x03 \x01(\x0c\x12)\n\x05stake\x18\x04 \x01(\x0b\x32\x1a.org.qsn.protobuf.BInteger\x12\x0c\n\x04name\x18\x05 \x01(\tB0\n,org.qsn.api.rpc.grpc.proto.entity.customizedP\x01\x62\x06proto3'
  ,
  dependencies=[qsn_dot_entity_dot_common_dot_BInteger__pb2.DESCRIPTOR,])




_VALIDATORTXDATADTO = _descriptor.Descriptor(
  name='ValidatorTxDataDto',
  full_name='org.qsn.protobuf.ValidatorTxDataDto',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='validatorAddress', full_name='org.qsn.protobuf.ValidatorTxDataDto.validatorAddress', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validatorPubKey', full_name='org.qsn.protobuf.ValidatorTxDataDto.validatorPubKey', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='delegationAddress', full_name='org.qsn.protobuf.ValidatorTxDataDto.delegationAddress', index=2,
      number=3, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stake', full_name='org.qsn.protobuf.ValidatorTxDataDto.stake', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='org.qsn.protobuf.ValidatorTxDataDto.name', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=103,
  serialized_end=258,
)

_VALIDATORTXDATADTO.fields_by_name['stake'].message_type = qsn_dot_entity_dot_common_dot_BInteger__pb2._BINTEGER
DESCRIPTOR.message_types_by_name['ValidatorTxDataDto'] = _VALIDATORTXDATADTO
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ValidatorTxDataDto = _reflection.GeneratedProtocolMessageType('ValidatorTxDataDto', (_message.Message,), {
  'DESCRIPTOR' : _VALIDATORTXDATADTO,
  '__module__' : 'qsn.entity.customized.ValidatorTxDataDto_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.ValidatorTxDataDto)
  })
_sym_db.RegisterMessage(ValidatorTxDataDto)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
