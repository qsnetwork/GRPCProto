# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: qsn/entity/response/BlockResponses.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from qsn.entity.common import Result_pb2 as qsn_dot_entity_dot_common_dot_Result__pb2
from qsn.entity.common.block import Block_pb2 as qsn_dot_entity_dot_common_dot_block_dot_Block__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='qsn/entity/response/BlockResponses.proto',
  package='org.qsn.protobuf',
  syntax='proto3',
  serialized_options=b'\n*org.qsn.api.rpc.grpc.proto.entity.responseP\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n(qsn/entity/response/BlockResponses.proto\x12\x10org.qsn.protobuf\x1a\x1eqsn/entity/common/Result.proto\x1a#qsn/entity/common/block/Block.proto\"z\n\x1cGetBlockHeaderByHashResponse\x12(\n\x06result\x18\x01 \x01(\x0b\x32\x18.org.qsn.protobuf.Result\x12\x30\n\x06header\x18\x02 \x01(\x0b\x32 .org.qsn.protobuf.BlockHeaderDto\"|\n\x1eGetBlockHeaderByHeightResponse\x12(\n\x06result\x18\x01 \x01(\x0b\x32\x18.org.qsn.protobuf.Result\x12\x30\n\x06header\x18\x02 \x01(\x0b\x32 .org.qsn.protobuf.BlockHeaderDto\"m\n\x16GetBlockByHashResponse\x12(\n\x06result\x18\x01 \x01(\x0b\x32\x18.org.qsn.protobuf.Result\x12)\n\x05\x62lock\x18\x02 \x01(\x0b\x32\x1a.org.qsn.protobuf.BlockDto\"o\n\x18GetBlockByHeightResponse\x12(\n\x06result\x18\x01 \x01(\x0b\x32\x18.org.qsn.protobuf.Result\x12)\n\x05\x62lock\x18\x02 \x01(\x0b\x32\x1a.org.qsn.protobuf.BlockDto\"R\n\x16GetBlockHeightResponse\x12(\n\x06result\x18\x01 \x01(\x0b\x32\x18.org.qsn.protobuf.Result\x12\x0e\n\x06height\x18\x02 \x01(\x03\x42.\n*org.qsn.api.rpc.grpc.proto.entity.responseP\x01\x62\x06proto3'
  ,
  dependencies=[qsn_dot_entity_dot_common_dot_Result__pb2.DESCRIPTOR,qsn_dot_entity_dot_common_dot_block_dot_Block__pb2.DESCRIPTOR,])




_GETBLOCKHEADERBYHASHRESPONSE = _descriptor.Descriptor(
  name='GetBlockHeaderByHashResponse',
  full_name='org.qsn.protobuf.GetBlockHeaderByHashResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='org.qsn.protobuf.GetBlockHeaderByHashResponse.result', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='header', full_name='org.qsn.protobuf.GetBlockHeaderByHashResponse.header', index=1,
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
  serialized_start=131,
  serialized_end=253,
)


_GETBLOCKHEADERBYHEIGHTRESPONSE = _descriptor.Descriptor(
  name='GetBlockHeaderByHeightResponse',
  full_name='org.qsn.protobuf.GetBlockHeaderByHeightResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='org.qsn.protobuf.GetBlockHeaderByHeightResponse.result', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='header', full_name='org.qsn.protobuf.GetBlockHeaderByHeightResponse.header', index=1,
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
  serialized_start=255,
  serialized_end=379,
)


_GETBLOCKBYHASHRESPONSE = _descriptor.Descriptor(
  name='GetBlockByHashResponse',
  full_name='org.qsn.protobuf.GetBlockByHashResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='org.qsn.protobuf.GetBlockByHashResponse.result', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='block', full_name='org.qsn.protobuf.GetBlockByHashResponse.block', index=1,
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
  serialized_start=381,
  serialized_end=490,
)


_GETBLOCKBYHEIGHTRESPONSE = _descriptor.Descriptor(
  name='GetBlockByHeightResponse',
  full_name='org.qsn.protobuf.GetBlockByHeightResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='org.qsn.protobuf.GetBlockByHeightResponse.result', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='block', full_name='org.qsn.protobuf.GetBlockByHeightResponse.block', index=1,
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
  serialized_start=492,
  serialized_end=603,
)


