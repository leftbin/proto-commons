// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leftbin/commons/proto/v1/network/dns/domain/rpc/model.proto

package com.leftbin.commons.proto.v1.network.dns.domain.rpc;

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
    internal_static_leftbin_commons_proto_v1_network_dns_domain_rpc_DnsDomain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_leftbin_commons_proto_v1_network_dns_domain_rpc_DnsDomain_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;leftbin/commons/proto/v1/network/dns/d" +
      "omain/rpc/model.proto\022/leftbin.commons.p" +
      "roto.v1.network.dns.domain.rpc\032;leftbin/" +
      "commons/proto/v1/network/dns/record/rpc/" +
      "model.proto\032Aleftbin/commons/proto/v1/ne" +
      "twork/dns/domain/rpc/enums/enums.proto\"\365" +
      "\001\n\tDnsDomain\022\037\n\013domain_name\030\001 \001(\tR\ndomai" +
      "nName\022j\n\nvisibility\030\002 \001(\0162J.leftbin.comm" +
      "ons.proto.v1.network.dns.domain.rpc.enum" +
      "s.DnsDomainVisibilityR\nvisibility\022[\n\013dns" +
      "_records\030\003 \003(\0132:.leftbin.commons.proto.v" +
      "1.network.dns.record.rpc.DnsRecordR\ndnsR" +
      "ecordsB\200\003\n3com.leftbin.commons.proto.v1." +
      "network.dns.domain.rpcB\nModelProtoP\001ZUgi" +
      "thub.com/leftbin/proto-commons/zzgo/left" +
      "bin/commons/proto/v1/network/dns/domain/" +
      "rpc\242\002\010LCPVNDDR\252\002/Leftbin.Commons.Proto.V" +
      "1.Network.Dns.Domain.Rpc\312\002/Leftbin\\Commo" +
      "ns\\Proto\\V1\\Network\\Dns\\Domain\\Rpc\342\002;Lef" +
      "tbin\\Commons\\Proto\\V1\\Network\\Dns\\Domain" +
      "\\Rpc\\GPBMetadata\352\0026Leftbin::Commons::Pro" +
      "to::V1::Network::Dns::Domain::Rpcb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.leftbin.commons.proto.v1.network.dns.record.rpc.ModelProto.getDescriptor(),
          com.leftbin.commons.proto.v1.network.dns.domain.rpc.enums.EnumsProto.getDescriptor(),
        });
    internal_static_leftbin_commons_proto_v1_network_dns_domain_rpc_DnsDomain_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_leftbin_commons_proto_v1_network_dns_domain_rpc_DnsDomain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_leftbin_commons_proto_v1_network_dns_domain_rpc_DnsDomain_descriptor,
        new java.lang.String[] { "DomainName", "Visibility", "DnsRecords", });
    com.leftbin.commons.proto.v1.network.dns.record.rpc.ModelProto.getDescriptor();
    com.leftbin.commons.proto.v1.network.dns.domain.rpc.enums.EnumsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}