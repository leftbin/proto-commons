// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: leftbin/commons/proto/v1/cloud/gcp/resource/project/state/model.proto
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

/// gcp project state
public struct Leftbin_Commons_Proto_V1_Cloud_Gcp_Resource_Project_State_GcpProjectState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// name of the gcp project
  public var name: String = String()

  /// id of the gcp project
  public var id: String = String()

  /// number of the gcp project
  public var number: String = String()

  /// id of the billing account
  public var billingAccountID: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Leftbin_Commons_Proto_V1_Cloud_Gcp_Resource_Project_State_GcpProjectState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "leftbin.commons.proto.v1.cloud.gcp.resource.project.state"

extension Leftbin_Commons_Proto_V1_Cloud_Gcp_Resource_Project_State_GcpProjectState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".GcpProjectState"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    2: .same(proto: "id"),
    3: .same(proto: "number"),
    4: .standard(proto: "billing_account_id"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.number) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.billingAccountID) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 1)
    }
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 2)
    }
    if !self.number.isEmpty {
      try visitor.visitSingularStringField(value: self.number, fieldNumber: 3)
    }
    if !self.billingAccountID.isEmpty {
      try visitor.visitSingularStringField(value: self.billingAccountID, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Leftbin_Commons_Proto_V1_Cloud_Gcp_Resource_Project_State_GcpProjectState, rhs: Leftbin_Commons_Proto_V1_Cloud_Gcp_Resource_Project_State_GcpProjectState) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs.id != rhs.id {return false}
    if lhs.number != rhs.number {return false}
    if lhs.billingAccountID != rhs.billingAccountID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
