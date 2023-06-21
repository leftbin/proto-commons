// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        (unknown)
// source: leftbin/commons/proto/v1/network/dns/record/rpc/enums/enums.proto

package enums

import (
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

// dns record type
// the recommended best practice to prefix the entry with enum name has been intentionally ignored to ensure that the enum's value matches the dns record type.
type DnsRecordType int32

const (
	DnsRecordType_DNS_RECORD_TYPE_UNSPECIFIED DnsRecordType = 0
	// host address
	DnsRecordType_A DnsRecordType = 1
	// ipv6 host address
	DnsRecordType_AAAA DnsRecordType = 2
	// auto resolved alias
	DnsRecordType_ALIAS DnsRecordType = 3
	// canonical name for an alias
	DnsRecordType_CNAME DnsRecordType = 4
	// mail exchange
	DnsRecordType_MX DnsRecordType = 5
	// name server
	DnsRecordType_NS DnsRecordType = 6
	// pointer
	DnsRecordType_PTR DnsRecordType = 7
	// start of authority
	DnsRecordType_SOA DnsRecordType = 8
	// location of service
	DnsRecordType_SRV DnsRecordType = 9
	// descriptive text
	DnsRecordType_TXT DnsRecordType = 10
)

// Enum value maps for DnsRecordType.
var (
	DnsRecordType_name = map[int32]string{
		0:  "DNS_RECORD_TYPE_UNSPECIFIED",
		1:  "A",
		2:  "AAAA",
		3:  "ALIAS",
		4:  "CNAME",
		5:  "MX",
		6:  "NS",
		7:  "PTR",
		8:  "SOA",
		9:  "SRV",
		10: "TXT",
	}
	DnsRecordType_value = map[string]int32{
		"DNS_RECORD_TYPE_UNSPECIFIED": 0,
		"A":                           1,
		"AAAA":                        2,
		"ALIAS":                       3,
		"CNAME":                       4,
		"MX":                          5,
		"NS":                          6,
		"PTR":                         7,
		"SOA":                         8,
		"SRV":                         9,
		"TXT":                         10,
	}
)

func (x DnsRecordType) Enum() *DnsRecordType {
	p := new(DnsRecordType)
	*p = x
	return p
}

func (x DnsRecordType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (DnsRecordType) Descriptor() protoreflect.EnumDescriptor {
	return file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_enumTypes[0].Descriptor()
}

func (DnsRecordType) Type() protoreflect.EnumType {
	return &file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_enumTypes[0]
}

func (x DnsRecordType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use DnsRecordType.Descriptor instead.
func (DnsRecordType) EnumDescriptor() ([]byte, []int) {
	return file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_rawDescGZIP(), []int{0}
}

var File_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto protoreflect.FileDescriptor

var file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_rawDesc = []byte{
	0x0a, 0x41, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x31, 0x2f, 0x6e, 0x65, 0x74, 0x77, 0x6f,
	0x72, 0x6b, 0x2f, 0x64, 0x6e, 0x73, 0x2f, 0x72, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x2f, 0x72, 0x70,
	0x63, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x35, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x6e, 0x65,
	0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x64, 0x6e, 0x73, 0x2e, 0x72, 0x65, 0x63, 0x6f, 0x72, 0x64,
	0x2e, 0x72, 0x70, 0x63, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2a, 0x8b, 0x01, 0x0a, 0x0d, 0x44,
	0x6e, 0x73, 0x52, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1f, 0x0a, 0x1b,
	0x44, 0x4e, 0x53, 0x5f, 0x52, 0x45, 0x43, 0x4f, 0x52, 0x44, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f,
	0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x05, 0x0a,
	0x01, 0x41, 0x10, 0x01, 0x12, 0x08, 0x0a, 0x04, 0x41, 0x41, 0x41, 0x41, 0x10, 0x02, 0x12, 0x09,
	0x0a, 0x05, 0x41, 0x4c, 0x49, 0x41, 0x53, 0x10, 0x03, 0x12, 0x09, 0x0a, 0x05, 0x43, 0x4e, 0x41,
	0x4d, 0x45, 0x10, 0x04, 0x12, 0x06, 0x0a, 0x02, 0x4d, 0x58, 0x10, 0x05, 0x12, 0x06, 0x0a, 0x02,
	0x4e, 0x53, 0x10, 0x06, 0x12, 0x07, 0x0a, 0x03, 0x50, 0x54, 0x52, 0x10, 0x07, 0x12, 0x07, 0x0a,
	0x03, 0x53, 0x4f, 0x41, 0x10, 0x08, 0x12, 0x07, 0x0a, 0x03, 0x53, 0x52, 0x56, 0x10, 0x09, 0x12,
	0x07, 0x0a, 0x03, 0x54, 0x58, 0x54, 0x10, 0x0a, 0x42, 0xa6, 0x03, 0x0a, 0x39, 0x63, 0x6f, 0x6d,
	0x2e, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72,
	0x6b, 0x2e, 0x64, 0x6e, 0x73, 0x2e, 0x72, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x2e, 0x72, 0x70, 0x63,
	0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x42, 0x0a, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0x50, 0x72, 0x6f,
	0x74, 0x6f, 0x50, 0x01, 0x5a, 0x5b, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2d, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2f, 0x7a, 0x7a, 0x67, 0x6f, 0x2f, 0x6c, 0x65, 0x66, 0x74,
	0x62, 0x69, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2f, 0x76, 0x31, 0x2f, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2f, 0x64, 0x6e, 0x73,
	0x2f, 0x72, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x2f, 0x72, 0x70, 0x63, 0x2f, 0x65, 0x6e, 0x75, 0x6d,
	0x73, 0xa2, 0x02, 0x09, 0x4c, 0x43, 0x50, 0x56, 0x4e, 0x44, 0x52, 0x52, 0x45, 0xaa, 0x02, 0x35,
	0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x56, 0x31, 0x2e, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b,
	0x2e, 0x44, 0x6e, 0x73, 0x2e, 0x52, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x2e, 0x52, 0x70, 0x63, 0x2e,
	0x45, 0x6e, 0x75, 0x6d, 0x73, 0xca, 0x02, 0x35, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x5c,
	0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x5c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5c, 0x56, 0x31,
	0x5c, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x5c, 0x44, 0x6e, 0x73, 0x5c, 0x52, 0x65, 0x63,
	0x6f, 0x72, 0x64, 0x5c, 0x52, 0x70, 0x63, 0x5c, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0xe2, 0x02, 0x41,
	0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x5c, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x5c,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5c, 0x56, 0x31, 0x5c, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b,
	0x5c, 0x44, 0x6e, 0x73, 0x5c, 0x52, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x5c, 0x52, 0x70, 0x63, 0x5c,
	0x45, 0x6e, 0x75, 0x6d, 0x73, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74,
	0x61, 0xea, 0x02, 0x3d, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x3a, 0x3a, 0x43, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x73, 0x3a, 0x3a, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x3a, 0x3a, 0x56, 0x31, 0x3a,
	0x3a, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x3a, 0x3a, 0x44, 0x6e, 0x73, 0x3a, 0x3a, 0x52,
	0x65, 0x63, 0x6f, 0x72, 0x64, 0x3a, 0x3a, 0x52, 0x70, 0x63, 0x3a, 0x3a, 0x45, 0x6e, 0x75, 0x6d,
	0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_rawDescOnce sync.Once
	file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_rawDescData = file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_rawDesc
)

func file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_rawDescGZIP() []byte {
	file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_rawDescOnce.Do(func() {
		file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_rawDescData = protoimpl.X.CompressGZIP(file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_rawDescData)
	})
	return file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_rawDescData
}

var file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_goTypes = []interface{}{
	(DnsRecordType)(0), // 0: leftbin.commons.proto.v1.network.dns.record.rpc.enums.DnsRecordType
}
var file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_init() }
func file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_init() {
	if File_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_goTypes,
		DependencyIndexes: file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_depIdxs,
		EnumInfos:         file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_enumTypes,
	}.Build()
	File_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto = out.File
	file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_rawDesc = nil
	file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_goTypes = nil
	file_leftbin_commons_proto_v1_network_dns_record_rpc_enums_enums_proto_depIdxs = nil
}
