// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/network/dns/record/rpc/model.proto

package com.leftbin.commons.proto.v1.network.dns.record.rpc;

/**
 * <pre>
 * dns record
 * </pre>
 *
 * Protobuf type {@code leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord}
 */
public final class DnsRecord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord)
    DnsRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DnsRecord.newBuilder() to construct.
  private DnsRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DnsRecord() {
    recordType_ = 0;
    name_ = "";
    values_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DnsRecord();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.leftbin.commons.proto.v1.network.dns.record.rpc.ModelProto.internal_static_leftbin_commons_proto_v1_network_dns_record_rpc_DnsRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.leftbin.commons.proto.v1.network.dns.record.rpc.ModelProto.internal_static_leftbin_commons_proto_v1_network_dns_record_rpc_DnsRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord.class, com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord.Builder.class);
  }

  public static final int RECORD_TYPE_FIELD_NUMBER = 1;
  private int recordType_ = 0;
  /**
   * <pre>
   * dns record type
   * </pre>
   *
   * <code>.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType record_type = 1 [json_name = "recordType"];</code>
   * @return The enum numeric value on the wire for recordType.
   */
  @java.lang.Override public int getRecordTypeValue() {
    return recordType_;
  }
  /**
   * <pre>
   * dns record type
   * </pre>
   *
   * <code>.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType record_type = 1 [json_name = "recordType"];</code>
   * @return The recordType.
   */
  @java.lang.Override public com.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType getRecordType() {
    com.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType result = com.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType.forNumber(recordType_);
    return result == null ? com.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType.UNRECOGNIZED : result;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * name to be added to the domain. ex: if name is "dev" then the
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * name to be added to the domain. ex: if name is "dev" then the
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUES_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList values_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * record values
   * </pre>
   *
   * <code>repeated string values = 3 [json_name = "values"];</code>
   * @return A list containing the values.
   */
  public com.google.protobuf.ProtocolStringList
      getValuesList() {
    return values_;
  }
  /**
   * <pre>
   * record values
   * </pre>
   *
   * <code>repeated string values = 3 [json_name = "values"];</code>
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <pre>
   * record values
   * </pre>
   *
   * <code>repeated string values = 3 [json_name = "values"];</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public java.lang.String getValues(int index) {
    return values_.get(index);
  }
  /**
   * <pre>
   * record values
   * </pre>
   *
   * <code>repeated string values = 3 [json_name = "values"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  public com.google.protobuf.ByteString
      getValuesBytes(int index) {
    return values_.getByteString(index);
  }

  public static final int TTL_SECONDS_FIELD_NUMBER = 4;
  private int ttlSeconds_ = 0;
  /**
   * <pre>
   * ttl in seconds
   * </pre>
   *
   * <code>int32 ttl_seconds = 4 [json_name = "ttlSeconds"];</code>
   * @return The ttlSeconds.
   */
  @java.lang.Override
  public int getTtlSeconds() {
    return ttlSeconds_;
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
    if (recordType_ != com.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType.DNS_RECORD_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, recordType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    for (int i = 0; i < values_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, values_.getRaw(i));
    }
    if (ttlSeconds_ != 0) {
      output.writeInt32(4, ttlSeconds_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (recordType_ != com.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType.DNS_RECORD_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, recordType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < values_.size(); i++) {
        dataSize += computeStringSizeNoTag(values_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getValuesList().size();
    }
    if (ttlSeconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, ttlSeconds_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord)) {
      return super.equals(obj);
    }
    com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord other = (com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord) obj;

    if (recordType_ != other.recordType_) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getValuesList()
        .equals(other.getValuesList())) return false;
    if (getTtlSeconds()
        != other.getTtlSeconds()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RECORD_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + recordType_;
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (37 * hash) + TTL_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + getTtlSeconds();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord parseFrom(
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
  public static Builder newBuilder(com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord prototype) {
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
   * <pre>
   * dns record
   * </pre>
   *
   * Protobuf type {@code leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord)
      com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.leftbin.commons.proto.v1.network.dns.record.rpc.ModelProto.internal_static_leftbin_commons_proto_v1_network_dns_record_rpc_DnsRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.leftbin.commons.proto.v1.network.dns.record.rpc.ModelProto.internal_static_leftbin_commons_proto_v1_network_dns_record_rpc_DnsRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord.class, com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord.Builder.class);
    }

    // Construct using com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      recordType_ = 0;
      name_ = "";
      values_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      ttlSeconds_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.leftbin.commons.proto.v1.network.dns.record.rpc.ModelProto.internal_static_leftbin_commons_proto_v1_network_dns_record_rpc_DnsRecord_descriptor;
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord getDefaultInstanceForType() {
      return com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord.getDefaultInstance();
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord build() {
      com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord buildPartial() {
      com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord result = new com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.recordType_ = recordType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        values_.makeImmutable();
        result.values_ = values_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.ttlSeconds_ = ttlSeconds_;
      }
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
      if (other instanceof com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord) {
        return mergeFrom((com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord other) {
      if (other == com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord.getDefaultInstance()) return this;
      if (other.recordType_ != 0) {
        setRecordTypeValue(other.getRecordTypeValue());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.values_.isEmpty()) {
        if (values_.isEmpty()) {
          values_ = other.values_;
          bitField0_ |= 0x00000004;
        } else {
          ensureValuesIsMutable();
          values_.addAll(other.values_);
        }
        onChanged();
      }
      if (other.getTtlSeconds() != 0) {
        setTtlSeconds(other.getTtlSeconds());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              recordType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureValuesIsMutable();
              values_.add(s);
              break;
            } // case 26
            case 32: {
              ttlSeconds_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int recordType_ = 0;
    /**
     * <pre>
     * dns record type
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType record_type = 1 [json_name = "recordType"];</code>
     * @return The enum numeric value on the wire for recordType.
     */
    @java.lang.Override public int getRecordTypeValue() {
      return recordType_;
    }
    /**
     * <pre>
     * dns record type
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType record_type = 1 [json_name = "recordType"];</code>
     * @param value The enum numeric value on the wire for recordType to set.
     * @return This builder for chaining.
     */
    public Builder setRecordTypeValue(int value) {
      recordType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * dns record type
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType record_type = 1 [json_name = "recordType"];</code>
     * @return The recordType.
     */
    @java.lang.Override
    public com.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType getRecordType() {
      com.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType result = com.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType.forNumber(recordType_);
      return result == null ? com.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * dns record type
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType record_type = 1 [json_name = "recordType"];</code>
     * @param value The recordType to set.
     * @return This builder for chaining.
     */
    public Builder setRecordType(com.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      recordType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * dns record type
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType record_type = 1 [json_name = "recordType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      recordType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * name to be added to the domain. ex: if name is "dev" then the
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * name to be added to the domain. ex: if name is "dev" then the
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * name to be added to the domain. ex: if name is "dev" then the
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name to be added to the domain. ex: if name is "dev" then the
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name to be added to the domain. ex: if name is "dev" then the
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList values_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureValuesIsMutable() {
      if (!values_.isModifiable()) {
        values_ = new com.google.protobuf.LazyStringArrayList(values_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * record values
     * </pre>
     *
     * <code>repeated string values = 3 [json_name = "values"];</code>
     * @return A list containing the values.
     */
    public com.google.protobuf.ProtocolStringList
        getValuesList() {
      values_.makeImmutable();
      return values_;
    }
    /**
     * <pre>
     * record values
     * </pre>
     *
     * <code>repeated string values = 3 [json_name = "values"];</code>
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     * <pre>
     * record values
     * </pre>
     *
     * <code>repeated string values = 3 [json_name = "values"];</code>
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public java.lang.String getValues(int index) {
      return values_.get(index);
    }
    /**
     * <pre>
     * record values
     * </pre>
     *
     * <code>repeated string values = 3 [json_name = "values"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the values at the given index.
     */
    public com.google.protobuf.ByteString
        getValuesBytes(int index) {
      return values_.getByteString(index);
    }
    /**
     * <pre>
     * record values
     * </pre>
     *
     * <code>repeated string values = 3 [json_name = "values"];</code>
     * @param index The index to set the value at.
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureValuesIsMutable();
      values_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record values
     * </pre>
     *
     * <code>repeated string values = 3 [json_name = "values"];</code>
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureValuesIsMutable();
      values_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record values
     * </pre>
     *
     * <code>repeated string values = 3 [json_name = "values"];</code>
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(
        java.lang.Iterable<java.lang.String> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, values_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record values
     * </pre>
     *
     * <code>repeated string values = 3 [json_name = "values"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      values_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record values
     * </pre>
     *
     * <code>repeated string values = 3 [json_name = "values"];</code>
     * @param value The bytes of the values to add.
     * @return This builder for chaining.
     */
    public Builder addValuesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureValuesIsMutable();
      values_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int ttlSeconds_ ;
    /**
     * <pre>
     * ttl in seconds
     * </pre>
     *
     * <code>int32 ttl_seconds = 4 [json_name = "ttlSeconds"];</code>
     * @return The ttlSeconds.
     */
    @java.lang.Override
    public int getTtlSeconds() {
      return ttlSeconds_;
    }
    /**
     * <pre>
     * ttl in seconds
     * </pre>
     *
     * <code>int32 ttl_seconds = 4 [json_name = "ttlSeconds"];</code>
     * @param value The ttlSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setTtlSeconds(int value) {

      ttlSeconds_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ttl in seconds
     * </pre>
     *
     * <code>int32 ttl_seconds = 4 [json_name = "ttlSeconds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTtlSeconds() {
      bitField0_ = (bitField0_ & ~0x00000008);
      ttlSeconds_ = 0;
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


    // @@protoc_insertion_point(builder_scope:leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord)
  }

  // @@protoc_insertion_point(class_scope:leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord)
  private static final com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord();
  }

  public static com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DnsRecord>
      PARSER = new com.google.protobuf.AbstractParser<DnsRecord>() {
    @java.lang.Override
    public DnsRecord parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DnsRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DnsRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

