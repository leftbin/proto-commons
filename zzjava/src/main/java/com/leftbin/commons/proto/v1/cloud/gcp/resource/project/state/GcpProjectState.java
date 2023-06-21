// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/cloud/gcp/resource/project/state/model.proto

package com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state;

/**
 * <pre>
 * gcp project state
 * </pre>
 *
 * Protobuf type {@code leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState}
 */
public final class GcpProjectState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState)
    GcpProjectStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GcpProjectState.newBuilder() to construct.
  private GcpProjectState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GcpProjectState() {
    name_ = "";
    id_ = "";
    number_ = "";
    billingAccountId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GcpProjectState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.ModelProto.internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_state_GcpProjectState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.ModelProto.internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_state_GcpProjectState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState.class, com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * name of the gcp project
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
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
   * name of the gcp project
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
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

  public static final int ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <pre>
   * id of the gcp project
   * </pre>
   *
   * <code>string id = 2 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * id of the gcp project
   * </pre>
   *
   * <code>string id = 2 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUMBER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object number_ = "";
  /**
   * <pre>
   * number of the gcp project
   * </pre>
   *
   * <code>string number = 3 [json_name = "number"];</code>
   * @return The number.
   */
  @java.lang.Override
  public java.lang.String getNumber() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      number_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * number of the gcp project
   * </pre>
   *
   * <code>string number = 3 [json_name = "number"];</code>
   * @return The bytes for number.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNumberBytes() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      number_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BILLING_ACCOUNT_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object billingAccountId_ = "";
  /**
   * <pre>
   * id of the billing account
   * </pre>
   *
   * <code>string billing_account_id = 4 [json_name = "billingAccountId"];</code>
   * @return The billingAccountId.
   */
  @java.lang.Override
  public java.lang.String getBillingAccountId() {
    java.lang.Object ref = billingAccountId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      billingAccountId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * id of the billing account
   * </pre>
   *
   * <code>string billing_account_id = 4 [json_name = "billingAccountId"];</code>
   * @return The bytes for billingAccountId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBillingAccountIdBytes() {
    java.lang.Object ref = billingAccountId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      billingAccountId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(number_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, number_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(billingAccountId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, billingAccountId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(number_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, number_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(billingAccountId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, billingAccountId_);
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
    if (!(obj instanceof com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState)) {
      return super.equals(obj);
    }
    com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState other = (com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getId()
        .equals(other.getId())) return false;
    if (!getNumber()
        .equals(other.getNumber())) return false;
    if (!getBillingAccountId()
        .equals(other.getBillingAccountId())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getNumber().hashCode();
    hash = (37 * hash) + BILLING_ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBillingAccountId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState parseFrom(
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
  public static Builder newBuilder(com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState prototype) {
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
   * gcp project state
   * </pre>
   *
   * Protobuf type {@code leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState)
      com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.ModelProto.internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_state_GcpProjectState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.ModelProto.internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_state_GcpProjectState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState.class, com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState.Builder.class);
    }

    // Construct using com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState.newBuilder()
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
      name_ = "";
      id_ = "";
      number_ = "";
      billingAccountId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.ModelProto.internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_state_GcpProjectState_descriptor;
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState getDefaultInstanceForType() {
      return com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState.getDefaultInstance();
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState build() {
      com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState buildPartial() {
      com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState result = new com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.number_ = number_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.billingAccountId_ = billingAccountId_;
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
      if (other instanceof com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState) {
        return mergeFrom((com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState other) {
      if (other == com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getNumber().isEmpty()) {
        number_ = other.number_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getBillingAccountId().isEmpty()) {
        billingAccountId_ = other.billingAccountId_;
        bitField0_ |= 0x00000008;
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              number_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              billingAccountId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * name of the gcp project
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
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
     * name of the gcp project
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
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
     * name of the gcp project
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name of the gcp project
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name of the gcp project
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * id of the gcp project
     * </pre>
     *
     * <code>string id = 2 [json_name = "id"];</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * id of the gcp project
     * </pre>
     *
     * <code>string id = 2 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * id of the gcp project
     * </pre>
     *
     * <code>string id = 2 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * id of the gcp project
     * </pre>
     *
     * <code>string id = 2 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * id of the gcp project
     * </pre>
     *
     * <code>string id = 2 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object number_ = "";
    /**
     * <pre>
     * number of the gcp project
     * </pre>
     *
     * <code>string number = 3 [json_name = "number"];</code>
     * @return The number.
     */
    public java.lang.String getNumber() {
      java.lang.Object ref = number_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        number_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * number of the gcp project
     * </pre>
     *
     * <code>string number = 3 [json_name = "number"];</code>
     * @return The bytes for number.
     */
    public com.google.protobuf.ByteString
        getNumberBytes() {
      java.lang.Object ref = number_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * number of the gcp project
     * </pre>
     *
     * <code>string number = 3 [json_name = "number"];</code>
     * @param value The number to set.
     * @return This builder for chaining.
     */
    public Builder setNumber(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      number_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * number of the gcp project
     * </pre>
     *
     * <code>string number = 3 [json_name = "number"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNumber() {
      number_ = getDefaultInstance().getNumber();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * number of the gcp project
     * </pre>
     *
     * <code>string number = 3 [json_name = "number"];</code>
     * @param value The bytes for number to set.
     * @return This builder for chaining.
     */
    public Builder setNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      number_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object billingAccountId_ = "";
    /**
     * <pre>
     * id of the billing account
     * </pre>
     *
     * <code>string billing_account_id = 4 [json_name = "billingAccountId"];</code>
     * @return The billingAccountId.
     */
    public java.lang.String getBillingAccountId() {
      java.lang.Object ref = billingAccountId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        billingAccountId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * id of the billing account
     * </pre>
     *
     * <code>string billing_account_id = 4 [json_name = "billingAccountId"];</code>
     * @return The bytes for billingAccountId.
     */
    public com.google.protobuf.ByteString
        getBillingAccountIdBytes() {
      java.lang.Object ref = billingAccountId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        billingAccountId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * id of the billing account
     * </pre>
     *
     * <code>string billing_account_id = 4 [json_name = "billingAccountId"];</code>
     * @param value The billingAccountId to set.
     * @return This builder for chaining.
     */
    public Builder setBillingAccountId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      billingAccountId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * id of the billing account
     * </pre>
     *
     * <code>string billing_account_id = 4 [json_name = "billingAccountId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBillingAccountId() {
      billingAccountId_ = getDefaultInstance().getBillingAccountId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * id of the billing account
     * </pre>
     *
     * <code>string billing_account_id = 4 [json_name = "billingAccountId"];</code>
     * @param value The bytes for billingAccountId to set.
     * @return This builder for chaining.
     */
    public Builder setBillingAccountIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      billingAccountId_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState)
  }

  // @@protoc_insertion_point(class_scope:leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState)
  private static final com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState();
  }

  public static com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcpProjectState>
      PARSER = new com.google.protobuf.AbstractParser<GcpProjectState>() {
    @java.lang.Override
    public GcpProjectState parsePartialFrom(
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

  public static com.google.protobuf.Parser<GcpProjectState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcpProjectState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.leftbin.commons.proto.v1.cloud.gcp.resource.project.state.GcpProjectState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

