// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opencensus/proto/agent/trace/v1/trace_service.proto

package io.opencensus.proto.agent.trace.v1;

public interface CurrentLibraryConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencensus.proto.agent.trace.v1.CurrentLibraryConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This is required only in the first message on the stream or if the
   * previous sent CurrentLibraryConfig message has a different Node (e.g.
   * when the same RPC is used to configure multiple Applications).
   * </pre>
   *
   * <code>.opencensus.proto.agent.common.v1.Node node = 1;</code>
   * @return Whether the node field is set.
   */
  boolean hasNode();
  /**
   * <pre>
   * This is required only in the first message on the stream or if the
   * previous sent CurrentLibraryConfig message has a different Node (e.g.
   * when the same RPC is used to configure multiple Applications).
   * </pre>
   *
   * <code>.opencensus.proto.agent.common.v1.Node node = 1;</code>
   * @return The node.
   */
  io.opencensus.proto.agent.common.v1.Node getNode();
  /**
   * <pre>
   * This is required only in the first message on the stream or if the
   * previous sent CurrentLibraryConfig message has a different Node (e.g.
   * when the same RPC is used to configure multiple Applications).
   * </pre>
   *
   * <code>.opencensus.proto.agent.common.v1.Node node = 1;</code>
   */
  io.opencensus.proto.agent.common.v1.NodeOrBuilder getNodeOrBuilder();

  /**
   * <pre>
   * Current configuration.
   * </pre>
   *
   * <code>.opencensus.proto.trace.v1.TraceConfig config = 2;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * Current configuration.
   * </pre>
   *
   * <code>.opencensus.proto.trace.v1.TraceConfig config = 2;</code>
   * @return The config.
   */
  io.opencensus.proto.trace.v1.TraceConfig getConfig();
  /**
   * <pre>
   * Current configuration.
   * </pre>
   *
   * <code>.opencensus.proto.trace.v1.TraceConfig config = 2;</code>
   */
  io.opencensus.proto.trace.v1.TraceConfigOrBuilder getConfigOrBuilder();
}
