package com.github.gnmi.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: gnmi.proto")
public final class gNMIGrpc {

  private gNMIGrpc() {}

  public static final String SERVICE_NAME = "gnmi.gNMI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.gnmi.proto.CapabilityRequest,
      com.github.gnmi.proto.CapabilityResponse> getCapabilitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Capabilities",
      requestType = com.github.gnmi.proto.CapabilityRequest.class,
      responseType = com.github.gnmi.proto.CapabilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.gnmi.proto.CapabilityRequest,
      com.github.gnmi.proto.CapabilityResponse> getCapabilitiesMethod() {
    io.grpc.MethodDescriptor<com.github.gnmi.proto.CapabilityRequest, com.github.gnmi.proto.CapabilityResponse> getCapabilitiesMethod;
    if ((getCapabilitiesMethod = gNMIGrpc.getCapabilitiesMethod) == null) {
      synchronized (gNMIGrpc.class) {
        if ((getCapabilitiesMethod = gNMIGrpc.getCapabilitiesMethod) == null) {
          gNMIGrpc.getCapabilitiesMethod = getCapabilitiesMethod = 
              io.grpc.MethodDescriptor.<com.github.gnmi.proto.CapabilityRequest, com.github.gnmi.proto.CapabilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gnmi.gNMI", "Capabilities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.gnmi.proto.CapabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.gnmi.proto.CapabilityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new gNMIMethodDescriptorSupplier("Capabilities"))
                  .build();
          }
        }
     }
     return getCapabilitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.gnmi.proto.GetRequest,
      com.github.gnmi.proto.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.github.gnmi.proto.GetRequest.class,
      responseType = com.github.gnmi.proto.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.gnmi.proto.GetRequest,
      com.github.gnmi.proto.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.github.gnmi.proto.GetRequest, com.github.gnmi.proto.GetResponse> getGetMethod;
    if ((getGetMethod = gNMIGrpc.getGetMethod) == null) {
      synchronized (gNMIGrpc.class) {
        if ((getGetMethod = gNMIGrpc.getGetMethod) == null) {
          gNMIGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<com.github.gnmi.proto.GetRequest, com.github.gnmi.proto.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gnmi.gNMI", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.gnmi.proto.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.gnmi.proto.GetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new gNMIMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.gnmi.proto.SetRequest,
      com.github.gnmi.proto.SetResponse> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Set",
      requestType = com.github.gnmi.proto.SetRequest.class,
      responseType = com.github.gnmi.proto.SetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.gnmi.proto.SetRequest,
      com.github.gnmi.proto.SetResponse> getSetMethod() {
    io.grpc.MethodDescriptor<com.github.gnmi.proto.SetRequest, com.github.gnmi.proto.SetResponse> getSetMethod;
    if ((getSetMethod = gNMIGrpc.getSetMethod) == null) {
      synchronized (gNMIGrpc.class) {
        if ((getSetMethod = gNMIGrpc.getSetMethod) == null) {
          gNMIGrpc.getSetMethod = getSetMethod = 
              io.grpc.MethodDescriptor.<com.github.gnmi.proto.SetRequest, com.github.gnmi.proto.SetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gnmi.gNMI", "Set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.gnmi.proto.SetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.gnmi.proto.SetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new gNMIMethodDescriptorSupplier("Set"))
                  .build();
          }
        }
     }
     return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.gnmi.proto.SubscribeRequest,
      com.github.gnmi.proto.SubscribeResponse> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = com.github.gnmi.proto.SubscribeRequest.class,
      responseType = com.github.gnmi.proto.SubscribeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.github.gnmi.proto.SubscribeRequest,
      com.github.gnmi.proto.SubscribeResponse> getSubscribeMethod() {
    io.grpc.MethodDescriptor<com.github.gnmi.proto.SubscribeRequest, com.github.gnmi.proto.SubscribeResponse> getSubscribeMethod;
    if ((getSubscribeMethod = gNMIGrpc.getSubscribeMethod) == null) {
      synchronized (gNMIGrpc.class) {
        if ((getSubscribeMethod = gNMIGrpc.getSubscribeMethod) == null) {
          gNMIGrpc.getSubscribeMethod = getSubscribeMethod = 
              io.grpc.MethodDescriptor.<com.github.gnmi.proto.SubscribeRequest, com.github.gnmi.proto.SubscribeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "gnmi.gNMI", "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.gnmi.proto.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.gnmi.proto.SubscribeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new gNMIMethodDescriptorSupplier("Subscribe"))
                  .build();
          }
        }
     }
     return getSubscribeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static gNMIStub newStub(io.grpc.Channel channel) {
    return new gNMIStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static gNMIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new gNMIBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static gNMIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new gNMIFutureStub(channel);
  }

  /**
   */
  public static abstract class gNMIImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Capabilities allows the client to retrieve the set of capabilities that
     * is supported by the target. This allows the target to validate the
     * service version that is implemented and retrieve the set of models that
     * the target supports. The models can then be specified in subsequent RPCs
     * to restrict the set of data that is utilized.
     * Reference: gNMI Specification Section 3.2
     * </pre>
     */
    public void capabilities(com.github.gnmi.proto.CapabilityRequest request,
        io.grpc.stub.StreamObserver<com.github.gnmi.proto.CapabilityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCapabilitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a snapshot of data from the target. A Get RPC requests that the
     * target snapshots a subset of the data tree as specified by the paths
     * included in the message and serializes this to be returned to the
     * client using the specified encoding.
     * Reference: gNMI Specification Section 3.3
     * </pre>
     */
    public void get(com.github.gnmi.proto.GetRequest request,
        io.grpc.stub.StreamObserver<com.github.gnmi.proto.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set allows the client to modify the state of data on the target. The
     * paths to modified along with the new values that the client wishes
     * to set the value to.
     * Reference: gNMI Specification Section 3.4
     * </pre>
     */
    public void set(com.github.gnmi.proto.SetRequest request,
        io.grpc.stub.StreamObserver<com.github.gnmi.proto.SetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe allows a client to request the target to send it values
     * of particular paths within the data tree. These values may be streamed
     * at a particular cadence (STREAM), sent one off on a long-lived channel
     * (POLL), or sent as a one-off retrieval (ONCE).
     * Reference: gNMI Specification Section 3.5
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.github.gnmi.proto.SubscribeRequest> subscribe(
        io.grpc.stub.StreamObserver<com.github.gnmi.proto.SubscribeResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSubscribeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCapabilitiesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.gnmi.proto.CapabilityRequest,
                com.github.gnmi.proto.CapabilityResponse>(
                  this, METHODID_CAPABILITIES)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.gnmi.proto.GetRequest,
                com.github.gnmi.proto.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.gnmi.proto.SetRequest,
                com.github.gnmi.proto.SetResponse>(
                  this, METHODID_SET)))
          .addMethod(
            getSubscribeMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.github.gnmi.proto.SubscribeRequest,
                com.github.gnmi.proto.SubscribeResponse>(
                  this, METHODID_SUBSCRIBE)))
          .build();
    }
  }

  /**
   */
  public static final class gNMIStub extends io.grpc.stub.AbstractStub<gNMIStub> {
    private gNMIStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gNMIStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gNMIStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gNMIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capabilities allows the client to retrieve the set of capabilities that
     * is supported by the target. This allows the target to validate the
     * service version that is implemented and retrieve the set of models that
     * the target supports. The models can then be specified in subsequent RPCs
     * to restrict the set of data that is utilized.
     * Reference: gNMI Specification Section 3.2
     * </pre>
     */
    public void capabilities(com.github.gnmi.proto.CapabilityRequest request,
        io.grpc.stub.StreamObserver<com.github.gnmi.proto.CapabilityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCapabilitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a snapshot of data from the target. A Get RPC requests that the
     * target snapshots a subset of the data tree as specified by the paths
     * included in the message and serializes this to be returned to the
     * client using the specified encoding.
     * Reference: gNMI Specification Section 3.3
     * </pre>
     */
    public void get(com.github.gnmi.proto.GetRequest request,
        io.grpc.stub.StreamObserver<com.github.gnmi.proto.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set allows the client to modify the state of data on the target. The
     * paths to modified along with the new values that the client wishes
     * to set the value to.
     * Reference: gNMI Specification Section 3.4
     * </pre>
     */
    public void set(com.github.gnmi.proto.SetRequest request,
        io.grpc.stub.StreamObserver<com.github.gnmi.proto.SetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe allows a client to request the target to send it values
     * of particular paths within the data tree. These values may be streamed
     * at a particular cadence (STREAM), sent one off on a long-lived channel
     * (POLL), or sent as a one-off retrieval (ONCE).
     * Reference: gNMI Specification Section 3.5
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.github.gnmi.proto.SubscribeRequest> subscribe(
        io.grpc.stub.StreamObserver<com.github.gnmi.proto.SubscribeResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class gNMIBlockingStub extends io.grpc.stub.AbstractStub<gNMIBlockingStub> {
    private gNMIBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gNMIBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gNMIBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gNMIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capabilities allows the client to retrieve the set of capabilities that
     * is supported by the target. This allows the target to validate the
     * service version that is implemented and retrieve the set of models that
     * the target supports. The models can then be specified in subsequent RPCs
     * to restrict the set of data that is utilized.
     * Reference: gNMI Specification Section 3.2
     * </pre>
     */
    public com.github.gnmi.proto.CapabilityResponse capabilities(com.github.gnmi.proto.CapabilityRequest request) {
      return blockingUnaryCall(
          getChannel(), getCapabilitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a snapshot of data from the target. A Get RPC requests that the
     * target snapshots a subset of the data tree as specified by the paths
     * included in the message and serializes this to be returned to the
     * client using the specified encoding.
     * Reference: gNMI Specification Section 3.3
     * </pre>
     */
    public com.github.gnmi.proto.GetResponse get(com.github.gnmi.proto.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set allows the client to modify the state of data on the target. The
     * paths to modified along with the new values that the client wishes
     * to set the value to.
     * Reference: gNMI Specification Section 3.4
     * </pre>
     */
    public com.github.gnmi.proto.SetResponse set(com.github.gnmi.proto.SetRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class gNMIFutureStub extends io.grpc.stub.AbstractStub<gNMIFutureStub> {
    private gNMIFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gNMIFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gNMIFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gNMIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capabilities allows the client to retrieve the set of capabilities that
     * is supported by the target. This allows the target to validate the
     * service version that is implemented and retrieve the set of models that
     * the target supports. The models can then be specified in subsequent RPCs
     * to restrict the set of data that is utilized.
     * Reference: gNMI Specification Section 3.2
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.gnmi.proto.CapabilityResponse> capabilities(
        com.github.gnmi.proto.CapabilityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCapabilitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a snapshot of data from the target. A Get RPC requests that the
     * target snapshots a subset of the data tree as specified by the paths
     * included in the message and serializes this to be returned to the
     * client using the specified encoding.
     * Reference: gNMI Specification Section 3.3
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.gnmi.proto.GetResponse> get(
        com.github.gnmi.proto.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set allows the client to modify the state of data on the target. The
     * paths to modified along with the new values that the client wishes
     * to set the value to.
     * Reference: gNMI Specification Section 3.4
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.gnmi.proto.SetResponse> set(
        com.github.gnmi.proto.SetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CAPABILITIES = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_SET = 2;
  private static final int METHODID_SUBSCRIBE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final gNMIImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(gNMIImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CAPABILITIES:
          serviceImpl.capabilities((com.github.gnmi.proto.CapabilityRequest) request,
              (io.grpc.stub.StreamObserver<com.github.gnmi.proto.CapabilityResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.github.gnmi.proto.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.github.gnmi.proto.GetResponse>) responseObserver);
          break;
        case METHODID_SET:
          serviceImpl.set((com.github.gnmi.proto.SetRequest) request,
              (io.grpc.stub.StreamObserver<com.github.gnmi.proto.SetResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.subscribe(
              (io.grpc.stub.StreamObserver<com.github.gnmi.proto.SubscribeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class gNMIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    gNMIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.gnmi.proto.GnmiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("gNMI");
    }
  }

  private static final class gNMIFileDescriptorSupplier
      extends gNMIBaseDescriptorSupplier {
    gNMIFileDescriptorSupplier() {}
  }

  private static final class gNMIMethodDescriptorSupplier
      extends gNMIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    gNMIMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (gNMIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new gNMIFileDescriptorSupplier())
              .addMethod(getCapabilitiesMethod())
              .addMethod(getGetMethod())
              .addMethod(getSetMethod())
              .addMethod(getSubscribeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
