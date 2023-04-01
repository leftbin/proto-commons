// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/timeline/rpc/model.proto

package com.leftbin.commons.proto.v1.timeline.rpc;

public interface ActivityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:leftbin.commons.proto.v1.timeline.rpc.Activity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique identifier of the activity
   * </pre>
   *
   * <code>string activity_id = 1 [json_name = "activityId"];</code>
   * @return The activityId.
   */
  java.lang.String getActivityId();
  /**
   * <pre>
   * unique identifier of the activity
   * </pre>
   *
   * <code>string activity_id = 1 [json_name = "activityId"];</code>
   * @return The bytes for activityId.
   */
  com.google.protobuf.ByteString
      getActivityIdBytes();

  /**
   * <pre>
   * type of the activity to identity the crud operation happened on the resource
   * </pre>
   *
   * <code>.leftbin.commons.proto.v1.timeline.enums.ActivityType activity_type = 2 [json_name = "activityType"];</code>
   * @return The enum numeric value on the wire for activityType.
   */
  int getActivityTypeValue();
  /**
   * <pre>
   * type of the activity to identity the crud operation happened on the resource
   * </pre>
   *
   * <code>.leftbin.commons.proto.v1.timeline.enums.ActivityType activity_type = 2 [json_name = "activityType"];</code>
   * @return The activityType.
   */
  com.leftbin.commons.proto.v1.timeline.enums.ActivityType getActivityType();

  /**
   * <pre>
   * email id of the user who has done the activity
   * </pre>
   *
   * <code>string actor = 3 [json_name = "actor"];</code>
   * @return The actor.
   */
  java.lang.String getActor();
  /**
   * <pre>
   * email id of the user who has done the activity
   * </pre>
   *
   * <code>string actor = 3 [json_name = "actor"];</code>
   * @return The bytes for actor.
   */
  com.google.protobuf.ByteString
      getActorBytes();

  /**
   * <pre>
   * time stamp of when the activity was done
   * </pre>
   *
   * <code>.google.protobuf.Timestamp cre_ts = 4 [json_name = "creTs"];</code>
   * @return Whether the creTs field is set.
   */
  boolean hasCreTs();
  /**
   * <pre>
   * time stamp of when the activity was done
   * </pre>
   *
   * <code>.google.protobuf.Timestamp cre_ts = 4 [json_name = "creTs"];</code>
   * @return The creTs.
   */
  com.google.protobuf.Timestamp getCreTs();
  /**
   * <pre>
   * time stamp of when the activity was done
   * </pre>
   *
   * <code>.google.protobuf.Timestamp cre_ts = 4 [json_name = "creTs"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreTsOrBuilder();

  /**
   * <pre>
   * unique identifier of the resource the activity belongs to
   * </pre>
   *
   * <code>string resource_id = 5 [json_name = "resourceId"];</code>
   * @return The resourceId.
   */
  java.lang.String getResourceId();
  /**
   * <pre>
   * unique identifier of the resource the activity belongs to
   * </pre>
   *
   * <code>string resource_id = 5 [json_name = "resourceId"];</code>
   * @return The bytes for resourceId.
   */
  com.google.protobuf.ByteString
      getResourceIdBytes();

  /**
   * <pre>
   * type of the resource the activity belongs to.
   * </pre>
   *
   * <code>string resource_type = 6 [json_name = "resourceType"];</code>
   * @return The resourceType.
   */
  java.lang.String getResourceType();
  /**
   * <pre>
   * type of the resource the activity belongs to.
   * </pre>
   *
   * <code>string resource_type = 6 [json_name = "resourceType"];</code>
   * @return The bytes for resourceType.
   */
  com.google.protobuf.ByteString
      getResourceTypeBytes();

  /**
   * <pre>
   * this is valid in case of activity type updates.
   * to capture the updates happened on specific fields and there
   * </pre>
   *
   * <code>repeated .leftbin.commons.proto.v1.timeline.rpc.ActivityUpdate updates = 7 [json_name = "updates"];</code>
   */
  java.util.List<com.leftbin.commons.proto.v1.timeline.rpc.ActivityUpdate> 
      getUpdatesList();
  /**
   * <pre>
   * this is valid in case of activity type updates.
   * to capture the updates happened on specific fields and there
   * </pre>
   *
   * <code>repeated .leftbin.commons.proto.v1.timeline.rpc.ActivityUpdate updates = 7 [json_name = "updates"];</code>
   */
  com.leftbin.commons.proto.v1.timeline.rpc.ActivityUpdate getUpdates(int index);
  /**
   * <pre>
   * this is valid in case of activity type updates.
   * to capture the updates happened on specific fields and there
   * </pre>
   *
   * <code>repeated .leftbin.commons.proto.v1.timeline.rpc.ActivityUpdate updates = 7 [json_name = "updates"];</code>
   */
  int getUpdatesCount();
  /**
   * <pre>
   * this is valid in case of activity type updates.
   * to capture the updates happened on specific fields and there
   * </pre>
   *
   * <code>repeated .leftbin.commons.proto.v1.timeline.rpc.ActivityUpdate updates = 7 [json_name = "updates"];</code>
   */
  java.util.List<? extends com.leftbin.commons.proto.v1.timeline.rpc.ActivityUpdateOrBuilder> 
      getUpdatesOrBuilderList();
  /**
   * <pre>
   * this is valid in case of activity type updates.
   * to capture the updates happened on specific fields and there
   * </pre>
   *
   * <code>repeated .leftbin.commons.proto.v1.timeline.rpc.ActivityUpdate updates = 7 [json_name = "updates"];</code>
   */
  com.leftbin.commons.proto.v1.timeline.rpc.ActivityUpdateOrBuilder getUpdatesOrBuilder(
      int index);
}
