// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/kubernetes/model.proto

package com.leftbin.commons.proto.v1.kubernetes;

/**
 * <pre>
 * kubernetes container cpu and memory resources
 * </pre>
 *
 * Protobuf type {@code leftbin.commons.proto.v1.kubernetes.ContainerResources}
 */
public final class ContainerResources extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:leftbin.commons.proto.v1.kubernetes.ContainerResources)
    ContainerResourcesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContainerResources.newBuilder() to construct.
  private ContainerResources(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContainerResources() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContainerResources();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.leftbin.commons.proto.v1.kubernetes.ModelProto.internal_static_leftbin_commons_proto_v1_kubernetes_ContainerResources_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.leftbin.commons.proto.v1.kubernetes.ModelProto.internal_static_leftbin_commons_proto_v1_kubernetes_ContainerResources_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.leftbin.commons.proto.v1.kubernetes.ContainerResources.class, com.leftbin.commons.proto.v1.kubernetes.ContainerResources.Builder.class);
  }

  public static final int LIMITS_FIELD_NUMBER = 1;
  private com.leftbin.commons.proto.v1.kubernetes.CpuMemory limits_;
  /**
   * <pre>
   * container resource limits
   * key is either cpu or memory and value is the limits value for the resource
   * </pre>
   *
   * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory limits = 1 [json_name = "limits"];</code>
   * @return Whether the limits field is set.
   */
  @java.lang.Override
  public boolean hasLimits() {
    return limits_ != null;
  }
  /**
   * <pre>
   * container resource limits
   * key is either cpu or memory and value is the limits value for the resource
   * </pre>
   *
   * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory limits = 1 [json_name = "limits"];</code>
   * @return The limits.
   */
  @java.lang.Override
  public com.leftbin.commons.proto.v1.kubernetes.CpuMemory getLimits() {
    return limits_ == null ? com.leftbin.commons.proto.v1.kubernetes.CpuMemory.getDefaultInstance() : limits_;
  }
  /**
   * <pre>
   * container resource limits
   * key is either cpu or memory and value is the limits value for the resource
   * </pre>
   *
   * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory limits = 1 [json_name = "limits"];</code>
   */
  @java.lang.Override
  public com.leftbin.commons.proto.v1.kubernetes.CpuMemoryOrBuilder getLimitsOrBuilder() {
    return limits_ == null ? com.leftbin.commons.proto.v1.kubernetes.CpuMemory.getDefaultInstance() : limits_;
  }

  public static final int REQUESTS_FIELD_NUMBER = 2;
  private com.leftbin.commons.proto.v1.kubernetes.CpuMemory requests_;
  /**
   * <pre>
   * container resource limits
   * key is either cpu or memory and value is the requests value for the resource
   * </pre>
   *
   * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory requests = 2 [json_name = "requests"];</code>
   * @return Whether the requests field is set.
   */
  @java.lang.Override
  public boolean hasRequests() {
    return requests_ != null;
  }
  /**
   * <pre>
   * container resource limits
   * key is either cpu or memory and value is the requests value for the resource
   * </pre>
   *
   * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory requests = 2 [json_name = "requests"];</code>
   * @return The requests.
   */
  @java.lang.Override
  public com.leftbin.commons.proto.v1.kubernetes.CpuMemory getRequests() {
    return requests_ == null ? com.leftbin.commons.proto.v1.kubernetes.CpuMemory.getDefaultInstance() : requests_;
  }
  /**
   * <pre>
   * container resource limits
   * key is either cpu or memory and value is the requests value for the resource
   * </pre>
   *
   * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory requests = 2 [json_name = "requests"];</code>
   */
  @java.lang.Override
  public com.leftbin.commons.proto.v1.kubernetes.CpuMemoryOrBuilder getRequestsOrBuilder() {
    return requests_ == null ? com.leftbin.commons.proto.v1.kubernetes.CpuMemory.getDefaultInstance() : requests_;
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
    if (limits_ != null) {
      output.writeMessage(1, getLimits());
    }
    if (requests_ != null) {
      output.writeMessage(2, getRequests());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (limits_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLimits());
    }
    if (requests_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRequests());
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
    if (!(obj instanceof com.leftbin.commons.proto.v1.kubernetes.ContainerResources)) {
      return super.equals(obj);
    }
    com.leftbin.commons.proto.v1.kubernetes.ContainerResources other = (com.leftbin.commons.proto.v1.kubernetes.ContainerResources) obj;

    if (hasLimits() != other.hasLimits()) return false;
    if (hasLimits()) {
      if (!getLimits()
          .equals(other.getLimits())) return false;
    }
    if (hasRequests() != other.hasRequests()) return false;
    if (hasRequests()) {
      if (!getRequests()
          .equals(other.getRequests())) return false;
    }
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
    if (hasLimits()) {
      hash = (37 * hash) + LIMITS_FIELD_NUMBER;
      hash = (53 * hash) + getLimits().hashCode();
    }
    if (hasRequests()) {
      hash = (37 * hash) + REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getRequests().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.leftbin.commons.proto.v1.kubernetes.ContainerResources parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.ContainerResources parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.ContainerResources parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.ContainerResources parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.ContainerResources parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.ContainerResources parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.ContainerResources parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.ContainerResources parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.leftbin.commons.proto.v1.kubernetes.ContainerResources parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.leftbin.commons.proto.v1.kubernetes.ContainerResources parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.ContainerResources parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leftbin.commons.proto.v1.kubernetes.ContainerResources parseFrom(
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
  public static Builder newBuilder(com.leftbin.commons.proto.v1.kubernetes.ContainerResources prototype) {
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
   * kubernetes container cpu and memory resources
   * </pre>
   *
   * Protobuf type {@code leftbin.commons.proto.v1.kubernetes.ContainerResources}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:leftbin.commons.proto.v1.kubernetes.ContainerResources)
      com.leftbin.commons.proto.v1.kubernetes.ContainerResourcesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.leftbin.commons.proto.v1.kubernetes.ModelProto.internal_static_leftbin_commons_proto_v1_kubernetes_ContainerResources_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.leftbin.commons.proto.v1.kubernetes.ModelProto.internal_static_leftbin_commons_proto_v1_kubernetes_ContainerResources_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.leftbin.commons.proto.v1.kubernetes.ContainerResources.class, com.leftbin.commons.proto.v1.kubernetes.ContainerResources.Builder.class);
    }

    // Construct using com.leftbin.commons.proto.v1.kubernetes.ContainerResources.newBuilder()
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
      limits_ = null;
      if (limitsBuilder_ != null) {
        limitsBuilder_.dispose();
        limitsBuilder_ = null;
      }
      requests_ = null;
      if (requestsBuilder_ != null) {
        requestsBuilder_.dispose();
        requestsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.leftbin.commons.proto.v1.kubernetes.ModelProto.internal_static_leftbin_commons_proto_v1_kubernetes_ContainerResources_descriptor;
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.kubernetes.ContainerResources getDefaultInstanceForType() {
      return com.leftbin.commons.proto.v1.kubernetes.ContainerResources.getDefaultInstance();
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.kubernetes.ContainerResources build() {
      com.leftbin.commons.proto.v1.kubernetes.ContainerResources result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.kubernetes.ContainerResources buildPartial() {
      com.leftbin.commons.proto.v1.kubernetes.ContainerResources result = new com.leftbin.commons.proto.v1.kubernetes.ContainerResources(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.leftbin.commons.proto.v1.kubernetes.ContainerResources result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.limits_ = limitsBuilder_ == null
            ? limits_
            : limitsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.requests_ = requestsBuilder_ == null
            ? requests_
            : requestsBuilder_.build();
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
      if (other instanceof com.leftbin.commons.proto.v1.kubernetes.ContainerResources) {
        return mergeFrom((com.leftbin.commons.proto.v1.kubernetes.ContainerResources)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.leftbin.commons.proto.v1.kubernetes.ContainerResources other) {
      if (other == com.leftbin.commons.proto.v1.kubernetes.ContainerResources.getDefaultInstance()) return this;
      if (other.hasLimits()) {
        mergeLimits(other.getLimits());
      }
      if (other.hasRequests()) {
        mergeRequests(other.getRequests());
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
              input.readMessage(
                  getLimitsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRequestsFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.leftbin.commons.proto.v1.kubernetes.CpuMemory limits_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.leftbin.commons.proto.v1.kubernetes.CpuMemory, com.leftbin.commons.proto.v1.kubernetes.CpuMemory.Builder, com.leftbin.commons.proto.v1.kubernetes.CpuMemoryOrBuilder> limitsBuilder_;
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the limits value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory limits = 1 [json_name = "limits"];</code>
     * @return Whether the limits field is set.
     */
    public boolean hasLimits() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the limits value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory limits = 1 [json_name = "limits"];</code>
     * @return The limits.
     */
    public com.leftbin.commons.proto.v1.kubernetes.CpuMemory getLimits() {
      if (limitsBuilder_ == null) {
        return limits_ == null ? com.leftbin.commons.proto.v1.kubernetes.CpuMemory.getDefaultInstance() : limits_;
      } else {
        return limitsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the limits value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory limits = 1 [json_name = "limits"];</code>
     */
    public Builder setLimits(com.leftbin.commons.proto.v1.kubernetes.CpuMemory value) {
      if (limitsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        limits_ = value;
      } else {
        limitsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the limits value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory limits = 1 [json_name = "limits"];</code>
     */
    public Builder setLimits(
        com.leftbin.commons.proto.v1.kubernetes.CpuMemory.Builder builderForValue) {
      if (limitsBuilder_ == null) {
        limits_ = builderForValue.build();
      } else {
        limitsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the limits value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory limits = 1 [json_name = "limits"];</code>
     */
    public Builder mergeLimits(com.leftbin.commons.proto.v1.kubernetes.CpuMemory value) {
      if (limitsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          limits_ != null &&
          limits_ != com.leftbin.commons.proto.v1.kubernetes.CpuMemory.getDefaultInstance()) {
          getLimitsBuilder().mergeFrom(value);
        } else {
          limits_ = value;
        }
      } else {
        limitsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the limits value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory limits = 1 [json_name = "limits"];</code>
     */
    public Builder clearLimits() {
      bitField0_ = (bitField0_ & ~0x00000001);
      limits_ = null;
      if (limitsBuilder_ != null) {
        limitsBuilder_.dispose();
        limitsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the limits value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory limits = 1 [json_name = "limits"];</code>
     */
    public com.leftbin.commons.proto.v1.kubernetes.CpuMemory.Builder getLimitsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLimitsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the limits value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory limits = 1 [json_name = "limits"];</code>
     */
    public com.leftbin.commons.proto.v1.kubernetes.CpuMemoryOrBuilder getLimitsOrBuilder() {
      if (limitsBuilder_ != null) {
        return limitsBuilder_.getMessageOrBuilder();
      } else {
        return limits_ == null ?
            com.leftbin.commons.proto.v1.kubernetes.CpuMemory.getDefaultInstance() : limits_;
      }
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the limits value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory limits = 1 [json_name = "limits"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.leftbin.commons.proto.v1.kubernetes.CpuMemory, com.leftbin.commons.proto.v1.kubernetes.CpuMemory.Builder, com.leftbin.commons.proto.v1.kubernetes.CpuMemoryOrBuilder> 
        getLimitsFieldBuilder() {
      if (limitsBuilder_ == null) {
        limitsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.leftbin.commons.proto.v1.kubernetes.CpuMemory, com.leftbin.commons.proto.v1.kubernetes.CpuMemory.Builder, com.leftbin.commons.proto.v1.kubernetes.CpuMemoryOrBuilder>(
                getLimits(),
                getParentForChildren(),
                isClean());
        limits_ = null;
      }
      return limitsBuilder_;
    }

    private com.leftbin.commons.proto.v1.kubernetes.CpuMemory requests_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.leftbin.commons.proto.v1.kubernetes.CpuMemory, com.leftbin.commons.proto.v1.kubernetes.CpuMemory.Builder, com.leftbin.commons.proto.v1.kubernetes.CpuMemoryOrBuilder> requestsBuilder_;
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the requests value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory requests = 2 [json_name = "requests"];</code>
     * @return Whether the requests field is set.
     */
    public boolean hasRequests() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the requests value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory requests = 2 [json_name = "requests"];</code>
     * @return The requests.
     */
    public com.leftbin.commons.proto.v1.kubernetes.CpuMemory getRequests() {
      if (requestsBuilder_ == null) {
        return requests_ == null ? com.leftbin.commons.proto.v1.kubernetes.CpuMemory.getDefaultInstance() : requests_;
      } else {
        return requestsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the requests value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory requests = 2 [json_name = "requests"];</code>
     */
    public Builder setRequests(com.leftbin.commons.proto.v1.kubernetes.CpuMemory value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requests_ = value;
      } else {
        requestsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the requests value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory requests = 2 [json_name = "requests"];</code>
     */
    public Builder setRequests(
        com.leftbin.commons.proto.v1.kubernetes.CpuMemory.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        requests_ = builderForValue.build();
      } else {
        requestsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the requests value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory requests = 2 [json_name = "requests"];</code>
     */
    public Builder mergeRequests(com.leftbin.commons.proto.v1.kubernetes.CpuMemory value) {
      if (requestsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          requests_ != null &&
          requests_ != com.leftbin.commons.proto.v1.kubernetes.CpuMemory.getDefaultInstance()) {
          getRequestsBuilder().mergeFrom(value);
        } else {
          requests_ = value;
        }
      } else {
        requestsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the requests value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory requests = 2 [json_name = "requests"];</code>
     */
    public Builder clearRequests() {
      bitField0_ = (bitField0_ & ~0x00000002);
      requests_ = null;
      if (requestsBuilder_ != null) {
        requestsBuilder_.dispose();
        requestsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the requests value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory requests = 2 [json_name = "requests"];</code>
     */
    public com.leftbin.commons.proto.v1.kubernetes.CpuMemory.Builder getRequestsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRequestsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the requests value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory requests = 2 [json_name = "requests"];</code>
     */
    public com.leftbin.commons.proto.v1.kubernetes.CpuMemoryOrBuilder getRequestsOrBuilder() {
      if (requestsBuilder_ != null) {
        return requestsBuilder_.getMessageOrBuilder();
      } else {
        return requests_ == null ?
            com.leftbin.commons.proto.v1.kubernetes.CpuMemory.getDefaultInstance() : requests_;
      }
    }
    /**
     * <pre>
     * container resource limits
     * key is either cpu or memory and value is the requests value for the resource
     * </pre>
     *
     * <code>.leftbin.commons.proto.v1.kubernetes.CpuMemory requests = 2 [json_name = "requests"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.leftbin.commons.proto.v1.kubernetes.CpuMemory, com.leftbin.commons.proto.v1.kubernetes.CpuMemory.Builder, com.leftbin.commons.proto.v1.kubernetes.CpuMemoryOrBuilder> 
        getRequestsFieldBuilder() {
      if (requestsBuilder_ == null) {
        requestsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.leftbin.commons.proto.v1.kubernetes.CpuMemory, com.leftbin.commons.proto.v1.kubernetes.CpuMemory.Builder, com.leftbin.commons.proto.v1.kubernetes.CpuMemoryOrBuilder>(
                getRequests(),
                getParentForChildren(),
                isClean());
        requests_ = null;
      }
      return requestsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:leftbin.commons.proto.v1.kubernetes.ContainerResources)
  }

  // @@protoc_insertion_point(class_scope:leftbin.commons.proto.v1.kubernetes.ContainerResources)
  private static final com.leftbin.commons.proto.v1.kubernetes.ContainerResources DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.leftbin.commons.proto.v1.kubernetes.ContainerResources();
  }

  public static com.leftbin.commons.proto.v1.kubernetes.ContainerResources getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContainerResources>
      PARSER = new com.google.protobuf.AbstractParser<ContainerResources>() {
    @java.lang.Override
    public ContainerResources parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContainerResources> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContainerResources> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.leftbin.commons.proto.v1.kubernetes.ContainerResources getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

