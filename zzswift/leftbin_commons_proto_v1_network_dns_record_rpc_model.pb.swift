// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: leftbin/commons/proto/v1/network/dns/record/rpc/model.proto
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

/// dns record
public struct Leftbin_Commons_Proto_V1_Network_Dns_Record_Rpc_DnsRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// dns record type
  public var recordType: Leftbin_Commons_Proto_V1_Network_Dns_Record_Rpc_Enums_DnsRecordType = .unspecified

  /// name to be added to the domain. ex: if name is "dev" then the
  public var name: String = String()

  /// record values
  public var values: [String] = []

  /// ttl in seconds
  public var ttlSeconds: Int32 = 0

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Leftbin_Commons_Proto_V1_Network_Dns_Record_Rpc_DnsRecord: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "leftbin.commons.proto.v1.network.dns.record.rpc"

extension Leftbin_Commons_Proto_V1_Network_Dns_Record_Rpc_DnsRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".DnsRecord"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "record_type"),
    2: .same(proto: "name"),
    3: .same(proto: "values"),
    4: .standard(proto: "ttl_seconds"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularEnumField(value: &self.recordType) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeRepeatedStringField(value: &self.values) }()
      case 4: try { try decoder.decodeSingularInt32Field(value: &self.ttlSeconds) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.recordType != .unspecified {
      try visitor.visitSingularEnumField(value: self.recordType, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if !self.values.isEmpty {
      try visitor.visitRepeatedStringField(value: self.values, fieldNumber: 3)
    }
    if self.ttlSeconds != 0 {
      try visitor.visitSingularInt32Field(value: self.ttlSeconds, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Leftbin_Commons_Proto_V1_Network_Dns_Record_Rpc_DnsRecord, rhs: Leftbin_Commons_Proto_V1_Network_Dns_Record_Rpc_DnsRecord) -> Bool {
    if lhs.recordType != rhs.recordType {return false}
    if lhs.name != rhs.name {return false}
    if lhs.values != rhs.values {return false}
    if lhs.ttlSeconds != rhs.ttlSeconds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
