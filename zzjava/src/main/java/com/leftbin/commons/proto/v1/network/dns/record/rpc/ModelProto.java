// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/network/dns/record/rpc/model.proto

package com.leftbin.commons.proto.v1.network.dns.record.rpc;

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
    internal_static_leftbin_commons_proto_v1_network_dns_record_rpc_DnsRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_network_dns_record_rpc_DnsRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;leftbin/commons/proto/v1/network/dns/r" +
      "ecord/rpc/model.proto\022/leftbin.commons.p" +
      "roto.v1.network.dns.record.rpc\032Aleftbin/" +
      "commons/proto/v1/network/dns/record/rpc/" +
      "enums/enums.proto\"\277\001\n\tDnsRecord\022e\n\013recor" +
      "d_type\030\001 \001(\0162D.leftbin.commons.proto.v1." +
      "network.dns.record.rpc.enums.DnsRecordTy" +
      "peR\nrecordType\022\022\n\004name\030\002 \001(\tR\004name\022\026\n\006va" +
      "lues\030\003 \003(\tR\006values\022\037\n\013ttl_seconds\030\004 \001(\005R" +
      "\nttlSecondsB\200\003\n3com.leftbin.commons.prot" +
      "o.v1.network.dns.record.rpcB\nModelProtoP" +
      "\001ZUgithub.com/leftbin/proto-commons/zzgo" +
      "/leftbin/commons/proto/v1/network/dns/re" +
      "cord/rpc\242\002\010LCPVNDRR\252\002/Leftbin.Commons.Pr" +
      "oto.V1.Network.Dns.Record.Rpc\312\002/Leftbin\\" +
      "Commons\\Proto\\V1\\Network\\Dns\\Record\\Rpc\342" +
      "\002;Leftbin\\Commons\\Proto\\V1\\Network\\Dns\\R" +
      "ecord\\Rpc\\GPBMetadata\352\0026Leftbin::Commons" +
      "::Proto::V1::Network::Dns::Record::Rpcb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.leftbin.commons.proto.v1.network.dns.record.rpc.enums.EnumsProto.getDescriptor(),
        });
    internal_static_leftbin_commons_proto_v1_network_dns_record_rpc_DnsRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_leftbin_commons_proto_v1_network_dns_record_rpc_DnsRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_network_dns_record_rpc_DnsRecord_descriptor,
        new java.lang.String[] { "RecordType", "Name", "Values", "TtlSeconds", });
    com.leftbin.commons.proto.v1.network.dns.record.rpc.enums.EnumsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}