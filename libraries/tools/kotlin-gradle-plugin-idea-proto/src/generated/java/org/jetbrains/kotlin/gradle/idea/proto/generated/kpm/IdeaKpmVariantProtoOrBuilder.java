// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_kpm.proto

package org.jetbrains.kotlin.gradle.idea.proto.generated.kpm;

public interface IdeaKpmVariantProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmVariantProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentProto fragment = 1;</code>
   * @return Whether the fragment field is set.
   */
  boolean hasFragment();
  /**
   * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentProto fragment = 1;</code>
   * @return The fragment.
   */
  org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentProto getFragment();
  /**
   * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentProto fragment = 1;</code>
   */
  org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmFragmentProtoOrBuilder getFragmentOrBuilder();

  /**
   * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmPlatformProto platform = 2;</code>
   * @return Whether the platform field is set.
   */
  boolean hasPlatform();
  /**
   * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmPlatformProto platform = 2;</code>
   * @return The platform.
   */
  org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmPlatformProto getPlatform();
  /**
   * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmPlatformProto platform = 2;</code>
   */
  org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmPlatformProtoOrBuilder getPlatformOrBuilder();

  /**
   * <code>map&lt;string, string&gt; variant_attributes = 3;</code>
   */
  int getVariantAttributesCount();
  /**
   * <code>map&lt;string, string&gt; variant_attributes = 3;</code>
   */
  boolean containsVariantAttributes(
      java.lang.String key);
  /**
   * Use {@link #getVariantAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getVariantAttributes();
  /**
   * <code>map&lt;string, string&gt; variant_attributes = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getVariantAttributesMap();
  /**
   * <code>map&lt;string, string&gt; variant_attributes = 3;</code>
   */

  /* nullable */
java.lang.String getVariantAttributesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; variant_attributes = 3;</code>
   */

  java.lang.String getVariantAttributesOrThrow(
      java.lang.String key);

  /**
   * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmCompilationOutputProto compilation_output = 4;</code>
   * @return Whether the compilationOutput field is set.
   */
  boolean hasCompilationOutput();
  /**
   * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmCompilationOutputProto compilation_output = 4;</code>
   * @return The compilationOutput.
   */
  org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmCompilationOutputProto getCompilationOutput();
  /**
   * <code>optional .org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmCompilationOutputProto compilation_output = 4;</code>
   */
  org.jetbrains.kotlin.gradle.idea.proto.generated.kpm.IdeaKpmCompilationOutputProtoOrBuilder getCompilationOutputOrBuilder();
}
