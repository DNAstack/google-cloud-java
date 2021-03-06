// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta1;

/**
 *
 *
 * <pre>
 * Label location.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1beta1.LabelLocation}
 */
public final class LabelLocation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1beta1.LabelLocation)
    LabelLocationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LabelLocation.newBuilder() to construct.
  private LabelLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LabelLocation() {
    confidence_ = 0F;
    level_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LabelLocation(
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
          case 10:
            {
              com.google.cloud.videointelligence.v1beta1.VideoSegment.Builder subBuilder = null;
              if (segment_ != null) {
                subBuilder = segment_.toBuilder();
              }
              segment_ =
                  input.readMessage(
                      com.google.cloud.videointelligence.v1beta1.VideoSegment.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(segment_);
                segment_ = subBuilder.buildPartial();
              }

              break;
            }
          case 21:
            {
              confidence_ = input.readFloat();
              break;
            }
          case 24:
            {
              int rawValue = input.readEnum();

              level_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1beta1_LabelLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1beta1_LabelLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1beta1.LabelLocation.class,
            com.google.cloud.videointelligence.v1beta1.LabelLocation.Builder.class);
  }

  public static final int SEGMENT_FIELD_NUMBER = 1;
  private com.google.cloud.videointelligence.v1beta1.VideoSegment segment_;
  /**
   *
   *
   * <pre>
   * Video segment. Set to [-1, -1] for video-level labels.
   * Set to [timestamp, timestamp] for frame-level labels.
   * Otherwise, corresponds to one of `AnnotateSpec.segments`
   * (if specified) or to shot boundaries (if requested).
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
   */
  public boolean hasSegment() {
    return segment_ != null;
  }
  /**
   *
   *
   * <pre>
   * Video segment. Set to [-1, -1] for video-level labels.
   * Set to [timestamp, timestamp] for frame-level labels.
   * Otherwise, corresponds to one of `AnnotateSpec.segments`
   * (if specified) or to shot boundaries (if requested).
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
   */
  public com.google.cloud.videointelligence.v1beta1.VideoSegment getSegment() {
    return segment_ == null
        ? com.google.cloud.videointelligence.v1beta1.VideoSegment.getDefaultInstance()
        : segment_;
  }
  /**
   *
   *
   * <pre>
   * Video segment. Set to [-1, -1] for video-level labels.
   * Set to [timestamp, timestamp] for frame-level labels.
   * Otherwise, corresponds to one of `AnnotateSpec.segments`
   * (if specified) or to shot boundaries (if requested).
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
   */
  public com.google.cloud.videointelligence.v1beta1.VideoSegmentOrBuilder getSegmentOrBuilder() {
    return getSegment();
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 2;
  private float confidence_;
  /**
   *
   *
   * <pre>
   * Confidence that the label is accurate. Range: [0, 1].
   * </pre>
   *
   * <code>float confidence = 2;</code>
   */
  public float getConfidence() {
    return confidence_;
  }

  public static final int LEVEL_FIELD_NUMBER = 3;
  private int level_;
  /**
   *
   *
   * <pre>
   * Label level.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta1.LabelLevel level = 3;</code>
   */
  public int getLevelValue() {
    return level_;
  }
  /**
   *
   *
   * <pre>
   * Label level.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta1.LabelLevel level = 3;</code>
   */
  public com.google.cloud.videointelligence.v1beta1.LabelLevel getLevel() {
    @SuppressWarnings("deprecation")
    com.google.cloud.videointelligence.v1beta1.LabelLevel result =
        com.google.cloud.videointelligence.v1beta1.LabelLevel.valueOf(level_);
    return result == null
        ? com.google.cloud.videointelligence.v1beta1.LabelLevel.UNRECOGNIZED
        : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (segment_ != null) {
      output.writeMessage(1, getSegment());
    }
    if (confidence_ != 0F) {
      output.writeFloat(2, confidence_);
    }
    if (level_
        != com.google.cloud.videointelligence.v1beta1.LabelLevel.LABEL_LEVEL_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, level_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (segment_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSegment());
    }
    if (confidence_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, confidence_);
    }
    if (level_
        != com.google.cloud.videointelligence.v1beta1.LabelLevel.LABEL_LEVEL_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, level_);
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1beta1.LabelLocation)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1beta1.LabelLocation other =
        (com.google.cloud.videointelligence.v1beta1.LabelLocation) obj;

    boolean result = true;
    result = result && (hasSegment() == other.hasSegment());
    if (hasSegment()) {
      result = result && getSegment().equals(other.getSegment());
    }
    result =
        result
            && (java.lang.Float.floatToIntBits(getConfidence())
                == java.lang.Float.floatToIntBits(other.getConfidence()));
    result = result && level_ == other.level_;
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
    if (hasSegment()) {
      hash = (37 * hash) + SEGMENT_FIELD_NUMBER;
      hash = (53 * hash) + getSegment().hashCode();
    }
    hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getConfidence());
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + level_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1beta1.LabelLocation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta1.LabelLocation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta1.LabelLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta1.LabelLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta1.LabelLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta1.LabelLocation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta1.LabelLocation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta1.LabelLocation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta1.LabelLocation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta1.LabelLocation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta1.LabelLocation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta1.LabelLocation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.videointelligence.v1beta1.LabelLocation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Label location.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1beta1.LabelLocation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1beta1.LabelLocation)
      com.google.cloud.videointelligence.v1beta1.LabelLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta1_LabelLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta1_LabelLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1beta1.LabelLocation.class,
              com.google.cloud.videointelligence.v1beta1.LabelLocation.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1beta1.LabelLocation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (segmentBuilder_ == null) {
        segment_ = null;
      } else {
        segment_ = null;
        segmentBuilder_ = null;
      }
      confidence_ = 0F;

      level_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta1_LabelLocation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta1.LabelLocation getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1beta1.LabelLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta1.LabelLocation build() {
      com.google.cloud.videointelligence.v1beta1.LabelLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta1.LabelLocation buildPartial() {
      com.google.cloud.videointelligence.v1beta1.LabelLocation result =
          new com.google.cloud.videointelligence.v1beta1.LabelLocation(this);
      if (segmentBuilder_ == null) {
        result.segment_ = segment_;
      } else {
        result.segment_ = segmentBuilder_.build();
      }
      result.confidence_ = confidence_;
      result.level_ = level_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.videointelligence.v1beta1.LabelLocation) {
        return mergeFrom((com.google.cloud.videointelligence.v1beta1.LabelLocation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1beta1.LabelLocation other) {
      if (other == com.google.cloud.videointelligence.v1beta1.LabelLocation.getDefaultInstance())
        return this;
      if (other.hasSegment()) {
        mergeSegment(other.getSegment());
      }
      if (other.getConfidence() != 0F) {
        setConfidence(other.getConfidence());
      }
      if (other.level_ != 0) {
        setLevelValue(other.getLevelValue());
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
      com.google.cloud.videointelligence.v1beta1.LabelLocation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.videointelligence.v1beta1.LabelLocation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.videointelligence.v1beta1.VideoSegment segment_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.videointelligence.v1beta1.VideoSegment,
            com.google.cloud.videointelligence.v1beta1.VideoSegment.Builder,
            com.google.cloud.videointelligence.v1beta1.VideoSegmentOrBuilder>
        segmentBuilder_;
    /**
     *
     *
     * <pre>
     * Video segment. Set to [-1, -1] for video-level labels.
     * Set to [timestamp, timestamp] for frame-level labels.
     * Otherwise, corresponds to one of `AnnotateSpec.segments`
     * (if specified) or to shot boundaries (if requested).
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
     */
    public boolean hasSegment() {
      return segmentBuilder_ != null || segment_ != null;
    }
    /**
     *
     *
     * <pre>
     * Video segment. Set to [-1, -1] for video-level labels.
     * Set to [timestamp, timestamp] for frame-level labels.
     * Otherwise, corresponds to one of `AnnotateSpec.segments`
     * (if specified) or to shot boundaries (if requested).
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
     */
    public com.google.cloud.videointelligence.v1beta1.VideoSegment getSegment() {
      if (segmentBuilder_ == null) {
        return segment_ == null
            ? com.google.cloud.videointelligence.v1beta1.VideoSegment.getDefaultInstance()
            : segment_;
      } else {
        return segmentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Video segment. Set to [-1, -1] for video-level labels.
     * Set to [timestamp, timestamp] for frame-level labels.
     * Otherwise, corresponds to one of `AnnotateSpec.segments`
     * (if specified) or to shot boundaries (if requested).
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
     */
    public Builder setSegment(com.google.cloud.videointelligence.v1beta1.VideoSegment value) {
      if (segmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        segment_ = value;
        onChanged();
      } else {
        segmentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Video segment. Set to [-1, -1] for video-level labels.
     * Set to [timestamp, timestamp] for frame-level labels.
     * Otherwise, corresponds to one of `AnnotateSpec.segments`
     * (if specified) or to shot boundaries (if requested).
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
     */
    public Builder setSegment(
        com.google.cloud.videointelligence.v1beta1.VideoSegment.Builder builderForValue) {
      if (segmentBuilder_ == null) {
        segment_ = builderForValue.build();
        onChanged();
      } else {
        segmentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Video segment. Set to [-1, -1] for video-level labels.
     * Set to [timestamp, timestamp] for frame-level labels.
     * Otherwise, corresponds to one of `AnnotateSpec.segments`
     * (if specified) or to shot boundaries (if requested).
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
     */
    public Builder mergeSegment(com.google.cloud.videointelligence.v1beta1.VideoSegment value) {
      if (segmentBuilder_ == null) {
        if (segment_ != null) {
          segment_ =
              com.google.cloud.videointelligence.v1beta1.VideoSegment.newBuilder(segment_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          segment_ = value;
        }
        onChanged();
      } else {
        segmentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Video segment. Set to [-1, -1] for video-level labels.
     * Set to [timestamp, timestamp] for frame-level labels.
     * Otherwise, corresponds to one of `AnnotateSpec.segments`
     * (if specified) or to shot boundaries (if requested).
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
     */
    public Builder clearSegment() {
      if (segmentBuilder_ == null) {
        segment_ = null;
        onChanged();
      } else {
        segment_ = null;
        segmentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Video segment. Set to [-1, -1] for video-level labels.
     * Set to [timestamp, timestamp] for frame-level labels.
     * Otherwise, corresponds to one of `AnnotateSpec.segments`
     * (if specified) or to shot boundaries (if requested).
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
     */
    public com.google.cloud.videointelligence.v1beta1.VideoSegment.Builder getSegmentBuilder() {

      onChanged();
      return getSegmentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Video segment. Set to [-1, -1] for video-level labels.
     * Set to [timestamp, timestamp] for frame-level labels.
     * Otherwise, corresponds to one of `AnnotateSpec.segments`
     * (if specified) or to shot boundaries (if requested).
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
     */
    public com.google.cloud.videointelligence.v1beta1.VideoSegmentOrBuilder getSegmentOrBuilder() {
      if (segmentBuilder_ != null) {
        return segmentBuilder_.getMessageOrBuilder();
      } else {
        return segment_ == null
            ? com.google.cloud.videointelligence.v1beta1.VideoSegment.getDefaultInstance()
            : segment_;
      }
    }
    /**
     *
     *
     * <pre>
     * Video segment. Set to [-1, -1] for video-level labels.
     * Set to [timestamp, timestamp] for frame-level labels.
     * Otherwise, corresponds to one of `AnnotateSpec.segments`
     * (if specified) or to shot boundaries (if requested).
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.videointelligence.v1beta1.VideoSegment,
            com.google.cloud.videointelligence.v1beta1.VideoSegment.Builder,
            com.google.cloud.videointelligence.v1beta1.VideoSegmentOrBuilder>
        getSegmentFieldBuilder() {
      if (segmentBuilder_ == null) {
        segmentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.videointelligence.v1beta1.VideoSegment,
                com.google.cloud.videointelligence.v1beta1.VideoSegment.Builder,
                com.google.cloud.videointelligence.v1beta1.VideoSegmentOrBuilder>(
                getSegment(), getParentForChildren(), isClean());
        segment_ = null;
      }
      return segmentBuilder_;
    }

    private float confidence_;
    /**
     *
     *
     * <pre>
     * Confidence that the label is accurate. Range: [0, 1].
     * </pre>
     *
     * <code>float confidence = 2;</code>
     */
    public float getConfidence() {
      return confidence_;
    }
    /**
     *
     *
     * <pre>
     * Confidence that the label is accurate. Range: [0, 1].
     * </pre>
     *
     * <code>float confidence = 2;</code>
     */
    public Builder setConfidence(float value) {

      confidence_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Confidence that the label is accurate. Range: [0, 1].
     * </pre>
     *
     * <code>float confidence = 2;</code>
     */
    public Builder clearConfidence() {

      confidence_ = 0F;
      onChanged();
      return this;
    }

    private int level_ = 0;
    /**
     *
     *
     * <pre>
     * Label level.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.LabelLevel level = 3;</code>
     */
    public int getLevelValue() {
      return level_;
    }
    /**
     *
     *
     * <pre>
     * Label level.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.LabelLevel level = 3;</code>
     */
    public Builder setLevelValue(int value) {
      level_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Label level.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.LabelLevel level = 3;</code>
     */
    public com.google.cloud.videointelligence.v1beta1.LabelLevel getLevel() {
      @SuppressWarnings("deprecation")
      com.google.cloud.videointelligence.v1beta1.LabelLevel result =
          com.google.cloud.videointelligence.v1beta1.LabelLevel.valueOf(level_);
      return result == null
          ? com.google.cloud.videointelligence.v1beta1.LabelLevel.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Label level.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.LabelLevel level = 3;</code>
     */
    public Builder setLevel(com.google.cloud.videointelligence.v1beta1.LabelLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }

      level_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Label level.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta1.LabelLevel level = 3;</code>
     */
    public Builder clearLevel() {

      level_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1beta1.LabelLocation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1beta1.LabelLocation)
  private static final com.google.cloud.videointelligence.v1beta1.LabelLocation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1beta1.LabelLocation();
  }

  public static com.google.cloud.videointelligence.v1beta1.LabelLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LabelLocation> PARSER =
      new com.google.protobuf.AbstractParser<LabelLocation>() {
        @java.lang.Override
        public LabelLocation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LabelLocation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LabelLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LabelLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1beta1.LabelLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
