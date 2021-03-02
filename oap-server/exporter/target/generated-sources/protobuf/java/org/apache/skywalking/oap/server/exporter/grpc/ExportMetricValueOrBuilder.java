// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metric-exporter.proto

package org.apache.skywalking.oap.server.exporter.grpc;

public interface ExportMetricValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ExportMetricValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string metricName = 1;</code>
   * @return The metricName.
   */
  java.lang.String getMetricName();
  /**
   * <code>string metricName = 1;</code>
   * @return The bytes for metricName.
   */
  com.google.protobuf.ByteString
      getMetricNameBytes();

  /**
   * <code>string entityName = 2;</code>
   * @return The entityName.
   */
  java.lang.String getEntityName();
  /**
   * <code>string entityName = 2;</code>
   * @return The bytes for entityName.
   */
  com.google.protobuf.ByteString
      getEntityNameBytes();

  /**
   * <code>string entityId = 3;</code>
   * @return The entityId.
   */
  java.lang.String getEntityId();
  /**
   * <code>string entityId = 3;</code>
   * @return The bytes for entityId.
   */
  com.google.protobuf.ByteString
      getEntityIdBytes();

  /**
   * <code>.ValueType type = 4;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.ValueType type = 4;</code>
   * @return The type.
   */
  org.apache.skywalking.oap.server.exporter.grpc.ValueType getType();

  /**
   * <code>int64 timeBucket = 5;</code>
   * @return The timeBucket.
   */
  long getTimeBucket();

  /**
   * <code>int64 longValue = 6;</code>
   * @return The longValue.
   */
  long getLongValue();

  /**
   * <code>double doubleValue = 7;</code>
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   * <code>repeated int64 longValues = 8;</code>
   * @return A list containing the longValues.
   */
  java.util.List<java.lang.Long> getLongValuesList();
  /**
   * <code>repeated int64 longValues = 8;</code>
   * @return The count of longValues.
   */
  int getLongValuesCount();
  /**
   * <code>repeated int64 longValues = 8;</code>
   * @param index The index of the element to return.
   * @return The longValues at the given index.
   */
  long getLongValues(int index);
}
