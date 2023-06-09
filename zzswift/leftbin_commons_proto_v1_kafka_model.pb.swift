// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: leftbin/commons/proto/v1/kafka/model.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

/// this is used to get host information of the pod
/// ip address and port of the pod
public struct Leftbin_Commons_Proto_V1_Kafka_HostInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var host: String = String()

  public var port: Int32 = 0

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// this is used as input to pass state store name
public struct Leftbin_Commons_Proto_V1_Kafka_StoreName {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var storeName: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// this is used as get topic partition details
public struct Leftbin_Commons_Proto_V1_Kafka_TopicPartition {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var topic: String = String()

  public var partition: Int32 = 0

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// this is used to get meta information of kafka streams instance
public struct Leftbin_Commons_Proto_V1_Kafka_InstanceMeta {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var hostInfo: Leftbin_Commons_Proto_V1_Kafka_HostInfo {
    get {return _hostInfo ?? Leftbin_Commons_Proto_V1_Kafka_HostInfo()}
    set {_hostInfo = newValue}
  }
  /// Returns true if `hostInfo` has been explicitly set.
  public var hasHostInfo: Bool {return self._hostInfo != nil}
  /// Clears the value of `hostInfo`. Subsequent reads from it will return its default value.
  public mutating func clearHostInfo() {self._hostInfo = nil}

  public var stateStoreNames: [String] = []

  public var topicPartitions: [Leftbin_Commons_Proto_V1_Kafka_TopicPartition] = []

  public var standbyStateStoreNames: [String] = []

  public var standbyTopicPartitions: [Leftbin_Commons_Proto_V1_Kafka_TopicPartition] = []

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _hostInfo: Leftbin_Commons_Proto_V1_Kafka_HostInfo? = nil
}

/// this is used to get meta information of kafka streams pod based on key
public struct Leftbin_Commons_Proto_V1_Kafka_KeyQueryMeta {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var hostInfo: Leftbin_Commons_Proto_V1_Kafka_HostInfo {
    get {return _hostInfo ?? Leftbin_Commons_Proto_V1_Kafka_HostInfo()}
    set {_hostInfo = newValue}
  }
  /// Returns true if `hostInfo` has been explicitly set.
  public var hasHostInfo: Bool {return self._hostInfo != nil}
  /// Clears the value of `hostInfo`. Subsequent reads from it will return its default value.
  public mutating func clearHostInfo() {self._hostInfo = nil}

  public var standbyHosts: [Leftbin_Commons_Proto_V1_Kafka_HostInfo] = []

