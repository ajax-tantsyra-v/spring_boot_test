//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: Book.proto

package org.spikeboot.grpc;

@kotlin.jvm.JvmSynthetic
public inline fun book(block: org.spikeboot.grpc.BookKt.Dsl.() -> kotlin.Unit): org.spikeboot.grpc.BookOuterClass.Book =
  org.spikeboot.grpc.BookKt.Dsl._create(org.spikeboot.grpc.BookOuterClass.Book.newBuilder()).apply { block() }._build()
public object BookKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.spikeboot.grpc.BookOuterClass.Book.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.spikeboot.grpc.BookOuterClass.Book.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.spikeboot.grpc.BookOuterClass.Book = _builder.build()

    /**
     * <code>string id = 1;</code>
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>string id = 1;</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>string book_name = 2;</code>
     */
    public var bookName: kotlin.String
      @JvmName("getBookName")
      get() = _builder.getBookName()
      @JvmName("setBookName")
      set(value) {
        _builder.setBookName(value)
      }
    /**
     * <code>string book_name = 2;</code>
     */
    public fun clearBookName() {
      _builder.clearBookName()
    }

    /**
     * <code>string author = 3;</code>
     */
    public var author: kotlin.String
      @JvmName("getAuthor")
      get() = _builder.getAuthor()
      @JvmName("setAuthor")
      set(value) {
        _builder.setAuthor(value)
      }
    /**
     * <code>string author = 3;</code>
     */
    public fun clearAuthor() {
      _builder.clearAuthor()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.spikeboot.grpc.BookOuterClass.Book.copy(block: org.spikeboot.grpc.BookKt.Dsl.() -> kotlin.Unit): org.spikeboot.grpc.BookOuterClass.Book =
  org.spikeboot.grpc.BookKt.Dsl._create(this.toBuilder()).apply { block() }._build()
