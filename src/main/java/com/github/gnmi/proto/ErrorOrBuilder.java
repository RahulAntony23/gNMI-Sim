// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gnmi.proto

package com.github.gnmi.proto;

@java.lang.Deprecated public interface ErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gnmi.Error)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Canonical gRPC error code.
   * </pre>
   *
   * <code>uint32 code = 1;</code>
   */
  int getCode();

  /**
   * <pre>
   * Human readable error.
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * Human readable error.
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * Optional additional information.
   * </pre>
   *
   * <code>.google.protobuf.Any data = 3;</code>
   */
  boolean hasData();
  /**
   * <pre>
   * Optional additional information.
   * </pre>
   *
   * <code>.google.protobuf.Any data = 3;</code>
   */
  com.google.protobuf.Any getData();
  /**
   * <pre>
   * Optional additional information.
   * </pre>
   *
   * <code>.google.protobuf.Any data = 3;</code>
   */
  com.google.protobuf.AnyOrBuilder getDataOrBuilder();
}
