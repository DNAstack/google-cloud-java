// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/uptime_service.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * The protocol for the `ListUptimeCheckIps` response.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.ListUptimeCheckIpsResponse}
 */
public  final class ListUptimeCheckIpsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.ListUptimeCheckIpsResponse)
    ListUptimeCheckIpsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListUptimeCheckIpsResponse.newBuilder() to construct.
  private ListUptimeCheckIpsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListUptimeCheckIpsResponse() {
    uptimeCheckIps_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListUptimeCheckIpsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              uptimeCheckIps_ = new java.util.ArrayList<com.google.monitoring.v3.UptimeCheckIp>();
              mutable_bitField0_ |= 0x00000001;
            }
            uptimeCheckIps_.add(
                input.readMessage(com.google.monitoring.v3.UptimeCheckIp.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        uptimeCheckIps_ = java.util.Collections.unmodifiableList(uptimeCheckIps_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_ListUptimeCheckIpsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_ListUptimeCheckIpsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.ListUptimeCheckIpsResponse.class, com.google.monitoring.v3.ListUptimeCheckIpsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int UPTIME_CHECK_IPS_FIELD_NUMBER = 1;
  private java.util.List<com.google.monitoring.v3.UptimeCheckIp> uptimeCheckIps_;
  /**
   * <pre>
   * The returned list of IP addresses (including region and location) that the
   * checkers run from.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
   */
  public java.util.List<com.google.monitoring.v3.UptimeCheckIp> getUptimeCheckIpsList() {
    return uptimeCheckIps_;
  }
  /**
   * <pre>
   * The returned list of IP addresses (including region and location) that the
   * checkers run from.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
   */
  public java.util.List<? extends com.google.monitoring.v3.UptimeCheckIpOrBuilder> 
      getUptimeCheckIpsOrBuilderList() {
    return uptimeCheckIps_;
  }
  /**
   * <pre>
   * The returned list of IP addresses (including region and location) that the
   * checkers run from.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
   */
  public int getUptimeCheckIpsCount() {
    return uptimeCheckIps_.size();
  }
  /**
   * <pre>
   * The returned list of IP addresses (including region and location) that the
   * checkers run from.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
   */
  public com.google.monitoring.v3.UptimeCheckIp getUptimeCheckIps(int index) {
    return uptimeCheckIps_.get(index);
  }
  /**
   * <pre>
   * The returned list of IP addresses (including region and location) that the
   * checkers run from.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
   */
  public com.google.monitoring.v3.UptimeCheckIpOrBuilder getUptimeCheckIpsOrBuilder(
      int index) {
    return uptimeCheckIps_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * This field represents the pagination token to retrieve the next page of
   * results. If the value is empty, it means no further results for the
   * request. To retrieve the next page of results, the value of the
   * next_page_token is passed to the subsequent List method call (in the
   * request message's page_token field).
   * NOTE: this field is not yet implemented
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This field represents the pagination token to retrieve the next page of
   * results. If the value is empty, it means no further results for the
   * request. To retrieve the next page of results, the value of the
   * next_page_token is passed to the subsequent List method call (in the
   * request message's page_token field).
   * NOTE: this field is not yet implemented
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < uptimeCheckIps_.size(); i++) {
      output.writeMessage(1, uptimeCheckIps_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < uptimeCheckIps_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, uptimeCheckIps_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.monitoring.v3.ListUptimeCheckIpsResponse)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.ListUptimeCheckIpsResponse other = (com.google.monitoring.v3.ListUptimeCheckIpsResponse) obj;

    boolean result = true;
    result = result && getUptimeCheckIpsList()
        .equals(other.getUptimeCheckIpsList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
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
    if (getUptimeCheckIpsCount() > 0) {
      hash = (37 * hash) + UPTIME_CHECK_IPS_FIELD_NUMBER;
      hash = (53 * hash) + getUptimeCheckIpsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.ListUptimeCheckIpsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListUptimeCheckIpsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListUptimeCheckIpsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListUptimeCheckIpsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListUptimeCheckIpsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListUptimeCheckIpsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListUptimeCheckIpsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListUptimeCheckIpsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListUptimeCheckIpsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListUptimeCheckIpsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListUptimeCheckIpsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListUptimeCheckIpsResponse parseFrom(
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
  public static Builder newBuilder(com.google.monitoring.v3.ListUptimeCheckIpsResponse prototype) {
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
   * <pre>
   * The protocol for the `ListUptimeCheckIps` response.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.ListUptimeCheckIpsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.ListUptimeCheckIpsResponse)
      com.google.monitoring.v3.ListUptimeCheckIpsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_ListUptimeCheckIpsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_ListUptimeCheckIpsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.ListUptimeCheckIpsResponse.class, com.google.monitoring.v3.ListUptimeCheckIpsResponse.Builder.class);
    }

    // Construct using com.google.monitoring.v3.ListUptimeCheckIpsResponse.newBuilder()
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
        getUptimeCheckIpsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (uptimeCheckIpsBuilder_ == null) {
        uptimeCheckIps_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        uptimeCheckIpsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_ListUptimeCheckIpsResponse_descriptor;
    }

    public com.google.monitoring.v3.ListUptimeCheckIpsResponse getDefaultInstanceForType() {
      return com.google.monitoring.v3.ListUptimeCheckIpsResponse.getDefaultInstance();
    }

    public com.google.monitoring.v3.ListUptimeCheckIpsResponse build() {
      com.google.monitoring.v3.ListUptimeCheckIpsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.monitoring.v3.ListUptimeCheckIpsResponse buildPartial() {
      com.google.monitoring.v3.ListUptimeCheckIpsResponse result = new com.google.monitoring.v3.ListUptimeCheckIpsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (uptimeCheckIpsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          uptimeCheckIps_ = java.util.Collections.unmodifiableList(uptimeCheckIps_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.uptimeCheckIps_ = uptimeCheckIps_;
      } else {
        result.uptimeCheckIps_ = uptimeCheckIpsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.monitoring.v3.ListUptimeCheckIpsResponse) {
        return mergeFrom((com.google.monitoring.v3.ListUptimeCheckIpsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.ListUptimeCheckIpsResponse other) {
      if (other == com.google.monitoring.v3.ListUptimeCheckIpsResponse.getDefaultInstance()) return this;
      if (uptimeCheckIpsBuilder_ == null) {
        if (!other.uptimeCheckIps_.isEmpty()) {
          if (uptimeCheckIps_.isEmpty()) {
            uptimeCheckIps_ = other.uptimeCheckIps_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUptimeCheckIpsIsMutable();
            uptimeCheckIps_.addAll(other.uptimeCheckIps_);
          }
          onChanged();
        }
      } else {
        if (!other.uptimeCheckIps_.isEmpty()) {
          if (uptimeCheckIpsBuilder_.isEmpty()) {
            uptimeCheckIpsBuilder_.dispose();
            uptimeCheckIpsBuilder_ = null;
            uptimeCheckIps_ = other.uptimeCheckIps_;
            bitField0_ = (bitField0_ & ~0x00000001);
            uptimeCheckIpsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUptimeCheckIpsFieldBuilder() : null;
          } else {
            uptimeCheckIpsBuilder_.addAllMessages(other.uptimeCheckIps_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.monitoring.v3.ListUptimeCheckIpsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.ListUptimeCheckIpsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.monitoring.v3.UptimeCheckIp> uptimeCheckIps_ =
      java.util.Collections.emptyList();
    private void ensureUptimeCheckIpsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        uptimeCheckIps_ = new java.util.ArrayList<com.google.monitoring.v3.UptimeCheckIp>(uptimeCheckIps_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.monitoring.v3.UptimeCheckIp, com.google.monitoring.v3.UptimeCheckIp.Builder, com.google.monitoring.v3.UptimeCheckIpOrBuilder> uptimeCheckIpsBuilder_;

    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public java.util.List<com.google.monitoring.v3.UptimeCheckIp> getUptimeCheckIpsList() {
      if (uptimeCheckIpsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(uptimeCheckIps_);
      } else {
        return uptimeCheckIpsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public int getUptimeCheckIpsCount() {
      if (uptimeCheckIpsBuilder_ == null) {
        return uptimeCheckIps_.size();
      } else {
        return uptimeCheckIpsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public com.google.monitoring.v3.UptimeCheckIp getUptimeCheckIps(int index) {
      if (uptimeCheckIpsBuilder_ == null) {
        return uptimeCheckIps_.get(index);
      } else {
        return uptimeCheckIpsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public Builder setUptimeCheckIps(
        int index, com.google.monitoring.v3.UptimeCheckIp value) {
      if (uptimeCheckIpsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUptimeCheckIpsIsMutable();
        uptimeCheckIps_.set(index, value);
        onChanged();
      } else {
        uptimeCheckIpsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public Builder setUptimeCheckIps(
        int index, com.google.monitoring.v3.UptimeCheckIp.Builder builderForValue) {
      if (uptimeCheckIpsBuilder_ == null) {
        ensureUptimeCheckIpsIsMutable();
        uptimeCheckIps_.set(index, builderForValue.build());
        onChanged();
      } else {
        uptimeCheckIpsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public Builder addUptimeCheckIps(com.google.monitoring.v3.UptimeCheckIp value) {
      if (uptimeCheckIpsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUptimeCheckIpsIsMutable();
        uptimeCheckIps_.add(value);
        onChanged();
      } else {
        uptimeCheckIpsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public Builder addUptimeCheckIps(
        int index, com.google.monitoring.v3.UptimeCheckIp value) {
      if (uptimeCheckIpsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUptimeCheckIpsIsMutable();
        uptimeCheckIps_.add(index, value);
        onChanged();
      } else {
        uptimeCheckIpsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public Builder addUptimeCheckIps(
        com.google.monitoring.v3.UptimeCheckIp.Builder builderForValue) {
      if (uptimeCheckIpsBuilder_ == null) {
        ensureUptimeCheckIpsIsMutable();
        uptimeCheckIps_.add(builderForValue.build());
        onChanged();
      } else {
        uptimeCheckIpsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public Builder addUptimeCheckIps(
        int index, com.google.monitoring.v3.UptimeCheckIp.Builder builderForValue) {
      if (uptimeCheckIpsBuilder_ == null) {
        ensureUptimeCheckIpsIsMutable();
        uptimeCheckIps_.add(index, builderForValue.build());
        onChanged();
      } else {
        uptimeCheckIpsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public Builder addAllUptimeCheckIps(
        java.lang.Iterable<? extends com.google.monitoring.v3.UptimeCheckIp> values) {
      if (uptimeCheckIpsBuilder_ == null) {
        ensureUptimeCheckIpsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, uptimeCheckIps_);
        onChanged();
      } else {
        uptimeCheckIpsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public Builder clearUptimeCheckIps() {
      if (uptimeCheckIpsBuilder_ == null) {
        uptimeCheckIps_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        uptimeCheckIpsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public Builder removeUptimeCheckIps(int index) {
      if (uptimeCheckIpsBuilder_ == null) {
        ensureUptimeCheckIpsIsMutable();
        uptimeCheckIps_.remove(index);
        onChanged();
      } else {
        uptimeCheckIpsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public com.google.monitoring.v3.UptimeCheckIp.Builder getUptimeCheckIpsBuilder(
        int index) {
      return getUptimeCheckIpsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public com.google.monitoring.v3.UptimeCheckIpOrBuilder getUptimeCheckIpsOrBuilder(
        int index) {
      if (uptimeCheckIpsBuilder_ == null) {
        return uptimeCheckIps_.get(index);  } else {
        return uptimeCheckIpsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public java.util.List<? extends com.google.monitoring.v3.UptimeCheckIpOrBuilder> 
         getUptimeCheckIpsOrBuilderList() {
      if (uptimeCheckIpsBuilder_ != null) {
        return uptimeCheckIpsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(uptimeCheckIps_);
      }
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public com.google.monitoring.v3.UptimeCheckIp.Builder addUptimeCheckIpsBuilder() {
      return getUptimeCheckIpsFieldBuilder().addBuilder(
          com.google.monitoring.v3.UptimeCheckIp.getDefaultInstance());
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public com.google.monitoring.v3.UptimeCheckIp.Builder addUptimeCheckIpsBuilder(
        int index) {
      return getUptimeCheckIpsFieldBuilder().addBuilder(
          index, com.google.monitoring.v3.UptimeCheckIp.getDefaultInstance());
    }
    /**
     * <pre>
     * The returned list of IP addresses (including region and location) that the
     * checkers run from.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.UptimeCheckIp uptime_check_ips = 1;</code>
     */
    public java.util.List<com.google.monitoring.v3.UptimeCheckIp.Builder> 
         getUptimeCheckIpsBuilderList() {
      return getUptimeCheckIpsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.monitoring.v3.UptimeCheckIp, com.google.monitoring.v3.UptimeCheckIp.Builder, com.google.monitoring.v3.UptimeCheckIpOrBuilder> 
        getUptimeCheckIpsFieldBuilder() {
      if (uptimeCheckIpsBuilder_ == null) {
        uptimeCheckIpsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.monitoring.v3.UptimeCheckIp, com.google.monitoring.v3.UptimeCheckIp.Builder, com.google.monitoring.v3.UptimeCheckIpOrBuilder>(
                uptimeCheckIps_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        uptimeCheckIps_ = null;
      }
      return uptimeCheckIpsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * This field represents the pagination token to retrieve the next page of
     * results. If the value is empty, it means no further results for the
     * request. To retrieve the next page of results, the value of the
     * next_page_token is passed to the subsequent List method call (in the
     * request message's page_token field).
     * NOTE: this field is not yet implemented
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This field represents the pagination token to retrieve the next page of
     * results. If the value is empty, it means no further results for the
     * request. To retrieve the next page of results, the value of the
     * next_page_token is passed to the subsequent List method call (in the
     * request message's page_token field).
     * NOTE: this field is not yet implemented
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This field represents the pagination token to retrieve the next page of
     * results. If the value is empty, it means no further results for the
     * request. To retrieve the next page of results, the value of the
     * next_page_token is passed to the subsequent List method call (in the
     * request message's page_token field).
     * NOTE: this field is not yet implemented
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field represents the pagination token to retrieve the next page of
     * results. If the value is empty, it means no further results for the
     * request. To retrieve the next page of results, the value of the
     * next_page_token is passed to the subsequent List method call (in the
     * request message's page_token field).
     * NOTE: this field is not yet implemented
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field represents the pagination token to retrieve the next page of
     * results. If the value is empty, it means no further results for the
     * request. To retrieve the next page of results, the value of the
     * next_page_token is passed to the subsequent List method call (in the
     * request message's page_token field).
     * NOTE: this field is not yet implemented
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.ListUptimeCheckIpsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.ListUptimeCheckIpsResponse)
  private static final com.google.monitoring.v3.ListUptimeCheckIpsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.ListUptimeCheckIpsResponse();
  }

  public static com.google.monitoring.v3.ListUptimeCheckIpsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListUptimeCheckIpsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListUptimeCheckIpsResponse>() {
    public ListUptimeCheckIpsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListUptimeCheckIpsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListUptimeCheckIpsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListUptimeCheckIpsResponse> getParserForType() {
    return PARSER;
  }

  public com.google.monitoring.v3.ListUptimeCheckIpsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
