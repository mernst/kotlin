// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_kpm.proto

package org.jetbrains.kotlin.gradle.idea.proto.generated.kpm;

/**
 * Protobuf type {@code org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto}
 */
public final class IdeaKpmFragmentCoordinatesProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto)
    IdeaKpmFragmentCoordinatesProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IdeaKpmFragmentCoordinatesProto.newBuilder() to construct.
  private IdeaKpmFragmentCoordinatesProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IdeaKpmFragmentCoordinatesProto() {
    fragmentName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IdeaKpmFragmentCoordinatesProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.ProtoKpm.internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_kpm_IdeaKpmFragmentCoordinatesProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.ProtoKpm.internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_kpm_IdeaKpmFragmentCoordinatesProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto.class, org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto.Builder.class);
  }

  private int bitField0_;
  public static final int MODULE_FIELD_NUMBER = 1;
  private org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto module_;
  /**
   * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto module = 1;</code>
   * @return Whether the module field is set.
   */
  @java.lang.Override
  public boolean hasModule() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto module = 1;</code>
   * @return The module.
   */
  @java.lang.Override
  public org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto getModule() {
    return module_ == null ? org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto.getDefaultInstance() : module_;
  }
  /**
   * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto module = 1;</code>
   */
  @java.lang.Override
  public org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProtoOrBuilder getModuleOrBuilder() {
    return module_ == null ? org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto.getDefaultInstance() : module_;
  }

  public static final int FRAGMENT_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object fragmentName_;
  /**
   * <code>optional string fragment_name = 2;</code>
   * @return Whether the fragmentName field is set.
   */
  @java.lang.Override
  public boolean hasFragmentName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string fragment_name = 2;</code>
   * @return The fragmentName.
   */
  @java.lang.Override
  public java.lang.String getFragmentName() {
    java.lang.Object ref = fragmentName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fragmentName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string fragment_name = 2;</code>
   * @return The bytes for fragmentName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFragmentNameBytes() {
    java.lang.Object ref = fragmentName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fragmentName_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getModule());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fragmentName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getModule());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fragmentName_);
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
    if (!(obj instanceof org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto)) {
      return super.equals(obj);
    }
    org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto other = (org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto) obj;

    if (hasModule() != other.hasModule()) return false;
    if (hasModule()) {
      if (!getModule()
          .equals(other.getModule())) return false;
    }
    if (hasFragmentName() != other.hasFragmentName()) return false;
    if (hasFragmentName()) {
      if (!getFragmentName()
          .equals(other.getFragmentName())) return false;
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
    if (hasModule()) {
      hash = (37 * hash) + MODULE_FIELD_NUMBER;
      hash = (53 * hash) + getModule().hashCode();
    }
    if (hasFragmentName()) {
      hash = (37 * hash) + FRAGMENT_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getFragmentName().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto parseFrom(
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
  public static Builder newBuilder(org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto prototype) {
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
   * Protobuf type {@code org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto)
      org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.ProtoKpm.internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_kpm_IdeaKpmFragmentCoordinatesProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.ProtoKpm.internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_kpm_IdeaKpmFragmentCoordinatesProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto.class, org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto.Builder.class);
    }

    // Construct using org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto.newBuilder()
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
        getModuleFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (moduleBuilder_ == null) {
        module_ = null;
      } else {
        moduleBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      fragmentName_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.ProtoKpm.internal_static_org_jetbrains_kotlin_gradle_idea_proto_generated_kpm_IdeaKpmFragmentCoordinatesProto_descriptor;
    }

    @java.lang.Override
    public org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto getDefaultInstanceForType() {
      return org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto build() {
      org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto buildPartial() {
      org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto result = new org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (moduleBuilder_ == null) {
          result.module_ = module_;
        } else {
          result.module_ = moduleBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.fragmentName_ = fragmentName_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto) {
        return mergeFrom((org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto other) {
      if (other == org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto.getDefaultInstance()) return this;
      if (other.hasModule()) {
        mergeModule(other.getModule());
      }
      if (other.hasFragmentName()) {
        bitField0_ |= 0x00000002;
        fragmentName_ = other.fragmentName_;
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
              input.readMessage(
                  getModuleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              fragmentName_ = input.readStringRequireUtf8();
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

    private org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto module_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto, org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto.Builder, org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProtoOrBuilder> moduleBuilder_;
    /**
     * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto module = 1;</code>
     * @return Whether the module field is set.
     */
    public boolean hasModule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto module = 1;</code>
     * @return The module.
     */
    public org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto getModule() {
      if (moduleBuilder_ == null) {
        return module_ == null ? org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto.getDefaultInstance() : module_;
      } else {
        return moduleBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto module = 1;</code>
     */
    public Builder setModule(org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto value) {
      if (moduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        module_ = value;
        onChanged();
      } else {
        moduleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto module = 1;</code>
     */
    public Builder setModule(
        org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto.Builder builderForValue) {
      if (moduleBuilder_ == null) {
        module_ = builderForValue.build();
        onChanged();
      } else {
        moduleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto module = 1;</code>
     */
    public Builder mergeModule(org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto value) {
      if (moduleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            module_ != null &&
            module_ != org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto.getDefaultInstance()) {
          module_ =
            org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto.newBuilder(module_).mergeFrom(value).buildPartial();
        } else {
          module_ = value;
        }
        onChanged();
      } else {
        moduleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto module = 1;</code>
     */
    public Builder clearModule() {
      if (moduleBuilder_ == null) {
        module_ = null;
        onChanged();
      } else {
        moduleBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto module = 1;</code>
     */
    public org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto.Builder getModuleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getModuleFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto module = 1;</code>
     */
    public org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProtoOrBuilder getModuleOrBuilder() {
      if (moduleBuilder_ != null) {
        return moduleBuilder_.getMessageOrBuilder();
      } else {
        return module_ == null ?
            org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto.getDefaultInstance() : module_;
      }
    }
    /**
     * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto module = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto, org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto.Builder, org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProtoOrBuilder> 
        getModuleFieldBuilder() {
      if (moduleBuilder_ == null) {
        moduleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto, org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProto.Builder, org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmModuleCoordinatesProtoOrBuilder>(
                getModule(),
                getParentForChildren(),
                isClean());
        module_ = null;
      }
      return moduleBuilder_;
    }

    private java.lang.Object fragmentName_ = "";
    /**
     * <code>optional string fragment_name = 2;</code>
     * @return Whether the fragmentName field is set.
     */
    public boolean hasFragmentName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string fragment_name = 2;</code>
     * @return The fragmentName.
     */
    public java.lang.String getFragmentName() {
      java.lang.Object ref = fragmentName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fragmentName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string fragment_name = 2;</code>
     * @return The bytes for fragmentName.
     */
    public com.google.protobuf.ByteString
        getFragmentNameBytes() {
      java.lang.Object ref = fragmentName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fragmentName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string fragment_name = 2;</code>
     * @param value The fragmentName to set.
     * @return This builder for chaining.
     */
    public Builder setFragmentName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      fragmentName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string fragment_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFragmentName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fragmentName_ = getDefaultInstance().getFragmentName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string fragment_name = 2;</code>
     * @param value The bytes for fragmentName to set.
     * @return This builder for chaining.
     */
    public Builder setFragmentNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      fragmentName_ = value;
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


    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto)
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto)
  private static final org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto();
  }

  public static org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IdeaKpmFragmentCoordinatesProto>
      PARSER = new com.google.protobuf.AbstractParser<IdeaKpmFragmentCoordinatesProto>() {
    @java.lang.Override
    public IdeaKpmFragmentCoordinatesProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<IdeaKpmFragmentCoordinatesProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IdeaKpmFragmentCoordinatesProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentCoordinatesProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

