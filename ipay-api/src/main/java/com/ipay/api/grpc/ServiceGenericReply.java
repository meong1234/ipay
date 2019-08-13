// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ipay.proto

package com.ipay.api.grpc;

/**
 * Protobuf type {@code com.ipay.api.ServiceGenericReply}
 */
public  final class ServiceGenericReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ipay.api.ServiceGenericReply)
    ServiceGenericReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServiceGenericReply.newBuilder() to construct.
  private ServiceGenericReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServiceGenericReply() {
    success_ = false;
    errors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServiceGenericReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            success_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              errors_ = new java.util.ArrayList<com.ipay.api.grpc.ServiceError>();
              mutable_bitField0_ |= 0x00000002;
            }
            errors_.add(
                input.readMessage(com.ipay.api.grpc.ServiceError.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        errors_ = java.util.Collections.unmodifiableList(errors_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ipay.api.grpc.IpayApiProto.internal_static_com_ipay_api_ServiceGenericReply_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ipay.api.grpc.IpayApiProto.internal_static_com_ipay_api_ServiceGenericReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ipay.api.grpc.ServiceGenericReply.class, com.ipay.api.grpc.ServiceGenericReply.Builder.class);
  }

  private int bitField0_;
  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_;
  /**
   * <code>bool success = 1;</code>
   */
  public boolean getSuccess() {
    return success_;
  }

  public static final int ERRORS_FIELD_NUMBER = 2;
  private java.util.List<com.ipay.api.grpc.ServiceError> errors_;
  /**
   * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
   */
  public java.util.List<com.ipay.api.grpc.ServiceError> getErrorsList() {
    return errors_;
  }
  /**
   * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
   */
  public java.util.List<? extends com.ipay.api.grpc.ServiceErrorOrBuilder> 
      getErrorsOrBuilderList() {
    return errors_;
  }
  /**
   * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
   */
  public int getErrorsCount() {
    return errors_.size();
  }
  /**
   * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
   */
  public com.ipay.api.grpc.ServiceError getErrors(int index) {
    return errors_.get(index);
  }
  /**
   * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
   */
  public com.ipay.api.grpc.ServiceErrorOrBuilder getErrorsOrBuilder(
      int index) {
    return errors_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    for (int i = 0; i < errors_.size(); i++) {
      output.writeMessage(2, errors_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, success_);
    }
    for (int i = 0; i < errors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, errors_.get(i));
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
    if (!(obj instanceof com.ipay.api.grpc.ServiceGenericReply)) {
      return super.equals(obj);
    }
    com.ipay.api.grpc.ServiceGenericReply other = (com.ipay.api.grpc.ServiceGenericReply) obj;

    boolean result = true;
    result = result && (getSuccess()
        == other.getSuccess());
    result = result && getErrorsList()
        .equals(other.getErrorsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    if (getErrorsCount() > 0) {
      hash = (37 * hash) + ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + getErrorsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ipay.api.grpc.ServiceGenericReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ipay.api.grpc.ServiceGenericReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ipay.api.grpc.ServiceGenericReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ipay.api.grpc.ServiceGenericReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ipay.api.grpc.ServiceGenericReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ipay.api.grpc.ServiceGenericReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ipay.api.grpc.ServiceGenericReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ipay.api.grpc.ServiceGenericReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ipay.api.grpc.ServiceGenericReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ipay.api.grpc.ServiceGenericReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ipay.api.grpc.ServiceGenericReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ipay.api.grpc.ServiceGenericReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ipay.api.grpc.ServiceGenericReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.ipay.api.ServiceGenericReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ipay.api.ServiceGenericReply)
      com.ipay.api.grpc.ServiceGenericReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ipay.api.grpc.IpayApiProto.internal_static_com_ipay_api_ServiceGenericReply_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ipay.api.grpc.IpayApiProto.internal_static_com_ipay_api_ServiceGenericReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ipay.api.grpc.ServiceGenericReply.class, com.ipay.api.grpc.ServiceGenericReply.Builder.class);
    }

    // Construct using com.ipay.api.grpc.ServiceGenericReply.newBuilder()
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
        getErrorsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      success_ = false;

      if (errorsBuilder_ == null) {
        errors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        errorsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ipay.api.grpc.IpayApiProto.internal_static_com_ipay_api_ServiceGenericReply_descriptor;
    }

    public com.ipay.api.grpc.ServiceGenericReply getDefaultInstanceForType() {
      return com.ipay.api.grpc.ServiceGenericReply.getDefaultInstance();
    }

    public com.ipay.api.grpc.ServiceGenericReply build() {
      com.ipay.api.grpc.ServiceGenericReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ipay.api.grpc.ServiceGenericReply buildPartial() {
      com.ipay.api.grpc.ServiceGenericReply result = new com.ipay.api.grpc.ServiceGenericReply(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.success_ = success_;
      if (errorsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          errors_ = java.util.Collections.unmodifiableList(errors_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.errors_ = errors_;
      } else {
        result.errors_ = errorsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ipay.api.grpc.ServiceGenericReply) {
        return mergeFrom((com.ipay.api.grpc.ServiceGenericReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ipay.api.grpc.ServiceGenericReply other) {
      if (other == com.ipay.api.grpc.ServiceGenericReply.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (errorsBuilder_ == null) {
        if (!other.errors_.isEmpty()) {
          if (errors_.isEmpty()) {
            errors_ = other.errors_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureErrorsIsMutable();
            errors_.addAll(other.errors_);
          }
          onChanged();
        }
      } else {
        if (!other.errors_.isEmpty()) {
          if (errorsBuilder_.isEmpty()) {
            errorsBuilder_.dispose();
            errorsBuilder_ = null;
            errors_ = other.errors_;
            bitField0_ = (bitField0_ & ~0x00000002);
            errorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getErrorsFieldBuilder() : null;
          } else {
            errorsBuilder_.addAllMessages(other.errors_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ipay.api.grpc.ServiceGenericReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ipay.api.grpc.ServiceGenericReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean success_ ;
    /**
     * <code>bool success = 1;</code>
     */
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <code>bool success = 1;</code>
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool success = 1;</code>
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private java.util.List<com.ipay.api.grpc.ServiceError> errors_ =
      java.util.Collections.emptyList();
    private void ensureErrorsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        errors_ = new java.util.ArrayList<com.ipay.api.grpc.ServiceError>(errors_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ipay.api.grpc.ServiceError, com.ipay.api.grpc.ServiceError.Builder, com.ipay.api.grpc.ServiceErrorOrBuilder> errorsBuilder_;

    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public java.util.List<com.ipay.api.grpc.ServiceError> getErrorsList() {
      if (errorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(errors_);
      } else {
        return errorsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public int getErrorsCount() {
      if (errorsBuilder_ == null) {
        return errors_.size();
      } else {
        return errorsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public com.ipay.api.grpc.ServiceError getErrors(int index) {
      if (errorsBuilder_ == null) {
        return errors_.get(index);
      } else {
        return errorsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public Builder setErrors(
        int index, com.ipay.api.grpc.ServiceError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.set(index, value);
        onChanged();
      } else {
        errorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public Builder setErrors(
        int index, com.ipay.api.grpc.ServiceError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.set(index, builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public Builder addErrors(com.ipay.api.grpc.ServiceError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.add(value);
        onChanged();
      } else {
        errorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public Builder addErrors(
        int index, com.ipay.api.grpc.ServiceError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.add(index, value);
        onChanged();
      } else {
        errorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public Builder addErrors(
        com.ipay.api.grpc.ServiceError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.add(builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public Builder addErrors(
        int index, com.ipay.api.grpc.ServiceError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.add(index, builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public Builder addAllErrors(
        java.lang.Iterable<? extends com.ipay.api.grpc.ServiceError> values) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, errors_);
        onChanged();
      } else {
        errorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public Builder clearErrors() {
      if (errorsBuilder_ == null) {
        errors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        errorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public Builder removeErrors(int index) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.remove(index);
        onChanged();
      } else {
        errorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public com.ipay.api.grpc.ServiceError.Builder getErrorsBuilder(
        int index) {
      return getErrorsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public com.ipay.api.grpc.ServiceErrorOrBuilder getErrorsOrBuilder(
        int index) {
      if (errorsBuilder_ == null) {
        return errors_.get(index);  } else {
        return errorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public java.util.List<? extends com.ipay.api.grpc.ServiceErrorOrBuilder> 
         getErrorsOrBuilderList() {
      if (errorsBuilder_ != null) {
        return errorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(errors_);
      }
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public com.ipay.api.grpc.ServiceError.Builder addErrorsBuilder() {
      return getErrorsFieldBuilder().addBuilder(
          com.ipay.api.grpc.ServiceError.getDefaultInstance());
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public com.ipay.api.grpc.ServiceError.Builder addErrorsBuilder(
        int index) {
      return getErrorsFieldBuilder().addBuilder(
          index, com.ipay.api.grpc.ServiceError.getDefaultInstance());
    }
    /**
     * <code>repeated .com.ipay.api.ServiceError errors = 2;</code>
     */
    public java.util.List<com.ipay.api.grpc.ServiceError.Builder> 
         getErrorsBuilderList() {
      return getErrorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ipay.api.grpc.ServiceError, com.ipay.api.grpc.ServiceError.Builder, com.ipay.api.grpc.ServiceErrorOrBuilder> 
        getErrorsFieldBuilder() {
      if (errorsBuilder_ == null) {
        errorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ipay.api.grpc.ServiceError, com.ipay.api.grpc.ServiceError.Builder, com.ipay.api.grpc.ServiceErrorOrBuilder>(
                errors_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        errors_ = null;
      }
      return errorsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ipay.api.ServiceGenericReply)
  }

  // @@protoc_insertion_point(class_scope:com.ipay.api.ServiceGenericReply)
  private static final com.ipay.api.grpc.ServiceGenericReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ipay.api.grpc.ServiceGenericReply();
  }

  public static com.ipay.api.grpc.ServiceGenericReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceGenericReply>
      PARSER = new com.google.protobuf.AbstractParser<ServiceGenericReply>() {
    public ServiceGenericReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServiceGenericReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServiceGenericReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceGenericReply> getParserForType() {
    return PARSER;
  }

  public com.ipay.api.grpc.ServiceGenericReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
