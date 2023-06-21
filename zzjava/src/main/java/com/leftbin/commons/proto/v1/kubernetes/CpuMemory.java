// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/kubernetes/model.proto

package com.leftbin.commons.proto.v1.kubernetes;

/**
 * Protobuf type {@code leftbin.commons.proto.v1.kubernetes.CpuMemory}
 */
public final class CpuMemory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:leftbin.commons.proto.v1.kubernetes.CpuMemory)
    CpuMemoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CpuMemory.newBuilder() to construct.
  private CpuMemory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CpuMemory() {
    cpu_ = "";
    memory_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CpuMemory();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.leftbin.commons.proto.v1.kubernetes.ModelProto.internal_static_leftbin_commons_proto_v1_kubernetes_CpuMemory_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.leftbin.commons.proto.v1.kubernetes.ModelProto.internal_static_leftbin_commons_proto_v1_kubernetes_CpuMemory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.leftbin.commons.proto.v1.kubernetes.CpuMemory.class, com.leftbin.commons.proto.v1.kubernetes.CpuMemory.Builder.class);
  }

  public static final int CPU_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cpu_ = "";
  /**
   * <code>string cpu = 1 [json_name = "cpu"];</code>
   * @return The cpu.
   */
  @java.lang.Override
  public java.lang.String getCpu() {
    java.lang.Object ref = cpu_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cpu_ = s;
      return s;
    }
  }
  /**
   * <code>string cpu = 1 [json_name = "cpu"];</code>
   * @return The bytes for cpu.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCpuBytes() {
    java.lang.Object ref = cpu_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cpu_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEMORY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object memory_ = "";
  /**
   * <code>string memory = 2 [json_name = "memory"];</code>
   * @return The memory.
   */
  @java.lang.Override
  public java.lang.String getMemory() {
    java.lang.Object ref = memory_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      memory_ = s;
      return s;
    }
  }
  /**
   * <code>string memory = 2 [json_name = "memory"];</code>
   * @return The bytes for memory.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMemoryBytes() {
    java.lang.Object ref = memory_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      memory_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpu_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cpu_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(memory_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, memory_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpu_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cpu_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(memory_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, memory_);
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
    if (!(obj instanceof com.leftbin.commons.proto.v1.kubernetes.CpuMemory)) {
      return super.equals(obj);
    }
    com.leftbin.commons.proto.v1.kubernetes.CpuMemory other = (com.leftbin.commons.proto.v1.kubernetes.CpuMemory) obj;

    if (!getCpu()
        .equals(other.getCpu())) return false;
    if (!getMemory()
        .equals(other.getMemory())) return false;
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
    hash = (37 * hash) + CPU_FIELD_NUMBER;
    hash = (53 * hash) + getCpu().hashCode();
    hash = (37 * hash) + MEMORY_FIELD_NUMBER;
    hash = (53 * hash) + getMemory().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.leftbin.commons.proto.v1.kubernetes.CpuMemory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.CpuMemory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.CpuMemory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.CpuMemory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.CpuMemory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.CpuMemory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.CpuMemory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.CpuMemory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.leftbin.commons.proto.v1.kubernetes.CpuMemory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.leftbin.commons.proto.v1.kubernetes.CpuMemory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.CpuMemory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.CpuMemory parseFrom(
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
  public static Builder newBuilder(com.leftbin.commons.proto.v1.kubernetes.CpuMemory prototype) {
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
   * Protobuf type {@code leftbin.commons.proto.v1.kubernetes.CpuMemory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:leftbin.commons.proto.v1.kubernetes.CpuMemory)
      com.leftbin.commons.proto.v1.kubernetes.CpuMemoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.leftbin.commons.proto.v1.kubernetes.ModelProto.internal_static_leftbin_commons_proto_v1_kubernetes_CpuMemory_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.leftbin.commons.proto.v1.kubernetes.ModelProto.internal_static_leftbin_commons_proto_v1_kubernetes_CpuMemory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.leftbin.commons.proto.v1.kubernetes.CpuMemory.class, com.leftbin.commons.proto.v1.kubernetes.CpuMemory.Builder.class);
    }

    // Construct using com.leftbin.commons.proto.v1.kubernetes.CpuMemory.newBuilder()
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
      cpu_ = "";
      memory_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.leftbin.commons.proto.v1.kubernetes.ModelProto.internal_static_leftbin_commons_proto_v1_kubernetes_CpuMemory_descriptor;
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.kubernetes.CpuMemory getDefaultInstanceForType() {
      return com.leftbin.commons.proto.v1.kubernetes.CpuMemory.getDefaultInstance();
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.kubernetes.CpuMemory build() {
      com.leftbin.commons.proto.v1.kubernetes.CpuMemory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.kubernetes.CpuMemory buildPartial() {
      com.leftbin.commons.proto.v1.kubernetes.CpuMemory result = new com.leftbin.commons.proto.v1.kubernetes.CpuMemory(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.leftbin.commons.proto.v1.kubernetes.CpuMemory result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cpu_ = cpu_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.memory_ = memory_;
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
      if (other instanceof com.leftbin.commons.proto.v1.kubernetes.CpuMemory) {
        return mergeFrom((com.leftbin.commons.proto.v1.kubernetes.CpuMemory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.leftbin.commons.proto.v1.kubernetes.CpuMemory other) {
      if (other == com.leftbin.commons.proto.v1.kubernetes.CpuMemory.getDefaultInstance()) return this;
      if (!other.getCpu().isEmpty()) {
        cpu_ = other.cpu_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getMemory().isEmpty()) {
        memory_ = other.memory_;
        bitField0_ |= 0x00000002;
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
              cpu_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              memory_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object cpu_ = "";
    /**
     * <code>string cpu = 1 [json_name = "cpu"];</code>
     * @return The cpu.
     */
    public java.lang.String getCpu() {
      java.lang.Object ref = cpu_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cpu_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cpu = 1 [json_name = "cpu"];</code>
     * @return The bytes for cpu.
     */
    public com.google.protobuf.ByteString
        getCpuBytes() {
      java.lang.Object ref = cpu_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cpu_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cpu = 1 [json_name = "cpu"];</code>
     * @param value The cpu to set.
     * @return This builder for chaining.
     */
    public Builder setCpu(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cpu_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string cpu = 1 [json_name = "cpu"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCpu() {
      cpu_ = getDefaultInstance().getCpu();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string cpu = 1 [json_name = "cpu"];</code>
     * @param value The bytes for cpu to set.
     * @return This builder for chaining.
     */
    public Builder setCpuBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cpu_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object memory_ = "";
    /**
     * <code>string memory = 2 [json_name = "memory"];</code>
     * @return The memory.
     */
    public java.lang.String getMemory() {
      java.lang.Object ref = memory_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        memory_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string memory = 2 [json_name = "memory"];</code>
     * @return The bytes for memory.
     */
    public com.google.protobuf.ByteString
        getMemoryBytes() {
      java.lang.Object ref = memory_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        memory_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string memory = 2 [json_name = "memory"];</code>
     * @param value The memory to set.
     * @return This builder for chaining.
     */
    public Builder setMemory(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      memory_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string memory = 2 [json_name = "memory"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMemory() {
      memory_ = getDefaultInstance().getMemory();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string memory = 2 [json_name = "memory"];</code>
     * @param value The bytes for memory to set.
     * @return This builder for chaining.
     */
    public Builder setMemoryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      memory_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:leftbin.commons.proto.v1.kubernetes.CpuMemory)
  }

  // @@protoc_insertion_point(class_scope:leftbin.commons.proto.v1.kubernetes.CpuMemory)
  private static final com.leftbin.commons.proto.v1.kubernetes.CpuMemory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.leftbin.commons.proto.v1.kubernetes.CpuMemory();
  }

  public static com.leftbin.commons.proto.v1.kubernetes.CpuMemory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CpuMemory>
      PARSER = new com.google.protobuf.AbstractParser<CpuMemory>() {
    @java.lang.Override
    public CpuMemory parsePartialFrom(
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

  public static com.google.protobuf.Parser<CpuMemory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CpuMemory> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.leftbin.commons.proto.v1.kubernetes.CpuMemory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
