// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: leftbin/commons/proto/v1/rpc/security/authentication/extensions/extensions.proto
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

// MARK: - Extension support defined in extensions.proto.

// MARK: - Extension Properties

// Swift Extensions on the exteneded Messages to add easy access to the declared
// extension fields. The names are based on the extension field name from the proto
// declaration. To avoid naming collisions, the names are prefixed with the name of
// the scope where the extend directive occurs.

extension SwiftProtobuf.Google_Protobuf_MethodOptions {

  public var Leftbin_Commons_Proto_V1_Rpc_Security_Authentication_Extensions_isPublic: Bool {
    get {return getExtensionValue(ext: Leftbin_Commons_Proto_V1_Rpc_Security_Authentication_Extensions_Extensions_is_public) ?? false}
    set {setExtensionValue(ext: Leftbin_Commons_Proto_V1_Rpc_Security_Authentication_Extensions_Extensions_is_public, value: newValue)}
  }
  /// Returns true if extension `Leftbin_Commons_Proto_V1_Rpc_Security_Authentication_Extensions_Extensions_is_public`
  /// has been explicitly set.
  public var hasLeftbin_Commons_Proto_V1_Rpc_Security_Authentication_Extensions_isPublic: Bool {
    return hasExtensionValue(ext: Leftbin_Commons_Proto_V1_Rpc_Security_Authentication_Extensions_Extensions_is_public)
  }
  /// Clears the value of extension `Leftbin_Commons_Proto_V1_Rpc_Security_Authentication_Extensions_Extensions_is_public`.
  /// Subsequent reads from it will return its default value.
  public mutating func clearLeftbin_Commons_Proto_V1_Rpc_Security_Authentication_Extensions_isPublic() {
    clearExtensionValue(ext: Leftbin_Commons_Proto_V1_Rpc_Security_Authentication_Extensions_Extensions_is_public)
  }

}

// MARK: - File's ExtensionMap: Leftbin_Commons_Proto_V1_Rpc_Security_Authentication_Extensions_Extensions_Extensions

/// A `SwiftProtobuf.SimpleExtensionMap` that includes all of the extensions defined by
/// this .proto file. It can be used any place an `SwiftProtobuf.ExtensionMap` is needed
/// in parsing, or it can be combined with other `SwiftProtobuf.SimpleExtensionMap`s to create
/// a larger `SwiftProtobuf.SimpleExtensionMap`.
public let Leftbin_Commons_Proto_V1_Rpc_Security_Authentication_Extensions_Extensions_Extensions: SwiftProtobuf.SimpleExtensionMap = [
  Leftbin_Commons_Proto_V1_Rpc_Security_Authentication_Extensions_Extensions_is_public
]

// Extension Objects - The only reason these might be needed is when manually
// constructing a `SimpleExtensionMap`, otherwise, use the above _Extension Properties_
// accessors for the extension fields on the messages directly.

public let Leftbin_Commons_Proto_V1_Rpc_Security_Authentication_Extensions_Extensions_is_public = SwiftProtobuf.MessageExtension<SwiftProtobuf.OptionalExtensionField<SwiftProtobuf.ProtobufBool>, SwiftProtobuf.Google_Protobuf_MethodOptions>(
  _protobuf_fieldNumber: 50057,
  fieldName: "leftbin.commons.proto.v1.rpc.security.authentication.extensions.is_public"
)
