//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: Book.proto

package org.spikeboot.grpc;

@kotlin.jvm.JvmSynthetic
public inline fun empty(block: org.spikeboot.grpc.EmptyKt.Dsl.() -> kotlin.Unit): org.spikeboot.grpc.BookOuterClass.Empty =
  org.spikeboot.grpc.EmptyKt.Dsl._create(org.spikeboot.grpc.BookOuterClass.Empty.newBuilder()).apply { block() }._build()
public object EmptyKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.spikeboot.grpc.BookOuterClass.Empty.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.spikeboot.grpc.BookOuterClass.Empty.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.spikeboot.grpc.BookOuterClass.Empty = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.spikeboot.grpc.BookOuterClass.Empty.copy(block: org.spikeboot.grpc.EmptyKt.Dsl.() -> kotlin.Unit): org.spikeboot.grpc.BookOuterClass.Empty =
  org.spikeboot.grpc.EmptyKt.Dsl._create(this.toBuilder()).apply { block() }._build()