// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gnmi.proto

package com.github.gnmi.proto;

public interface SetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gnmi.SetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Prefix used for paths.
   * </pre>
   *
   * <code>.gnmi.Path prefix = 1;</code>
   */
  boolean hasPrefix();
  /**
   * <pre>
   * Prefix used for paths.
   * </pre>
   *
   * <code>.gnmi.Path prefix = 1;</code>
   */
  com.github.gnmi.proto.Path getPrefix();
  /**
   * <pre>
   * Prefix used for paths.
   * </pre>
   *
   * <code>.gnmi.Path prefix = 1;</code>
   */
  com.github.gnmi.proto.PathOrBuilder getPrefixOrBuilder();

  /**
   * <pre>
   * A set of responses specifying the result of the operations specified in
   * the SetRequest.
   * </pre>
   *
   * <code>repeated .gnmi.UpdateResult response = 2;</code>
   */
  java.util.List<com.github.gnmi.proto.UpdateResult> 
      getResponseList();
  /**
   * <pre>
   * A set of responses specifying the result of the operations specified in
   * the SetRequest.
   * </pre>
   *
   * <code>repeated .gnmi.UpdateResult response = 2;</code>
   */
  com.github.gnmi.proto.UpdateResult getResponse(int index);
  /**
   * <pre>
   * A set of responses specifying the result of the operations specified in
   * the SetRequest.
   * </pre>
   *
   * <code>repeated .gnmi.UpdateResult response = 2;</code>
   */
  int getResponseCount();
  /**
   * <pre>
   * A set of responses specifying the result of the operations specified in
   * the SetRequest.
   * </pre>
   *
   * <code>repeated .gnmi.UpdateResult response = 2;</code>
   */
  java.util.List<? extends com.github.gnmi.proto.UpdateResultOrBuilder> 
      getResponseOrBuilderList();
  /**
   * <pre>
   * A set of responses specifying the result of the operations specified in
   * the SetRequest.
   * </pre>
   *
   * <code>repeated .gnmi.UpdateResult response = 2;</code>
   */
  com.github.gnmi.proto.UpdateResultOrBuilder getResponseOrBuilder(
      int index);

  /**
   * <pre>
   * The overall status of the transaction.
   * </pre>
   *
   * <code>.gnmi.Error message = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasMessage();
  /**
   * <pre>
   * The overall status of the transaction.
   * </pre>
   *
   * <code>.gnmi.Error message = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.github.gnmi.proto.Error getMessage();
  /**
   * <pre>
   * The overall status of the transaction.
   * </pre>
   *
   * <code>.gnmi.Error message = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.github.gnmi.proto.ErrorOrBuilder getMessageOrBuilder();

  /**
   * <pre>
   * Timestamp of transaction (ns since epoch).
   * </pre>
   *
   * <code>int64 timestamp = 4;</code>
   */
  long getTimestamp();

  /**
   * <pre>
   * Extension messages associated with the SetResponse. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  java.util.List<gnmi_ext.GnmiExt.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Extension messages associated with the SetResponse. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  gnmi_ext.GnmiExt.Extension getExtension(int index);
  /**
   * <pre>
   * Extension messages associated with the SetResponse. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Extension messages associated with the SetResponse. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  java.util.List<? extends gnmi_ext.GnmiExt.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Extension messages associated with the SetResponse. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  gnmi_ext.GnmiExt.ExtensionOrBuilder getExtensionOrBuilder(
      int index);
}
