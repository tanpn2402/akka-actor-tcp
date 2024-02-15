// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/bean/assetsInfo.proto

package com.txtech.services.protobuf.bean;

public final class AssetsInfoProtos {
  private AssetsInfoProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AssetsInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf.bean.AssetsInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 cash = 1;</code>
     */
    boolean hasCash();
    /**
     * <code>optional int64 cash = 1;</code>
     */
    long getCash();

    /**
     * <code>optional double validNonCash = 2;</code>
     */
    boolean hasValidNonCash();
    /**
     * <code>optional double validNonCash = 2;</code>
     */
    double getValidNonCash();

    /**
     * <code>optional double totalValue = 3;</code>
     */
    boolean hasTotalValue();
    /**
     * <code>optional double totalValue = 3;</code>
     */
    double getTotalValue();

    /**
     * <code>optional int64 maxValidNonCash = 4;</code>
     */
    boolean hasMaxValidNonCash();
    /**
     * <code>optional int64 maxValidNonCash = 4;</code>
     */
    long getMaxValidNonCash();

    /**
     * <code>optional double cashWithdrawable = 5;</code>
     */
    boolean hasCashWithdrawable();
    /**
     * <code>optional double cashWithdrawable = 5;</code>
     */
    double getCashWithdrawable();

