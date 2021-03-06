// Copyright (c) 2009 Shardul Deo
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
//
// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.googlecode.protobuf.socketrpc;

public final class SocketRpcProtos {
  private SocketRpcProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum ErrorReason
      implements com.google.protobuf.ProtocolMessageEnum {
    BAD_REQUEST_DATA(0, 0),
    BAD_REQUEST_PROTO(1, 1),
    SERVICE_NOT_FOUND(2, 2),
    METHOD_NOT_FOUND(3, 3),
    RPC_ERROR(4, 4),
    RPC_FAILED(5, 5),
    INVALID_REQUEST_PROTO(6, 6),
    BAD_RESPONSE_PROTO(7, 7),
    UNKNOWN_HOST(8, 8),
    IO_ERROR(9, 9),
    ;


    public final int getNumber() { return value; }

    public static ErrorReason valueOf(int value) {
      switch (value) {
        case 0: return BAD_REQUEST_DATA;
        case 1: return BAD_REQUEST_PROTO;
        case 2: return SERVICE_NOT_FOUND;
        case 3: return METHOD_NOT_FOUND;
        case 4: return RPC_ERROR;
        case 5: return RPC_FAILED;
        case 6: return INVALID_REQUEST_PROTO;
        case 7: return BAD_RESPONSE_PROTO;
        case 8: return UNKNOWN_HOST;
        case 9: return IO_ERROR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ErrorReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ErrorReason>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ErrorReason>() {
            public ErrorReason findValueByNumber(int number) {
              return ErrorReason.valueOf(number)
    ;        }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.googlecode.protobuf.socketrpc.SocketRpcProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final ErrorReason[] VALUES = {
      BAD_REQUEST_DATA, BAD_REQUEST_PROTO, SERVICE_NOT_FOUND, METHOD_NOT_FOUND, RPC_ERROR, RPC_FAILED, INVALID_REQUEST_PROTO, BAD_RESPONSE_PROTO, UNKNOWN_HOST, IO_ERROR,
    };
    public static ErrorReason valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    private final int index;
    private final int value;
    private ErrorReason(int index, int value) {
      this.index = index;
      this.value = value;
    }

    static {
      com.googlecode.protobuf.socketrpc.SocketRpcProtos.getDescriptor();
    }
  }

  public static final class Request extends
      com.google.protobuf.GeneratedMessage {
    // Use Request.newBuilder() to construct.
    private Request() {}

    private static final Request defaultInstance = new Request();
    public static Request getDefaultInstance() {
      return defaultInstance;
    }

    public Request getDefaultInstanceForType() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.googlecode.protobuf.socketrpc.SocketRpcProtos.internal_static_protobuf_socketrpc_Request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.googlecode.protobuf.socketrpc.SocketRpcProtos.internal_static_protobuf_socketrpc_Request_fieldAccessorTable;
    }

    // required string service_name = 1;
    public static final int SERVICE_NAME_FIELD_NUMBER = 1;
    private boolean hasServiceName;
    private java.lang.String serviceName_ = "";
    public boolean hasServiceName() { return hasServiceName; }
    public java.lang.String getServiceName() { return serviceName_; }

    // required string method_name = 2;
    public static final int METHOD_NAME_FIELD_NUMBER = 2;
    private boolean hasMethodName;
    private java.lang.String methodName_ = "";
    public boolean hasMethodName() { return hasMethodName; }
    public java.lang.String getMethodName() { return methodName_; }

    // required bytes request_proto = 3;
    public static final int REQUEST_PROTO_FIELD_NUMBER = 3;
    private boolean hasRequestProto;
    private com.google.protobuf.ByteString requestProto_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasRequestProto() { return hasRequestProto; }
    public com.google.protobuf.ByteString getRequestProto() { return requestProto_; }

    public final boolean isInitialized() {
      if (!hasServiceName) return false;
      if (!hasMethodName) return false;
      if (!hasRequestProto) return false;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasServiceName()) {
        output.writeString(1, getServiceName());
      }
      if (hasMethodName()) {
        output.writeString(2, getMethodName());
      }
      if (hasRequestProto()) {
        output.writeBytes(3, getRequestProto());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasServiceName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getServiceName());
      }
      if (hasMethodName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getMethodName());
      }
      if (hasRequestProto()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getRequestProto());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request result;

      // Construct using com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request();
        return builder;
      }