_GETBLOCKHEIGHTRESPONSE = _descriptor.Descriptor(
  name='GetBlockHeightResponse',
  full_name='org.qsn.protobuf.GetBlockHeightResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='org.qsn.protobuf.GetBlockHeightResponse.result', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='height', full_name='org.qsn.protobuf.GetBlockHeightResponse.height', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=605,
  serialized_end=687,
)

_GETBLOCKHEADERBYHASHRESPONSE.fields_by_name['result'].message_type = qsn_dot_entity_dot_common_dot_Result__pb2._RESULT
_GETBLOCKHEADERBYHASHRESPONSE.fields_by_name['header'].message_type = qsn_dot_entity_dot_common_dot_block_dot_Block__pb2._BLOCKHEADERDTO
_GETBLOCKHEADERBYHEIGHTRESPONSE.fields_by_name['result'].message_type = qsn_dot_entity_dot_common_dot_Result__pb2._RESULT
_GETBLOCKHEADERBYHEIGHTRESPONSE.fields_by_name['header'].message_type = qsn_dot_entity_dot_common_dot_block_dot_Block__pb2._BLOCKHEADERDTO
_GETBLOCKBYHASHRESPONSE.fields_by_name['result'].message_type = qsn_dot_entity_dot_common_dot_Result__pb2._RESULT
_GETBLOCKBYHASHRESPONSE.fields_by_name['block'].message_type = qsn_dot_entity_dot_common_dot_block_dot_Block__pb2._BLOCKDTO
_GETBLOCKBYHEIGHTRESPONSE.fields_by_name['result'].message_type = qsn_dot_entity_dot_common_dot_Result__pb2._RESULT
_GETBLOCKBYHEIGHTRESPONSE.fields_by_name['block'].message_type = qsn_dot_entity_dot_common_dot_block_dot_Block__pb2._BLOCKDTO
_GETBLOCKHEIGHTRESPONSE.fields_by_name['result'].message_type = qsn_dot_entity_dot_common_dot_Result__pb2._RESULT
DESCRIPTOR.message_types_by_name['GetBlockHeaderByHashResponse'] = _GETBLOCKHEADERBYHASHRESPONSE
DESCRIPTOR.message_types_by_name['GetBlockHeaderByHeightResponse'] = _GETBLOCKHEADERBYHEIGHTRESPONSE
DESCRIPTOR.message_types_by_name['GetBlockByHashResponse'] = _GETBLOCKBYHASHRESPONSE
DESCRIPTOR.message_types_by_name['GetBlockByHeightResponse'] = _GETBLOCKBYHEIGHTRESPONSE
DESCRIPTOR.message_types_by_name['GetBlockHeightResponse'] = _GETBLOCKHEIGHTRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetBlockHeaderByHashResponse = _reflection.GeneratedProtocolMessageType('GetBlockHeaderByHashResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETBLOCKHEADERBYHASHRESPONSE,
  '__module__' : 'qsn.entity.response.BlockResponses_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.GetBlockHeaderByHashResponse)
  })
_sym_db.RegisterMessage(GetBlockHeaderByHashResponse)

GetBlockHeaderByHeightResponse = _reflection.GeneratedProtocolMessageType('GetBlockHeaderByHeightResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETBLOCKHEADERBYHEIGHTRESPONSE,
  '__module__' : 'qsn.entity.response.BlockResponses_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.GetBlockHeaderByHeightResponse)
  })
_sym_db.RegisterMessage(GetBlockHeaderByHeightResponse)

GetBlockByHashResponse = _reflection.GeneratedProtocolMessageType('GetBlockByHashResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETBLOCKBYHASHRESPONSE,
  '__module__' : 'qsn.entity.response.BlockResponses_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.GetBlockByHashResponse)
  })
_sym_db.RegisterMessage(GetBlockByHashResponse)

GetBlockByHeightResponse = _reflection.GeneratedProtocolMessageType('GetBlockByHeightResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETBLOCKBYHEIGHTRESPONSE,
  '__module__' : 'qsn.entity.response.BlockResponses_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.GetBlockByHeightResponse)
  })
_sym_db.RegisterMessage(GetBlockByHeightResponse)

GetBlockHeightResponse = _reflection.GeneratedProtocolMessageType('GetBlockHeightResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETBLOCKHEIGHTRESPONSE,
  '__module__' : 'qsn.entity.response.BlockResponses_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.GetBlockHeightResponse)
  })
_sym_db.RegisterMessage(GetBlockHeightResponse)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
