# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: qsn/entity/request/ValidatorRequests.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from qsn.entity.common import BaseRequest_pb2 as qsn_dot_entity_dot_common_dot_BaseRequest__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='qsn/entity/request/ValidatorRequests.proto',
  package='org.qsn.protobuf',
  syntax='proto3',
  serialized_options=b'\n)org.qsn.api.rpc.grpc.proto.entity.requestP\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n*qsn/entity/request/ValidatorRequests.proto\x12\x10org.qsn.protobuf\x1a#qsn/entity/common/BaseRequest.proto\"Z\n\x13GetValidatorRequest\x12\x32\n\x0b\x62\x61seRequest\x18\x01 \x01(\x0b\x32\x1d.org.qsn.protobuf.BaseRequest\x12\x0f\n\x07\x61\x64\x64ress\x18\x02 \x01(\x0c\"f\n\x1fGetValidatorsByBlockHashRequest\x12\x32\n\x0b\x62\x61seRequest\x18\x01 \x01(\x0b\x32\x1d.org.qsn.protobuf.BaseRequest\x12\x0f\n\x07\x61\x64\x64ress\x18\x02 \x01(\x0c\x42-\n)org.qsn.api.rpc.grpc.proto.entity.requestP\x01\x62\x06proto3'
  ,
  dependencies=[qsn_dot_entity_dot_common_dot_BaseRequest__pb2.DESCRIPTOR,])




_GETVALIDATORREQUEST = _descriptor.Descriptor(
  name='GetValidatorRequest',
  full_name='org.qsn.protobuf.GetValidatorRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='baseRequest', full_name='org.qsn.protobuf.GetValidatorRequest.baseRequest', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='address', full_name='org.qsn.protobuf.GetValidatorRequest.address', index=1,
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
  serialized_start=101,
  serialized_end=191,
)


_GETVALIDATORSBYBLOCKHASHREQUEST = _descriptor.Descriptor(
  name='GetValidatorsByBlockHashRequest',
  full_name='org.qsn.protobuf.GetValidatorsByBlockHashRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='baseRequest', full_name='org.qsn.protobuf.GetValidatorsByBlockHashRequest.baseRequest', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='address', full_name='org.qsn.protobuf.GetValidatorsByBlockHashRequest.address', index=1,
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
  serialized_start=193,
  serialized_end=295,
)

_GETVALIDATORREQUEST.fields_by_name['baseRequest'].message_type = qsn_dot_entity_dot_common_dot_BaseRequest__pb2._BASEREQUEST
_GETVALIDATORSBYBLOCKHASHREQUEST.fields_by_name['baseRequest'].message_type = qsn_dot_entity_dot_common_dot_BaseRequest__pb2._BASEREQUEST
DESCRIPTOR.message_types_by_name['GetValidatorRequest'] = _GETVALIDATORREQUEST
DESCRIPTOR.message_types_by_name['GetValidatorsByBlockHashRequest'] = _GETVALIDATORSBYBLOCKHASHREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetValidatorRequest = _reflection.GeneratedProtocolMessageType('GetValidatorRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETVALIDATORREQUEST,
  '__module__' : 'qsn.entity.request.ValidatorRequests_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.GetValidatorRequest)
  })
_sym_db.RegisterMessage(GetValidatorRequest)

GetValidatorsByBlockHashRequest = _reflection.GeneratedProtocolMessageType('GetValidatorsByBlockHashRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETVALIDATORSBYBLOCKHASHREQUEST,
  '__module__' : 'qsn.entity.request.ValidatorRequests_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.GetValidatorsByBlockHashRequest)
  })
_sym_db.RegisterMessage(GetValidatorsByBlockHashRequest)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)