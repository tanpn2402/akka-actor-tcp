// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/request/cashTransferClientBankBalanceRequest.proto

package com.txtech.services.protobuf.request;

public final class CashTransferClientBankBalanceRequestProtos {
  private CashTransferClientBankBalanceRequestProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CashTransferClientBankBalanceRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf.request.CashTransferClientBankBalanceRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string clientID = 1;</code>
     */
    boolean hasClientID();
    /**
     * <code>required string clientID = 1;</code>
     */
    java.lang.String getClientID();
    /**
     * <code>required string clientID = 1;</code>
     */
    com.google.protobuf.ByteString
        getClientIDBytes();

    /**
     * <code>required int32 tradingAccSeq = 2;</code>
     */
    boolean hasTradingAccSeq();
    /**
     * <code>required int32 tradingAccSeq = 2;</code>
     */
    int getTradingAccSeq();
  }
  /**
   * Protobuf type {@code protobuf.request.CashTransferClientBankBalanceRequest}
   */
  public  static final class CashTransferClientBankBalanceRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protobuf.request.CashTransferClientBankBalanceRequest)
      CashTransferClientBankBalanceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CashTransferClientBankBalanceRequest.newBuilder() to construct.
    private CashTransferClientBankBalanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CashTransferClientBankBalanceRequest() {
      clientID_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CashTransferClientBankBalanceRequest(
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
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              clientID_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              tradingAccSeq_ = input.readInt32();
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
      return com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.internal_static_protobuf_request_CashTransferClientBankBalanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.internal_static_protobuf_request_CashTransferClientBankBalanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest.class, com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest.Builder.class);
    }

    private int bitField0_;
    public static final int CLIENTID_FIELD_NUMBER = 1;
    private volatile java.lang.Object clientID_;
    /**
     * <code>required string clientID = 1;</code>
     */
    public boolean hasClientID() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string clientID = 1;</code>
     */
    public java.lang.String getClientID() {
      java.lang.Object ref = clientID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientID_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string clientID = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClientIDBytes() {
      java.lang.Object ref = clientID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TRADINGACCSEQ_FIELD_NUMBER = 2;
    private int tradingAccSeq_;
    /**
     * <code>required int32 tradingAccSeq = 2;</code>
     */
    public boolean hasTradingAccSeq() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required int32 tradingAccSeq = 2;</code>
     */
    public int getTradingAccSeq() {
      return tradingAccSeq_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasClientID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTradingAccSeq()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientID_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt32(2, tradingAccSeq_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientID_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, tradingAccSeq_);
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
      if (!(obj instanceof com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest)) {
        return super.equals(obj);
      }
      com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest other = (com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest) obj;

      if (hasClientID() != other.hasClientID()) return false;
      if (hasClientID()) {
        if (!getClientID()
            .equals(other.getClientID())) return false;
      }
      if (hasTradingAccSeq() != other.hasTradingAccSeq()) return false;
      if (hasTradingAccSeq()) {
        if (getTradingAccSeq()
            != other.getTradingAccSeq()) return false;
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
      if (hasClientID()) {
        hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
        hash = (53 * hash) + getClientID().hashCode();
      }
      if (hasTradingAccSeq()) {
        hash = (37 * hash) + TRADINGACCSEQ_FIELD_NUMBER;
        hash = (53 * hash) + getTradingAccSeq();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest parseFrom(
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
    public static Builder newBuilder(com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest prototype) {
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
     * Protobuf type {@code protobuf.request.CashTransferClientBankBalanceRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf.request.CashTransferClientBankBalanceRequest)
        com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.internal_static_protobuf_request_CashTransferClientBankBalanceRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.internal_static_protobuf_request_CashTransferClientBankBalanceRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest.class, com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest.Builder.class);
      }

      // Construct using com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest.newBuilder()
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
        clientID_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        tradingAccSeq_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.internal_static_protobuf_request_CashTransferClientBankBalanceRequest_descriptor;
      }

      @java.lang.Override
      public com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest getDefaultInstanceForType() {
        return com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest build() {
        com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest buildPartial() {
        com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest result = new com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.clientID_ = clientID_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.tradingAccSeq_ = tradingAccSeq_;
          to_bitField0_ |= 0x00000002;
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
        if (other instanceof com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest) {
          return mergeFrom((com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest other) {
        if (other == com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest.getDefaultInstance()) return this;
        if (other.hasClientID()) {
          bitField0_ |= 0x00000001;
          clientID_ = other.clientID_;
          onChanged();
        }
        if (other.hasTradingAccSeq()) {
          setTradingAccSeq(other.getTradingAccSeq());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasClientID()) {
          return false;
        }
        if (!hasTradingAccSeq()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object clientID_ = "";
      /**
       * <code>required string clientID = 1;</code>
       */
      public boolean hasClientID() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string clientID = 1;</code>
       */
      public java.lang.String getClientID() {
        java.lang.Object ref = clientID_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            clientID_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string clientID = 1;</code>
       */
      public com.google.protobuf.ByteString
          getClientIDBytes() {
        java.lang.Object ref = clientID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string clientID = 1;</code>
       */
      public Builder setClientID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        clientID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string clientID = 1;</code>
       */
      public Builder clearClientID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        clientID_ = getDefaultInstance().getClientID();
        onChanged();
        return this;
      }
      /**
       * <code>required string clientID = 1;</code>
       */
      public Builder setClientIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        clientID_ = value;
        onChanged();
        return this;
      }

      private int tradingAccSeq_ ;
      /**
       * <code>required int32 tradingAccSeq = 2;</code>
       */
      public boolean hasTradingAccSeq() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required int32 tradingAccSeq = 2;</code>
       */
      public int getTradingAccSeq() {
        return tradingAccSeq_;
      }
      /**
       * <code>required int32 tradingAccSeq = 2;</code>
       */
      public Builder setTradingAccSeq(int value) {
        bitField0_ |= 0x00000002;
        tradingAccSeq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 tradingAccSeq = 2;</code>
       */
      public Builder clearTradingAccSeq() {
        bitField0_ = (bitField0_ & ~0x00000002);
        tradingAccSeq_ = 0;
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


      // @@protoc_insertion_point(builder_scope:protobuf.request.CashTransferClientBankBalanceRequest)
    }

    // @@protoc_insertion_point(class_scope:protobuf.request.CashTransferClientBankBalanceRequest)
    private static final com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest();
    }

    public static com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CashTransferClientBankBalanceRequest>
        PARSER = new com.google.protobuf.AbstractParser<CashTransferClientBankBalanceRequest>() {
      @java.lang.Override
      public CashTransferClientBankBalanceRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CashTransferClientBankBalanceRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CashTransferClientBankBalanceRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CashTransferClientBankBalanceRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.txtech.services.protobuf.request.CashTransferClientBankBalanceRequestProtos.CashTransferClientBankBalanceRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_request_CashTransferClientBankBalanceRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_request_CashTransferClientBankBalanceRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;protobuf/request/cashTransferClientBan" +
      "kBalanceRequest.proto\022\020protobuf.request\"" +
      "O\n$CashTransferClientBankBalanceRequest\022" +
      "\020\n\010clientID\030\001 \002(\t\022\025\n\rtradingAccSeq\030\002 \002(\005" +
      "BR\n$com.txtech.services.protobuf.request" +
      "B*CashTransferClientBankBalanceRequestPr" +
      "otos"
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
    internal_static_protobuf_request_CashTransferClientBankBalanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_request_CashTransferClientBankBalanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_request_CashTransferClientBankBalanceRequest_descriptor,
        new java.lang.String[] { "ClientID", "TradingAccSeq", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}