    /**
     * <code>optional double ee = 6;</code>
     */
    boolean hasEe();
    /**
     * <code>optional double ee = 6;</code>
     */
    double getEe();
  }
  /**
   * Protobuf type {@code protobuf.bean.AssetsInfo}
   */
  public  static final class AssetsInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protobuf.bean.AssetsInfo)
      AssetsInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AssetsInfo.newBuilder() to construct.
    private AssetsInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AssetsInfo() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AssetsInfo(
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
            case 8: {
              bitField0_ |= 0x00000001;
              cash_ = input.readInt64();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              validNonCash_ = input.readDouble();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              totalValue_ = input.readDouble();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              maxValidNonCash_ = input.readInt64();
              break;
            }
            case 41: {
              bitField0_ |= 0x00000010;
              cashWithdrawable_ = input.readDouble();
              break;
            }
            case 49: {
              bitField0_ |= 0x00000020;
              ee_ = input.readDouble();
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
      return com.txtech.services.protobuf.bean.AssetsInfoProtos.internal_static_protobuf_bean_AssetsInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.txtech.services.protobuf.bean.AssetsInfoProtos.internal_static_protobuf_bean_AssetsInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo.class, com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo.Builder.class);
    }

    private int bitField0_;
    public static final int CASH_FIELD_NUMBER = 1;
    private long cash_;
    /**
     * <code>optional int64 cash = 1;</code>
     */
    public boolean hasCash() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int64 cash = 1;</code>
     */
    public long getCash() {
      return cash_;
    }

    public static final int VALIDNONCASH_FIELD_NUMBER = 2;
    private double validNonCash_;
    /**
     * <code>optional double validNonCash = 2;</code>
     */
    public boolean hasValidNonCash() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional double validNonCash = 2;</code>
     */
    public double getValidNonCash() {
      return validNonCash_;
    }

    public static final int TOTALVALUE_FIELD_NUMBER = 3;
    private double totalValue_;
    /**
     * <code>optional double totalValue = 3;</code>
     */
    public boolean hasTotalValue() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional double totalValue = 3;</code>
     */
    public double getTotalValue() {
      return totalValue_;
    }

    public static final int MAXVALIDNONCASH_FIELD_NUMBER = 4;
    private long maxValidNonCash_;
    /**
     * <code>optional int64 maxValidNonCash = 4;</code>
     */
    public boolean hasMaxValidNonCash() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional int64 maxValidNonCash = 4;</code>
     */
    public long getMaxValidNonCash() {
      return maxValidNonCash_;
    }

    public static final int CASHWITHDRAWABLE_FIELD_NUMBER = 5;
    private double cashWithdrawable_;
    /**
     * <code>optional double cashWithdrawable = 5;</code>
     */
    public boolean hasCashWithdrawable() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional double cashWithdrawable = 5;</code>
     */
    public double getCashWithdrawable() {
      return cashWithdrawable_;
    }

    public static final int EE_FIELD_NUMBER = 6;
    private double ee_;
    /**
     * <code>optional double ee = 6;</code>
     */
    public boolean hasEe() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional double ee = 6;</code>
     */
    public double getEe() {
      return ee_;
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
        output.writeInt64(1, cash_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeDouble(2, validNonCash_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeDouble(3, totalValue_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeInt64(4, maxValidNonCash_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeDouble(5, cashWithdrawable_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeDouble(6, ee_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, cash_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, validNonCash_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, totalValue_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, maxValidNonCash_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(5, cashWithdrawable_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(6, ee_);
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
      if (!(obj instanceof com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo)) {
        return super.equals(obj);
      }
      com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo other = (com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo) obj;

      if (hasCash() != other.hasCash()) return false;
      if (hasCash()) {
        if (getCash()
            != other.getCash()) return false;
      }
      if (hasValidNonCash() != other.hasValidNonCash()) return false;
      if (hasValidNonCash()) {
        if (java.lang.Double.doubleToLongBits(getValidNonCash())
            != java.lang.Double.doubleToLongBits(
                other.getValidNonCash())) return false;
      }
      if (hasTotalValue() != other.hasTotalValue()) return false;
      if (hasTotalValue()) {
        if (java.lang.Double.doubleToLongBits(getTotalValue())
            != java.lang.Double.doubleToLongBits(
                other.getTotalValue())) return false;
      }
      if (hasMaxValidNonCash() != other.hasMaxValidNonCash()) return false;
      if (hasMaxValidNonCash()) {
        if (getMaxValidNonCash()
            != other.getMaxValidNonCash()) return false;
      }
      if (hasCashWithdrawable() != other.hasCashWithdrawable()) return false;
      if (hasCashWithdrawable()) {
        if (java.lang.Double.doubleToLongBits(getCashWithdrawable())
            != java.lang.Double.doubleToLongBits(
                other.getCashWithdrawable())) return false;
      }
      if (hasEe() != other.hasEe()) return false;
      if (hasEe()) {
        if (java.lang.Double.doubleToLongBits(getEe())
            != java.lang.Double.doubleToLongBits(
                other.getEe())) return false;
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
      if (hasCash()) {
        hash = (37 * hash) + CASH_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getCash());
      }
      if (hasValidNonCash()) {
        hash = (37 * hash) + VALIDNONCASH_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getValidNonCash()));
      }
      if (hasTotalValue()) {
        hash = (37 * hash) + TOTALVALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getTotalValue()));
      }
      if (hasMaxValidNonCash()) {
        hash = (37 * hash) + MAXVALIDNONCASH_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getMaxValidNonCash());
      }
      if (hasCashWithdrawable()) {
        hash = (37 * hash) + CASHWITHDRAWABLE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getCashWithdrawable()));
      }
      if (hasEe()) {
        hash = (37 * hash) + EE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getEe()));
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo parseFrom(
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
    public static Builder newBuilder(com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo prototype) {
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
     * Protobuf type {@code protobuf.bean.AssetsInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf.bean.AssetsInfo)
        com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.txtech.services.protobuf.bean.AssetsInfoProtos.internal_static_protobuf_bean_AssetsInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.txtech.services.protobuf.bean.AssetsInfoProtos.internal_static_protobuf_bean_AssetsInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo.class, com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo.Builder.class);
      }

      // Construct using com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo.newBuilder()
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
        cash_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        validNonCash_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        totalValue_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        maxValidNonCash_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        cashWithdrawable_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000010);
        ee_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.txtech.services.protobuf.bean.AssetsInfoProtos.internal_static_protobuf_bean_AssetsInfo_descriptor;
      }

      @java.lang.Override
      public com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo getDefaultInstanceForType() {
        return com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo.getDefaultInstance();
      }

      @java.lang.Override
      public com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo build() {
        com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo buildPartial() {
        com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo result = new com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.cash_ = cash_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.validNonCash_ = validNonCash_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.totalValue_ = totalValue_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.maxValidNonCash_ = maxValidNonCash_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.cashWithdrawable_ = cashWithdrawable_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.ee_ = ee_;
          to_bitField0_ |= 0x00000020;
        }
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
        if (other instanceof com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo) {
          return mergeFrom((com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo other) {
        if (other == com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo.getDefaultInstance()) return this;
        if (other.hasCash()) {
          setCash(other.getCash());
        }
        if (other.hasValidNonCash()) {
          setValidNonCash(other.getValidNonCash());
        }
        if (other.hasTotalValue()) {
          setTotalValue(other.getTotalValue());
        }
        if (other.hasMaxValidNonCash()) {
          setMaxValidNonCash(other.getMaxValidNonCash());
        }
        if (other.hasCashWithdrawable()) {
          setCashWithdrawable(other.getCashWithdrawable());
        }
        if (other.hasEe()) {
          setEe(other.getEe());
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
        com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long cash_ ;
      /**
       * <code>optional int64 cash = 1;</code>
       */
      public boolean hasCash() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int64 cash = 1;</code>
       */
      public long getCash() {
        return cash_;
      }
      /**
       * <code>optional int64 cash = 1;</code>
       */
      public Builder setCash(long value) {
        bitField0_ |= 0x00000001;
        cash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 cash = 1;</code>
       */
      public Builder clearCash() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cash_ = 0L;
        onChanged();
        return this;
      }

      private double validNonCash_ ;
      /**
       * <code>optional double validNonCash = 2;</code>
       */
      public boolean hasValidNonCash() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional double validNonCash = 2;</code>
       */
      public double getValidNonCash() {
        return validNonCash_;
      }
      /**
       * <code>optional double validNonCash = 2;</code>
       */
      public Builder setValidNonCash(double value) {
        bitField0_ |= 0x00000002;
        validNonCash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double validNonCash = 2;</code>
       */
      public Builder clearValidNonCash() {
        bitField0_ = (bitField0_ & ~0x00000002);
        validNonCash_ = 0D;
        onChanged();
        return this;
      }

      private double totalValue_ ;
      /**
       * <code>optional double totalValue = 3;</code>
       */
      public boolean hasTotalValue() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional double totalValue = 3;</code>
       */
      public double getTotalValue() {
        return totalValue_;
      }
      /**
       * <code>optional double totalValue = 3;</code>
       */
      public Builder setTotalValue(double value) {
        bitField0_ |= 0x00000004;
        totalValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double totalValue = 3;</code>
       */
      public Builder clearTotalValue() {
        bitField0_ = (bitField0_ & ~0x00000004);
        totalValue_ = 0D;
        onChanged();
        return this;
      }

      private long maxValidNonCash_ ;
      /**
       * <code>optional int64 maxValidNonCash = 4;</code>
       */
      public boolean hasMaxValidNonCash() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional int64 maxValidNonCash = 4;</code>
       */
      public long getMaxValidNonCash() {
        return maxValidNonCash_;
      }
      /**
       * <code>optional int64 maxValidNonCash = 4;</code>
       */
      public Builder setMaxValidNonCash(long value) {
        bitField0_ |= 0x00000008;
        maxValidNonCash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 maxValidNonCash = 4;</code>
       */
      public Builder clearMaxValidNonCash() {
        bitField0_ = (bitField0_ & ~0x00000008);
        maxValidNonCash_ = 0L;
        onChanged();
        return this;
      }

      private double cashWithdrawable_ ;
      /**
       * <code>optional double cashWithdrawable = 5;</code>
       */
      public boolean hasCashWithdrawable() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional double cashWithdrawable = 5;</code>
       */
      public double getCashWithdrawable() {
        return cashWithdrawable_;
      }
      /**
       * <code>optional double cashWithdrawable = 5;</code>
       */
      public Builder setCashWithdrawable(double value) {
        bitField0_ |= 0x00000010;
        cashWithdrawable_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double cashWithdrawable = 5;</code>
       */
      public Builder clearCashWithdrawable() {
        bitField0_ = (bitField0_ & ~0x00000010);
        cashWithdrawable_ = 0D;
        onChanged();
        return this;
      }

      private double ee_ ;
      /**
       * <code>optional double ee = 6;</code>
       */
      public boolean hasEe() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <code>optional double ee = 6;</code>
       */
      public double getEe() {
        return ee_;
      }
      /**
       * <code>optional double ee = 6;</code>
       */
      public Builder setEe(double value) {
        bitField0_ |= 0x00000020;
        ee_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double ee = 6;</code>
       */
      public Builder clearEe() {
        bitField0_ = (bitField0_ & ~0x00000020);
        ee_ = 0D;
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


      // @@protoc_insertion_point(builder_scope:protobuf.bean.AssetsInfo)
    }

    // @@protoc_insertion_point(class_scope:protobuf.bean.AssetsInfo)
    private static final com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo();
    }

    public static com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<AssetsInfo>
        PARSER = new com.google.protobuf.AbstractParser<AssetsInfo>() {
      @java.lang.Override
      public AssetsInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AssetsInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AssetsInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AssetsInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.txtech.services.protobuf.bean.AssetsInfoProtos.AssetsInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_bean_AssetsInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_bean_AssetsInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036protobuf/bean/assetsInfo.proto\022\rprotob" +
      "uf.bean\"\203\001\n\nAssetsInfo\022\014\n\004cash\030\001 \001(\003\022\024\n\014" +
      "validNonCash\030\002 \001(\001\022\022\n\ntotalValue\030\003 \001(\001\022\027" +
      "\n\017maxValidNonCash\030\004 \001(\003\022\030\n\020cashWithdrawa" +
      "ble\030\005 \001(\001\022\n\n\002ee\030\006 \001(\001B5\n!com.txtech.serv" +
      "ices.protobuf.beanB\020AssetsInfoProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_protobuf_bean_AssetsInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_bean_AssetsInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_bean_AssetsInfo_descriptor,
        new java.lang.String[] { "Cash", "ValidNonCash", "TotalValue", "MaxValidNonCash", "CashWithdrawable", "Ee", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}