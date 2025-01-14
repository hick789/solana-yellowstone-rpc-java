// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: solana-storage.proto

package solana.storage.ConfirmedBlock;

/**
 * Protobuf type {@code solana.storage.ConfirmedBlock.UiTokenAmount}
 */
public final class UiTokenAmount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:solana.storage.ConfirmedBlock.UiTokenAmount)
    UiTokenAmountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UiTokenAmount.newBuilder() to construct.
  private UiTokenAmount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UiTokenAmount() {
    amount_ = "";
    uiAmountString_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new UiTokenAmount();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return SolanaStorage.internal_static_solana_storage_ConfirmedBlock_UiTokenAmount_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SolanaStorage.internal_static_solana_storage_ConfirmedBlock_UiTokenAmount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            UiTokenAmount.class, Builder.class);
  }

  public static final int UI_AMOUNT_FIELD_NUMBER = 1;
  private double uiAmount_;
  /**
   * <code>double ui_amount = 1;</code>
   * @return The uiAmount.
   */
  @Override
  public double getUiAmount() {
    return uiAmount_;
  }

  public static final int DECIMALS_FIELD_NUMBER = 2;
  private int decimals_;
  /**
   * <code>uint32 decimals = 2;</code>
   * @return The decimals.
   */
  @Override
  public int getDecimals() {
    return decimals_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private volatile Object amount_;
  /**
   * <code>string amount = 3;</code>
   * @return The amount.
   */
  @Override
  public String getAmount() {
    Object ref = amount_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      amount_ = s;
      return s;
    }
  }
  /**
   * <code>string amount = 3;</code>
   * @return The bytes for amount.
   */
  @Override
  public com.google.protobuf.ByteString
      getAmountBytes() {
    Object ref = amount_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      amount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UI_AMOUNT_STRING_FIELD_NUMBER = 4;
  private volatile Object uiAmountString_;
  /**
   * <code>string ui_amount_string = 4;</code>
   * @return The uiAmountString.
   */
  @Override
  public String getUiAmountString() {
    Object ref = uiAmountString_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      uiAmountString_ = s;
      return s;
    }
  }
  /**
   * <code>string ui_amount_string = 4;</code>
   * @return The bytes for uiAmountString.
   */
  @Override
  public com.google.protobuf.ByteString
      getUiAmountStringBytes() {
    Object ref = uiAmountString_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      uiAmountString_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (Double.doubleToRawLongBits(uiAmount_) != 0) {
      output.writeDouble(1, uiAmount_);
    }
    if (decimals_ != 0) {
      output.writeUInt32(2, decimals_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, amount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uiAmountString_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, uiAmountString_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (Double.doubleToRawLongBits(uiAmount_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, uiAmount_);
    }
    if (decimals_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, decimals_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, amount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uiAmountString_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, uiAmountString_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof UiTokenAmount)) {
      return super.equals(obj);
    }
    UiTokenAmount other = (UiTokenAmount) obj;

    if (Double.doubleToLongBits(getUiAmount())
        != Double.doubleToLongBits(
            other.getUiAmount())) return false;
    if (getDecimals()
        != other.getDecimals()) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (!getUiAmountString()
        .equals(other.getUiAmountString())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + UI_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        Double.doubleToLongBits(getUiAmount()));
    hash = (37 * hash) + DECIMALS_FIELD_NUMBER;
    hash = (53 * hash) + getDecimals();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (37 * hash) + UI_AMOUNT_STRING_FIELD_NUMBER;
    hash = (53 * hash) + getUiAmountString().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static UiTokenAmount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UiTokenAmount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UiTokenAmount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UiTokenAmount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UiTokenAmount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UiTokenAmount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UiTokenAmount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UiTokenAmount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static UiTokenAmount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static UiTokenAmount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static UiTokenAmount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UiTokenAmount parseFrom(
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
  public static Builder newBuilder(UiTokenAmount prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code solana.storage.ConfirmedBlock.UiTokenAmount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:solana.storage.ConfirmedBlock.UiTokenAmount)
      UiTokenAmountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SolanaStorage.internal_static_solana_storage_ConfirmedBlock_UiTokenAmount_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SolanaStorage.internal_static_solana_storage_ConfirmedBlock_UiTokenAmount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UiTokenAmount.class, Builder.class);
    }

    // Construct using solana.storage.ConfirmedBlock.UiTokenAmount.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      uiAmount_ = 0D;

      decimals_ = 0;

      amount_ = "";

      uiAmountString_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SolanaStorage.internal_static_solana_storage_ConfirmedBlock_UiTokenAmount_descriptor;
    }

    @Override
    public UiTokenAmount getDefaultInstanceForType() {
      return UiTokenAmount.getDefaultInstance();
    }

    @Override
    public UiTokenAmount build() {
      UiTokenAmount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public UiTokenAmount buildPartial() {
      UiTokenAmount result = new UiTokenAmount(this);
      result.uiAmount_ = uiAmount_;
      result.decimals_ = decimals_;
      result.amount_ = amount_;
      result.uiAmountString_ = uiAmountString_;
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
      if (other instanceof UiTokenAmount) {
        return mergeFrom((UiTokenAmount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(UiTokenAmount other) {
      if (other == UiTokenAmount.getDefaultInstance()) return this;
      if (other.getUiAmount() != 0D) {
        setUiAmount(other.getUiAmount());
      }
      if (other.getDecimals() != 0) {
        setDecimals(other.getDecimals());
      }
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
        onChanged();
      }
      if (!other.getUiAmountString().isEmpty()) {
        uiAmountString_ = other.uiAmountString_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {
              uiAmount_ = input.readDouble();

              break;
            } // case 9
            case 16: {
              decimals_ = input.readUInt32();

              break;
            } // case 16
            case 26: {
              amount_ = input.readStringRequireUtf8();

              break;
            } // case 26
            case 34: {
              uiAmountString_ = input.readStringRequireUtf8();

              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private double uiAmount_ ;
    /**
     * <code>double ui_amount = 1;</code>
     * @return The uiAmount.
     */
    @Override
    public double getUiAmount() {
      return uiAmount_;
    }
    /**
     * <code>double ui_amount = 1;</code>
     * @param value The uiAmount to set.
     * @return This builder for chaining.
     */
    public Builder setUiAmount(double value) {
      
      uiAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double ui_amount = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUiAmount() {
      
      uiAmount_ = 0D;
      onChanged();
      return this;
    }

    private int decimals_ ;
    /**
     * <code>uint32 decimals = 2;</code>
     * @return The decimals.
     */
    @Override
    public int getDecimals() {
      return decimals_;
    }
    /**
     * <code>uint32 decimals = 2;</code>
     * @param value The decimals to set.
     * @return This builder for chaining.
     */
    public Builder setDecimals(int value) {
      
      decimals_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 decimals = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDecimals() {
      
      decimals_ = 0;
      onChanged();
      return this;
    }

    private Object amount_ = "";
    /**
     * <code>string amount = 3;</code>
     * @return The amount.
     */
    public String getAmount() {
      Object ref = amount_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        amount_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string amount = 3;</code>
     * @return The bytes for amount.
     */
    public com.google.protobuf.ByteString
        getAmountBytes() {
      Object ref = amount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        amount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string amount = 3;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      
      amount_ = getDefaultInstance().getAmount();
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 3;</code>
     * @param value The bytes for amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      amount_ = value;
      onChanged();
      return this;
    }

    private Object uiAmountString_ = "";
    /**
     * <code>string ui_amount_string = 4;</code>
     * @return The uiAmountString.
     */
    public String getUiAmountString() {
      Object ref = uiAmountString_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        uiAmountString_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string ui_amount_string = 4;</code>
     * @return The bytes for uiAmountString.
     */
    public com.google.protobuf.ByteString
        getUiAmountStringBytes() {
      Object ref = uiAmountString_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        uiAmountString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ui_amount_string = 4;</code>
     * @param value The uiAmountString to set.
     * @return This builder for chaining.
     */
    public Builder setUiAmountString(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uiAmountString_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ui_amount_string = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUiAmountString() {
      
      uiAmountString_ = getDefaultInstance().getUiAmountString();
      onChanged();
      return this;
    }
    /**
     * <code>string ui_amount_string = 4;</code>
     * @param value The bytes for uiAmountString to set.
     * @return This builder for chaining.
     */
    public Builder setUiAmountStringBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uiAmountString_ = value;
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


    // @@protoc_insertion_point(builder_scope:solana.storage.ConfirmedBlock.UiTokenAmount)
  }

  // @@protoc_insertion_point(class_scope:solana.storage.ConfirmedBlock.UiTokenAmount)
  private static final UiTokenAmount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UiTokenAmount();
  }

  public static UiTokenAmount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UiTokenAmount>
      PARSER = new com.google.protobuf.AbstractParser<UiTokenAmount>() {
    @Override
    public UiTokenAmount parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UiTokenAmount> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<UiTokenAmount> getParserForType() {
    return PARSER;
  }

  @Override
  public UiTokenAmount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

