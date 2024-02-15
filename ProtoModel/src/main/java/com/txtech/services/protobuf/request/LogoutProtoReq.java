// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/request/LogoutReq.proto

package com.txtech.services.protobuf.request;

public final class LogoutProtoReq {
  private LogoutProtoReq() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LogoutReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf.request.LogoutReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string operatorID = 1;</code>
     */
    boolean hasOperatorID();
    /**
     * <code>required string operatorID = 1;</code>
     */
    java.lang.String getOperatorID();
    /**
     * <code>required string operatorID = 1;</code>
     */
    com.google.protobuf.ByteString
        getOperatorIDBytes();
  }
  /**
   * Protobuf type {@code protobuf.request.LogoutReq}
   */
  public  static final class LogoutReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protobuf.request.LogoutReq)
      LogoutReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LogoutReq.newBuilder() to construct.
    private LogoutReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LogoutReq() {
      operatorID_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LogoutReq(
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
              operatorID_ = bs;
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
      return com.txtech.services.protobuf.request.LogoutProtoReq.internal_static_protobuf_request_LogoutReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.txtech.services.protobuf.request.LogoutProtoReq.internal_static_protobuf_request_LogoutReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq.class, com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq.Builder.class);
    }

    private int bitField0_;
    public static final int OPERATORID_FIELD_NUMBER = 1;
    private volatile java.lang.Object operatorID_;
    /**
     * <code>required string operatorID = 1;</code>
     */
    public boolean hasOperatorID() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string operatorID = 1;</code>
     */
    public java.lang.String getOperatorID() {
      java.lang.Object ref = operatorID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          operatorID_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string operatorID = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOperatorIDBytes() {
      java.lang.Object ref = operatorID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operatorID_ = b;
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

      if (!hasOperatorID()) {
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, operatorID_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, operatorID_);
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
      if (!(obj instanceof com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq)) {
        return super.equals(obj);
      }
      com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq other = (com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq) obj;

      if (hasOperatorID() != other.hasOperatorID()) return false;
      if (hasOperatorID()) {
        if (!getOperatorID()
            .equals(other.getOperatorID())) return false;
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
      if (hasOperatorID()) {
        hash = (37 * hash) + OPERATORID_FIELD_NUMBER;
        hash = (53 * hash) + getOperatorID().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq parseFrom(
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
    public static Builder newBuilder(com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq prototype) {
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
     * Protobuf type {@code protobuf.request.LogoutReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf.request.LogoutReq)
        com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.txtech.services.protobuf.request.LogoutProtoReq.internal_static_protobuf_request_LogoutReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.txtech.services.protobuf.request.LogoutProtoReq.internal_static_protobuf_request_LogoutReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq.class, com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq.Builder.class);
      }

      // Construct using com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq.newBuilder()
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
        operatorID_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.txtech.services.protobuf.request.LogoutProtoReq.internal_static_protobuf_request_LogoutReq_descriptor;
      }

      @java.lang.Override
      public com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq getDefaultInstanceForType() {
        return com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq.getDefaultInstance();
      }

      @java.lang.Override
      public com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq build() {
        com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq buildPartial() {
        com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq result = new com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.operatorID_ = operatorID_;
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
        if (other instanceof com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq) {
          return mergeFrom((com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq other) {
        if (other == com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq.getDefaultInstance()) return this;
        if (other.hasOperatorID()) {
          bitField0_ |= 0x00000001;
          operatorID_ = other.operatorID_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasOperatorID()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object operatorID_ = "";
      /**
       * <code>required string operatorID = 1;</code>
       */
      public boolean hasOperatorID() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string operatorID = 1;</code>
       */
      public java.lang.String getOperatorID() {
        java.lang.Object ref = operatorID_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            operatorID_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string operatorID = 1;</code>
       */
      public com.google.protobuf.ByteString
          getOperatorIDBytes() {
        java.lang.Object ref = operatorID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          operatorID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string operatorID = 1;</code>
       */
      public Builder setOperatorID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        operatorID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string operatorID = 1;</code>
       */
      public Builder clearOperatorID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        operatorID_ = getDefaultInstance().getOperatorID();
        onChanged();
        return this;
      }
      /**
       * <code>required string operatorID = 1;</code>
       */
      public Builder setOperatorIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        operatorID_ = value;
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


      // @@protoc_insertion_point(builder_scope:protobuf.request.LogoutReq)
    }

    // @@protoc_insertion_point(class_scope:protobuf.request.LogoutReq)
    private static final com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq();
    }

    public static com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LogoutReq>
        PARSER = new com.google.protobuf.AbstractParser<LogoutReq>() {
      @java.lang.Override
      public LogoutReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LogoutReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LogoutReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LogoutReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.txtech.services.protobuf.request.LogoutProtoReq.LogoutReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_request_LogoutReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_request_LogoutReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n protobuf/request/LogoutReq.proto\022\020prot" +
      "obuf.request\"\037\n\tLogoutReq\022\022\n\noperatorID\030" +
      "\001 \002(\tB6\n$com.txtech.services.protobuf.re" +
      "questB\016LogoutProtoReq"
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
    internal_static_protobuf_request_LogoutReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_request_LogoutReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_request_LogoutReq_descriptor,
        new java.lang.String[] { "OperatorID", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}