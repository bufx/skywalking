// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/address.proto

package io.envoyproxy.envoy.config.core.v3;

/**
 * <pre>
 * CidrRange specifies an IP Address and a prefix length to construct
 * the subnet mask for a `CIDR &lt;https://tools.ietf.org/html/rfc4632&gt;`_ range.
 * </pre>
 *
 * Protobuf type {@code envoy.config.core.v3.CidrRange}
 */
public final class CidrRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.core.v3.CidrRange)
    CidrRangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CidrRange.newBuilder() to construct.
  private CidrRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CidrRange() {
    addressPrefix_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CidrRange();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CidrRange(
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
            java.lang.String s = input.readStringRequireUtf8();

            addressPrefix_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.UInt32Value.Builder subBuilder = null;
            if (prefixLen_ != null) {
              subBuilder = prefixLen_.toBuilder();
            }
            prefixLen_ = input.readMessage(com.google.protobuf.UInt32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(prefixLen_);
              prefixLen_ = subBuilder.buildPartial();
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
    return io.envoyproxy.envoy.config.core.v3.AddressProto.internal_static_envoy_config_core_v3_CidrRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.core.v3.AddressProto.internal_static_envoy_config_core_v3_CidrRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.core.v3.CidrRange.class, io.envoyproxy.envoy.config.core.v3.CidrRange.Builder.class);
  }

  public static final int ADDRESS_PREFIX_FIELD_NUMBER = 1;
  private volatile java.lang.Object addressPrefix_;
  /**
   * <pre>
   * IPv4 or IPv6 address, e.g. ``192.0.0.0`` or ``2001:db8::``.
   * </pre>
   *
   * <code>string address_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The addressPrefix.
   */
  @java.lang.Override
  public java.lang.String getAddressPrefix() {
    java.lang.Object ref = addressPrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      addressPrefix_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * IPv4 or IPv6 address, e.g. ``192.0.0.0`` or ``2001:db8::``.
   * </pre>
   *
   * <code>string address_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for addressPrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressPrefixBytes() {
    java.lang.Object ref = addressPrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      addressPrefix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREFIX_LEN_FIELD_NUMBER = 2;
  private com.google.protobuf.UInt32Value prefixLen_;
  /**
   * <pre>
   * Length of prefix, e.g. 0, 32.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value prefix_len = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the prefixLen field is set.
   */
  @java.lang.Override
  public boolean hasPrefixLen() {
    return prefixLen_ != null;
  }
  /**
   * <pre>
   * Length of prefix, e.g. 0, 32.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value prefix_len = 2 [(.validate.rules) = { ... }</code>
   * @return The prefixLen.
   */
  @java.lang.Override
  public com.google.protobuf.UInt32Value getPrefixLen() {
    return prefixLen_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : prefixLen_;
  }
  /**
   * <pre>
   * Length of prefix, e.g. 0, 32.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value prefix_len = 2 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.UInt32ValueOrBuilder getPrefixLenOrBuilder() {
    return getPrefixLen();
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
    if (!getAddressPrefixBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, addressPrefix_);
    }
    if (prefixLen_ != null) {
      output.writeMessage(2, getPrefixLen());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAddressPrefixBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, addressPrefix_);
    }
    if (prefixLen_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPrefixLen());
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
    if (!(obj instanceof io.envoyproxy.envoy.config.core.v3.CidrRange)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.core.v3.CidrRange other = (io.envoyproxy.envoy.config.core.v3.CidrRange) obj;

    if (!getAddressPrefix()
        .equals(other.getAddressPrefix())) return false;
    if (hasPrefixLen() != other.hasPrefixLen()) return false;
    if (hasPrefixLen()) {
      if (!getPrefixLen()
          .equals(other.getPrefixLen())) return false;
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
    hash = (37 * hash) + ADDRESS_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getAddressPrefix().hashCode();
    if (hasPrefixLen()) {
      hash = (37 * hash) + PREFIX_LEN_FIELD_NUMBER;
      hash = (53 * hash) + getPrefixLen().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.core.v3.CidrRange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.CidrRange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.CidrRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.CidrRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.CidrRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.CidrRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.CidrRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.CidrRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.CidrRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.CidrRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.CidrRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.CidrRange parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.core.v3.CidrRange prototype) {
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
   * CidrRange specifies an IP Address and a prefix length to construct
   * the subnet mask for a `CIDR &lt;https://tools.ietf.org/html/rfc4632&gt;`_ range.
   * </pre>
   *
   * Protobuf type {@code envoy.config.core.v3.CidrRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.core.v3.CidrRange)
      io.envoyproxy.envoy.config.core.v3.CidrRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.core.v3.AddressProto.internal_static_envoy_config_core_v3_CidrRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.core.v3.AddressProto.internal_static_envoy_config_core_v3_CidrRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.core.v3.CidrRange.class, io.envoyproxy.envoy.config.core.v3.CidrRange.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.core.v3.CidrRange.newBuilder()
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
      addressPrefix_ = "";

      if (prefixLenBuilder_ == null) {
        prefixLen_ = null;
      } else {
        prefixLen_ = null;
        prefixLenBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.core.v3.AddressProto.internal_static_envoy_config_core_v3_CidrRange_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.CidrRange getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.core.v3.CidrRange.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.CidrRange build() {
      io.envoyproxy.envoy.config.core.v3.CidrRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.CidrRange buildPartial() {
      io.envoyproxy.envoy.config.core.v3.CidrRange result = new io.envoyproxy.envoy.config.core.v3.CidrRange(this);
      result.addressPrefix_ = addressPrefix_;
      if (prefixLenBuilder_ == null) {
        result.prefixLen_ = prefixLen_;
      } else {
        result.prefixLen_ = prefixLenBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.config.core.v3.CidrRange) {
        return mergeFrom((io.envoyproxy.envoy.config.core.v3.CidrRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.core.v3.CidrRange other) {
      if (other == io.envoyproxy.envoy.config.core.v3.CidrRange.getDefaultInstance()) return this;
      if (!other.getAddressPrefix().isEmpty()) {
        addressPrefix_ = other.addressPrefix_;
        onChanged();
      }
      if (other.hasPrefixLen()) {
        mergePrefixLen(other.getPrefixLen());
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
      io.envoyproxy.envoy.config.core.v3.CidrRange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.core.v3.CidrRange) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object addressPrefix_ = "";
    /**
     * <pre>
     * IPv4 or IPv6 address, e.g. ``192.0.0.0`` or ``2001:db8::``.
     * </pre>
     *
     * <code>string address_prefix = 1 [(.validate.rules) = { ... }</code>
     * @return The addressPrefix.
     */
    public java.lang.String getAddressPrefix() {
      java.lang.Object ref = addressPrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        addressPrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * IPv4 or IPv6 address, e.g. ``192.0.0.0`` or ``2001:db8::``.
     * </pre>
     *
     * <code>string address_prefix = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for addressPrefix.
     */
    public com.google.protobuf.ByteString
        getAddressPrefixBytes() {
      java.lang.Object ref = addressPrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        addressPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * IPv4 or IPv6 address, e.g. ``192.0.0.0`` or ``2001:db8::``.
     * </pre>
     *
     * <code>string address_prefix = 1 [(.validate.rules) = { ... }</code>
     * @param value The addressPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setAddressPrefix(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      addressPrefix_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IPv4 or IPv6 address, e.g. ``192.0.0.0`` or ``2001:db8::``.
     * </pre>
     *
     * <code>string address_prefix = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearAddressPrefix() {
      
      addressPrefix_ = getDefaultInstance().getAddressPrefix();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IPv4 or IPv6 address, e.g. ``192.0.0.0`` or ``2001:db8::``.
     * </pre>
     *
     * <code>string address_prefix = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for addressPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setAddressPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      addressPrefix_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.UInt32Value prefixLen_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> prefixLenBuilder_;
    /**
     * <pre>
     * Length of prefix, e.g. 0, 32.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value prefix_len = 2 [(.validate.rules) = { ... }</code>
     * @return Whether the prefixLen field is set.
     */
    public boolean hasPrefixLen() {
      return prefixLenBuilder_ != null || prefixLen_ != null;
    }
    /**
     * <pre>
     * Length of prefix, e.g. 0, 32.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value prefix_len = 2 [(.validate.rules) = { ... }</code>
     * @return The prefixLen.
     */
    public com.google.protobuf.UInt32Value getPrefixLen() {
      if (prefixLenBuilder_ == null) {
        return prefixLen_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : prefixLen_;
      } else {
        return prefixLenBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Length of prefix, e.g. 0, 32.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value prefix_len = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setPrefixLen(com.google.protobuf.UInt32Value value) {
      if (prefixLenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        prefixLen_ = value;
        onChanged();
      } else {
        prefixLenBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Length of prefix, e.g. 0, 32.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value prefix_len = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setPrefixLen(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      if (prefixLenBuilder_ == null) {
        prefixLen_ = builderForValue.build();
        onChanged();
      } else {
        prefixLenBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Length of prefix, e.g. 0, 32.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value prefix_len = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder mergePrefixLen(com.google.protobuf.UInt32Value value) {
      if (prefixLenBuilder_ == null) {
        if (prefixLen_ != null) {
          prefixLen_ =
            com.google.protobuf.UInt32Value.newBuilder(prefixLen_).mergeFrom(value).buildPartial();
        } else {
          prefixLen_ = value;
        }
        onChanged();
      } else {
        prefixLenBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Length of prefix, e.g. 0, 32.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value prefix_len = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearPrefixLen() {
      if (prefixLenBuilder_ == null) {
        prefixLen_ = null;
        onChanged();
      } else {
        prefixLen_ = null;
        prefixLenBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Length of prefix, e.g. 0, 32.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value prefix_len = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.UInt32Value.Builder getPrefixLenBuilder() {
      
      onChanged();
      return getPrefixLenFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Length of prefix, e.g. 0, 32.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value prefix_len = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.UInt32ValueOrBuilder getPrefixLenOrBuilder() {
      if (prefixLenBuilder_ != null) {
        return prefixLenBuilder_.getMessageOrBuilder();
      } else {
        return prefixLen_ == null ?
            com.google.protobuf.UInt32Value.getDefaultInstance() : prefixLen_;
      }
    }
    /**
     * <pre>
     * Length of prefix, e.g. 0, 32.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value prefix_len = 2 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> 
        getPrefixLenFieldBuilder() {
      if (prefixLenBuilder_ == null) {
        prefixLenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder>(
                getPrefixLen(),
                getParentForChildren(),
                isClean());
        prefixLen_ = null;
      }
      return prefixLenBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.core.v3.CidrRange)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.core.v3.CidrRange)
  private static final io.envoyproxy.envoy.config.core.v3.CidrRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.core.v3.CidrRange();
  }

  public static io.envoyproxy.envoy.config.core.v3.CidrRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CidrRange>
      PARSER = new com.google.protobuf.AbstractParser<CidrRange>() {
    @java.lang.Override
    public CidrRange parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CidrRange(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CidrRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CidrRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.CidrRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

