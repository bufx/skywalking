// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/Tracing.proto

package org.apache.skywalking.apm.network.language.agent.v3;

public interface LogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.Log)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The timestamp in milliseconds of this event.,
   * measured between the current time and midnight, January 1, 1970 UTC.
   * </pre>
   *
   * <code>int64 time = 1;</code>
   * @return The time.
   */
  long getTime();

  /**
   * <pre>
   * String key, String value pair.
   * </pre>
   *
   * <code>repeated .skywalking.v3.KeyStringValuePair data = 2;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.common.v3.KeyStringValuePair> 
      getDataList();
  /**
   * <pre>
   * String key, String value pair.
   * </pre>
   *
   * <code>repeated .skywalking.v3.KeyStringValuePair data = 2;</code>
   */
  org.apache.skywalking.apm.network.common.v3.KeyStringValuePair getData(int index);
  /**
   * <pre>
   * String key, String value pair.
   * </pre>
   *
   * <code>repeated .skywalking.v3.KeyStringValuePair data = 2;</code>
   */
  int getDataCount();
  /**
   * <pre>
   * String key, String value pair.
   * </pre>
   *
   * <code>repeated .skywalking.v3.KeyStringValuePair data = 2;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.common.v3.KeyStringValuePairOrBuilder> 
      getDataOrBuilderList();
  /**
   * <pre>
   * String key, String value pair.
   * </pre>
   *
   * <code>repeated .skywalking.v3.KeyStringValuePair data = 2;</code>
   */
  org.apache.skywalking.apm.network.common.v3.KeyStringValuePairOrBuilder getDataOrBuilder(
      int index);
}