  public var partition: Int32 = 0

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _hostInfo: Leftbin_Commons_Proto_V1_Kafka_HostInfo? = nil
}

/// this is used to get meta information of kafka streams pod
public struct Leftbin_Commons_Proto_V1_Kafka_StreamsMeta {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var instanceMeta: [Leftbin_Commons_Proto_V1_Kafka_InstanceMeta] = []

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// this is used to pass uuid as key
public struct Leftbin_Commons_Proto_V1_Kafka_Uuid {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var uuid: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Leftbin_Commons_Proto_V1_Kafka_HostInfo: @unchecked Sendable {}
extension Leftbin_Commons_Proto_V1_Kafka_StoreName: @unchecked Sendable {}
extension Leftbin_Commons_Proto_V1_Kafka_TopicPartition: @unchecked Sendable {}
extension Leftbin_Commons_Proto_V1_Kafka_InstanceMeta: @unchecked Sendable {}
extension Leftbin_Commons_Proto_V1_Kafka_KeyQueryMeta: @unchecked Sendable {}
extension Leftbin_Commons_Proto_V1_Kafka_StreamsMeta: @unchecked Sendable {}
extension Leftbin_Commons_Proto_V1_Kafka_Uuid: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "leftbin.commons.proto.v1.kafka"

extension Leftbin_Commons_Proto_V1_Kafka_HostInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".HostInfo"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "host"),
    2: .same(proto: "port"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.host) }()
      case 2: try { try decoder.decodeSingularInt32Field(value: &self.port) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.host.isEmpty {
      try visitor.visitSingularStringField(value: self.host, fieldNumber: 1)
    }
    if self.port != 0 {
      try visitor.visitSingularInt32Field(value: self.port, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Leftbin_Commons_Proto_V1_Kafka_HostInfo, rhs: Leftbin_Commons_Proto_V1_Kafka_HostInfo) -> Bool {
    if lhs.host != rhs.host {return false}
    if lhs.port != rhs.port {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Leftbin_Commons_Proto_V1_Kafka_StoreName: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".StoreName"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "store_name"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.storeName) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.storeName.isEmpty {
      try visitor.visitSingularStringField(value: self.storeName, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Leftbin_Commons_Proto_V1_Kafka_StoreName, rhs: Leftbin_Commons_Proto_V1_Kafka_StoreName) -> Bool {
    if lhs.storeName != rhs.storeName {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Leftbin_Commons_Proto_V1_Kafka_TopicPartition: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".TopicPartition"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "topic"),
    2: .same(proto: "partition"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.topic) }()
      case 2: try { try decoder.decodeSingularInt32Field(value: &self.partition) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.topic.isEmpty {
      try visitor.visitSingularStringField(value: self.topic, fieldNumber: 1)
    }
    if self.partition != 0 {
      try visitor.visitSingularInt32Field(value: self.partition, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Leftbin_Commons_Proto_V1_Kafka_TopicPartition, rhs: Leftbin_Commons_Proto_V1_Kafka_TopicPartition) -> Bool {
    if lhs.topic != rhs.topic {return false}
    if lhs.partition != rhs.partition {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Leftbin_Commons_Proto_V1_Kafka_InstanceMeta: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".InstanceMeta"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "host_info"),
    2: .standard(proto: "state_store_names"),
    3: .standard(proto: "topic_partitions"),
    4: .standard(proto: "standby_state_store_names"),
    5: .standard(proto: "standby_topic_partitions"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._hostInfo) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.stateStoreNames) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.topicPartitions) }()
      case 4: try { try decoder.decodeRepeatedStringField(value: &self.standbyStateStoreNames) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.standbyTopicPartitions) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._hostInfo {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.stateStoreNames.isEmpty {
      try visitor.visitRepeatedStringField(value: self.stateStoreNames, fieldNumber: 2)
    }
    if !self.topicPartitions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.topicPartitions, fieldNumber: 3)
    }
    if !self.standbyStateStoreNames.isEmpty {
      try visitor.visitRepeatedStringField(value: self.standbyStateStoreNames, fieldNumber: 4)
    }
    if !self.standbyTopicPartitions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.standbyTopicPartitions, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Leftbin_Commons_Proto_V1_Kafka_InstanceMeta, rhs: Leftbin_Commons_Proto_V1_Kafka_InstanceMeta) -> Bool {
    if lhs._hostInfo != rhs._hostInfo {return false}
    if lhs.stateStoreNames != rhs.stateStoreNames {return false}
    if lhs.topicPartitions != rhs.topicPartitions {return false}
    if lhs.standbyStateStoreNames != rhs.standbyStateStoreNames {return false}
    if lhs.standbyTopicPartitions != rhs.standbyTopicPartitions {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Leftbin_Commons_Proto_V1_Kafka_KeyQueryMeta: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".KeyQueryMeta"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "host_info"),
    2: .standard(proto: "standby_hosts"),
    3: .same(proto: "partition"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._hostInfo) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.standbyHosts) }()
      case 3: try { try decoder.decodeSingularInt32Field(value: &self.partition) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._hostInfo {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.standbyHosts.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.standbyHosts, fieldNumber: 2)
    }
    if self.partition != 0 {
      try visitor.visitSingularInt32Field(value: self.partition, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Leftbin_Commons_Proto_V1_Kafka_KeyQueryMeta, rhs: Leftbin_Commons_Proto_V1_Kafka_KeyQueryMeta) -> Bool {
    if lhs._hostInfo != rhs._hostInfo {return false}
    if lhs.standbyHosts != rhs.standbyHosts {return false}
    if lhs.partition != rhs.partition {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Leftbin_Commons_Proto_V1_Kafka_StreamsMeta: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".StreamsMeta"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "instance_meta"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.instanceMeta) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.instanceMeta.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.instanceMeta, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Leftbin_Commons_Proto_V1_Kafka_StreamsMeta, rhs: Leftbin_Commons_Proto_V1_Kafka_StreamsMeta) -> Bool {
    if lhs.instanceMeta != rhs.instanceMeta {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Leftbin_Commons_Proto_V1_Kafka_Uuid: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".Uuid"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "uuid"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.uuid) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.uuid.isEmpty {
      try visitor.visitSingularStringField(value: self.uuid, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Leftbin_Commons_Proto_V1_Kafka_Uuid, rhs: Leftbin_Commons_Proto_V1_Kafka_Uuid) -> Bool {
    if lhs.uuid != rhs.uuid {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