      protected com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request.getDescriptor();
      }

      public com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request getDefaultInstanceForType() {
        return com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request) {
          return mergeFrom((com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request other) {
        if (other == com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request.getDefaultInstance()) return this;
        if (other.hasServiceName()) {
          setServiceName(other.getServiceName());
        }
        if (other.hasMethodName()) {
          setMethodName(other.getMethodName());
        }
        if (other.hasRequestProto()) {
          setRequestProto(other.getRequestProto());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setServiceName(input.readString());
              break;
            }
            case 18: {
              setMethodName(input.readString());
              break;
            }
            case 26: {
              setRequestProto(input.readBytes());
              break;
            }
          }
        }
      }


      // required string service_name = 1;
      public boolean hasServiceName() {
        return result.hasServiceName();
      }
      public java.lang.String getServiceName() {
        return result.getServiceName();
      }
      public Builder setServiceName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasServiceName = true;
        result.serviceName_ = value;
        return this;
      }
      public Builder clearServiceName() {
        result.hasServiceName = false;
        result.serviceName_ = getDefaultInstance().getServiceName();
        return this;
      }

      // required string method_name = 2;
      public boolean hasMethodName() {
        return result.hasMethodName();
      }
      public java.lang.String getMethodName() {
        return result.getMethodName();
      }
      public Builder setMethodName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasMethodName = true;
        result.methodName_ = value;
        return this;
      }
      public Builder clearMethodName() {
        result.hasMethodName = false;
        result.methodName_ = getDefaultInstance().getMethodName();
        return this;
      }

      // required bytes request_proto = 3;
      public boolean hasRequestProto() {
        return result.hasRequestProto();
      }
      public com.google.protobuf.ByteString getRequestProto() {
        return result.getRequestProto();
      }
      public Builder setRequestProto(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasRequestProto = true;
        result.requestProto_ = value;
        return this;
      }
      public Builder clearRequestProto() {
        result.hasRequestProto = false;
        result.requestProto_ = getDefaultInstance().getRequestProto();
        return this;
      }
    }

    static {
      com.googlecode.protobuf.socketrpc.SocketRpcProtos.getDescriptor();
    }

    static {
      com.googlecode.protobuf.socketrpc.SocketRpcProtos.internalForceInit();
    }
  }

  public static final class Response extends
      com.google.protobuf.GeneratedMessage {
    // Use Response.newBuilder() to construct.
    private Response() {}

    private static final Response defaultInstance = new Response();
    public static Response getDefaultInstance() {
      return defaultInstance;
    }

    public Response getDefaultInstanceForType() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.googlecode.protobuf.socketrpc.SocketRpcProtos.internal_static_protobuf_socketrpc_Response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.googlecode.protobuf.socketrpc.SocketRpcProtos.internal_static_protobuf_socketrpc_Response_fieldAccessorTable;
    }

    // optional bytes response_proto = 1;
    public static final int RESPONSE_PROTO_FIELD_NUMBER = 1;
    private boolean hasResponseProto;
    private com.google.protobuf.ByteString responseProto_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasResponseProto() { return hasResponseProto; }
    public com.google.protobuf.ByteString getResponseProto() { return responseProto_; }

    // optional string error = 2;
    public static final int ERROR_FIELD_NUMBER = 2;
    private boolean hasError;
    private java.lang.String error_ = "";
    public boolean hasError() { return hasError; }
    public java.lang.String getError() { return error_; }

    // optional bool callback = 3 [default = false];
    public static final int CALLBACK_FIELD_NUMBER = 3;
    private boolean hasCallback;
    private boolean callback_ = false;
    public boolean hasCallback() { return hasCallback; }
    public boolean getCallback() { return callback_; }

    // optional .protobuf.socketrpc.ErrorReason error_reason = 4;
    public static final int ERROR_REASON_FIELD_NUMBER = 4;
    private boolean hasErrorReason;
    private com.googlecode.protobuf.socketrpc.SocketRpcProtos.ErrorReason errorReason_ = com.googlecode.protobuf.socketrpc.SocketRpcProtos.ErrorReason.BAD_REQUEST_DATA;
    public boolean hasErrorReason() { return hasErrorReason; }
    public com.googlecode.protobuf.socketrpc.SocketRpcProtos.ErrorReason getErrorReason() { return errorReason_; }

    public final boolean isInitialized() {
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasResponseProto()) {
        output.writeBytes(1, getResponseProto());
      }
      if (hasError()) {
        output.writeString(2, getError());
      }
      if (hasCallback()) {
        output.writeBool(3, getCallback());
      }
      if (hasErrorReason()) {
        output.writeEnum(4, getErrorReason().getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasResponseProto()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getResponseProto());
      }
      if (hasError()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getError());
      }
      if (hasCallback()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, getCallback());
      }
      if (hasErrorReason()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, getErrorReason().getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response result;

      // Construct using com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response();
        return builder;
      }

      protected com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response.getDescriptor();
      }

      public com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response getDefaultInstanceForType() {
        return com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response) {
          return mergeFrom((com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response other) {
        if (other == com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response.getDefaultInstance()) return this;
        if (other.hasResponseProto()) {
          setResponseProto(other.getResponseProto());
        }
        if (other.hasError()) {
          setError(other.getError());
        }
        if (other.hasCallback()) {
          setCallback(other.getCallback());
        }
        if (other.hasErrorReason()) {
          setErrorReason(other.getErrorReason());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setResponseProto(input.readBytes());
              break;
            }
            case 18: {
              setError(input.readString());
              break;
            }
            case 24: {
              setCallback(input.readBool());
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              com.googlecode.protobuf.socketrpc.SocketRpcProtos.ErrorReason value = com.googlecode.protobuf.socketrpc.SocketRpcProtos.ErrorReason.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                setErrorReason(value);
              }
              break;
            }
          }
        }
      }


      // optional bytes response_proto = 1;
      public boolean hasResponseProto() {
        return result.hasResponseProto();
      }
      public com.google.protobuf.ByteString getResponseProto() {
        return result.getResponseProto();
      }
      public Builder setResponseProto(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasResponseProto = true;
        result.responseProto_ = value;
        return this;
      }
      public Builder clearResponseProto() {
        result.hasResponseProto = false;
        result.responseProto_ = getDefaultInstance().getResponseProto();
        return this;
      }

      // optional string error = 2;
      public boolean hasError() {
        return result.hasError();
      }
      public java.lang.String getError() {
        return result.getError();
      }
      public Builder setError(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasError = true;
        result.error_ = value;
        return this;
      }
      public Builder clearError() {
        result.hasError = false;
        result.error_ = getDefaultInstance().getError();
        return this;
      }

      // optional bool callback = 3 [default = false];
      public boolean hasCallback() {
        return result.hasCallback();
      }
      public boolean getCallback() {
        return result.getCallback();
      }
      public Builder setCallback(boolean value) {
        result.hasCallback = true;
        result.callback_ = value;
        return this;
      }
      public Builder clearCallback() {
        result.hasCallback = false;
        result.callback_ = false;
        return this;
      }

      // optional .protobuf.socketrpc.ErrorReason error_reason = 4;
      public boolean hasErrorReason() {
        return result.hasErrorReason();
      }
      public com.googlecode.protobuf.socketrpc.SocketRpcProtos.ErrorReason getErrorReason() {
        return result.getErrorReason();
      }
      public Builder setErrorReason(com.googlecode.protobuf.socketrpc.SocketRpcProtos.ErrorReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasErrorReason = true;
        result.errorReason_ = value;
        return this;
      }
      public Builder clearErrorReason() {
        result.hasErrorReason = false;
        result.errorReason_ = com.googlecode.protobuf.socketrpc.SocketRpcProtos.ErrorReason.BAD_REQUEST_DATA;
        return this;
      }
    }

    static {
      com.googlecode.protobuf.socketrpc.SocketRpcProtos.getDescriptor();
    }

    static {
      com.googlecode.protobuf.socketrpc.SocketRpcProtos.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_socketrpc_Request_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobuf_socketrpc_Request_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_socketrpc_Response_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobuf_socketrpc_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\trpc.proto\022\022protobuf.socketrpc\"K\n\007Reque" +
      "st\022\024\n\014service_name\030\001 \002(\t\022\023\n\013method_name\030" +
      "\002 \002(\t\022\025\n\rrequest_proto\030\003 \002(\014\"\201\001\n\010Respons" +
      "e\022\026\n\016response_proto\030\001 \001(\014\022\r\n\005error\030\002 \001(\t" +
      "\022\027\n\010callback\030\003 \001(\010:\005false\0225\n\014error_reaso" +
      "n\030\004 \001(\0162\037.protobuf.socketrpc.ErrorReason" +
      "*\331\001\n\013ErrorReason\022\024\n\020BAD_REQUEST_DATA\020\000\022\025" +
      "\n\021BAD_REQUEST_PROTO\020\001\022\025\n\021SERVICE_NOT_FOU" +
      "ND\020\002\022\024\n\020METHOD_NOT_FOUND\020\003\022\r\n\tRPC_ERROR\020" +
      "\004\022\016\n\nRPC_FAILED\020\005\022\031\n\025INVALID_REQUEST_PRO",
      "TO\020\006\022\026\n\022BAD_RESPONSE_PROTO\020\007\022\020\n\014UNKNOWN_" +
      "HOST\020\010\022\014\n\010IO_ERROR\020\tB4\n!com.googlecode.p" +
      "rotobuf.socketrpcB\017SocketRpcProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_protobuf_socketrpc_Request_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_protobuf_socketrpc_Request_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protobuf_socketrpc_Request_descriptor,
              new java.lang.String[] { "ServiceName", "MethodName", "RequestProto", },
              com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request.class,
              com.googlecode.protobuf.socketrpc.SocketRpcProtos.Request.Builder.class);
          internal_static_protobuf_socketrpc_Response_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_protobuf_socketrpc_Response_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protobuf_socketrpc_Response_descriptor,
              new java.lang.String[] { "ResponseProto", "Error", "Callback", "ErrorReason", },
              com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response.class,
              com.googlecode.protobuf.socketrpc.SocketRpcProtos.Response.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  public static void internalForceInit() {}
}
