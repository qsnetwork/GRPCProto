# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: qsn/entity/customized/TransferTxDataDto.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from qsn.entity.common import BInteger_pb2 as qsn_dot_entity_dot_common_dot_BInteger__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='qsn/entity/customized/TransferTxDataDto.proto',
  package='org.qsn.protobuf',
  syntax='proto3',
  serialized_options=b'\n,org.qsn.api.rpc.grpc.proto.entity.customizedP\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n-qsn/entity/customized/TransferTxDataDto.proto\x12\x10org.qsn.protobuf\x1a qsn/entity/common/BInteger.proto\"J\n\x11TransferTxDataDto\x12\n\n\x02to\x18\x01 \x01(\x0c\x12)\n\x05value\x18\x02 \x01(\x0b\x32\x1a.org.qsn.protobuf.BIntegerB0\n,org.qsn.api.rpc.grpc.proto.entity.customizedP\x01\x62\x06proto3'
  ,
  dependencies=[qsn_dot_entity_dot_common_dot_BInteger__pb2.DESCRIPTOR,])




_TRANSFERTXDATADTO = _descriptor.Descriptor(
  name='TransferTxDataDto',
  full_name='org.qsn.protobuf.TransferTxDataDto',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='to', full_name='org.qsn.protobuf.TransferTxDataDto.to', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='org.qsn.protobuf.TransferTxDataDto.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
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
  serialized_start=101,
  serialized_end=175,
)

_TRANSFERTXDATADTO.fields_by_name['value'].message_type = qsn_dot_entity_dot_common_dot_BInteger__pb2._BINTEGER
DESCRIPTOR.message_types_by_name['TransferTxDataDto'] = _TRANSFERTXDATADTO
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TransferTxDataDto = _reflection.GeneratedProtocolMessageType('TransferTxDataDto', (_message.Message,), {
  'DESCRIPTOR' : _TRANSFERTXDATADTO,
  '__module__' : 'qsn.entity.customized.TransferTxDataDto_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.TransferTxDataDto)
  })
_sym_db.RegisterMessage(TransferTxDataDto)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
