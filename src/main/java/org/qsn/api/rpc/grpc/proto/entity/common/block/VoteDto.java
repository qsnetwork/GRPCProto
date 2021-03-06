// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/common/block/BlockDto.proto

package org.qsn.api.rpc.grpc.proto.entity.common.block;

/**
 * Protobuf type {@code org.qsn.protobuf.VoteDto}
 */
public final class VoteDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.qsn.protobuf.VoteDto)
    VoteDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VoteDto.newBuilder() to construct.
  private VoteDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VoteDto() {
    blockHash_ = com.google.protobuf.ByteString.EMPTY;
    validatorAddress_ = com.google.protobuf.ByteString.EMPTY;
    signature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VoteDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VoteDto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            type_ = input.readInt32();
            break;
          }
          case 16: {

            height_ = input.readInt64();
            break;
          }
          case 24: {

            round_ = input.readInt32();
            break;
          }
          case 34: {

            blockHash_ = input.readBytes();
            break;
          }
          case 40: {

            timestamp_ = input.readInt64();
            break;
          }
          case 50: {

            validatorAddress_ = input.readBytes();
            break;
          }
          case 56: {

            validatorIndex_ = input.readInt32();
            break;
          }
          case 66: {

            signature_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.qsn.api.rpc.grpc.proto.entity.common.block.BlockDtoOuterClass.internal_static_org_qsn_protobuf_VoteDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.qsn.api.rpc.grpc.proto.entity.common.block.BlockDtoOuterClass.internal_static_org_qsn_protobuf_VoteDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto.class, org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>int32 type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private long height_;
  /**
   * <code>int64 height = 2;</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int ROUND_FIELD_NUMBER = 3;
  private int round_;
  /**
   * <code>int32 round = 3;</code>
   * @return The round.
   */
  @java.lang.Override
  public int getRound() {
    return round_;
  }

  public static final int BLOCKHASH_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString blockHash_;
  /**
   * <code>bytes blockHash = 4;</code>
   * @return The blockHash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBlockHash() {
    return blockHash_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 5;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 5;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int VALIDATORADDRESS_FIELD_NUMBER = 6;
  private com.google.protobuf.ByteString validatorAddress_;
  /**
   * <code>bytes validatorAddress = 6;</code>
   * @return The validatorAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValidatorAddress() {
    return validatorAddress_;
  }

  public static final int VALIDATORINDEX_FIELD_NUMBER = 7;
  private int validatorIndex_;
  /**
   * <code>int32 validatorIndex = 7;</code>
   * @return The validatorIndex.
   */
  @java.lang.Override
  public int getValidatorIndex() {
    return validatorIndex_;
  }

  public static final int SIGNATURE_FIELD_NUMBER = 8;
  private com.google.protobuf.ByteString signature_;
  /**
   * <code>bytes signature = 8;</code>
   * @return The signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (type_ != 0) {
      output.writeInt32(1, type_);
    }
    if (height_ != 0L) {
      output.writeInt64(2, height_);
    }
    if (round_ != 0) {
      output.writeInt32(3, round_);
    }
    if (!blockHash_.isEmpty()) {
      output.writeBytes(4, blockHash_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(5, timestamp_);
    }
    if (!validatorAddress_.isEmpty()) {
      output.writeBytes(6, validatorAddress_);
    }
    if (validatorIndex_ != 0) {
      output.writeInt32(7, validatorIndex_);
    }
    if (!signature_.isEmpty()) {
      output.writeBytes(8, signature_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, type_);
    }
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, height_);
    }
    if (round_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, round_);
    }
    if (!blockHash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, blockHash_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, timestamp_);
    }
    if (!validatorAddress_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(6, validatorAddress_);
    }
    if (validatorIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, validatorIndex_);
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(8, signature_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto)) {
      return super.equals(obj);
    }
    org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto other = (org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto) obj;

    if (getType()
        != other.getType()) return false;
    if (getHeight()
        != other.getHeight()) return false;
    if (getRound()
        != other.getRound()) return false;
    if (!getBlockHash()
        .equals(other.getBlockHash())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (!getValidatorAddress()
        .equals(other.getValidatorAddress())) return false;
    if (getValidatorIndex()
        != other.getValidatorIndex()) return false;
    if (!getSignature()
        .equals(other.getSignature())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    hash = (37 * hash) + ROUND_FIELD_NUMBER;
    hash = (53 * hash) + getRound();
    hash = (37 * hash) + BLOCKHASH_FIELD_NUMBER;
    hash = (53 * hash) + getBlockHash().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + VALIDATORADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getValidatorAddress().hashCode();
    hash = (37 * hash) + VALIDATORINDEX_FIELD_NUMBER;
    hash = (53 * hash) + getValidatorIndex();
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.qsn.protobuf.VoteDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.qsn.protobuf.VoteDto)
      org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.qsn.api.rpc.grpc.proto.entity.common.block.BlockDtoOuterClass.internal_static_org_qsn_protobuf_VoteDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.qsn.api.rpc.grpc.proto.entity.common.block.BlockDtoOuterClass.internal_static_org_qsn_protobuf_VoteDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto.class, org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto.Builder.class);
    }

    // Construct using org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      height_ = 0L;

      round_ = 0;

      blockHash_ = com.google.protobuf.ByteString.EMPTY;

      timestamp_ = 0L;

      validatorAddress_ = com.google.protobuf.ByteString.EMPTY;

      validatorIndex_ = 0;

      signature_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.qsn.api.rpc.grpc.proto.entity.common.block.BlockDtoOuterClass.internal_static_org_qsn_protobuf_VoteDto_descriptor;
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto getDefaultInstanceForType() {
      return org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto.getDefaultInstance();
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto build() {
      org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto buildPartial() {
      org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto result = new org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto(this);
      result.type_ = type_;
      result.height_ = height_;
      result.round_ = round_;
      result.blockHash_ = blockHash_;
      result.timestamp_ = timestamp_;
      result.validatorAddress_ = validatorAddress_;
      result.validatorIndex_ = validatorIndex_;
      result.signature_ = signature_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto) {
        return mergeFrom((org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto other) {
      if (other == org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto.getDefaultInstance()) return this;
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.getRound() != 0) {
        setRound(other.getRound());
      }
      if (other.getBlockHash() != com.google.protobuf.ByteString.EMPTY) {
        setBlockHash(other.getBlockHash());
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (other.getValidatorAddress() != com.google.protobuf.ByteString.EMPTY) {
        setValidatorAddress(other.getValidatorAddress());
      }
      if (other.getValidatorIndex() != 0) {
        setValidatorIndex(other.getValidatorIndex());
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ ;
    /**
     * <code>int32 type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }
    /**
     * <code>int32 type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private long height_ ;
    /**
     * <code>int64 height = 2;</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <code>int64 height = 2;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 height = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      
      height_ = 0L;
      onChanged();
      return this;
    }

    private int round_ ;
    /**
     * <code>int32 round = 3;</code>
     * @return The round.
     */
    @java.lang.Override
    public int getRound() {
      return round_;
    }
    /**
     * <code>int32 round = 3;</code>
     * @param value The round to set.
     * @return This builder for chaining.
     */
    public Builder setRound(int value) {
      
      round_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 round = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRound() {
      
      round_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString blockHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes blockHash = 4;</code>
     * @return The blockHash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBlockHash() {
      return blockHash_;
    }
    /**
     * <code>bytes blockHash = 4;</code>
     * @param value The blockHash to set.
     * @return This builder for chaining.
     */
    public Builder setBlockHash(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      blockHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes blockHash = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockHash() {
      
      blockHash_ = getDefaultInstance().getBlockHash();
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 5;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 5;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString validatorAddress_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes validatorAddress = 6;</code>
     * @return The validatorAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getValidatorAddress() {
      return validatorAddress_;
    }
    /**
     * <code>bytes validatorAddress = 6;</code>
     * @param value The validatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorAddress(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      validatorAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes validatorAddress = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidatorAddress() {
      
      validatorAddress_ = getDefaultInstance().getValidatorAddress();
      onChanged();
      return this;
    }

    private int validatorIndex_ ;
    /**
     * <code>int32 validatorIndex = 7;</code>
     * @return The validatorIndex.
     */
    @java.lang.Override
    public int getValidatorIndex() {
      return validatorIndex_;
    }
    /**
     * <code>int32 validatorIndex = 7;</code>
     * @param value The validatorIndex to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorIndex(int value) {
      
      validatorIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 validatorIndex = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidatorIndex() {
      
      validatorIndex_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signature = 8;</code>
     * @return The signature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <code>bytes signature = 8;</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      signature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signature = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      
      signature_ = getDefaultInstance().getSignature();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.qsn.protobuf.VoteDto)
  }

  // @@protoc_insertion_point(class_scope:org.qsn.protobuf.VoteDto)
  private static final org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto();
  }

  public static org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VoteDto>
      PARSER = new com.google.protobuf.AbstractParser<VoteDto>() {
    @java.lang.Override
    public VoteDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VoteDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VoteDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VoteDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.block.VoteDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

