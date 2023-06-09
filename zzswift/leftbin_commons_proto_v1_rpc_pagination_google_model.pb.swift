// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: leftbin/commons/proto/v1/rpc/pagination/google/model.proto
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

///google style of pagination
public struct Leftbin_Commons_Proto_V1_Rpc_Pagination_Google_GooglePageInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  ///google apis include a token to retrieve next page of results.
  ///if there are no more items to return, the next_page_token is empty
  public var pageToken: String = String()

  ///number of items to include in the result
  public var size: Int32 = 0

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Leftbin_Commons_Proto_V1_Rpc_Pagination_Google_GooglePageInfo: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "leftbin.commons.proto.v1.rpc.pagination.google"

extension Leftbin_Commons_Proto_V1_Rpc_Pagination_Google_GooglePageInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".GooglePageInfo"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "page_token"),
    2: .same(proto: "size"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.pageToken) }()
      case 2: try { try decoder.decodeSingularInt32Field(value: &self.size) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.pageToken.isEmpty {
      try visitor.visitSingularStringField(value: self.pageToken, fieldNumber: 1)
    }
    if self.size != 0 {
      try visitor.visitSingularInt32Field(value: self.size, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Leftbin_Commons_Proto_V1_Rpc_Pagination_Google_GooglePageInfo, rhs: Leftbin_Commons_Proto_V1_Rpc_Pagination_Google_GooglePageInfo) -> Bool {
    if lhs.pageToken != rhs.pageToken {return false}
    if lhs.size != rhs.size {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
