// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/cloud/gcp/resource/folder/rpc/model.proto

package com.leftbin.commons.proto.v1.cloud.gcp.resource.folder.rpc;

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
    internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_folder_rpc_GcpFolder_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_folder_rpc_GcpFolder_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_folder_rpc_GcpFolders_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_folder_rpc_GcpFolders_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBleftbin/commons/proto/v1/cloud/gcp/res" +
      "ource/folder/rpc/model.proto\0226leftbin.co" +
      "mmons.proto.v1.cloud.gcp.resource.folder" +
      ".rpc\"V\n\tGcpFolder\022\016\n\002id\030\001 \001(\tR\002id\022!\n\014dis" +
      "play_name\030\002 \001(\tR\013displayName\022\026\n\006parent\030\003" +
      " \001(\tR\006parent\"i\n\nGcpFolders\022[\n\007entries\030\001 " +
      "\003(\0132A.leftbin.commons.proto.v1.cloud.gcp" +
      ".resource.folder.rpc.GcpFolderR\007entriesB" +
      "\261\003\n:com.leftbin.commons.proto.v1.cloud.g" +
      "cp.resource.folder.rpcB\nModelProtoP\001Zagi" +
      "thub.com/plantoncloud/proto-commons/zzgo" +
      "/leftbin/commons/proto/v1/cloud/gcp/reso" +
      "urce/folder/rpc\242\002\tLCPVCGRFR\252\0026Leftbin.Co" +
      "mmons.Proto.V1.Cloud.Gcp.Resource.Folder" +
      ".Rpc\312\0026Leftbin\\Commons\\Proto\\V1\\Cloud\\Gc" +
      "p\\Resource\\Folder\\Rpc\342\002BLeftbin\\Commons\\" +
      "Proto\\V1\\Cloud\\Gcp\\Resource\\Folder\\Rpc\\G" +
      "PBMetadata\352\002>Leftbin::Commons::Proto::V1" +
      "::Cloud::Gcp::Resource::Folder::Rpcb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_folder_rpc_GcpFolder_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_folder_rpc_GcpFolder_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_folder_rpc_GcpFolder_descriptor,
        new java.lang.String[] { "Id", "DisplayName", "Parent", });
    internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_folder_rpc_GcpFolders_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_folder_rpc_GcpFolders_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_folder_rpc_GcpFolders_descriptor,
        new java.lang.String[] { "Entries", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
