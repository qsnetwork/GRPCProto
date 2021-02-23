# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: qsn/entity/response/ValidatorResponses.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from qsn.entity.common import Result_pb2 as qsn_dot_entity_dot_common_dot_Result__pb2
from qsn.entity.common.validator import ValidatorDto_pb2 as qsn_dot_entity_dot_common_dot_validator_dot_ValidatorDto__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='qsn/entity/response/ValidatorResponses.proto',
  package='org.qsn.protobuf',
  syntax='proto3',
  serialized_options=b'\n*org.qsn.api.rpc.grpc.proto.entity.responseP\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n,qsn/entity/response/ValidatorResponses.proto\x12\x10org.qsn.protobuf\x1a\x1eqsn/entity/common/Result.proto\x1a.qsn/entity/common/validator/ValidatorDto.proto\"s\n\x14GetValidatorResponse\x12(\n\x06result\x18\x01 \x01(\x0b\x32\x18.org.qsn.protobuf.Result\x12\x31\n\tvalidator\x18\x02 \x01(\x0b\x32\x1e.org.qsn.protobuf.ValidatorDto\"\x80\x01\n GetValidatorsByBlockHashResponse\x12(\n\x06result\x18\x01 \x01(\x0b\x32\x18.org.qsn.protobuf.Result\x12\x32\n\nvalidators\x18\x02 \x03(\x0b\x32\x1e.org.qsn.protobuf.ValidatorDtoB.\n*org.qsn.api.rpc.grpc.proto.entity.responseP\x01\x62\x06proto3'
  ,
  dependencies=[qsn_dot_entity_dot_common_dot_Result__pb2.DESCRIPTOR,qsn_dot_entity_dot_common_dot_validator_dot_ValidatorDto__pb2.DESCRIPTOR,])




_GETVALIDATORRESPONSE = _descriptor.Descriptor(
  name='GetValidatorResponse',
  full_name='org.qsn.protobuf.GetValidatorResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='org.qsn.protobuf.GetValidatorResponse.result', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validator', full_name='org.qsn.protobuf.GetValidatorResponse.validator', index=1,
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
  serialized_start=146,
  serialized_end=261,
)


_GETVALIDATORSBYBLOCKHASHRESPONSE = _descriptor.Descriptor(
  name='GetValidatorsByBlockHashResponse',
  full_name='org.qsn.protobuf.GetValidatorsByBlockHashResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='org.qsn.protobuf.GetValidatorsByBlockHashResponse.result', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validators', full_name='org.qsn.protobuf.GetValidatorsByBlockHashResponse.validators', index=1,
      number=2, type=11, cpp_type=10, label=3,
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
  serialized_start=264,
  serialized_end=392,
)

_GETVALIDATORRESPONSE.fields_by_name['result'].message_type = qsn_dot_entity_dot_common_dot_Result__pb2._RESULT
_GETVALIDATORRESPONSE.fields_by_name['validator'].message_type = qsn_dot_entity_dot_common_dot_validator_dot_ValidatorDto__pb2._VALIDATORDTO
_GETVALIDATORSBYBLOCKHASHRESPONSE.fields_by_name['result'].message_type = qsn_dot_entity_dot_common_dot_Result__pb2._RESULT
_GETVALIDATORSBYBLOCKHASHRESPONSE.fields_by_name['validators'].message_type = qsn_dot_entity_dot_common_dot_validator_dot_ValidatorDto__pb2._VALIDATORDTO
DESCRIPTOR.message_types_by_name['GetValidatorResponse'] = _GETVALIDATORRESPONSE
DESCRIPTOR.message_types_by_name['GetValidatorsByBlockHashResponse'] = _GETVALIDATORSBYBLOCKHASHRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetValidatorResponse = _reflection.GeneratedProtocolMessageType('GetValidatorResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETVALIDATORRESPONSE,
  '__module__' : 'qsn.entity.response.ValidatorResponses_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.GetValidatorResponse)
  })
_sym_db.RegisterMessage(GetValidatorResponse)

GetValidatorsByBlockHashResponse = _reflection.GeneratedProtocolMessageType('GetValidatorsByBlockHashResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETVALIDATORSBYBLOCKHASHRESPONSE,
  '__module__' : 'qsn.entity.response.ValidatorResponses_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.GetValidatorsByBlockHashResponse)
  })
_sym_db.RegisterMessage(GetValidatorsByBlockHashResponse)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)