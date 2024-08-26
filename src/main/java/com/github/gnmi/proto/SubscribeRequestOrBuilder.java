// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gnmi.proto

package com.github.gnmi.proto;

public interface SubscribeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gnmi.SubscribeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specify the paths within a subscription.
   * </pre>
   *
   * <code>.gnmi.SubscriptionList subscribe = 1;</code>
   */
  boolean hasSubscribe();
  /**
   * <pre>
   * Specify the paths within a subscription.
   * </pre>
   *
   * <code>.gnmi.SubscriptionList subscribe = 1;</code>
   */
  com.github.gnmi.proto.SubscriptionList getSubscribe();
  /**
   * <pre>
   * Specify the paths within a subscription.
   * </pre>
   *
   * <code>.gnmi.SubscriptionList subscribe = 1;</code>
   */
  com.github.gnmi.proto.SubscriptionListOrBuilder getSubscribeOrBuilder();

  /**
   * <pre>
   * Trigger a polled update.
   * </pre>
   *
   * <code>.gnmi.Poll poll = 3;</code>
   */
  boolean hasPoll();
  /**
   * <pre>
   * Trigger a polled update.
   * </pre>
   *
   * <code>.gnmi.Poll poll = 3;</code>
   */
  com.github.gnmi.proto.Poll getPoll();
  /**
   * <pre>
   * Trigger a polled update.
   * </pre>
   *
   * <code>.gnmi.Poll poll = 3;</code>
   */
  com.github.gnmi.proto.PollOrBuilder getPollOrBuilder();

  /**
   * <pre>
   * Extension messages associated with the SubscribeRequest. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  java.util.List<gnmi_ext.GnmiExt.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Extension messages associated with the SubscribeRequest. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  gnmi_ext.GnmiExt.Extension getExtension(int index);
  /**
   * <pre>
   * Extension messages associated with the SubscribeRequest. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Extension messages associated with the SubscribeRequest. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  java.util.List<? extends gnmi_ext.GnmiExt.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Extension messages associated with the SubscribeRequest. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  gnmi_ext.GnmiExt.ExtensionOrBuilder getExtensionOrBuilder(
      int index);

  public com.github.gnmi.proto.SubscribeRequest.RequestCase getRequestCase();
}
