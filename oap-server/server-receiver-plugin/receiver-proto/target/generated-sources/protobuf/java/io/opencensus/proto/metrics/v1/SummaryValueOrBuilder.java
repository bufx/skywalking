// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opencensus/proto/metrics/v1/metrics.proto

package io.opencensus.proto.metrics.v1;

public interface SummaryValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencensus.proto.metrics.v1.SummaryValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The total number of recorded values since start_time. Optional since
   * some systems don't expose this.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value count = 1;</code>
   * @return Whether the count field is set.
   */
  boolean hasCount();
  /**
   * <pre>
   * The total number of recorded values since start_time. Optional since
   * some systems don't expose this.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value count = 1;</code>
   * @return The count.
   */
  com.google.protobuf.Int64Value getCount();
  /**
   * <pre>
   * The total number of recorded values since start_time. Optional since
   * some systems don't expose this.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value count = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCountOrBuilder();

  /**
   * <pre>
   * The total sum of recorded values since start_time. Optional since some
   * systems don't expose this. If count is zero then this field must be zero.
   * This field must be unset if the sum is not available.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue sum = 2;</code>
   * @return Whether the sum field is set.
   */
  boolean hasSum();
  /**
   * <pre>
   * The total sum of recorded values since start_time. Optional since some
   * systems don't expose this. If count is zero then this field must be zero.
   * This field must be unset if the sum is not available.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue sum = 2;</code>
   * @return The sum.
   */
  com.google.protobuf.DoubleValue getSum();
  /**
   * <pre>
   * The total sum of recorded values since start_time. Optional since some
   * systems don't expose this. If count is zero then this field must be zero.
   * This field must be unset if the sum is not available.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue sum = 2;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getSumOrBuilder();

  /**
   * <pre>
   * Values calculated over an arbitrary time window.
   * </pre>
   *
   * <code>.opencensus.proto.metrics.v1.SummaryValue.Snapshot snapshot = 3;</code>
   * @return Whether the snapshot field is set.
   */
  boolean hasSnapshot();
  /**
   * <pre>
   * Values calculated over an arbitrary time window.
   * </pre>
   *
   * <code>.opencensus.proto.metrics.v1.SummaryValue.Snapshot snapshot = 3;</code>
   * @return The snapshot.
   */
  io.opencensus.proto.metrics.v1.SummaryValue.Snapshot getSnapshot();
  /**
   * <pre>
   * Values calculated over an arbitrary time window.
   * </pre>
   *
   * <code>.opencensus.proto.metrics.v1.SummaryValue.Snapshot snapshot = 3;</code>
   */
  io.opencensus.proto.metrics.v1.SummaryValue.SnapshotOrBuilder getSnapshotOrBuilder();
}
