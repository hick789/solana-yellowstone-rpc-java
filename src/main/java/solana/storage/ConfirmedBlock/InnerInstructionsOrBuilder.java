// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: solana-storage.proto

package solana.storage.ConfirmedBlock;

public interface InnerInstructionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:solana.storage.ConfirmedBlock.InnerInstructions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 index = 1;</code>
   * @return The index.
   */
  int getIndex();

  /**
   * <code>repeated .solana.storage.ConfirmedBlock.InnerInstruction instructions = 2;</code>
   */
  java.util.List<InnerInstruction>
      getInstructionsList();
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.InnerInstruction instructions = 2;</code>
   */
  InnerInstruction getInstructions(int index);
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.InnerInstruction instructions = 2;</code>
   */
  int getInstructionsCount();
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.InnerInstruction instructions = 2;</code>
   */
  java.util.List<? extends InnerInstructionOrBuilder>
      getInstructionsOrBuilderList();
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.InnerInstruction instructions = 2;</code>
   */
  InnerInstructionOrBuilder getInstructionsOrBuilder(
      int index);
}
