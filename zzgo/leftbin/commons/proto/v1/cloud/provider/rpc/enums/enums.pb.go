// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        (unknown)
// source: leftbin/commons/proto/v1/cloud/provider/rpc/enums/enums.proto

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

// cloud provider type
// the recommended best practice to prefix the entry with enum name and using uppercase for entry names has been intentionally ignored as the values of entry names are used for naming resources.
type CloudProviderName int32

const (
	// default value when cloud provider name is not set
	CloudProviderName_CLOUD_PROVIDER_NAME_UNSPECIFIED CloudProviderName = 0
	// amazon web services cloud provider
	CloudProviderName_aws CloudProviderName = 1
	// google cloud platform cloud provider
	CloudProviderName_gcp CloudProviderName = 2
	// microsoft azure cloud provider
	CloudProviderName_azure CloudProviderName = 3
	// alibaba cloud provider
	CloudProviderName_alibaba CloudProviderName = 4
	// oracle cloud provider
	CloudProviderName_oracle CloudProviderName = 5
)

// Enum value maps for CloudProviderName.
var (
	CloudProviderName_name = map[int32]string{
		0: "CLOUD_PROVIDER_NAME_UNSPECIFIED",
		1: "aws",
		2: "gcp",
		3: "azure",
		4: "alibaba",
		5: "oracle",
	}
	CloudProviderName_value = map[string]int32{
		"CLOUD_PROVIDER_NAME_UNSPECIFIED": 0,
		"aws":                             1,
		"gcp":                             2,
		"azure":                           3,
		"alibaba":                         4,
		"oracle":                          5,
	}
)

func (x CloudProviderName) Enum() *CloudProviderName {
	p := new(CloudProviderName)
	*p = x
	return p
}

func (x CloudProviderName) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (CloudProviderName) Descriptor() protoreflect.EnumDescriptor {
	return file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_enumTypes[0].Descriptor()
}

func (CloudProviderName) Type() protoreflect.EnumType {
	return &file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_enumTypes[0]
}

func (x CloudProviderName) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use CloudProviderName.Descriptor instead.
func (CloudProviderName) EnumDescriptor() ([]byte, []int) {
	return file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_rawDescGZIP(), []int{0}
}

var File_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto protoreflect.FileDescriptor

var file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_rawDesc = []byte{
	0x0a, 0x3d, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x31, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64,
	0x2f, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2f, 0x72, 0x70, 0x63, 0x2f, 0x65, 0x6e,
	0x75, 0x6d, 0x73, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x31, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e,
	0x70, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2e, 0x72, 0x70, 0x63, 0x2e, 0x65, 0x6e, 0x75,
	0x6d, 0x73, 0x2a, 0x6e, 0x0a, 0x11, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x50, 0x72, 0x6f, 0x76, 0x69,
	0x64, 0x65, 0x72, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x23, 0x0a, 0x1f, 0x43, 0x4c, 0x4f, 0x55, 0x44,
	0x5f, 0x50, 0x52, 0x4f, 0x56, 0x49, 0x44, 0x45, 0x52, 0x5f, 0x4e, 0x41, 0x4d, 0x45, 0x5f, 0x55,
	0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x07, 0x0a, 0x03,
	0x61, 0x77, 0x73, 0x10, 0x01, 0x12, 0x07, 0x0a, 0x03, 0x67, 0x63, 0x70, 0x10, 0x02, 0x12, 0x09,
	0x0a, 0x05, 0x61, 0x7a, 0x75, 0x72, 0x65, 0x10, 0x03, 0x12, 0x0b, 0x0a, 0x07, 0x61, 0x6c, 0x69,
	0x62, 0x61, 0x62, 0x61, 0x10, 0x04, 0x12, 0x0a, 0x0a, 0x06, 0x6f, 0x72, 0x61, 0x63, 0x6c, 0x65,
	0x10, 0x05, 0x42, 0x91, 0x03, 0x0a, 0x35, 0x63, 0x6f, 0x6d, 0x2e, 0x6c, 0x65, 0x66, 0x74, 0x62,
	0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2e, 0x76, 0x31, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x64,
	0x65, 0x72, 0x2e, 0x72, 0x70, 0x63, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x42, 0x0a, 0x45, 0x6e,
	0x75, 0x6d, 0x73, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x5c, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x70, 0x6c, 0x61, 0x6e, 0x74, 0x6f, 0x6e, 0x63, 0x6c,
	0x6f, 0x75, 0x64, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2d, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x73, 0x2f, 0x7a, 0x7a, 0x67, 0x6f, 0x2f, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2f, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x31, 0x2f,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2f, 0x72,
	0x70, 0x63, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0xa2, 0x02, 0x08, 0x4c, 0x43, 0x50, 0x56, 0x43,
	0x50, 0x52, 0x45, 0xaa, 0x02, 0x31, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x43, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x56, 0x31, 0x2e, 0x43,
	0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x50, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2e, 0x52, 0x70,
	0x63, 0x2e, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0xca, 0x02, 0x31, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69,
	0x6e, 0x5c, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x5c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5c,
	0x56, 0x31, 0x5c, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x5c, 0x50, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65,
	0x72, 0x5c, 0x52, 0x70, 0x63, 0x5c, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0xe2, 0x02, 0x3d, 0x4c, 0x65,
	0x66, 0x74, 0x62, 0x69, 0x6e, 0x5c, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x5c, 0x50, 0x72,
	0x6f, 0x74, 0x6f, 0x5c, 0x56, 0x31, 0x5c, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x5c, 0x50, 0x72, 0x6f,
	0x76, 0x69, 0x64, 0x65, 0x72, 0x5c, 0x52, 0x70, 0x63, 0x5c, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0x5c,
	0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x38, 0x4c, 0x65,
	0x66, 0x74, 0x62, 0x69, 0x6e, 0x3a, 0x3a, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x3a, 0x3a,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x3a, 0x3a, 0x56, 0x31, 0x3a, 0x3a, 0x43, 0x6c, 0x6f, 0x75, 0x64,
	0x3a, 0x3a, 0x50, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x3a, 0x3a, 0x52, 0x70, 0x63, 0x3a,
	0x3a, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_rawDescOnce sync.Once
	file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_rawDescData = file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_rawDesc
)

func file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_rawDescGZIP() []byte {
	file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_rawDescOnce.Do(func() {
		file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_rawDescData = protoimpl.X.CompressGZIP(file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_rawDescData)
	})
	return file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_rawDescData
}

var file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_goTypes = []interface{}{
	(CloudProviderName)(0), // 0: leftbin.commons.proto.v1.cloud.provider.rpc.enums.CloudProviderName
}
var file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_init() }
func file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_init() {
	if File_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_goTypes,
		DependencyIndexes: file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_depIdxs,
		EnumInfos:         file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_enumTypes,
	}.Build()
	File_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto = out.File
	file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_rawDesc = nil
	file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_goTypes = nil
	file_leftbin_commons_proto_v1_cloud_provider_rpc_enums_enums_proto_depIdxs = nil
}
