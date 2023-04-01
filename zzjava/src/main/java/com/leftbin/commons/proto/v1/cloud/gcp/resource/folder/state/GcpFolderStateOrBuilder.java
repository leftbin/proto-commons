// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/cloud/gcp/resource/folder/state/model.proto

package com.leftbin.commons.proto.v1.cloud.gcp.resource.folder.state;

public interface GcpFolderStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:leftbin.commons.proto.v1.cloud.gcp.resource.folder.state.GcpFolderState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * id of the gcp project.
   * ex: 498520640386.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * id of the gcp project.
   * ex: 498520640386.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * display name for the folder.
   * (important) a two character suffix starting with a hyphen is added at the end of the
   * display name to allow recreating folders with same resource identifier on planton cloud.
   * </pre>
   *
   * <code>string display_name = 2 [json_name = "displayName"];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * display name for the folder.
   * (important) a two character suffix starting with a hyphen is added at the end of the
   * display name to allow recreating folders with same resource identifier on planton cloud.
   * </pre>
   *
   * <code>string display_name = 2 [json_name = "displayName"];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * parent of the folder.
   * parent can be either a gcp organization or another gcp folder.
   * </pre>
   *
   * <code>string parent = 3 [json_name = "parent"];</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * parent of the folder.
   * parent can be either a gcp organization or another gcp folder.
   * </pre>
   *
   * <code>string parent = 3 [json_name = "parent"];</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();
}
