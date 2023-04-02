// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/timeline/rpc/model.proto

package com.leftbin.commons.proto.v1.timeline.rpc;

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
    internal_static_leftbin_commons_proto_v1_timeline_rpc_Activity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_timeline_rpc_Activity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_leftbin_commons_proto_v1_timeline_rpc_ActivityUpdate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_timeline_rpc_ActivityUpdate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_leftbin_commons_proto_v1_timeline_rpc_ActivityList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_timeline_rpc_ActivityList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_leftbin_commons_proto_v1_timeline_rpc_ListActivityByResourceTypeAndResourceIdInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_timeline_rpc_ListActivityByResourceTypeAndResourceIdInput_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1leftbin/commons/proto/v1/timeline/rpc/" +
      "model.proto\022%leftbin.commons.proto.v1.ti" +
      "meline.rpc\0327leftbin/commons/proto/v1/tim" +
      "eline/rpc/enums/enums.proto\032\037google/prot" +
      "obuf/timestamp.proto\032/leftbin/commons/pr" +
      "oto/v1/pagination/model.proto\"\347\002\n\010Activi" +
      "ty\022\037\n\013activity_id\030\001 \001(\tR\nactivityId\022Z\n\ra" +
      "ctivity_type\030\002 \001(\01625.leftbin.commons.pro" +
      "to.v1.timeline.enums.ActivityTypeR\014activ" +
      "ityType\022\024\n\005actor\030\003 \001(\tR\005actor\0221\n\006cre_ts\030" +
      "\004 \001(\0132\032.google.protobuf.TimestampR\005creTs" +
      "\022\037\n\013resource_id\030\005 \001(\tR\nresourceId\022#\n\rres" +
      "ource_type\030\006 \001(\tR\014resourceType\022O\n\007update" +
      "s\030\007 \003(\01325.leftbin.commons.proto.v1.timel" +
      "ine.rpc.ActivityUpdateR\007updates\"\322\001\n\016Acti" +
      "vityUpdate\022\035\n\nfield_name\030\001 \001(\tR\tfieldNam" +
      "e\022\035\n\nfield_type\030\002 \001(\tR\tfieldType\022\033\n\told_" +
      "value\030\003 \001(\tR\010oldValue\022\033\n\tnew_value\030\004 \001(\t" +
      "R\010newValue\022!\n\014added_values\030\005 \003(\tR\013addedV" +
      "alues\022%\n\016removed_values\030\006 \003(\tR\rremovedVa" +
      "lues\"z\n\014ActivityList\022\037\n\013total_pages\030\001 \001(" +
      "\005R\ntotalPages\022I\n\007entries\030\002 \003(\0132/.leftbin" +
      ".commons.proto.v1.timeline.rpc.ActivityR" +
      "\007entries\"\300\001\n,ListActivityByResourceTypeA" +
      "ndResourceIdInput\022\037\n\013resource_id\030\001 \001(\tR\n" +
      "resourceId\022#\n\rresource_type\030\002 \001(\tR\014resou" +
      "rceType\022J\n\tpage_info\030\003 \001(\0132-.leftbin.com" +
      "mons.proto.v1.pagination.PageInfoR\010pageI" +
      "nfoB\305\002\n)com.leftbin.commons.proto.v1.tim" +
      "eline.rpcB\nModelProtoP\001ZPgithub.com/plan" +
      "toncloud/proto-commons/zzgo/leftbin/comm" +
      "ons/proto/v1/timeline/rpc\242\002\006LCPVTR\252\002%Lef" +
      "tbin.Commons.Proto.V1.Timeline.Rpc\312\002%Lef" +
      "tbin\\Commons\\Proto\\V1\\Timeline\\Rpc\342\0021Lef" +
      "tbin\\Commons\\Proto\\V1\\Timeline\\Rpc\\GPBMe" +
      "tadata\352\002*Leftbin::Commons::Proto::V1::Ti" +
      "meline::Rpcb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.leftbin.commons.proto.v1.timeline.enums.EnumsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.leftbin.commons.proto.v1.pagination.ModelProto.getDescriptor(),
        });
    internal_static_leftbin_commons_proto_v1_timeline_rpc_Activity_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_leftbin_commons_proto_v1_timeline_rpc_Activity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_timeline_rpc_Activity_descriptor,
        new java.lang.String[] { "ActivityId", "ActivityType", "Actor", "CreTs", "ResourceId", "ResourceType", "Updates", });
    internal_static_leftbin_commons_proto_v1_timeline_rpc_ActivityUpdate_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_leftbin_commons_proto_v1_timeline_rpc_ActivityUpdate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_timeline_rpc_ActivityUpdate_descriptor,
        new java.lang.String[] { "FieldName", "FieldType", "OldValue", "NewValue", "AddedValues", "RemovedValues", });
    internal_static_leftbin_commons_proto_v1_timeline_rpc_ActivityList_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_leftbin_commons_proto_v1_timeline_rpc_ActivityList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_timeline_rpc_ActivityList_descriptor,
        new java.lang.String[] { "TotalPages", "Entries", });
    internal_static_leftbin_commons_proto_v1_timeline_rpc_ListActivityByResourceTypeAndResourceIdInput_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_leftbin_commons_proto_v1_timeline_rpc_ListActivityByResourceTypeAndResourceIdInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_timeline_rpc_ListActivityByResourceTypeAndResourceIdInput_descriptor,
        new java.lang.String[] { "ResourceId", "ResourceType", "PageInfo", });
    com.leftbin.commons.proto.v1.timeline.enums.EnumsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.leftbin.commons.proto.v1.pagination.ModelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}