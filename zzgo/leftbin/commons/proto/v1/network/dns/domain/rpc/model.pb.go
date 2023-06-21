// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        (unknown)
// source: leftbin/commons/proto/v1/network/dns/domain/rpc/model.proto

package rpc

import (
	enums "github.com/leftbin/proto-commons/zzgo/leftbin/commons/proto/v1/network/dns/domain/rpc/enums"
	rpc "github.com/leftbin/proto-commons/zzgo/leftbin/commons/proto/v1/network/dns/record/rpc"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type DnsDomain struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// domain name example.com
	DomainName string `protobuf:"bytes,1,opt,name=domain_name,json=domainName,proto3" json:"domain_name,omitempty"`
	// domain visibility. for private visibility internal reserved ips are added to the zone.
	// for publicly visible domains external reserved domains are added to the zone.
	Visibility enums.DnsDomainVisibility `protobuf:"varint,2,opt,name=visibility,proto3,enum=leftbin.commons.proto.v1.network.dns.domain.rpc.enums.DnsDomainVisibility" json:"visibility,omitempty"`
	// dns records to be added to the zone
	DnsRecords []*rpc.DnsRecord `protobuf:"bytes,3,rep,name=dns_records,json=dnsRecords,proto3" json:"dns_records,omitempty"`
}

func (x *DnsDomain) Reset() {
	*x = DnsDomain{}
	if protoimpl.UnsafeEnabled {
		mi := &file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DnsDomain) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DnsDomain) ProtoMessage() {}

