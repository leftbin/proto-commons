// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        (unknown)
// source: leftbin/commons/proto/v1/authz/extensions/extensions.proto

package extensions

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	descriptorpb "google.golang.org/protobuf/types/descriptorpb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// authorization config message to check before executing rpc
type AuthorizationConfig struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// permission required to run the service
	Permission string `protobuf:"bytes,1,opt,name=permission,proto3" json:"permission,omitempty"`
	// type of the resource that the permission should be granted
	ResourceType string `protobuf:"bytes,2,opt,name=resource_type,json=resourceType,proto3" json:"resource_type,omitempty"`
	// error message to be returned when the permission is not granted to user
	ErrorMsg string `protobuf:"bytes,3,opt,name=error_msg,json=errorMsg,proto3" json:"error_msg,omitempty"`
}

func (x *AuthorizationConfig) Reset() {
	*x = AuthorizationConfig{}
	if protoimpl.UnsafeEnabled {
		mi := &file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AuthorizationConfig) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AuthorizationConfig) ProtoMessage() {}

func (x *AuthorizationConfig) ProtoReflect() protoreflect.Message {
	mi := &file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AuthorizationConfig.ProtoReflect.Descriptor instead.
func (*AuthorizationConfig) Descriptor() ([]byte, []int) {
	return file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_rawDescGZIP(), []int{0}
}

func (x *AuthorizationConfig) GetPermission() string {
	if x != nil {
		return x.Permission
	}
	return ""
}

func (x *AuthorizationConfig) GetResourceType() string {
	if x != nil {
		return x.ResourceType
	}
	return ""
}

func (x *AuthorizationConfig) GetErrorMsg() string {
	if x != nil {
		return x.ErrorMsg
	}
	return ""
}

var file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_extTypes = []protoimpl.ExtensionInfo{
	{
		ExtendedType:  (*descriptorpb.MethodOptions)(nil),
		ExtensionType: (*AuthorizationConfig)(nil),
		Field:         50056,
		Name:          "leftbin.commons.proto.v1.authz.extensions.authorization_config",
		Tag:           "bytes,50056,opt,name=authorization_config",
		Filename:      "leftbin/commons/proto/v1/authz/extensions/extensions.proto",
	},
	{
		ExtendedType:  (*descriptorpb.MethodOptions)(nil),
		ExtensionType: (*bool)(nil),
		Field:         50057,
		Name:          "leftbin.commons.proto.v1.authz.extensions.is_public",
		Tag:           "varint,50057,opt,name=is_public",
		Filename:      "leftbin/commons/proto/v1/authz/extensions/extensions.proto",
	},
}

// Extension fields to descriptorpb.MethodOptions.
var (
	// optional leftbin.commons.proto.v1.authz.extensions.AuthorizationConfig authorization_config = 50056;
	E_AuthorizationConfig = &file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_extTypes[0]
	// optional bool is_public = 50057;
	E_IsPublic = &file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_extTypes[1]
)

var File_leftbin_commons_proto_v1_authz_extensions_extensions_proto protoreflect.FileDescriptor

var file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_rawDesc = []byte{
	0x0a, 0x3a, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x31, 0x2f, 0x61, 0x75, 0x74, 0x68, 0x7a,
	0x2f, 0x65, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x65, 0x78, 0x74, 0x65,
	0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x29, 0x6c, 0x65,
	0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x61, 0x75, 0x74, 0x68, 0x7a, 0x2e, 0x65, 0x78, 0x74,
	0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x1a, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70,
	0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x77, 0x0a, 0x13, 0x41, 0x75, 0x74,
	0x68, 0x6f, 0x72, 0x69, 0x7a, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67,
	0x12, 0x1e, 0x0a, 0x0a, 0x70, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x70, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e,
	0x12, 0x23, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x74, 0x79, 0x70,
	0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1b, 0x0a, 0x09, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x5f, 0x6d,
	0x73, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x4d,
	0x73, 0x67, 0x3a, 0x93, 0x01, 0x0a, 0x14, 0x61, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x69, 0x7a, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x12, 0x1e, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x4d, 0x65,
	0x74, 0x68, 0x6f, 0x64, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0x88, 0x87, 0x03, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x3e, 0x2e, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x61,
	0x75, 0x74, 0x68, 0x7a, 0x2e, 0x65, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x2e,
	0x41, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x69, 0x7a, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f, 0x6e,
	0x66, 0x69, 0x67, 0x52, 0x13, 0x61, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x69, 0x7a, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x3a, 0x3d, 0x0a, 0x09, 0x69, 0x73, 0x5f, 0x70,
	0x75, 0x62, 0x6c, 0x69, 0x63, 0x12, 0x1e, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x4d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x4f, 0x70,
	0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0x89, 0x87, 0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x08, 0x69,
	0x73, 0x50, 0x75, 0x62, 0x6c, 0x69, 0x63, 0x42, 0xe2, 0x02, 0x0a, 0x2d, 0x63, 0x6f, 0x6d, 0x2e,
	0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x61, 0x75, 0x74, 0x68, 0x7a, 0x2e, 0x65,
	0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x42, 0x0f, 0x45, 0x78, 0x74, 0x65, 0x6e,
	0x73, 0x69, 0x6f, 0x6e, 0x73, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x54, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x70, 0x6c, 0x61, 0x6e, 0x74, 0x6f, 0x6e,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2d, 0x63, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0x73, 0x2f, 0x7a, 0x7a, 0x67, 0x6f, 0x2f, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e,
	0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76,
	0x31, 0x2f, 0x61, 0x75, 0x74, 0x68, 0x7a, 0x2f, 0x65, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f,
	0x6e, 0x73, 0xa2, 0x02, 0x06, 0x4c, 0x43, 0x50, 0x56, 0x41, 0x45, 0xaa, 0x02, 0x29, 0x4c, 0x65,
	0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x50, 0x72,
	0x6f, 0x74, 0x6f, 0x2e, 0x56, 0x31, 0x2e, 0x41, 0x75, 0x74, 0x68, 0x7a, 0x2e, 0x45, 0x78, 0x74,
	0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0xca, 0x02, 0x29, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69,
	0x6e, 0x5c, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x5c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5c,
	0x56, 0x31, 0x5c, 0x41, 0x75, 0x74, 0x68, 0x7a, 0x5c, 0x45, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69,
	0x6f, 0x6e, 0x73, 0xe2, 0x02, 0x35, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x5c, 0x43, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x5c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5c, 0x56, 0x31, 0x5c, 0x41,
	0x75, 0x74, 0x68, 0x7a, 0x5c, 0x45, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x5c,
	0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x2e, 0x4c, 0x65,
	0x66, 0x74, 0x62, 0x69, 0x6e, 0x3a, 0x3a, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x3a, 0x3a,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x3a, 0x3a, 0x56, 0x31, 0x3a, 0x3a, 0x41, 0x75, 0x74, 0x68, 0x7a,
	0x3a, 0x3a, 0x45, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_rawDescOnce sync.Once
	file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_rawDescData = file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_rawDesc
)

func file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_rawDescGZIP() []byte {
	file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_rawDescOnce.Do(func() {
		file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_rawDescData = protoimpl.X.CompressGZIP(file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_rawDescData)
	})
	return file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_rawDescData
}

var file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_goTypes = []interface{}{
	(*AuthorizationConfig)(nil),        // 0: leftbin.commons.proto.v1.authz.extensions.AuthorizationConfig
	(*descriptorpb.MethodOptions)(nil), // 1: google.protobuf.MethodOptions
}
var file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_depIdxs = []int32{
	1, // 0: leftbin.commons.proto.v1.authz.extensions.authorization_config:extendee -> google.protobuf.MethodOptions
	1, // 1: leftbin.commons.proto.v1.authz.extensions.is_public:extendee -> google.protobuf.MethodOptions
	0, // 2: leftbin.commons.proto.v1.authz.extensions.authorization_config:type_name -> leftbin.commons.proto.v1.authz.extensions.AuthorizationConfig
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	2, // [2:3] is the sub-list for extension type_name
	0, // [0:2] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_init() }
func file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_init() {
	if File_leftbin_commons_proto_v1_authz_extensions_extensions_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AuthorizationConfig); i {
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
			RawDescriptor: file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 2,
			NumServices:   0,
		},
		GoTypes:           file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_goTypes,
		DependencyIndexes: file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_depIdxs,
		MessageInfos:      file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_msgTypes,
		ExtensionInfos:    file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_extTypes,
	}.Build()
	File_leftbin_commons_proto_v1_authz_extensions_extensions_proto = out.File
	file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_rawDesc = nil
	file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_goTypes = nil
	file_leftbin_commons_proto_v1_authz_extensions_extensions_proto_depIdxs = nil
}
