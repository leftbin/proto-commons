// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/protobuf/strings/model.proto

package com.leftbin.commons.proto.v1.protobuf.strings;

public interface StringListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:leftbin.commons.proto.v1.protobuf.strings.StringList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string entries = 1 [json_name = "entries"];</code>
   * @return A list containing the entries.
   */
  java.util.List<java.lang.String>
      getEntriesList();
  /**
   * <code>repeated string entries = 1 [json_name = "entries"];</code>
   * @return The count of entries.
   */
  int getEntriesCount();
  /**
   * <code>repeated string entries = 1 [json_name = "entries"];</code>
   * @param index The index of the element to return.
   * @return The entries at the given index.
   */
  java.lang.String getEntries(int index);
  /**
   * <code>repeated string entries = 1 [json_name = "entries"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the entries at the given index.
   */
  com.google.protobuf.ByteString
      getEntriesBytes(int index);
}
