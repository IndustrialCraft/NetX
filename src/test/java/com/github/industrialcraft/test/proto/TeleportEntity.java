// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TeleportEntityMessage.proto

package com.github.industrialcraft.test.proto;

public final class TeleportEntity {
  private TeleportEntity() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TeleportEntityMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:messages.TeleportEntityMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 id = 1;</code>
     * @return Whether the id field is set.
     */
    boolean hasId();
    /**
     * <code>optional int32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>optional int32 x = 2;</code>
     * @return Whether the x field is set.
     */
    boolean hasX();
    /**
     * <code>optional int32 x = 2;</code>
     * @return The x.
     */
    int getX();

    /**
     * <code>optional int32 y = 3;</code>
     * @return Whether the y field is set.
     */
    boolean hasY();
    /**
     * <code>optional int32 y = 3;</code>
     * @return The y.
     */
    int getY();

    /**
     * <code>optional int32 z = 4;</code>
     * @return Whether the z field is set.
     */
    boolean hasZ();
    /**
     * <code>optional int32 z = 4;</code>
     * @return The z.
     */
    int getZ();
  }
  /**
   * Protobuf type {@code messages.TeleportEntityMessage}
   */
  public static final class TeleportEntityMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:messages.TeleportEntityMessage)
      TeleportEntityMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TeleportEntityMessage.newBuilder() to construct.
    private TeleportEntityMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TeleportEntityMessage() {
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new TeleportEntityMessage();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TeleportEntityMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
              id_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              x_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              y_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              z_ = input.readInt32();
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
      return TeleportEntity.internal_static_messages_TeleportEntityMessage_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TeleportEntity.internal_static_messages_TeleportEntityMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TeleportEntityMessage.class, Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>optional int32 id = 1;</code>
     * @return Whether the id field is set.
     */
    @Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 id = 1;</code>
     * @return The id.
     */
    @Override
    public int getId() {
      return id_;
    }

    public static final int X_FIELD_NUMBER = 2;
    private int x_;
    /**
     * <code>optional int32 x = 2;</code>
     * @return Whether the x field is set.
     */
    @Override
    public boolean hasX() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 x = 2;</code>
     * @return The x.
     */
    @Override
    public int getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 3;
    private int y_;
    /**
     * <code>optional int32 y = 3;</code>
     * @return Whether the y field is set.
     */
    @Override
    public boolean hasY() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 y = 3;</code>
     * @return The y.
     */
    @Override
    public int getY() {
      return y_;
    }

    public static final int Z_FIELD_NUMBER = 4;
    private int z_;
    /**
     * <code>optional int32 z = 4;</code>
     * @return Whether the z field is set.
     */
    @Override
    public boolean hasZ() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional int32 z = 4;</code>
     * @return The z.
     */
    @Override
    public int getZ() {
      return z_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt32(2, x_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeInt32(3, y_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeInt32(4, z_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, x_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, y_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, z_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof TeleportEntityMessage)) {
        return super.equals(obj);
      }
      TeleportEntityMessage other = (TeleportEntityMessage) obj;

      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (getId()
            != other.getId()) return false;
      }
      if (hasX() != other.hasX()) return false;
      if (hasX()) {
        if (getX()
            != other.getX()) return false;
      }
      if (hasY() != other.hasY()) return false;
      if (hasY()) {
        if (getY()
            != other.getY()) return false;
      }
      if (hasZ() != other.hasZ()) return false;
      if (hasZ()) {
        if (getZ()
            != other.getZ()) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId();
      }
      if (hasX()) {
        hash = (37 * hash) + X_FIELD_NUMBER;
        hash = (53 * hash) + getX();
      }
      if (hasY()) {
        hash = (37 * hash) + Y_FIELD_NUMBER;
        hash = (53 * hash) + getY();
      }
      if (hasZ()) {
        hash = (37 * hash) + Z_FIELD_NUMBER;
        hash = (53 * hash) + getZ();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static TeleportEntityMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TeleportEntityMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TeleportEntityMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TeleportEntityMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TeleportEntityMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TeleportEntityMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TeleportEntityMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TeleportEntityMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static TeleportEntityMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static TeleportEntityMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static TeleportEntityMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TeleportEntityMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(TeleportEntityMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code messages.TeleportEntityMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:messages.TeleportEntityMessage)
        TeleportEntityMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return TeleportEntity.internal_static_messages_TeleportEntityMessage_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return TeleportEntity.internal_static_messages_TeleportEntityMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                TeleportEntityMessage.class, Builder.class);
      }

      // Construct using com.github.industrialcraft.netx.proto.TeleportEntity.TeleportEntityMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        y_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        z_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TeleportEntity.internal_static_messages_TeleportEntityMessage_descriptor;
      }

      @Override
      public TeleportEntityMessage getDefaultInstanceForType() {
        return TeleportEntityMessage.getDefaultInstance();
      }

      @Override
      public TeleportEntityMessage build() {
        TeleportEntityMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public TeleportEntityMessage buildPartial() {
        TeleportEntityMessage result = new TeleportEntityMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.x_ = x_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.y_ = y_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.z_ = z_;
          to_bitField0_ |= 0x00000008;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TeleportEntityMessage) {
          return mergeFrom((TeleportEntityMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(TeleportEntityMessage other) {
        if (other == TeleportEntityMessage.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        if (other.hasZ()) {
          setZ(other.getZ());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        TeleportEntityMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (TeleportEntityMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>optional int32 id = 1;</code>
       * @return Whether the id field is set.
       */
      @Override
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int32 id = 1;</code>
       * @return The id.
       */
      @Override
      public int getId() {
        return id_;
      }
      /**
       * <code>optional int32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private int x_ ;
      /**
       * <code>optional int32 x = 2;</code>
       * @return Whether the x field is set.
       */
      @Override
      public boolean hasX() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int32 x = 2;</code>
       * @return The x.
       */
      @Override
      public int getX() {
        return x_;
      }
      /**
       * <code>optional int32 x = 2;</code>
       * @param value The x to set.
       * @return This builder for chaining.
       */
      public Builder setX(int value) {
        bitField0_ |= 0x00000002;
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 x = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000002);
        x_ = 0;
        onChanged();
        return this;
      }

      private int y_ ;
      /**
       * <code>optional int32 y = 3;</code>
       * @return Whether the y field is set.
       */
      @Override
      public boolean hasY() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional int32 y = 3;</code>
       * @return The y.
       */
      @Override
      public int getY() {
        return y_;
      }
      /**
       * <code>optional int32 y = 3;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(int value) {
        bitField0_ |= 0x00000004;
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 y = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000004);
        y_ = 0;
        onChanged();
        return this;
      }

      private int z_ ;
      /**
       * <code>optional int32 z = 4;</code>
       * @return Whether the z field is set.
       */
      @Override
      public boolean hasZ() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional int32 z = 4;</code>
       * @return The z.
       */
      @Override
      public int getZ() {
        return z_;
      }
      /**
       * <code>optional int32 z = 4;</code>
       * @param value The z to set.
       * @return This builder for chaining.
       */
      public Builder setZ(int value) {
        bitField0_ |= 0x00000008;
        z_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 z = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearZ() {
        bitField0_ = (bitField0_ & ~0x00000008);
        z_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:messages.TeleportEntityMessage)
    }

    // @@protoc_insertion_point(class_scope:messages.TeleportEntityMessage)
    private static final TeleportEntityMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new TeleportEntityMessage();
    }

    public static TeleportEntityMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<TeleportEntityMessage>
        PARSER = new com.google.protobuf.AbstractParser<TeleportEntityMessage>() {
      @Override
      public TeleportEntityMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TeleportEntityMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TeleportEntityMessage> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<TeleportEntityMessage> getParserForType() {
      return PARSER;
    }

    @Override
    public TeleportEntityMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_TeleportEntityMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_TeleportEntityMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\033TeleportEntityMessage.proto\022\010messages\"" +
      "D\n\025TeleportEntityMessage\022\n\n\002id\030\001 \001(\005\022\t\n\001" +
      "x\030\002 \001(\005\022\t\n\001y\030\003 \001(\005\022\t\n\001z\030\004 \001(\005B9\n%com.git" +
      "hub.industrialcraft.netx.protoB\016Teleport" +
      "EntityP\000"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_messages_TeleportEntityMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_messages_TeleportEntityMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_TeleportEntityMessage_descriptor,
        new String[] { "Id", "X", "Y", "Z", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
