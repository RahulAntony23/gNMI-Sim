package org.example;

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
    comments = "Source: Order.proto")
public final class StudentServceGrpc {

  private StudentServceGrpc() {}

  public static final String SERVICE_NAME = "StudentServce";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.StudentRequest,
      org.example.StudentResponse> getGetStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudent",
      requestType = org.example.StudentRequest.class,
      responseType = org.example.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.StudentRequest,
      org.example.StudentResponse> getGetStudentMethod() {
    io.grpc.MethodDescriptor<org.example.StudentRequest, org.example.StudentResponse> getGetStudentMethod;
    if ((getGetStudentMethod = StudentServceGrpc.getGetStudentMethod) == null) {
      synchronized (StudentServceGrpc.class) {
        if ((getGetStudentMethod = StudentServceGrpc.getGetStudentMethod) == null) {
          StudentServceGrpc.getGetStudentMethod = getGetStudentMethod = 
              io.grpc.MethodDescriptor.<org.example.StudentRequest, org.example.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StudentServce", "GetStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.StudentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServceMethodDescriptorSupplier("GetStudent"))
                  .build();
          }
        }
     }
     return getGetStudentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServceStub newStub(io.grpc.Channel channel) {
    return new StudentServceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentServceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentServceFutureStub(channel);
  }

  /**
   */
  public static abstract class StudentServceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStudent(org.example.StudentRequest request,
        io.grpc.stub.StreamObserver<org.example.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.StudentRequest,
                org.example.StudentResponse>(
                  this, METHODID_GET_STUDENT)))
          .build();
    }
  }

  /**
   */
  public static final class StudentServceStub extends io.grpc.stub.AbstractStub<StudentServceStub> {
    private StudentServceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServceStub(channel, callOptions);
    }

    /**
     */
    public void getStudent(org.example.StudentRequest request,
        io.grpc.stub.StreamObserver<org.example.StudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StudentServceBlockingStub extends io.grpc.stub.AbstractStub<StudentServceBlockingStub> {
    private StudentServceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.StudentResponse getStudent(org.example.StudentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStudentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentServceFutureStub extends io.grpc.stub.AbstractStub<StudentServceFutureStub> {
    private StudentServceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.StudentResponse> getStudent(
        org.example.StudentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STUDENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentServceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentServceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STUDENT:
          serviceImpl.getStudent((org.example.StudentRequest) request,
              (io.grpc.stub.StreamObserver<org.example.StudentResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StudentServceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Order.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentServce");
    }
  }

  private static final class StudentServceFileDescriptorSupplier
      extends StudentServceBaseDescriptorSupplier {
    StudentServceFileDescriptorSupplier() {}
  }

  private static final class StudentServceMethodDescriptorSupplier
      extends StudentServceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentServceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StudentServceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServceFileDescriptorSupplier())
              .addMethod(getGetStudentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
