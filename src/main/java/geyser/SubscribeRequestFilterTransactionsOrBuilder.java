// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geyser.proto

package geyser;

public interface SubscribeRequestFilterTransactionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:geyser.SubscribeRequestFilterTransactions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool vote = 1;</code>
   * @return Whether the vote field is set.
   */
  boolean hasVote();
  /**
   * <code>optional bool vote = 1;</code>
   * @return The vote.
   */
  boolean getVote();

  /**
   * <code>optional bool failed = 2;</code>
   * @return Whether the failed field is set.
   */
  boolean hasFailed();
  /**
   * <code>optional bool failed = 2;</code>
   * @return The failed.
   */
  boolean getFailed();

  /**
   * <code>optional string signature = 5;</code>
   * @return Whether the signature field is set.
   */
  boolean hasSignature();
  /**
   * <code>optional string signature = 5;</code>
   * @return The signature.
   */
  String getSignature();
  /**
   * <code>optional string signature = 5;</code>
   * @return The bytes for signature.
   */
  com.google.protobuf.ByteString
      getSignatureBytes();

  /**
   * <code>repeated string account_include = 3;</code>
   * @return A list containing the accountInclude.
   */
  java.util.List<String>
      getAccountIncludeList();
  /**
   * <code>repeated string account_include = 3;</code>
   * @return The count of accountInclude.
   */
  int getAccountIncludeCount();
  /**
   * <code>repeated string account_include = 3;</code>
   * @param index The index of the element to return.
   * @return The accountInclude at the given index.
   */
  String getAccountInclude(int index);
  /**
   * <code>repeated string account_include = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the accountInclude at the given index.
   */
  com.google.protobuf.ByteString
      getAccountIncludeBytes(int index);

  /**
   * <code>repeated string account_exclude = 4;</code>
   * @return A list containing the accountExclude.
   */
  java.util.List<String>
      getAccountExcludeList();
  /**
   * <code>repeated string account_exclude = 4;</code>
   * @return The count of accountExclude.
   */
  int getAccountExcludeCount();
  /**
   * <code>repeated string account_exclude = 4;</code>
   * @param index The index of the element to return.
   * @return The accountExclude at the given index.
   */
  String getAccountExclude(int index);
  /**
   * <code>repeated string account_exclude = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the accountExclude at the given index.
   */
  com.google.protobuf.ByteString
      getAccountExcludeBytes(int index);

  /**
   * <code>repeated string account_required = 6;</code>
   * @return A list containing the accountRequired.
   */
  java.util.List<String>
      getAccountRequiredList();
  /**
   * <code>repeated string account_required = 6;</code>
   * @return The count of accountRequired.
   */
  int getAccountRequiredCount();
  /**
   * <code>repeated string account_required = 6;</code>
   * @param index The index of the element to return.
   * @return The accountRequired at the given index.
   */
  String getAccountRequired(int index);
  /**
   * <code>repeated string account_required = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the accountRequired at the given index.
   */
  com.google.protobuf.ByteString
      getAccountRequiredBytes(int index);
}