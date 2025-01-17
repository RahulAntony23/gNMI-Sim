// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gnmi.proto

package com.github.gnmi.proto;

public interface SubscriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gnmi.Subscription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The data tree path.
   * </pre>
   *
   * <code>.gnmi.Path path = 1;</code>
   */
  boolean hasPath();
  /**
   * <pre>
   * The data tree path.
   * </pre>
   *
   * <code>.gnmi.Path path = 1;</code>
   */
  com.github.gnmi.proto.Path getPath();
  /**
   * <pre>
   * The data tree path.
   * </pre>
   *
   * <code>.gnmi.Path path = 1;</code>
   */
  com.github.gnmi.proto.PathOrBuilder getPathOrBuilder();

  /**
   * <pre>
   * Subscription mode to be used.
   * </pre>
   *
   * <code>.gnmi.SubscriptionMode mode = 2;</code>
   */
  int getModeValue();
  /**
   * <pre>
   * Subscription mode to be used.
   * </pre>
   *
   * <code>.gnmi.SubscriptionMode mode = 2;</code>
   */
  com.github.gnmi.proto.SubscriptionMode getMode();

  /**
   * <pre>
   * ns between samples in SAMPLE mode.
   * </pre>
   *
   * <code>uint64 sample_interval = 3;</code>
   */
  long getSampleInterval();

  /**
   * <pre>
   * Indicates whether values that have not changed should be sent in a SAMPLE
   * subscription.
   * </pre>
   *
   * <code>bool suppress_redundant = 4;</code>
   */
  boolean getSuppressRedundant();

  /**
   * <pre>
   * Specifies the maximum allowable silent period in nanoseconds when
   * suppress_redundant is in use. The target should send a value at least once
   * in the period specified.
   * </pre>
   *
   * <code>uint64 heartbeat_interval = 5;</code>
   */
  long getHeartbeatInterval();
}
