# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: qsn/entity/common/block/Block.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from qsn.entity.common.transaction import TransactionDto_pb2 as qsn_dot_entity_dot_common_dot_transaction_dot_TransactionDto__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='qsn/entity/common/block/Block.proto',
  package='org.qsn.protobuf',
  syntax='proto3',
  serialized_options=b'\n.org.qsn.api.rpc.grpc.proto.entity.common.blockP\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n#qsn/entity/common/block/Block.proto\x12\x10org.qsn.protobuf\x1a\x32qsn/entity/common/transaction/TransactionDto.proto\"0\n\x12\x42lockHeaderVersion\x12\r\n\x05\x62lock\x18\x01 \x01(\x05\x12\x0b\n\x03\x61pp\x18\x02 \x01(\x05\"\xee\x03\n\x0e\x42lockHeaderDto\x12\x35\n\x07version\x18\x01 \x01(\x0b\x32$.org.qsn.protobuf.BlockHeaderVersion\x12\x14\n\x0c\x62lockAddress\x18\x02 \x01(\x0c\x12\x0f\n\x07\x63hainId\x18\x03 \x01(\t\x12\x0e\n\x06height\x18\x04 \x01(\x03\x12\x0c\n\x04time\x18\x05 \x01(\x03\x12\x0e\n\x06numTxs\x18\x06 \x01(\x03\x12\x10\n\x08totalTxs\x18\x07 \x01(\x03\x12\x1e\n\x16proposerSequenceNumber\x18\x08 \x01(\x03\x12\x15\n\rlastBlockhash\x18\t \x01(\x0c\x12\x16\n\x0elastCommitHash\x18\n \x01(\x0c\x12\x10\n\x08\x64\x61taHash\x18\x0b \x01(\x0c\x12\x16\n\x0evalidatorsHash\x18\x0c \x01(\x0c\x12\x1a\n\x12nextValidatorsHash\x18\r \x01(\x0c\x12\x13\n\x0b\x61\x63\x63ountHash\x18\x0e \x01(\x0c\x12\x14\n\x0c\x63ontractHash\x18\x0f \x01(\x0c\x12\x13\n\x0bstorageHash\x18\x10 \x01(\x0c\x12\x17\n\x0ftransactionHash\x18\x11 \x01(\x0c\x12\x1e\n\x16transactionReceiptHash\x18\x12 \x01(\x0c\x12\x17\n\x0f\x62lockRewardHash\x18\x13 \x01(\x0c\x12\x17\n\x0fproposerAddress\x18\x14 \x01(\x0c\"F\n\x0c\x42lockDataDto\x12\x36\n\x0ctransactions\x18\x01 \x03(\x0b\x32 .org.qsn.protobuf.TransactionDto\"\xa6\x01\n\x0cPrecommitDto\x12\x0c\n\x04type\x18\x01 \x01(\x05\x12\x0e\n\x06height\x18\x02 \x01(\x03\x12\r\n\x05round\x18\x03 \x01(\x05\x12\x11\n\tblockHash\x18\x04 \x01(\x0c\x12\x11\n\ttimestamp\x18\x05 \x01(\x03\x12\x18\n\x10validatorAddress\x18\x06 \x01(\x0c\x12\x16\n\x0evalidatorIndex\x18\x07 \x01(\x05\x12\x11\n\tsignature\x18\x08 \x01(\x0c\"f\n\rLastCommitDto\x12\x0e\n\x06height\x18\x01 \x01(\x03\x12\x11\n\tblockHash\x18\x02 \x01(\x0c\x12\x32\n\nprecommits\x18\x03 \x03(\x0b\x32\x1e.org.qsn.protobuf.PrecommitDto\"\x9f\x01\n\x08\x42lockDto\x12\x30\n\x06header\x18\x01 \x01(\x0b\x32 .org.qsn.protobuf.BlockHeaderDto\x12,\n\x04\x64\x61ta\x18\x02 \x01(\x0b\x32\x1e.org.qsn.protobuf.BlockDataDto\x12\x33\n\nlastCommit\x18\x03 \x01(\x0b\x32\x1f.org.qsn.protobuf.LastCommitDtoB2\n.org.qsn.api.rpc.grpc.proto.entity.common.blockP\x01\x62\x06proto3'
  ,
  dependencies=[qsn_dot_entity_dot_common_dot_transaction_dot_TransactionDto__pb2.DESCRIPTOR,])




