// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/kafka/model.proto

package com.leftbin.commons.proto.v1.kafka;

/**
 * <pre>
 * this is used as input to pass state store name
 * </pre>
 *
 * Protobuf type {@code leftbin.commons.proto.v1.kafka.StoreName}
 */
public final class StoreName extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:leftbin.commons.proto.v1.kafka.StoreName)
    StoreNameOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StoreName.newBuilder() to construct.
  private StoreName(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StoreName() {
    storeName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StoreName();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.leftbin.commons.proto.v1.kafka.ModelProto.internal_static_leftbin_commons_proto_v1_kafka_StoreName_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.leftbin.commons.proto.v1.kafka.ModelProto.internal_static_leftbin_commons_proto_v1_kafka_StoreName_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.leftbin.commons.proto.v1.kafka.StoreName.class, com.leftbin.commons.proto.v1.kafka.StoreName.Builder.class);
  }

  public static final int STORE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object storeName_ = "";
  /**
   * <code>string store_name = 1 [json_name = "storeName"];</code>
   * @return The storeName.
   */
  @java.lang.Override
  public java.lang.String getStoreName() {
    java.lang.Object ref = storeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      storeName_ = s;
      return s;
    }
  }
  /**
   * <code>string store_name = 1 [json_name = "storeName"];</code>
   * @return The bytes for storeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStoreNameBytes() {
    java.lang.Object ref = storeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      storeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, storeName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, storeName_);
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
    if (!(obj instanceof com.leftbin.commons.proto.v1.kafka.StoreName)) {
      return super.equals(obj);
    }
    com.leftbin.commons.proto.v1.kafka.StoreName other = (com.leftbin.commons.proto.v1.kafka.StoreName) obj;

    if (!getStoreName()
        .equals(other.getStoreName())) return false;
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
    hash = (37 * hash) + STORE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getStoreName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.leftbin.commons.proto.v1.kafka.StoreName parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.kafka.StoreName parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.kafka.StoreName parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.kafka.StoreName parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.kafka.StoreName parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.kafka.StoreName parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.kafka.StoreName parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leftbin.commons.proto.v1.kafka.StoreName parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.leftbin.commons.proto.v1.kafka.StoreName parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.leftbin.commons.proto.v1.kafka.StoreName parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.kafka.StoreName parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leftbin.commons.proto.v1.kafka.StoreName parseFrom(
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
  public static Builder newBuilder(com.leftbin.commons.proto.v1.kafka.StoreName prototype) {
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
   * this is used as input to pass state store name
   * </pre>
   *
   * Protobuf type {@code leftbin.commons.proto.v1.kafka.StoreName}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:leftbin.commons.proto.v1.kafka.StoreName)
      com.leftbin.commons.proto.v1.kafka.StoreNameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.leftbin.commons.proto.v1.kafka.ModelProto.internal_static_leftbin_commons_proto_v1_kafka_StoreName_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.leftbin.commons.proto.v1.kafka.ModelProto.internal_static_leftbin_commons_proto_v1_kafka_StoreName_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.leftbin.commons.proto.v1.kafka.StoreName.class, com.leftbin.commons.proto.v1.kafka.StoreName.Builder.class);
    }

    // Construct using com.leftbin.commons.proto.v1.kafka.StoreName.newBuilder()
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
      storeName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.leftbin.commons.proto.v1.kafka.ModelProto.internal_static_leftbin_commons_proto_v1_kafka_StoreName_descriptor;
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.kafka.StoreName getDefaultInstanceForType() {
      return com.leftbin.commons.proto.v1.kafka.StoreName.getDefaultInstance();
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.kafka.StoreName build() {
      com.leftbin.commons.proto.v1.kafka.StoreName result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.kafka.StoreName buildPartial() {
      com.leftbin.commons.proto.v1.kafka.StoreName result = new com.leftbin.commons.proto.v1.kafka.StoreName(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.leftbin.commons.proto.v1.kafka.StoreName result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.storeName_ = storeName_;
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
      if (other instanceof com.leftbin.commons.proto.v1.kafka.StoreName) {
        return mergeFrom((com.leftbin.commons.proto.v1.kafka.StoreName)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.leftbin.commons.proto.v1.kafka.StoreName other) {
      if (other == com.leftbin.commons.proto.v1.kafka.StoreName.getDefaultInstance()) return this;
      if (!other.getStoreName().isEmpty()) {
        storeName_ = other.storeName_;
        bitField0_ |= 0x00000001;
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
              storeName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object storeName_ = "";
    /**
     * <code>string store_name = 1 [json_name = "storeName"];</code>
     * @return The storeName.
     */
    public java.lang.String getStoreName() {
      java.lang.Object ref = storeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        storeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string store_name = 1 [json_name = "storeName"];</code>
     * @return The bytes for storeName.
     */
    public com.google.protobuf.ByteString
        getStoreNameBytes() {
      java.lang.Object ref = storeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string store_name = 1 [json_name = "storeName"];</code>
     * @param value The storeName to set.
     * @return This builder for chaining.
     */
    public Builder setStoreName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      storeName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string store_name = 1 [json_name = "storeName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStoreName() {
      storeName_ = getDefaultInstance().getStoreName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string store_name = 1 [json_name = "storeName"];</code>
     * @param value The bytes for storeName to set.
     * @return This builder for chaining.
     */
    public Builder setStoreNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      storeName_ = value;
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


    // @@protoc_insertion_point(builder_scope:leftbin.commons.proto.v1.kafka.StoreName)
  }

  // @@protoc_insertion_point(class_scope:leftbin.commons.proto.v1.kafka.StoreName)
  private static final com.leftbin.commons.proto.v1.kafka.StoreName DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.leftbin.commons.proto.v1.kafka.StoreName();
  }

  public static com.leftbin.commons.proto.v1.kafka.StoreName getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StoreName>
      PARSER = new com.google.protobuf.AbstractParser<StoreName>() {
    @java.lang.Override
    public StoreName parsePartialFrom(
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

  public static com.google.protobuf.Parser<StoreName> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StoreName> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.leftbin.commons.proto.v1.kafka.StoreName getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

