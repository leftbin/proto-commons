// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/kafka/model.proto

package com.leftbin.commons.proto.v1.kafka;

public final class ModelProto {
  private ModelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_leftbin_commons_proto_v1_kafka_HostInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_kafka_HostInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_leftbin_commons_proto_v1_kafka_StoreName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_kafka_StoreName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_leftbin_commons_proto_v1_kafka_TopicPartition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_kafka_TopicPartition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_leftbin_commons_proto_v1_kafka_InstanceMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_kafka_InstanceMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_leftbin_commons_proto_v1_kafka_KeyQueryMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_kafka_KeyQueryMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_leftbin_commons_proto_v1_kafka_StreamsMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_kafka_StreamsMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_leftbin_commons_proto_v1_kafka_Uuid_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_kafka_Uuid_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*leftbin/commons/proto/v1/kafka/model.p" +
      "roto\022\036leftbin.commons.proto.v1.kafka\032\037go" +
      "ogle/protobuf/timestamp.proto\"2\n\010HostInf" +
      "o\022\022\n\004host\030\001 \001(\tR\004host\022\022\n\004port\030\002 \001(\005R\004por" +
      "t\"*\n\tStoreName\022\035\n\nstore_name\030\001 \001(\tR\tstor" +
      "eName\"D\n\016TopicPartition\022\024\n\005topic\030\001 \001(\tR\005" +
      "topic\022\034\n\tpartition\030\002 \001(\005R\tpartition\"\201\003\n\014" +
      "InstanceMeta\022E\n\thost_info\030\001 \001(\0132(.leftbi" +
      "n.commons.proto.v1.kafka.HostInfoR\010hostI" +
      "nfo\022*\n\021state_store_names\030\002 \003(\tR\017stateSto" +
      "reNames\022Y\n\020topic_partitions\030\003 \003(\0132..left" +
      "bin.commons.proto.v1.kafka.TopicPartitio" +
      "nR\017topicPartitions\0229\n\031standby_state_stor" +
      "e_names\030\004 \003(\tR\026standbyStateStoreNames\022h\n" +
      "\030standby_topic_partitions\030\005 \003(\0132..leftbi" +
      "n.commons.proto.v1.kafka.TopicPartitionR" +
      "\026standbyTopicPartitions\"\302\001\n\014KeyQueryMeta" +
      "\022E\n\thost_info\030\001 \001(\0132(.leftbin.commons.pr" +
      "oto.v1.kafka.HostInfoR\010hostInfo\022M\n\rstand" +
      "by_hosts\030\002 \003(\0132(.leftbin.commons.proto.v" +
      "1.kafka.HostInfoR\014standbyHosts\022\034\n\tpartit" +
      "ion\030\003 \001(\005R\tpartition\"`\n\013StreamsMeta\022Q\n\ri" +
      "nstance_meta\030\001 \003(\0132,.leftbin.commons.pro" +
      "to.v1.kafka.InstanceMetaR\014instanceMeta\"\032" +
      "\n\004Uuid\022\022\n\004uuid\030\001 \001(\tR\004uuidB\224\002\n\"com.leftb" +
      "in.commons.proto.v1.kafkaB\nModelProtoP\001Z" +
      "Dgithub.com/leftbin/proto-commons/zzgo/l" +
      "eftbin/commons/proto/v1/kafka\242\002\005LCPVK\252\002\036" +
      "Leftbin.Commons.Proto.V1.Kafka\312\002\036Leftbin" +
      "\\Commons\\Proto\\V1\\Kafka\342\002*Leftbin\\Common" +
      "s\\Proto\\V1\\Kafka\\GPBMetadata\352\002\"Leftbin::" +
      "Commons::Proto::V1::Kafkab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_leftbin_commons_proto_v1_kafka_HostInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_leftbin_commons_proto_v1_kafka_HostInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_kafka_HostInfo_descriptor,
        new java.lang.String[] { "Host", "Port", });
    internal_static_leftbin_commons_proto_v1_kafka_StoreName_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_leftbin_commons_proto_v1_kafka_StoreName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_kafka_StoreName_descriptor,
        new java.lang.String[] { "StoreName", });
    internal_static_leftbin_commons_proto_v1_kafka_TopicPartition_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_leftbin_commons_proto_v1_kafka_TopicPartition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_kafka_TopicPartition_descriptor,
        new java.lang.String[] { "Topic", "Partition", });
    internal_static_leftbin_commons_proto_v1_kafka_InstanceMeta_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_leftbin_commons_proto_v1_kafka_InstanceMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_kafka_InstanceMeta_descriptor,
        new java.lang.String[] { "HostInfo", "StateStoreNames", "TopicPartitions", "StandbyStateStoreNames", "StandbyTopicPartitions", });
    internal_static_leftbin_commons_proto_v1_kafka_KeyQueryMeta_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_leftbin_commons_proto_v1_kafka_KeyQueryMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_kafka_KeyQueryMeta_descriptor,
        new java.lang.String[] { "HostInfo", "StandbyHosts", "Partition", });
    internal_static_leftbin_commons_proto_v1_kafka_StreamsMeta_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_leftbin_commons_proto_v1_kafka_StreamsMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_kafka_StreamsMeta_descriptor,
        new java.lang.String[] { "InstanceMeta", });
    internal_static_leftbin_commons_proto_v1_kafka_Uuid_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_leftbin_commons_proto_v1_kafka_Uuid_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_kafka_Uuid_descriptor,
        new java.lang.String[] { "Uuid", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
