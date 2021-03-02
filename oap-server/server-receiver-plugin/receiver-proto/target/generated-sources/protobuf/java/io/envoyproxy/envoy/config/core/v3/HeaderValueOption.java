// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/base.proto

package io.envoyproxy.envoy.config.core.v3;

/**
 * <pre>
 * Header name/value pair plus option to control append behavior.
 * </pre>
 *
 * Protobuf type {@code envoy.config.core.v3.HeaderValueOption}
 */
public final class HeaderValueOption extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.core.v3.HeaderValueOption)
    HeaderValueOptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HeaderValueOption.newBuilder() to construct.
  private HeaderValueOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeaderValueOption() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HeaderValueOption();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HeaderValueOption(
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
          case 10: {
            io.envoyproxy.envoy.config.core.v3.HeaderValue.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(io.envoyproxy.envoy.config.core.v3.HeaderValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.BoolValue.Builder subBuilder = null;
            if (append_ != null) {
              subBuilder = append_.toBuilder();
            }
            append_ = input.readMessage(com.google.protobuf.BoolValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(append_);
              append_ = subBuilder.buildPartial();
            }

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
    return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_HeaderValueOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_HeaderValueOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.core.v3.HeaderValueOption.class, io.envoyproxy.envoy.config.core.v3.HeaderValueOption.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.config.core.v3.HeaderValue header_;
  /**
   * <pre>
   * Header name/value pair that this option applies to.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   * Header name/value pair that this option applies to.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
   * @return The header.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.HeaderValue getHeader() {
    return header_ == null ? io.envoyproxy.envoy.config.core.v3.HeaderValue.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   * Header name/value pair that this option applies to.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.HeaderValueOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int APPEND_FIELD_NUMBER = 2;
  private com.google.protobuf.BoolValue append_;
  /**
   * <pre>
   * Should the value be appended? If true (default), the value is appended to
   * existing values. Otherwise it replaces any existing values.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue append = 2;</code>
   * @return Whether the append field is set.
   */
  @java.lang.Override
  public boolean hasAppend() {
    return append_ != null;
  }
  /**
   * <pre>
   * Should the value be appended? If true (default), the value is appended to
   * existing values. Otherwise it replaces any existing values.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue append = 2;</code>
   * @return The append.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getAppend() {
    return append_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : append_;
  }
  /**
   * <pre>
   * Should the value be appended? If true (default), the value is appended to
   * existing values. Otherwise it replaces any existing values.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue append = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getAppendOrBuilder() {
    return getAppend();
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (append_ != null) {
      output.writeMessage(2, getAppend());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (append_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAppend());
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
    if (!(obj instanceof io.envoyproxy.envoy.config.core.v3.HeaderValueOption)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.core.v3.HeaderValueOption other = (io.envoyproxy.envoy.config.core.v3.HeaderValueOption) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (hasAppend() != other.hasAppend()) return false;
    if (hasAppend()) {
      if (!getAppend()
          .equals(other.getAppend())) return false;
    }
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (hasAppend()) {
      hash = (37 * hash) + APPEND_FIELD_NUMBER;
      hash = (53 * hash) + getAppend().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.core.v3.HeaderValueOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.HeaderValueOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.HeaderValueOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.HeaderValueOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.HeaderValueOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.HeaderValueOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.HeaderValueOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.HeaderValueOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.HeaderValueOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.HeaderValueOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.HeaderValueOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.HeaderValueOption parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.core.v3.HeaderValueOption prototype) {
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
   * Header name/value pair plus option to control append behavior.
   * </pre>
   *
   * Protobuf type {@code envoy.config.core.v3.HeaderValueOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.core.v3.HeaderValueOption)
      io.envoyproxy.envoy.config.core.v3.HeaderValueOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_HeaderValueOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_HeaderValueOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.core.v3.HeaderValueOption.class, io.envoyproxy.envoy.config.core.v3.HeaderValueOption.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.core.v3.HeaderValueOption.newBuilder()
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
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (appendBuilder_ == null) {
        append_ = null;
      } else {
        append_ = null;
        appendBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_HeaderValueOption_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.HeaderValueOption getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.core.v3.HeaderValueOption.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.HeaderValueOption build() {
      io.envoyproxy.envoy.config.core.v3.HeaderValueOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.HeaderValueOption buildPartial() {
      io.envoyproxy.envoy.config.core.v3.HeaderValueOption result = new io.envoyproxy.envoy.config.core.v3.HeaderValueOption(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (appendBuilder_ == null) {
        result.append_ = append_;
      } else {
        result.append_ = appendBuilder_.build();
      }
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
      if (other instanceof io.envoyproxy.envoy.config.core.v3.HeaderValueOption) {
        return mergeFrom((io.envoyproxy.envoy.config.core.v3.HeaderValueOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.core.v3.HeaderValueOption other) {
      if (other == io.envoyproxy.envoy.config.core.v3.HeaderValueOption.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasAppend()) {
        mergeAppend(other.getAppend());
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
      io.envoyproxy.envoy.config.core.v3.HeaderValueOption parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.core.v3.HeaderValueOption) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.envoyproxy.envoy.config.core.v3.HeaderValue header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.HeaderValue, io.envoyproxy.envoy.config.core.v3.HeaderValue.Builder, io.envoyproxy.envoy.config.core.v3.HeaderValueOrBuilder> headerBuilder_;
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     * @return The header.
     */
    public io.envoyproxy.envoy.config.core.v3.HeaderValue getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? io.envoyproxy.envoy.config.core.v3.HeaderValue.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setHeader(io.envoyproxy.envoy.config.core.v3.HeaderValue value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setHeader(
        io.envoyproxy.envoy.config.core.v3.HeaderValue.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeHeader(io.envoyproxy.envoy.config.core.v3.HeaderValue value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            io.envoyproxy.envoy.config.core.v3.HeaderValue.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.core.v3.HeaderValue.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.core.v3.HeaderValueOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            io.envoyproxy.envoy.config.core.v3.HeaderValue.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.config.core.v3.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.HeaderValue, io.envoyproxy.envoy.config.core.v3.HeaderValue.Builder, io.envoyproxy.envoy.config.core.v3.HeaderValueOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.HeaderValue, io.envoyproxy.envoy.config.core.v3.HeaderValue.Builder, io.envoyproxy.envoy.config.core.v3.HeaderValueOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private com.google.protobuf.BoolValue append_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> appendBuilder_;
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values. Otherwise it replaces any existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     * @return Whether the append field is set.
     */
    public boolean hasAppend() {
      return appendBuilder_ != null || append_ != null;
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values. Otherwise it replaces any existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     * @return The append.
     */
    public com.google.protobuf.BoolValue getAppend() {
      if (appendBuilder_ == null) {
        return append_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : append_;
      } else {
        return appendBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values. Otherwise it replaces any existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public Builder setAppend(com.google.protobuf.BoolValue value) {
      if (appendBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        append_ = value;
        onChanged();
      } else {
        appendBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values. Otherwise it replaces any existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public Builder setAppend(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (appendBuilder_ == null) {
        append_ = builderForValue.build();
        onChanged();
      } else {
        appendBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values. Otherwise it replaces any existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public Builder mergeAppend(com.google.protobuf.BoolValue value) {
      if (appendBuilder_ == null) {
        if (append_ != null) {
          append_ =
            com.google.protobuf.BoolValue.newBuilder(append_).mergeFrom(value).buildPartial();
        } else {
          append_ = value;
        }
        onChanged();
      } else {
        appendBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values. Otherwise it replaces any existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public Builder clearAppend() {
      if (appendBuilder_ == null) {
        append_ = null;
        onChanged();
      } else {
        append_ = null;
        appendBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values. Otherwise it replaces any existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public com.google.protobuf.BoolValue.Builder getAppendBuilder() {
      
      onChanged();
      return getAppendFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values. Otherwise it replaces any existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getAppendOrBuilder() {
      if (appendBuilder_ != null) {
        return appendBuilder_.getMessageOrBuilder();
      } else {
        return append_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : append_;
      }
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values. Otherwise it replaces any existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> 
        getAppendFieldBuilder() {
      if (appendBuilder_ == null) {
        appendBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getAppend(),
                getParentForChildren(),
                isClean());
        append_ = null;
      }
      return appendBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.core.v3.HeaderValueOption)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.core.v3.HeaderValueOption)
  private static final io.envoyproxy.envoy.config.core.v3.HeaderValueOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.core.v3.HeaderValueOption();
  }

  public static io.envoyproxy.envoy.config.core.v3.HeaderValueOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HeaderValueOption>
      PARSER = new com.google.protobuf.AbstractParser<HeaderValueOption>() {
    @java.lang.Override
    public HeaderValueOption parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HeaderValueOption(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HeaderValueOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HeaderValueOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.HeaderValueOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

