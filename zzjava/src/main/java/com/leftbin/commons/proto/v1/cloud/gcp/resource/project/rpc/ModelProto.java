// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/cloud/gcp/resource/project/rpc/model.proto

package com.leftbin.commons.proto.v1.cloud.gcp.resource.project.rpc;

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
    internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_rpc_GcpProject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_rpc_GcpProject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_rpc_GcpProjects_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_rpc_GcpProjects_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCleftbin/commons/proto/v1/cloud/gcp/res" +
      "ource/project/rpc/model.proto\0227leftbin.c" +
      "ommons.proto.v1.cloud.gcp.resource.proje" +
      "ct.rpc\"v\n\nGcpProject\022\022\n\004name\030\001 \001(\tR\004name" +
      "\022\016\n\002id\030\002 \001(\tR\002id\022\026\n\006number\030\003 \001(\tR\006number" +
      "\022,\n\022billing_account_id\030\004 \001(\tR\020billingAcc" +
      "ountId\"f\n\013GcpProjects\022W\n\004list\030\001 \003(\0132C.le" +
      "ftbin.commons.proto.v1.cloud.gcp.resourc" +
      "e.project.rpc.GcpProjectR\004listB\267\003\n;com.l" +
      "eftbin.commons.proto.v1.cloud.gcp.resour" +
      "ce.project.rpcB\nModelProtoP\001Zbgithub.com" +
      "/plantoncloud/proto-commons/zzgo/leftbin" +
      "/commons/proto/v1/cloud/gcp/resource/pro" +
      "ject/rpc\242\002\tLCPVCGRPR\252\0027Leftbin.Commons.P" +
      "roto.V1.Cloud.Gcp.Resource.Project.Rpc\312\002" +
      "7Leftbin\\Commons\\Proto\\V1\\Cloud\\Gcp\\Reso" +
      "urce\\Project\\Rpc\342\002CLeftbin\\Commons\\Proto" +
      "\\V1\\Cloud\\Gcp\\Resource\\Project\\Rpc\\GPBMe" +
      "tadata\352\002?Leftbin::Commons::Proto::V1::Cl" +
      "oud::Gcp::Resource::Project::Rpcb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_rpc_GcpProject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_rpc_GcpProject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_rpc_GcpProject_descriptor,
        new java.lang.String[] { "Name", "Id", "Number", "BillingAccountId", });
    internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_rpc_GcpProjects_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_rpc_GcpProjects_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_cloud_gcp_resource_project_rpc_GcpProjects_descriptor,
        new java.lang.String[] { "List", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
