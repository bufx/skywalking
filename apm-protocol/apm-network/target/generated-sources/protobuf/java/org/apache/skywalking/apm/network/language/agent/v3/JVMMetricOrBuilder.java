// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/JVMMetric.proto

package org.apache.skywalking.apm.network.language.agent.v3;

public interface JVMMetricOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.JVMMetric)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 time = 1;</code>
   * @return The time.
   */
  long getTime();

  /**
   * <code>.skywalking.v3.CPU cpu = 2;</code>
   * @return Whether the cpu field is set.
   */
  boolean hasCpu();
  /**
   * <code>.skywalking.v3.CPU cpu = 2;</code>
   * @return The cpu.
   */
  org.apache.skywalking.apm.network.common.v3.CPU getCpu();
  /**
   * <code>.skywalking.v3.CPU cpu = 2;</code>
   */
  org.apache.skywalking.apm.network.common.v3.CPUOrBuilder getCpuOrBuilder();

  /**
   * <code>repeated .skywalking.v3.Memory memory = 3;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.language.agent.v3.Memory> 
      getMemoryList();
  /**
   * <code>repeated .skywalking.v3.Memory memory = 3;</code>
   */
  org.apache.skywalking.apm.network.language.agent.v3.Memory getMemory(int index);
  /**
   * <code>repeated .skywalking.v3.Memory memory = 3;</code>
   */
  int getMemoryCount();
  /**
   * <code>repeated .skywalking.v3.Memory memory = 3;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.language.agent.v3.MemoryOrBuilder> 
      getMemoryOrBuilderList();
  /**
   * <code>repeated .skywalking.v3.Memory memory = 3;</code>
   */
  org.apache.skywalking.apm.network.language.agent.v3.MemoryOrBuilder getMemoryOrBuilder(
      int index);

  /**
   * <code>repeated .skywalking.v3.MemoryPool memoryPool = 4;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.language.agent.v3.MemoryPool> 
      getMemoryPoolList();
  /**
   * <code>repeated .skywalking.v3.MemoryPool memoryPool = 4;</code>
   */
  org.apache.skywalking.apm.network.language.agent.v3.MemoryPool getMemoryPool(int index);
  /**
   * <code>repeated .skywalking.v3.MemoryPool memoryPool = 4;</code>
   */
  int getMemoryPoolCount();
  /**
   * <code>repeated .skywalking.v3.MemoryPool memoryPool = 4;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.language.agent.v3.MemoryPoolOrBuilder> 
      getMemoryPoolOrBuilderList();
  /**
   * <code>repeated .skywalking.v3.MemoryPool memoryPool = 4;</code>
   */
  org.apache.skywalking.apm.network.language.agent.v3.MemoryPoolOrBuilder getMemoryPoolOrBuilder(
      int index);

  /**
   * <code>repeated .skywalking.v3.GC gc = 5;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.language.agent.v3.GC> 
      getGcList();
  /**
   * <code>repeated .skywalking.v3.GC gc = 5;</code>
   */
  org.apache.skywalking.apm.network.language.agent.v3.GC getGc(int index);
  /**
   * <code>repeated .skywalking.v3.GC gc = 5;</code>
   */
  int getGcCount();
  /**
   * <code>repeated .skywalking.v3.GC gc = 5;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.language.agent.v3.GCOrBuilder> 
      getGcOrBuilderList();
  /**
   * <code>repeated .skywalking.v3.GC gc = 5;</code>
   */
  org.apache.skywalking.apm.network.language.agent.v3.GCOrBuilder getGcOrBuilder(
      int index);

  /**
   * <code>.skywalking.v3.Thread thread = 6;</code>
   * @return Whether the thread field is set.
   */
  boolean hasThread();
  /**
   * <code>.skywalking.v3.Thread thread = 6;</code>
   * @return The thread.
   */
  org.apache.skywalking.apm.network.language.agent.v3.Thread getThread();
  /**
   * <code>.skywalking.v3.Thread thread = 6;</code>
   */
  org.apache.skywalking.apm.network.language.agent.v3.ThreadOrBuilder getThreadOrBuilder();
}
