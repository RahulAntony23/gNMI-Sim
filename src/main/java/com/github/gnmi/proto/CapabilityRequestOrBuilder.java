// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gnmi.proto

package com.github.gnmi.proto;

public interface CapabilityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gnmi.CapabilityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Extension messages associated with the CapabilityRequest. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 1;</code>
   */
  java.util.List<gnmi_ext.GnmiExt.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Extension messages associated with the CapabilityRequest. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 1;</code>
   */
  gnmi_ext.GnmiExt.Extension getExtension(int index);
  /**
   * <pre>
   * Extension messages associated with the CapabilityRequest. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 1;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Extension messages associated with the CapabilityRequest. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 1;</code>
   */
  java.util.List<? extends gnmi_ext.GnmiExt.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Extension messages associated with the CapabilityRequest. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 1;</code>
   */
  gnmi_ext.GnmiExt.ExtensionOrBuilder getExtensionOrBuilder(
      int index);
}
