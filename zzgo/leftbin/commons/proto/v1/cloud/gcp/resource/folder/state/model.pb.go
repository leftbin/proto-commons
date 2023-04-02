// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        (unknown)
// source: leftbin/commons/proto/v1/cloud/gcp/resource/folder/state/model.proto

package state

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

// gcp folder state
type GcpFolderState struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// id of the gcp project.
	// ex: 498520640386.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// display name for the folder.
	// (important) a two character suffix starting with a hyphen is added at the end of the
	// display name to allow recreating folders with same resource identifier on planton cloud.
	DisplayName string `protobuf:"bytes,2,opt,name=display_name,json=displayName,proto3" json:"display_name,omitempty"`
	// parent of the folder.
	// parent can be either a gcp organization or another gcp folder.
	Parent string `protobuf:"bytes,3,opt,name=parent,proto3" json:"parent,omitempty"`
}

func (x *GcpFolderState) Reset() {
	*x = GcpFolderState{}
	if protoimpl.UnsafeEnabled {
		mi := &file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GcpFolderState) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GcpFolderState) ProtoMessage() {}

func (x *GcpFolderState) ProtoReflect() protoreflect.Message {
	mi := &file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GcpFolderState.ProtoReflect.Descriptor instead.
func (*GcpFolderState) Descriptor() ([]byte, []int) {
	return file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_rawDescGZIP(), []int{0}
}

func (x *GcpFolderState) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *GcpFolderState) GetDisplayName() string {
	if x != nil {
		return x.DisplayName
	}
	return ""
}

func (x *GcpFolderState) GetParent() string {
	if x != nil {
		return x.Parent
	}
	return ""
}

var File_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto protoreflect.FileDescriptor

var file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_rawDesc = []byte{
	0x0a, 0x44, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x31, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64,
	0x2f, 0x67, 0x63, 0x70, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2f, 0x66, 0x6f,
	0x6c, 0x64, 0x65, 0x72, 0x2f, 0x73, 0x74, 0x61, 0x74, 0x65, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x38, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31,
	0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x67, 0x63, 0x70, 0x2e, 0x72, 0x65, 0x73, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x2e, 0x66, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x2e, 0x73, 0x74, 0x61, 0x74, 0x65,
	0x22, 0x5b, 0x0a, 0x0e, 0x47, 0x63, 0x70, 0x46, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x53, 0x74, 0x61,
	0x74, 0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02,
	0x69, 0x64, 0x12, 0x21, 0x0a, 0x0c, 0x64, 0x69, 0x73, 0x70, 0x6c, 0x61, 0x79, 0x5f, 0x6e, 0x61,
	0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x64, 0x69, 0x73, 0x70, 0x6c, 0x61,
	0x79, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x42, 0xbd, 0x03,
	0x0a, 0x3c, 0x63, 0x6f, 0x6d, 0x2e, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x67, 0x63, 0x70, 0x2e, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x2e, 0x66, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x2e, 0x73, 0x74, 0x61, 0x74, 0x65, 0x42, 0x0a,
	0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x63, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x70, 0x6c, 0x61, 0x6e, 0x74, 0x6f, 0x6e,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2d, 0x63, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0x73, 0x2f, 0x7a, 0x7a, 0x67, 0x6f, 0x2f, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e,
	0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76,
	0x31, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x67, 0x63, 0x70, 0x2f, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x2f, 0x66, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x2f, 0x73, 0x74, 0x61, 0x74,
	0x65, 0xa2, 0x02, 0x09, 0x4c, 0x43, 0x50, 0x56, 0x43, 0x47, 0x52, 0x46, 0x53, 0xaa, 0x02, 0x38,
	0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x56, 0x31, 0x2e, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x47,
	0x63, 0x70, 0x2e, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x46, 0x6f, 0x6c, 0x64,
	0x65, 0x72, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x65, 0xca, 0x02, 0x38, 0x4c, 0x65, 0x66, 0x74, 0x62,
	0x69, 0x6e, 0x5c, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x5c, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x5c, 0x56, 0x31, 0x5c, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x5c, 0x47, 0x63, 0x70, 0x5c, 0x52, 0x65,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5c, 0x46, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x5c, 0x53, 0x74,
	0x61, 0x74, 0x65, 0xe2, 0x02, 0x44, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x5c, 0x43, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x5c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5c, 0x56, 0x31, 0x5c, 0x43,
	0x6c, 0x6f, 0x75, 0x64, 0x5c, 0x47, 0x63, 0x70, 0x5c, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x5c, 0x46, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x5c, 0x53, 0x74, 0x61, 0x74, 0x65, 0x5c, 0x47,
	0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x40, 0x4c, 0x65, 0x66,
	0x74, 0x62, 0x69, 0x6e, 0x3a, 0x3a, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x3a, 0x3a, 0x50,
	0x72, 0x6f, 0x74, 0x6f, 0x3a, 0x3a, 0x56, 0x31, 0x3a, 0x3a, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x3a,
	0x3a, 0x47, 0x63, 0x70, 0x3a, 0x3a, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x3a, 0x3a,
	0x46, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x3a, 0x3a, 0x53, 0x74, 0x61, 0x74, 0x65, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_rawDescOnce sync.Once
	file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_rawDescData = file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_rawDesc
)

func file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_rawDescGZIP() []byte {
	file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_rawDescOnce.Do(func() {
		file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_rawDescData = protoimpl.X.CompressGZIP(file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_rawDescData)
	})
	return file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_rawDescData
}

var file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_goTypes = []interface{}{
	(*GcpFolderState)(nil), // 0: leftbin.commons.proto.v1.cloud.gcp.resource.folder.state.GcpFolderState
}
var file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_init() }
func file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_init() {
	if File_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GcpFolderState); i {
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
			RawDescriptor: file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_goTypes,
		DependencyIndexes: file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_depIdxs,
		MessageInfos:      file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_msgTypes,
	}.Build()
	File_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto = out.File
	file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_rawDesc = nil
	file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_goTypes = nil
	file_leftbin_commons_proto_v1_cloud_gcp_resource_folder_state_model_proto_depIdxs = nil
}