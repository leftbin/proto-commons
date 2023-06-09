// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/protobuf/strings/model.proto

package com.leftbin.commons.proto.v1.protobuf.strings;

/**
 * Protobuf type {@code leftbin.commons.proto.v1.protobuf.strings.StringList}
 */
public final class StringList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:leftbin.commons.proto.v1.protobuf.strings.StringList)
    StringListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StringList.newBuilder() to construct.
  private StringList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StringList() {
    entries_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StringList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.leftbin.commons.proto.v1.protobuf.strings.ModelProto.internal_static_leftbin_commons_proto_v1_protobuf_strings_StringList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.leftbin.commons.proto.v1.protobuf.strings.ModelProto.internal_static_leftbin_commons_proto_v1_protobuf_strings_StringList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.leftbin.commons.proto.v1.protobuf.strings.StringList.class, com.leftbin.commons.proto.v1.protobuf.strings.StringList.Builder.class);
  }

  public static final int ENTRIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList entries_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string entries = 1 [json_name = "entries"];</code>
   * @return A list containing the entries.
   */
  public com.google.protobuf.ProtocolStringList
      getEntriesList() {
    return entries_;
  }
  /**
   * <code>repeated string entries = 1 [json_name = "entries"];</code>
   * @return The count of entries.
   */
  public int getEntriesCount() {
    return entries_.size();
  }
  /**
   * <code>repeated string entries = 1 [json_name = "entries"];</code>
   * @param index The index of the element to return.
   * @return The entries at the given index.
   */
  public java.lang.String getEntries(int index) {
    return entries_.get(index);
  }
  /**
   * <code>repeated string entries = 1 [json_name = "entries"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the entries at the given index.
   */
  public com.google.protobuf.ByteString
      getEntriesBytes(int index) {
    return entries_.getByteString(index);
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
    for (int i = 0; i < entries_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, entries_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < entries_.size(); i++) {
        dataSize += computeStringSizeNoTag(entries_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEntriesList().size();
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
    if (!(obj instanceof com.leftbin.commons.proto.v1.protobuf.strings.StringList)) {
      return super.equals(obj);
    }
    com.leftbin.commons.proto.v1.protobuf.strings.StringList other = (com.leftbin.commons.proto.v1.protobuf.strings.StringList) obj;

    if (!getEntriesList()
        .equals(other.getEntriesList())) return false;
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
    if (getEntriesCount() > 0) {
      hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getEntriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.leftbin.commons.proto.v1.protobuf.strings.StringList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.protobuf.strings.StringList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.protobuf.strings.StringList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.protobuf.strings.StringList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.protobuf.strings.StringList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.protobuf.strings.StringList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.protobuf.strings.StringList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leftbin.commons.proto.v1.protobuf.strings.StringList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.leftbin.commons.proto.v1.protobuf.strings.StringList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.leftbin.commons.proto.v1.protobuf.strings.StringList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.protobuf.strings.StringList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leftbin.commons.proto.v1.protobuf.strings.StringList parseFrom(
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
  public static Builder newBuilder(com.leftbin.commons.proto.v1.protobuf.strings.StringList prototype) {
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
   * Protobuf type {@code leftbin.commons.proto.v1.protobuf.strings.StringList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:leftbin.commons.proto.v1.protobuf.strings.StringList)
      com.leftbin.commons.proto.v1.protobuf.strings.StringListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.leftbin.commons.proto.v1.protobuf.strings.ModelProto.internal_static_leftbin_commons_proto_v1_protobuf_strings_StringList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.leftbin.commons.proto.v1.protobuf.strings.ModelProto.internal_static_leftbin_commons_proto_v1_protobuf_strings_StringList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.leftbin.commons.proto.v1.protobuf.strings.StringList.class, com.leftbin.commons.proto.v1.protobuf.strings.StringList.Builder.class);
    }

    // Construct using com.leftbin.commons.proto.v1.protobuf.strings.StringList.newBuilder()
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
      entries_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.leftbin.commons.proto.v1.protobuf.strings.ModelProto.internal_static_leftbin_commons_proto_v1_protobuf_strings_StringList_descriptor;
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.protobuf.strings.StringList getDefaultInstanceForType() {
      return com.leftbin.commons.proto.v1.protobuf.strings.StringList.getDefaultInstance();
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.protobuf.strings.StringList build() {
      com.leftbin.commons.proto.v1.protobuf.strings.StringList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.protobuf.strings.StringList buildPartial() {
      com.leftbin.commons.proto.v1.protobuf.strings.StringList result = new com.leftbin.commons.proto.v1.protobuf.strings.StringList(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.leftbin.commons.proto.v1.protobuf.strings.StringList result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        entries_.makeImmutable();
        result.entries_ = entries_;
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
      if (other instanceof com.leftbin.commons.proto.v1.protobuf.strings.StringList) {
        return mergeFrom((com.leftbin.commons.proto.v1.protobuf.strings.StringList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.leftbin.commons.proto.v1.protobuf.strings.StringList other) {
      if (other == com.leftbin.commons.proto.v1.protobuf.strings.StringList.getDefaultInstance()) return this;
      if (!other.entries_.isEmpty()) {
        if (entries_.isEmpty()) {
          entries_ = other.entries_;
          bitField0_ |= 0x00000001;
        } else {
          ensureEntriesIsMutable();
          entries_.addAll(other.entries_);
        }
        onChanged();
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureEntriesIsMutable();
              entries_.add(s);
              break;
            } // case 10
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

    private com.google.protobuf.LazyStringArrayList entries_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureEntriesIsMutable() {
      if (!entries_.isModifiable()) {
        entries_ = new com.google.protobuf.LazyStringArrayList(entries_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string entries = 1 [json_name = "entries"];</code>
     * @return A list containing the entries.
     */
    public com.google.protobuf.ProtocolStringList
        getEntriesList() {
      entries_.makeImmutable();
      return entries_;
    }
    /**
     * <code>repeated string entries = 1 [json_name = "entries"];</code>
     * @return The count of entries.
     */
    public int getEntriesCount() {
      return entries_.size();
    }
    /**
     * <code>repeated string entries = 1 [json_name = "entries"];</code>
     * @param index The index of the element to return.
     * @return The entries at the given index.
     */
    public java.lang.String getEntries(int index) {
      return entries_.get(index);
    }
    /**
     * <code>repeated string entries = 1 [json_name = "entries"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the entries at the given index.
     */
    public com.google.protobuf.ByteString
        getEntriesBytes(int index) {
      return entries_.getByteString(index);
    }
    /**
     * <code>repeated string entries = 1 [json_name = "entries"];</code>
     * @param index The index to set the value at.
     * @param value The entries to set.
     * @return This builder for chaining.
     */
    public Builder setEntries(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEntriesIsMutable();
      entries_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string entries = 1 [json_name = "entries"];</code>
     * @param value The entries to add.
     * @return This builder for chaining.
     */
    public Builder addEntries(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEntriesIsMutable();
      entries_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string entries = 1 [json_name = "entries"];</code>
     * @param values The entries to add.
     * @return This builder for chaining.
     */
    public Builder addAllEntries(
        java.lang.Iterable<java.lang.String> values) {
      ensureEntriesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, entries_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string entries = 1 [json_name = "entries"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntries() {
      entries_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string entries = 1 [json_name = "entries"];</code>
     * @param value The bytes of the entries to add.
     * @return This builder for chaining.
     */
    public Builder addEntriesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureEntriesIsMutable();
      entries_.add(value);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:leftbin.commons.proto.v1.protobuf.strings.StringList)
  }

  // @@protoc_insertion_point(class_scope:leftbin.commons.proto.v1.protobuf.strings.StringList)
  private static final com.leftbin.commons.proto.v1.protobuf.strings.StringList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.leftbin.commons.proto.v1.protobuf.strings.StringList();
  }

  public static com.leftbin.commons.proto.v1.protobuf.strings.StringList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StringList>
      PARSER = new com.google.protobuf.AbstractParser<StringList>() {
    @java.lang.Override
    public StringList parsePartialFrom(
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

  public static com.google.protobuf.Parser<StringList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StringList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.leftbin.commons.proto.v1.protobuf.strings.StringList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

