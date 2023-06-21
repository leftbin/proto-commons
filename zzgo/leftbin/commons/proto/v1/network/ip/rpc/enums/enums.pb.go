// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        (unknown)
// source: leftbin/commons/proto/v1/network/ip/rpc/enums/enums.proto

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

type IpAddressVisibility int32

const (
	IpAddressVisibility_IP_ADDRESS_VISIBILITY_UNSPECIFIED IpAddressVisibility = 0
	IpAddressVisibility_IP_ADDRESS_VISIBILITY_INTERNAL    IpAddressVisibility = 1
	IpAddressVisibility_IP_ADDRESS_VISIBILITY_EXTERNAL    IpAddressVisibility = 2
)

// Enum value maps for IpAddressVisibility.
var (
	IpAddressVisibility_name = map[int32]string{
		0: "IP_ADDRESS_VISIBILITY_UNSPECIFIED",
		1: "IP_ADDRESS_VISIBILITY_INTERNAL",
		2: "IP_ADDRESS_VISIBILITY_EXTERNAL",
	}
	IpAddressVisibility_value = map[string]int32{
		"IP_ADDRESS_VISIBILITY_UNSPECIFIED": 0,
		"IP_ADDRESS_VISIBILITY_INTERNAL":    1,
		"IP_ADDRESS_VISIBILITY_EXTERNAL":    2,
	}
)

func (x IpAddressVisibility) Enum() *IpAddressVisibility {
	p := new(IpAddressVisibility)
	*p = x
	return p
}

func (x IpAddressVisibility) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (IpAddressVisibility) Descriptor() protoreflect.EnumDescriptor {
	return file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_enumTypes[0].Descriptor()
}

func (IpAddressVisibility) Type() protoreflect.EnumType {
	return &file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_enumTypes[0]
}

func (x IpAddressVisibility) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use IpAddressVisibility.Descriptor instead.
func (IpAddressVisibility) EnumDescriptor() ([]byte, []int) {
	return file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_rawDescGZIP(), []int{0}
}

var File_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto protoreflect.FileDescriptor

var file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_rawDesc = []byte{
	0x0a, 0x39, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x31, 0x2f, 0x6e, 0x65, 0x74, 0x77, 0x6f,
	0x72, 0x6b, 0x2f, 0x69, 0x70, 0x2f, 0x72, 0x70, 0x63, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f,
	0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x2d, 0x6c, 0x65, 0x66,
	0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x69, 0x70,
	0x2e, 0x72, 0x70, 0x63, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2a, 0x84, 0x01, 0x0a, 0x13, 0x49,
	0x70, 0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x56, 0x69, 0x73, 0x69, 0x62, 0x69, 0x6c, 0x69,
	0x74, 0x79, 0x12, 0x25, 0x0a, 0x21, 0x49, 0x50, 0x5f, 0x41, 0x44, 0x44, 0x52, 0x45, 0x53, 0x53,
	0x5f, 0x56, 0x49, 0x53, 0x49, 0x42, 0x49, 0x4c, 0x49, 0x54, 0x59, 0x5f, 0x55, 0x4e, 0x53, 0x50,
	0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x22, 0x0a, 0x1e, 0x49, 0x50, 0x5f,
	0x41, 0x44, 0x44, 0x52, 0x45, 0x53, 0x53, 0x5f, 0x56, 0x49, 0x53, 0x49, 0x42, 0x49, 0x4c, 0x49,
	0x54, 0x59, 0x5f, 0x49, 0x4e, 0x54, 0x45, 0x52, 0x4e, 0x41, 0x4c, 0x10, 0x01, 0x12, 0x22, 0x0a,
	0x1e, 0x49, 0x50, 0x5f, 0x41, 0x44, 0x44, 0x52, 0x45, 0x53, 0x53, 0x5f, 0x56, 0x49, 0x53, 0x49,
	0x42, 0x49, 0x4c, 0x49, 0x54, 0x59, 0x5f, 0x45, 0x58, 0x54, 0x45, 0x52, 0x4e, 0x41, 0x4c, 0x10,
	0x02, 0x42, 0xf4, 0x02, 0x0a, 0x31, 0x63, 0x6f, 0x6d, 0x2e, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69,
	0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e,
	0x76, 0x31, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x69, 0x70, 0x2e, 0x72, 0x70,
	0x63, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x42, 0x0a, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0x50, 0x72,
	0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x53, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2d,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2f, 0x7a, 0x7a, 0x67, 0x6f, 0x2f, 0x6c, 0x65, 0x66,
	0x74, 0x62, 0x69, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2f, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2f, 0x76, 0x31, 0x2f, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2f, 0x69, 0x70,
	0x2f, 0x72, 0x70, 0x63, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0xa2, 0x02, 0x08, 0x4c, 0x43, 0x50,
	0x56, 0x4e, 0x49, 0x52, 0x45, 0xaa, 0x02, 0x2d, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e,
	0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x56, 0x31,
	0x2e, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x49, 0x70, 0x2e, 0x52, 0x70, 0x63, 0x2e,
	0x45, 0x6e, 0x75, 0x6d, 0x73, 0xca, 0x02, 0x2d, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x5c,
	0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x5c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5c, 0x56, 0x31,
	0x5c, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x5c, 0x49, 0x70, 0x5c, 0x52, 0x70, 0x63, 0x5c,
	0x45, 0x6e, 0x75, 0x6d, 0x73, 0xe2, 0x02, 0x39, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x5c,
	0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x5c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5c, 0x56, 0x31,
	0x5c, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x5c, 0x49, 0x70, 0x5c, 0x52, 0x70, 0x63, 0x5c,
	0x45, 0x6e, 0x75, 0x6d, 0x73, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74,
	0x61, 0xea, 0x02, 0x34, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x3a, 0x3a, 0x43, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x73, 0x3a, 0x3a, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x3a, 0x3a, 0x56, 0x31, 0x3a,
	0x3a, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x3a, 0x3a, 0x49, 0x70, 0x3a, 0x3a, 0x52, 0x70,
	0x63, 0x3a, 0x3a, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_rawDescOnce sync.Once
	file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_rawDescData = file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_rawDesc
)

func file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_rawDescGZIP() []byte {
	file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_rawDescOnce.Do(func() {
		file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_rawDescData = protoimpl.X.CompressGZIP(file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_rawDescData)
	})
	return file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_rawDescData
}

var file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_goTypes = []interface{}{
	(IpAddressVisibility)(0), // 0: leftbin.commons.proto.v1.network.ip.rpc.enums.IpAddressVisibility
}
var file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_init() }
func file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_init() {
	if File_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_goTypes,
		DependencyIndexes: file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_depIdxs,
		EnumInfos:         file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_enumTypes,
	}.Build()
	File_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto = out.File
	file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_rawDesc = nil
	file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_goTypes = nil
	file_leftbin_commons_proto_v1_network_ip_rpc_enums_enums_proto_depIdxs = nil
}
