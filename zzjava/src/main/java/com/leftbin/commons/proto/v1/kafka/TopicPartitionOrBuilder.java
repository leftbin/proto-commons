// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/kafka/model.proto

package com.leftbin.commons.proto.v1.kafka;

public interface TopicPartitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:leftbin.commons.proto.v1.kafka.TopicPartition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string topic = 1 [json_name = "topic"];</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <code>string topic = 1 [json_name = "topic"];</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <code>int32 partition = 2 [json_name = "partition"];</code>
   * @return The partition.
   */
  int getPartition();
}