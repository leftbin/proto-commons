// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        (unknown)
// source: leftbin/commons/proto/v1/kubernetes/model.proto

package kubernetes

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

// sidecar object in microservice deployment configuration
// this spec should always match the specification of a kubernetes container spec https://pkg.go.dev/k8s.io/api/core/v1#Container
// warning: sidecar feature does not currently support all features of a kubernetes container spec.
type Container struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name      string              `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Image     string              `protobuf:"bytes,2,opt,name=image,proto3" json:"image,omitempty"`
	Ports     []*ContainerPort    `protobuf:"bytes,3,rep,name=ports,proto3" json:"ports,omitempty"`
	Resources *ContainerResources `protobuf:"bytes,4,opt,name=resources,proto3" json:"resources,omitempty"`
	Env       []*ContainerEnvVar  `protobuf:"bytes,5,rep,name=env,proto3" json:"env,omitempty"`
}

func (x *Container) Reset() {
	*x = Container{}
	if protoimpl.UnsafeEnabled {
		mi := &file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Container) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Container) ProtoMessage() {}

func (x *Container) ProtoReflect() protoreflect.Message {
	mi := &file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Container.ProtoReflect.Descriptor instead.
func (*Container) Descriptor() ([]byte, []int) {
	return file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDescGZIP(), []int{0}
}

func (x *Container) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Container) GetImage() string {
	if x != nil {
		return x.Image
	}
	return ""
}

func (x *Container) GetPorts() []*ContainerPort {
	if x != nil {
		return x.Ports
	}
	return nil
}

func (x *Container) GetResources() *ContainerResources {
	if x != nil {
		return x.Resources
	}
	return nil
}

func (x *Container) GetEnv() []*ContainerEnvVar {
	if x != nil {
		return x.Env
	}
	return nil
}

// kubernetes container cpu and memory resources
type ContainerResources struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// container resource limits
	// key is either cpu or memory and value is the limits value for the resource
	Limits *CpuMemory `protobuf:"bytes,1,opt,name=limits,proto3" json:"limits,omitempty"`
	// container resource limits
	// key is either cpu or memory and value is the requests value for the resource
	Requests *CpuMemory `protobuf:"bytes,2,opt,name=requests,proto3" json:"requests,omitempty"`
}

func (x *ContainerResources) Reset() {
	*x = ContainerResources{}
	if protoimpl.UnsafeEnabled {
		mi := &file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ContainerResources) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ContainerResources) ProtoMessage() {}

func (x *ContainerResources) ProtoReflect() protoreflect.Message {
	mi := &file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ContainerResources.ProtoReflect.Descriptor instead.
func (*ContainerResources) Descriptor() ([]byte, []int) {
	return file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDescGZIP(), []int{1}
}

func (x *ContainerResources) GetLimits() *CpuMemory {
	if x != nil {
		return x.Limits
	}
	return nil
}

func (x *ContainerResources) GetRequests() *CpuMemory {
	if x != nil {
		return x.Requests
	}
	return nil
}

type ContainerEnvVar struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name  string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Value string `protobuf:"bytes,2,opt,name=value,proto3" json:"value,omitempty"`
}

func (x *ContainerEnvVar) Reset() {
	*x = ContainerEnvVar{}
	if protoimpl.UnsafeEnabled {
		mi := &file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ContainerEnvVar) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ContainerEnvVar) ProtoMessage() {}

func (x *ContainerEnvVar) ProtoReflect() protoreflect.Message {
	mi := &file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ContainerEnvVar.ProtoReflect.Descriptor instead.
func (*ContainerEnvVar) Descriptor() ([]byte, []int) {
	return file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDescGZIP(), []int{2}
}

func (x *ContainerEnvVar) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *ContainerEnvVar) GetValue() string {
	if x != nil {
		return x.Value
	}
	return ""
}

type ContainerPort struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// the attribute names must use camel case to marshal into https://pkg.go.dev/k8s.io/api/core/v1#Container
	ContainerPort int32  `protobuf:"varint,2,opt,name=containerPort,proto3" json:"containerPort,omitempty"`
	Protocol      string `protobuf:"bytes,3,opt,name=protocol,proto3" json:"protocol,omitempty"`
}

func (x *ContainerPort) Reset() {
	*x = ContainerPort{}
	if protoimpl.UnsafeEnabled {
		mi := &file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ContainerPort) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ContainerPort) ProtoMessage() {}

func (x *ContainerPort) ProtoReflect() protoreflect.Message {
	mi := &file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ContainerPort.ProtoReflect.Descriptor instead.
func (*ContainerPort) Descriptor() ([]byte, []int) {
	return file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDescGZIP(), []int{3}
}

func (x *ContainerPort) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *ContainerPort) GetContainerPort() int32 {
	if x != nil {
		return x.ContainerPort
	}
	return 0
}

func (x *ContainerPort) GetProtocol() string {
	if x != nil {
		return x.Protocol
	}
	return ""
}

type CpuMemory struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Cpu    string `protobuf:"bytes,1,opt,name=cpu,proto3" json:"cpu,omitempty"`
	Memory string `protobuf:"bytes,2,opt,name=memory,proto3" json:"memory,omitempty"`
}

func (x *CpuMemory) Reset() {
	*x = CpuMemory{}
	if protoimpl.UnsafeEnabled {
		mi := &file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CpuMemory) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CpuMemory) ProtoMessage() {}

func (x *CpuMemory) ProtoReflect() protoreflect.Message {
	mi := &file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CpuMemory.ProtoReflect.Descriptor instead.
func (*CpuMemory) Descriptor() ([]byte, []int) {
	return file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDescGZIP(), []int{4}
}

func (x *CpuMemory) GetCpu() string {
	if x != nil {
		return x.Cpu
	}
	return ""
}

func (x *CpuMemory) GetMemory() string {
	if x != nil {
		return x.Memory
	}
	return ""
}

var File_leftbin_commons_proto_v1_kubernetes_model_proto protoreflect.FileDescriptor

var file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDesc = []byte{
	0x0a, 0x2f, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x31, 0x2f, 0x6b, 0x75, 0x62, 0x65, 0x72,
	0x6e, 0x65, 0x74, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x23, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f,
	0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x6b, 0x75, 0x62, 0x65,
	0x72, 0x6e, 0x65, 0x74, 0x65, 0x73, 0x22, 0x9e, 0x02, 0x0a, 0x09, 0x43, 0x6f, 0x6e, 0x74, 0x61,
	0x69, 0x6e, 0x65, 0x72, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x69, 0x6d, 0x61, 0x67,
	0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x69, 0x6d, 0x61, 0x67, 0x65, 0x12, 0x48,
	0x0a, 0x05, 0x70, 0x6f, 0x72, 0x74, 0x73, 0x18, 0x03, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x32, 0x2e,
	0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x6b, 0x75, 0x62, 0x65, 0x72, 0x6e, 0x65,
	0x74, 0x65, 0x73, 0x2e, 0x43, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x50, 0x6f, 0x72,
	0x74, 0x52, 0x05, 0x70, 0x6f, 0x72, 0x74, 0x73, 0x12, 0x55, 0x0a, 0x09, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x73, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x37, 0x2e, 0x6c, 0x65,
	0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x6b, 0x75, 0x62, 0x65, 0x72, 0x6e, 0x65, 0x74, 0x65,
	0x73, 0x2e, 0x43, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x52, 0x65, 0x73, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x73, 0x52, 0x09, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x12,
	0x46, 0x0a, 0x03, 0x65, 0x6e, 0x76, 0x18, 0x05, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x34, 0x2e, 0x6c,
	0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x6b, 0x75, 0x62, 0x65, 0x72, 0x6e, 0x65, 0x74,
	0x65, 0x73, 0x2e, 0x43, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x45, 0x6e, 0x76, 0x56,
	0x61, 0x72, 0x52, 0x03, 0x65, 0x6e, 0x76, 0x22, 0xa8, 0x01, 0x0a, 0x12, 0x43, 0x6f, 0x6e, 0x74,
	0x61, 0x69, 0x6e, 0x65, 0x72, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x12, 0x46,
	0x0a, 0x06, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2e,
	0x2e, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x6b, 0x75, 0x62, 0x65, 0x72, 0x6e,
	0x65, 0x74, 0x65, 0x73, 0x2e, 0x43, 0x70, 0x75, 0x4d, 0x65, 0x6d, 0x6f, 0x72, 0x79, 0x52, 0x06,
	0x6c, 0x69, 0x6d, 0x69, 0x74, 0x73, 0x12, 0x4a, 0x0a, 0x08, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2e, 0x2e, 0x6c, 0x65, 0x66, 0x74, 0x62,
	0x69, 0x6e, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2e, 0x76, 0x31, 0x2e, 0x6b, 0x75, 0x62, 0x65, 0x72, 0x6e, 0x65, 0x74, 0x65, 0x73, 0x2e, 0x43,
	0x70, 0x75, 0x4d, 0x65, 0x6d, 0x6f, 0x72, 0x79, 0x52, 0x08, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x73, 0x22, 0x3b, 0x0a, 0x0f, 0x43, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x45,
	0x6e, 0x76, 0x56, 0x61, 0x72, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x76, 0x61, 0x6c,
	0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x22,
	0x65, 0x0a, 0x0d, 0x43, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x50, 0x6f, 0x72, 0x74,
	0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04,
	0x6e, 0x61, 0x6d, 0x65, 0x12, 0x24, 0x0a, 0x0d, 0x63, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x65,
	0x72, 0x50, 0x6f, 0x72, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0d, 0x63, 0x6f, 0x6e,
	0x74, 0x61, 0x69, 0x6e, 0x65, 0x72, 0x50, 0x6f, 0x72, 0x74, 0x12, 0x1a, 0x0a, 0x08, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x22, 0x35, 0x0a, 0x09, 0x43, 0x70, 0x75, 0x4d, 0x65, 0x6d,
	0x6f, 0x72, 0x79, 0x12, 0x10, 0x0a, 0x03, 0x63, 0x70, 0x75, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x03, 0x63, 0x70, 0x75, 0x12, 0x16, 0x0a, 0x06, 0x6d, 0x65, 0x6d, 0x6f, 0x72, 0x79, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x6d, 0x65, 0x6d, 0x6f, 0x72, 0x79, 0x42, 0xb2, 0x02,
	0x0a, 0x27, 0x63, 0x6f, 0x6d, 0x2e, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x6b,
	0x75, 0x62, 0x65, 0x72, 0x6e, 0x65, 0x74, 0x65, 0x73, 0x42, 0x0a, 0x4d, 0x6f, 0x64, 0x65, 0x6c,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x49, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e,
	0x63, 0x6f, 0x6d, 0x2f, 0x6c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2d, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2f, 0x7a, 0x7a, 0x67, 0x6f, 0x2f, 0x6c,
	0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2f, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x31, 0x2f, 0x6b, 0x75, 0x62, 0x65, 0x72, 0x6e, 0x65, 0x74,
	0x65, 0x73, 0xa2, 0x02, 0x05, 0x4c, 0x43, 0x50, 0x56, 0x4b, 0xaa, 0x02, 0x23, 0x4c, 0x65, 0x66,
	0x74, 0x62, 0x69, 0x6e, 0x2e, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x2e, 0x50, 0x72, 0x6f,
	0x74, 0x6f, 0x2e, 0x56, 0x31, 0x2e, 0x4b, 0x75, 0x62, 0x65, 0x72, 0x6e, 0x65, 0x74, 0x65, 0x73,
	0xca, 0x02, 0x23, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e, 0x5c, 0x43, 0x6f, 0x6d, 0x6d, 0x6f,
	0x6e, 0x73, 0x5c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5c, 0x56, 0x31, 0x5c, 0x4b, 0x75, 0x62, 0x65,
	0x72, 0x6e, 0x65, 0x74, 0x65, 0x73, 0xe2, 0x02, 0x2f, 0x4c, 0x65, 0x66, 0x74, 0x62, 0x69, 0x6e,
	0x5c, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x5c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5c, 0x56,
	0x31, 0x5c, 0x4b, 0x75, 0x62, 0x65, 0x72, 0x6e, 0x65, 0x74, 0x65, 0x73, 0x5c, 0x47, 0x50, 0x42,
	0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x27, 0x4c, 0x65, 0x66, 0x74, 0x62,
	0x69, 0x6e, 0x3a, 0x3a, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x73, 0x3a, 0x3a, 0x50, 0x72, 0x6f,
	0x74, 0x6f, 0x3a, 0x3a, 0x56, 0x31, 0x3a, 0x3a, 0x4b, 0x75, 0x62, 0x65, 0x72, 0x6e, 0x65, 0x74,
	0x65, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDescOnce sync.Once
	file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDescData = file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDesc
)

func file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDescGZIP() []byte {
	file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDescOnce.Do(func() {
		file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDescData = protoimpl.X.CompressGZIP(file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDescData)
	})
	return file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDescData
}

var file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_leftbin_commons_proto_v1_kubernetes_model_proto_goTypes = []interface{}{
	(*Container)(nil),          // 0: leftbin.commons.proto.v1.kubernetes.Container
	(*ContainerResources)(nil), // 1: leftbin.commons.proto.v1.kubernetes.ContainerResources
	(*ContainerEnvVar)(nil),    // 2: leftbin.commons.proto.v1.kubernetes.ContainerEnvVar
	(*ContainerPort)(nil),      // 3: leftbin.commons.proto.v1.kubernetes.ContainerPort
	(*CpuMemory)(nil),          // 4: leftbin.commons.proto.v1.kubernetes.CpuMemory
}
var file_leftbin_commons_proto_v1_kubernetes_model_proto_depIdxs = []int32{
	3, // 0: leftbin.commons.proto.v1.kubernetes.Container.ports:type_name -> leftbin.commons.proto.v1.kubernetes.ContainerPort
	1, // 1: leftbin.commons.proto.v1.kubernetes.Container.resources:type_name -> leftbin.commons.proto.v1.kubernetes.ContainerResources
	2, // 2: leftbin.commons.proto.v1.kubernetes.Container.env:type_name -> leftbin.commons.proto.v1.kubernetes.ContainerEnvVar
	4, // 3: leftbin.commons.proto.v1.kubernetes.ContainerResources.limits:type_name -> leftbin.commons.proto.v1.kubernetes.CpuMemory
	4, // 4: leftbin.commons.proto.v1.kubernetes.ContainerResources.requests:type_name -> leftbin.commons.proto.v1.kubernetes.CpuMemory
	5, // [5:5] is the sub-list for method output_type
	5, // [5:5] is the sub-list for method input_type
	5, // [5:5] is the sub-list for extension type_name
	5, // [5:5] is the sub-list for extension extendee
	0, // [0:5] is the sub-list for field type_name
}

func init() { file_leftbin_commons_proto_v1_kubernetes_model_proto_init() }
func file_leftbin_commons_proto_v1_kubernetes_model_proto_init() {
	if File_leftbin_commons_proto_v1_kubernetes_model_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Container); i {
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
		file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ContainerResources); i {
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
		file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ContainerEnvVar); i {
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
		file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ContainerPort); i {
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
		file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CpuMemory); i {
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
			RawDescriptor: file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_leftbin_commons_proto_v1_kubernetes_model_proto_goTypes,
		DependencyIndexes: file_leftbin_commons_proto_v1_kubernetes_model_proto_depIdxs,
		MessageInfos:      file_leftbin_commons_proto_v1_kubernetes_model_proto_msgTypes,
	}.Build()
	File_leftbin_commons_proto_v1_kubernetes_model_proto = out.File
	file_leftbin_commons_proto_v1_kubernetes_model_proto_rawDesc = nil
	file_leftbin_commons_proto_v1_kubernetes_model_proto_goTypes = nil
	file_leftbin_commons_proto_v1_kubernetes_model_proto_depIdxs = nil
}