func (x *DnsDomain) ProtoReflect() protoreflect.Message {
	mi := &file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DnsDomain.ProtoReflect.Descriptor instead.
func (*DnsDomain) Descriptor() ([]byte, []int) {
	return file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_rawDescGZIP(), []int{0}
}

func (x *DnsDomain) GetDomainName() string {
	if x != nil {
		return x.DomainName
	}
	return ""
}

func (x *DnsDomain) GetVisibility() enums.DnsDomainVisibility {
	if x != nil {
		return x.Visibility
	}
	return enums.DnsDomainVisibility(0)
}

func (x *DnsDomain) GetDnsRecords() []*rpc.DnsRecord {
	if x != nil {
		return x.DnsRecords
	}
	return nil
}

var File_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto protoreflect.FileDescriptor

var file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_rawDesc = []byte{
	0x0a, 0x3b, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x31, 0x2f, 0x6e, 0x65, 0x74, 0x77, 0x6f,
	0x72, 0x6b, 0x2f, 0x64, 0x6e, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f, 0x72, 0x70,
	0x63, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x2f, 0x6c,
	0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e,
	0x64, 0x6e, 0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2e, 0x72, 0x70, 0x63, 0x1a, 0x3b,
	0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2f,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x31, 0x2f, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b,
	0x2f, 0x64, 0x6e, 0x73, 0x2f, 0x72, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x2f, 0x72, 0x70, 0x63, 0x2f,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x41, 0x6c, 0x65, 0x66,
	0x74, 0x62, 0x69, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2f, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2f, 0x76, 0x31, 0x2f, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2f, 0x64, 0x6e,
	0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f, 0x72, 0x70, 0x63, 0x2f, 0x65, 0x6e, 0x75,
	0x6d, 0x73, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xf5,
	0x01, 0x0a, 0x09, 0x44, 0x6e, 0x73, 0x44, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x12, 0x1f, 0x0a, 0x0b,
	0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0a, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x6a, 0x0a,
	0x0a, 0x76, 0x69, 0x73, 0x69, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x0e, 0x32, 0x4a, 0x2e, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x6e, 0x65, 0x74,
	0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x64, 0x6e, 0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2e,
	0x72, 0x70, 0x63, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x44, 0x6e, 0x73, 0x44, 0x6f, 0x6d,
	0x61, 0x69, 0x6e, 0x56, 0x69, 0x73, 0x69, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x52, 0x0a, 0x76,
	0x69, 0x73, 0x69, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x12, 0x5b, 0x0a, 0x0b, 0x64, 0x6e, 0x73,
	0x5f, 0x72, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x73, 0x18, 0x03, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x3a,
	0x2e, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72,
	0x6b, 0x2e, 0x64, 0x6e, 0x73, 0x2e, 0x72, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x2e, 0x72, 0x70, 0x63,
	0x2e, 0x44, 0x6e, 0x73, 0x52, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x52, 0x0a, 0x64, 0x6e, 0x73, 0x52,
	0x65, 0x63, 0x6f, 0x72, 0x64, 0x73, 0x42, 0x80, 0x03, 0x0a, 0x33, 0x63, 0x6f, 0x6d, 0x2e, 0x6c,
	0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e,
	0x64, 0x6e, 0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2e, 0x72, 0x70, 0x63, 0x42, 0x0a,
	0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x55, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e,
	0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2d, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2f, 0x7a,
	0x7a, 0x67, 0x6f, 0x2f, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x31, 0x2f, 0x6e, 0x65, 0x74,
	0x77, 0x6f, 0x72, 0x6b, 0x2f, 0x64, 0x6e, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f,
	0x72, 0x70, 0x63, 0xa2, 0x02, 0x08, 0x4c, 0x43, 0x50, 0x56, 0x4e, 0x44, 0x44, 0x52, 0xaa, 0x02,
	0x2f, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73,
	0x2e, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x56, 0x31, 0x2e, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72,
	0x6b, 0x2e, 0x44, 0x6e, 0x73, 0x2e, 0x44, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2e, 0x52, 0x70, 0x63,
	0xca, 0x02, 0x2f, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x5c, 0x43, 0x6f, 0x6d, 0x6d, 0x6f,
	0x6e, 0x73, 0x5c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5c, 0x56, 0x31, 0x5c, 0x4e, 0x65, 0x74, 0x77,
	0x6f, 0x72, 0x6b, 0x5c, 0x44, 0x6e, 0x73, 0x5c, 0x44, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x5c, 0x52,
	0x70, 0x63, 0xe2, 0x02, 0x3b, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x5c, 0x43, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x73, 0x5c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5c, 0x56, 0x31, 0x5c, 0x4e, 0x65,
	0x74, 0x77, 0x6f, 0x72, 0x6b, 0x5c, 0x44, 0x6e, 0x73, 0x5c, 0x44, 0x6f, 0x6d, 0x61, 0x69, 0x6e,
	0x5c, 0x52, 0x70, 0x63, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61,
	0xea, 0x02, 0x36, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x3a, 0x3a, 0x43, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0x73, 0x3a, 0x3a, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x3a, 0x3a, 0x56, 0x31, 0x3a, 0x3a,
	0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x3a, 0x3a, 0x44, 0x6e, 0x73, 0x3a, 0x3a, 0x44, 0x6f,
	0x6d, 0x61, 0x69, 0x6e, 0x3a, 0x3a, 0x52, 0x70, 0x63, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_rawDescOnce sync.Once
	file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_rawDescData = file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_rawDesc
)

func file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_rawDescGZIP() []byte {
	file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_rawDescOnce.Do(func() {
		file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_rawDescData = protoimpl.X.CompressGZIP(file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_rawDescData)
	})
	return file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_rawDescData
}

var file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_goTypes = []interface{}{
	(*DnsDomain)(nil),              // 0: leftbin.commons.proto.v1.network.dns.domain.rpc.DnsDomain
	(enums.DnsDomainVisibility)(0), // 1: leftbin.commons.proto.v1.network.dns.domain.rpc.enums.DnsDomainVisibility
	(*rpc.DnsRecord)(nil),          // 2: leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord
}
var file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_depIdxs = []int32{
	1, // 0: leftbin.commons.proto.v1.network.dns.domain.rpc.DnsDomain.visibility:type_name -> leftbin.commons.proto.v1.network.dns.domain.rpc.enums.DnsDomainVisibility
	2, // 1: leftbin.commons.proto.v1.network.dns.domain.rpc.DnsDomain.dns_records:type_name -> leftbin.commons.proto.v1.network.dns.record.rpc.DnsRecord
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_init() }
func file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_init() {
	if File_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DnsDomain); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_goTypes,
		DependencyIndexes: file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_depIdxs,
		MessageInfos:      file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_msgTypes,
	}.Build()
	File_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto = out.File
	file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_rawDesc = nil
	file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_goTypes = nil
	file_leftbin_commons_proto_v1_network_dns_domain_rpc_model_proto_depIdxs = nil
}
