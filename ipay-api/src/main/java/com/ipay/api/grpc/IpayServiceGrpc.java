package com.ipay.api.grpc;

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
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: ipay.proto")
public final class IpayServiceGrpc {

  private IpayServiceGrpc() {}

  public static final String SERVICE_NAME = "com.ipay.api.IpayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ipay.api.grpc.CreateCustomerRequest,
      com.ipay.api.grpc.CreateCustomerResponse> getCreateCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCustomer",
      requestType = com.ipay.api.grpc.CreateCustomerRequest.class,
      responseType = com.ipay.api.grpc.CreateCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ipay.api.grpc.CreateCustomerRequest,
      com.ipay.api.grpc.CreateCustomerResponse> getCreateCustomerMethod() {
    io.grpc.MethodDescriptor<com.ipay.api.grpc.CreateCustomerRequest, com.ipay.api.grpc.CreateCustomerResponse> getCreateCustomerMethod;
    if ((getCreateCustomerMethod = IpayServiceGrpc.getCreateCustomerMethod) == null) {
      synchronized (IpayServiceGrpc.class) {
        if ((getCreateCustomerMethod = IpayServiceGrpc.getCreateCustomerMethod) == null) {
          IpayServiceGrpc.getCreateCustomerMethod = getCreateCustomerMethod = 
              io.grpc.MethodDescriptor.<com.ipay.api.grpc.CreateCustomerRequest, com.ipay.api.grpc.CreateCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.ipay.api.IpayService", "CreateCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ipay.api.grpc.CreateCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ipay.api.grpc.CreateCustomerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IpayServiceMethodDescriptorSupplier("CreateCustomer"))
                  .build();
          }
        }
     }
     return getCreateCustomerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IpayServiceStub newStub(io.grpc.Channel channel) {
    return new IpayServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IpayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IpayServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IpayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IpayServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class IpayServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCustomer(com.ipay.api.grpc.CreateCustomerRequest request,
        io.grpc.stub.StreamObserver<com.ipay.api.grpc.CreateCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCustomerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ipay.api.grpc.CreateCustomerRequest,
                com.ipay.api.grpc.CreateCustomerResponse>(
                  this, METHODID_CREATE_CUSTOMER)))
          .build();
    }
  }

  /**
   */
  public static final class IpayServiceStub extends io.grpc.stub.AbstractStub<IpayServiceStub> {
    private IpayServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IpayServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IpayServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IpayServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCustomer(com.ipay.api.grpc.CreateCustomerRequest request,
        io.grpc.stub.StreamObserver<com.ipay.api.grpc.CreateCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCustomerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IpayServiceBlockingStub extends io.grpc.stub.AbstractStub<IpayServiceBlockingStub> {
    private IpayServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IpayServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IpayServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IpayServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ipay.api.grpc.CreateCustomerResponse createCustomer(com.ipay.api.grpc.CreateCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCustomerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IpayServiceFutureStub extends io.grpc.stub.AbstractStub<IpayServiceFutureStub> {
    private IpayServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IpayServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IpayServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IpayServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ipay.api.grpc.CreateCustomerResponse> createCustomer(
        com.ipay.api.grpc.CreateCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCustomerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CUSTOMER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IpayServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IpayServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CUSTOMER:
          serviceImpl.createCustomer((com.ipay.api.grpc.CreateCustomerRequest) request,
              (io.grpc.stub.StreamObserver<com.ipay.api.grpc.CreateCustomerResponse>) responseObserver);
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

  private static abstract class IpayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IpayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ipay.api.grpc.IpayApiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IpayService");
    }
  }

  private static final class IpayServiceFileDescriptorSupplier
      extends IpayServiceBaseDescriptorSupplier {
    IpayServiceFileDescriptorSupplier() {}
  }

  private static final class IpayServiceMethodDescriptorSupplier
      extends IpayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IpayServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IpayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IpayServiceFileDescriptorSupplier())
              .addMethod(getCreateCustomerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