_BLOCKHEADERVERSION = _descriptor.Descriptor(
  name='BlockHeaderVersion',
  full_name='org.qsn.protobuf.BlockHeaderVersion',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='block', full_name='org.qsn.protobuf.BlockHeaderVersion.block', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='app', full_name='org.qsn.protobuf.BlockHeaderVersion.app', index=1,
      number=2, type=5, cpp_type=1, label=1,
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
  serialized_start=109,
  serialized_end=157,
)


_BLOCKHEADERDTO = _descriptor.Descriptor(
  name='BlockHeaderDto',
  full_name='org.qsn.protobuf.BlockHeaderDto',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='version', full_name='org.qsn.protobuf.BlockHeaderDto.version', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='blockAddress', full_name='org.qsn.protobuf.BlockHeaderDto.blockAddress', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='chainId', full_name='org.qsn.protobuf.BlockHeaderDto.chainId', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='height', full_name='org.qsn.protobuf.BlockHeaderDto.height', index=3,
      number=4, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='time', full_name='org.qsn.protobuf.BlockHeaderDto.time', index=4,
      number=5, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='numTxs', full_name='org.qsn.protobuf.BlockHeaderDto.numTxs', index=5,
      number=6, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='totalTxs', full_name='org.qsn.protobuf.BlockHeaderDto.totalTxs', index=6,
      number=7, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='proposerSequenceNumber', full_name='org.qsn.protobuf.BlockHeaderDto.proposerSequenceNumber', index=7,
      number=8, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='lastBlockhash', full_name='org.qsn.protobuf.BlockHeaderDto.lastBlockhash', index=8,
      number=9, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='lastCommitHash', full_name='org.qsn.protobuf.BlockHeaderDto.lastCommitHash', index=9,
      number=10, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dataHash', full_name='org.qsn.protobuf.BlockHeaderDto.dataHash', index=10,
      number=11, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validatorsHash', full_name='org.qsn.protobuf.BlockHeaderDto.validatorsHash', index=11,
      number=12, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='nextValidatorsHash', full_name='org.qsn.protobuf.BlockHeaderDto.nextValidatorsHash', index=12,
      number=13, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='accountHash', full_name='org.qsn.protobuf.BlockHeaderDto.accountHash', index=13,
      number=14, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='contractHash', full_name='org.qsn.protobuf.BlockHeaderDto.contractHash', index=14,
      number=15, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='storageHash', full_name='org.qsn.protobuf.BlockHeaderDto.storageHash', index=15,
      number=16, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transactionHash', full_name='org.qsn.protobuf.BlockHeaderDto.transactionHash', index=16,
      number=17, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transactionReceiptHash', full_name='org.qsn.protobuf.BlockHeaderDto.transactionReceiptHash', index=17,
      number=18, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='blockRewardHash', full_name='org.qsn.protobuf.BlockHeaderDto.blockRewardHash', index=18,
      number=19, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='proposerAddress', full_name='org.qsn.protobuf.BlockHeaderDto.proposerAddress', index=19,
      number=20, type=12, cpp_type=9, label=1,
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
  serialized_start=160,
  serialized_end=654,
)


_BLOCKDATADTO = _descriptor.Descriptor(
  name='BlockDataDto',
  full_name='org.qsn.protobuf.BlockDataDto',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='transactions', full_name='org.qsn.protobuf.BlockDataDto.transactions', index=0,
      number=1, type=11, cpp_type=10, label=3,
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
  serialized_start=656,
  serialized_end=726,
)


_PRECOMMITDTO = _descriptor.Descriptor(
  name='PrecommitDto',
  full_name='org.qsn.protobuf.PrecommitDto',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='type', full_name='org.qsn.protobuf.PrecommitDto.type', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='height', full_name='org.qsn.protobuf.PrecommitDto.height', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='round', full_name='org.qsn.protobuf.PrecommitDto.round', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='blockHash', full_name='org.qsn.protobuf.PrecommitDto.blockHash', index=3,
      number=4, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='org.qsn.protobuf.PrecommitDto.timestamp', index=4,
      number=5, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validatorAddress', full_name='org.qsn.protobuf.PrecommitDto.validatorAddress', index=5,
      number=6, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validatorIndex', full_name='org.qsn.protobuf.PrecommitDto.validatorIndex', index=6,
      number=7, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='signature', full_name='org.qsn.protobuf.PrecommitDto.signature', index=7,
      number=8, type=12, cpp_type=9, label=1,
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
  serialized_start=729,
  serialized_end=895,
)


