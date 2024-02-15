// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/request/queryClientCashBalanceRequest.proto

package com.txtech.services.protobuf.request;

public final class QueryClientCashBalanceRequestProtos {
  private QueryClientCashBalanceRequestProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QueryClientCashBalanceRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf.request.QueryClientCashBalanceRequest)
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

    /**
     * <code>required string subAccountID = 3;</code>
     */
    boolean hasSubAccountID();
    /**
     * <code>required string subAccountID = 3;</code>
     */
    java.lang.String getSubAccountID();
    /**
     * <code>required string subAccountID = 3;</code>
     */
    com.google.protobuf.ByteString
        getSubAccountIDBytes();

    /**
     * <code>required string language = 4;</code>
     */
    boolean hasLanguage();
    /**
     * <code>required string language = 4;</code>
     */
    java.lang.String getLanguage();
    /**
     * <code>required string language = 4;</code>
     */
    com.google.protobuf.ByteString
        getLanguageBytes();
  }
  /**
   * Protobuf type {@code protobuf.request.QueryClientCashBalanceRequest}
   */
  public  static final class QueryClientCashBalanceRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protobuf.request.QueryClientCashBalanceRequest)
      QueryClientCashBalanceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QueryClientCashBalanceRequest.newBuilder() to construct.
    private QueryClientCashBalanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QueryClientCashBalanceRequest() {
      clientID_ = "";
      subAccountID_ = "";
      language_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private QueryClientCashBalanceRequest(
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
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              subAccountID_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              language_ = bs;
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
      return com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.internal_static_protobuf_request_QueryClientCashBalanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.internal_static_protobuf_request_QueryClientCashBalanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest.class, com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest.Builder.class);
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

    public static final int SUBACCOUNTID_FIELD_NUMBER = 3;
    private volatile java.lang.Object subAccountID_;
    /**
     * <code>required string subAccountID = 3;</code>
     */
    public boolean hasSubAccountID() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required string subAccountID = 3;</code>
     */
    public java.lang.String getSubAccountID() {
      java.lang.Object ref = subAccountID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          subAccountID_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string subAccountID = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSubAccountIDBytes() {
      java.lang.Object ref = subAccountID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subAccountID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LANGUAGE_FIELD_NUMBER = 4;
    private volatile java.lang.Object language_;
    /**
     * <code>required string language = 4;</code>
     */
    public boolean hasLanguage() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required string language = 4;</code>
     */
    public java.lang.String getLanguage() {
      java.lang.Object ref = language_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          language_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string language = 4;</code>
     */
    public com.google.protobuf.ByteString
        getLanguageBytes() {
      java.lang.Object ref = language_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        language_ = b;
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

      if (!hasClientID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTradingAccSeq()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSubAccountID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLanguage()) {
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
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, subAccountID_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, language_);
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
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, subAccountID_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, language_);
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
      if (!(obj instanceof com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest)) {
        return super.equals(obj);
      }
      com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest other = (com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest) obj;

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
      if (hasSubAccountID() != other.hasSubAccountID()) return false;
      if (hasSubAccountID()) {
        if (!getSubAccountID()
            .equals(other.getSubAccountID())) return false;
      }
      if (hasLanguage() != other.hasLanguage()) return false;
      if (hasLanguage()) {
        if (!getLanguage()
            .equals(other.getLanguage())) return false;
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
      if (hasSubAccountID()) {
        hash = (37 * hash) + SUBACCOUNTID_FIELD_NUMBER;
        hash = (53 * hash) + getSubAccountID().hashCode();
      }
      if (hasLanguage()) {
        hash = (37 * hash) + LANGUAGE_FIELD_NUMBER;
        hash = (53 * hash) + getLanguage().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest parseFrom(
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
    public static Builder newBuilder(com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest prototype) {
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
     * Protobuf type {@code protobuf.request.QueryClientCashBalanceRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf.request.QueryClientCashBalanceRequest)
        com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.internal_static_protobuf_request_QueryClientCashBalanceRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.internal_static_protobuf_request_QueryClientCashBalanceRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest.class, com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest.Builder.class);
      }

      // Construct using com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest.newBuilder()
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
        subAccountID_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        language_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.internal_static_protobuf_request_QueryClientCashBalanceRequest_descriptor;
      }

      @java.lang.Override
      public com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest getDefaultInstanceForType() {
        return com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest build() {
        com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest buildPartial() {
        com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest result = new com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest(this);
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
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.subAccountID_ = subAccountID_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.language_ = language_;
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
        if (other instanceof com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest) {
          return mergeFrom((com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest other) {
        if (other == com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest.getDefaultInstance()) return this;
        if (other.hasClientID()) {
          bitField0_ |= 0x00000001;
          clientID_ = other.clientID_;
          onChanged();
        }
        if (other.hasTradingAccSeq()) {
          setTradingAccSeq(other.getTradingAccSeq());
        }
        if (other.hasSubAccountID()) {
          bitField0_ |= 0x00000004;
          subAccountID_ = other.subAccountID_;
          onChanged();
        }
        if (other.hasLanguage()) {
          bitField0_ |= 0x00000008;
          language_ = other.language_;
          onChanged();
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
        if (!hasSubAccountID()) {
          return false;
        }
        if (!hasLanguage()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest) e.getUnfinishedMessage();
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

      private java.lang.Object subAccountID_ = "";
      /**
       * <code>required string subAccountID = 3;</code>
       */
      public boolean hasSubAccountID() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required string subAccountID = 3;</code>
       */
      public java.lang.String getSubAccountID() {
        java.lang.Object ref = subAccountID_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            subAccountID_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string subAccountID = 3;</code>
       */
      public com.google.protobuf.ByteString
          getSubAccountIDBytes() {
        java.lang.Object ref = subAccountID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          subAccountID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string subAccountID = 3;</code>
       */
      public Builder setSubAccountID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        subAccountID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string subAccountID = 3;</code>
       */
      public Builder clearSubAccountID() {
        bitField0_ = (bitField0_ & ~0x00000004);
        subAccountID_ = getDefaultInstance().getSubAccountID();
        onChanged();
        return this;
      }
      /**
       * <code>required string subAccountID = 3;</code>
       */
      public Builder setSubAccountIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        subAccountID_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object language_ = "";
      /**
       * <code>required string language = 4;</code>
       */
      public boolean hasLanguage() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>required string language = 4;</code>
       */
      public java.lang.String getLanguage() {
        java.lang.Object ref = language_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            language_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string language = 4;</code>
       */
      public com.google.protobuf.ByteString
          getLanguageBytes() {
        java.lang.Object ref = language_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          language_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string language = 4;</code>
       */
      public Builder setLanguage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        language_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string language = 4;</code>
       */
      public Builder clearLanguage() {
        bitField0_ = (bitField0_ & ~0x00000008);
        language_ = getDefaultInstance().getLanguage();
        onChanged();
        return this;
      }
      /**
       * <code>required string language = 4;</code>
       */
      public Builder setLanguageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        language_ = value;
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


      // @@protoc_insertion_point(builder_scope:protobuf.request.QueryClientCashBalanceRequest)
    }

    // @@protoc_insertion_point(class_scope:protobuf.request.QueryClientCashBalanceRequest)
    private static final com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest();
    }

    public static com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<QueryClientCashBalanceRequest>
        PARSER = new com.google.protobuf.AbstractParser<QueryClientCashBalanceRequest>() {
      @java.lang.Override
      public QueryClientCashBalanceRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new QueryClientCashBalanceRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<QueryClientCashBalanceRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QueryClientCashBalanceRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.txtech.services.protobuf.request.QueryClientCashBalanceRequestProtos.QueryClientCashBalanceRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_request_QueryClientCashBalanceRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_request_QueryClientCashBalanceRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4protobuf/request/queryClientCashBalanc" +
      "eRequest.proto\022\020protobuf.request\"p\n\035Quer" +
      "yClientCashBalanceRequest\022\020\n\010clientID\030\001 " +
      "\002(\t\022\025\n\rtradingAccSeq\030\002 \002(\005\022\024\n\014subAccount" +
      "ID\030\003 \002(\t\022\020\n\010language\030\004 \002(\tBK\n$com.txtech" +
      ".services.protobuf.requestB#QueryClientC" +
      "ashBalanceRequestProtos"
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
    internal_static_protobuf_request_QueryClientCashBalanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_request_QueryClientCashBalanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_request_QueryClientCashBalanceRequest_descriptor,
        new java.lang.String[] { "ClientID", "TradingAccSeq", "SubAccountID", "Language", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
