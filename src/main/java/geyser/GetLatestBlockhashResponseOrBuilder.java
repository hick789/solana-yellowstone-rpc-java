// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geyser.proto

package geyser;

public interface GetLatestBlockhashResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:geyser.GetLatestBlockhashResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 slot = 1;</code>
   * @return The slot.
   */
  long getSlot();

  /**
   * <code>string blockhash = 2;</code>
   * @return The blockhash.
   */
  String getBlockhash();
  /**
   * <code>string blockhash = 2;</code>
   * @return The bytes for blockhash.
   */
  com.google.protobuf.ByteString
      getBlockhashBytes();

  /**
   * <code>uint64 last_valid_block_height = 3;</code>
   * @return The lastValidBlockHeight.
   */
  long getLastValidBlockHeight();
}
