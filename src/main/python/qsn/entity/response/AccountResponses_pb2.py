# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: qsn/entity/response/AccountResponses.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from qsn.entity.common import Result_pb2 as qsn_dot_entity_dot_common_dot_Result__pb2
from qsn.entity.common import BInteger_pb2 as qsn_dot_entity_dot_common_dot_BInteger__pb2
from qsn.entity.common.account import Account_pb2 as qsn_dot_entity_dot_common_dot_account_dot_Account__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='qsn/entity/response/AccountResponses.proto',
  package='org.qsn.protobuf',
  syntax='proto3',
  serialized_options=b'\n*org.qsn.api.rpc.grpc.proto.entity.responseP\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n*qsn/entity/response/AccountResponses.proto\x12\x10org.qsn.protobuf\x1a\x1eqsn/entity/common/Result.proto\x1a qsn/entity/common/BInteger.proto\x1a\'qsn/entity/common/account/Account.proto\"m\n\x12GetAccountResponse\x12(\n\x06result\x18\x01 \x01(\x0b\x32\x18.org.qsn.protobuf.Result\x12-\n\x07\x61\x63\x63ount\x18\x02 \x01(\x0b\x32\x1c.org.qsn.protobuf.AccountDto\"r\n\x19GetAccountBalanceResponse\x12(\n\x06result\x18\x01 \x01(\x0b\x32\x18.org.qsn.protobuf.Result\x12+\n\x07\x62\x61lance\x18\x02 \x01(\x0b\x32\x1a.org.qsn.protobuf.BInteger\"n\n\x17GetAccountNonceResponse\x12(\n\x06result\x18\x01 \x01(\x0b\x32\x18.org.qsn.protobuf.Result\x12)\n\x05nonce\x18\x02 \x01(\x0b\x32\x1a.org.qsn.protobuf.BIntegerB.\n*org.qsn.api.rpc.grpc.proto.entity.responseP\x01\x62\x06proto3'
  ,
  dependencies=[qsn_dot_entity_dot_common_dot_Result__pb2.DESCRIPTOR,qsn_dot_entity_dot_common_dot_BInteger__pb2.DESCRIPTOR,qsn_dot_entity_dot_common_dot_account_dot_Account__pb2.DESCRIPTOR,])




_GETACCOUNTRESPONSE = _descriptor.Descriptor(
  name='GetAccountResponse',
  full_name='org.qsn.protobuf.GetAccountResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='org.qsn.protobuf.GetAccountResponse.result', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='account', full_name='org.qsn.protobuf.GetAccountResponse.account', index=1,
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
  serialized_start=171,
  serialized_end=280,
)


_GETACCOUNTBALANCERESPONSE = _descriptor.Descriptor(
  name='GetAccountBalanceResponse',
  full_name='org.qsn.protobuf.GetAccountBalanceResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='org.qsn.protobuf.GetAccountBalanceResponse.result', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='balance', full_name='org.qsn.protobuf.GetAccountBalanceResponse.balance', index=1,
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
  serialized_start=282,
  serialized_end=396,
)


_GETACCOUNTNONCERESPONSE = _descriptor.Descriptor(
  name='GetAccountNonceResponse',
  full_name='org.qsn.protobuf.GetAccountNonceResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='org.qsn.protobuf.GetAccountNonceResponse.result', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='nonce', full_name='org.qsn.protobuf.GetAccountNonceResponse.nonce', index=1,
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
  serialized_start=398,
  serialized_end=508,
)

_GETACCOUNTRESPONSE.fields_by_name['result'].message_type = qsn_dot_entity_dot_common_dot_Result__pb2._RESULT
_GETACCOUNTRESPONSE.fields_by_name['account'].message_type = qsn_dot_entity_dot_common_dot_account_dot_Account__pb2._ACCOUNTDTO
_GETACCOUNTBALANCERESPONSE.fields_by_name['result'].message_type = qsn_dot_entity_dot_common_dot_Result__pb2._RESULT
_GETACCOUNTBALANCERESPONSE.fields_by_name['balance'].message_type = qsn_dot_entity_dot_common_dot_BInteger__pb2._BINTEGER
_GETACCOUNTNONCERESPONSE.fields_by_name['result'].message_type = qsn_dot_entity_dot_common_dot_Result__pb2._RESULT
_GETACCOUNTNONCERESPONSE.fields_by_name['nonce'].message_type = qsn_dot_entity_dot_common_dot_BInteger__pb2._BINTEGER
DESCRIPTOR.message_types_by_name['GetAccountResponse'] = _GETACCOUNTRESPONSE
DESCRIPTOR.message_types_by_name['GetAccountBalanceResponse'] = _GETACCOUNTBALANCERESPONSE
DESCRIPTOR.message_types_by_name['GetAccountNonceResponse'] = _GETACCOUNTNONCERESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetAccountResponse = _reflection.GeneratedProtocolMessageType('GetAccountResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETACCOUNTRESPONSE,
  '__module__' : 'qsn.entity.response.AccountResponses_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.GetAccountResponse)
  })
_sym_db.RegisterMessage(GetAccountResponse)

GetAccountBalanceResponse = _reflection.GeneratedProtocolMessageType('GetAccountBalanceResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETACCOUNTBALANCERESPONSE,
  '__module__' : 'qsn.entity.response.AccountResponses_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.GetAccountBalanceResponse)
  })
_sym_db.RegisterMessage(GetAccountBalanceResponse)

GetAccountNonceResponse = _reflection.GeneratedProtocolMessageType('GetAccountNonceResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETACCOUNTNONCERESPONSE,
  '__module__' : 'qsn.entity.response.AccountResponses_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.GetAccountNonceResponse)
  })
_sym_db.RegisterMessage(GetAccountNonceResponse)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)