_LASTCOMMITDTO = _descriptor.Descriptor(
  name='LastCommitDto',
  full_name='org.qsn.protobuf.LastCommitDto',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='height', full_name='org.qsn.protobuf.LastCommitDto.height', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='blockHash', full_name='org.qsn.protobuf.LastCommitDto.blockHash', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='precommits', full_name='org.qsn.protobuf.LastCommitDto.precommits', index=2,
      number=3, type=11, cpp_type=10, label=3,
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
  serialized_start=897,
  serialized_end=999,
)


_BLOCKDTO = _descriptor.Descriptor(
  name='BlockDto',
  full_name='org.qsn.protobuf.BlockDto',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='header', full_name='org.qsn.protobuf.BlockDto.header', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='data', full_name='org.qsn.protobuf.BlockDto.data', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='lastCommit', full_name='org.qsn.protobuf.BlockDto.lastCommit', index=2,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_start=1002,
  serialized_end=1161,
)

_BLOCKHEADERDTO.fields_by_name['version'].message_type = _BLOCKHEADERVERSION
_BLOCKDATADTO.fields_by_name['transactions'].message_type = qsn_dot_entity_dot_common_dot_transaction_dot_TransactionDto__pb2._TRANSACTIONDTO
_LASTCOMMITDTO.fields_by_name['precommits'].message_type = _PRECOMMITDTO
_BLOCKDTO.fields_by_name['header'].message_type = _BLOCKHEADERDTO
_BLOCKDTO.fields_by_name['data'].message_type = _BLOCKDATADTO
_BLOCKDTO.fields_by_name['lastCommit'].message_type = _LASTCOMMITDTO
DESCRIPTOR.message_types_by_name['BlockHeaderVersion'] = _BLOCKHEADERVERSION
DESCRIPTOR.message_types_by_name['BlockHeaderDto'] = _BLOCKHEADERDTO
DESCRIPTOR.message_types_by_name['BlockDataDto'] = _BLOCKDATADTO
DESCRIPTOR.message_types_by_name['PrecommitDto'] = _PRECOMMITDTO
DESCRIPTOR.message_types_by_name['LastCommitDto'] = _LASTCOMMITDTO
DESCRIPTOR.message_types_by_name['BlockDto'] = _BLOCKDTO
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BlockHeaderVersion = _reflection.GeneratedProtocolMessageType('BlockHeaderVersion', (_message.Message,), {
  'DESCRIPTOR' : _BLOCKHEADERVERSION,
  '__module__' : 'qsn.entity.common.block.Block_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.BlockHeaderVersion)
  })
_sym_db.RegisterMessage(BlockHeaderVersion)

BlockHeaderDto = _reflection.GeneratedProtocolMessageType('BlockHeaderDto', (_message.Message,), {
  'DESCRIPTOR' : _BLOCKHEADERDTO,
  '__module__' : 'qsn.entity.common.block.Block_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.BlockHeaderDto)
  })
_sym_db.RegisterMessage(BlockHeaderDto)

BlockDataDto = _reflection.GeneratedProtocolMessageType('BlockDataDto', (_message.Message,), {
  'DESCRIPTOR' : _BLOCKDATADTO,
  '__module__' : 'qsn.entity.common.block.Block_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.BlockDataDto)
  })
_sym_db.RegisterMessage(BlockDataDto)

PrecommitDto = _reflection.GeneratedProtocolMessageType('PrecommitDto', (_message.Message,), {
  'DESCRIPTOR' : _PRECOMMITDTO,
  '__module__' : 'qsn.entity.common.block.Block_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.PrecommitDto)
  })
_sym_db.RegisterMessage(PrecommitDto)

LastCommitDto = _reflection.GeneratedProtocolMessageType('LastCommitDto', (_message.Message,), {
  'DESCRIPTOR' : _LASTCOMMITDTO,
  '__module__' : 'qsn.entity.common.block.Block_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.LastCommitDto)
  })
_sym_db.RegisterMessage(LastCommitDto)

BlockDto = _reflection.GeneratedProtocolMessageType('BlockDto', (_message.Message,), {
  'DESCRIPTOR' : _BLOCKDTO,
  '__module__' : 'qsn.entity.common.block.Block_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.BlockDto)
  })
_sym_db.RegisterMessage(BlockDto)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
