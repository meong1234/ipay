package com.ipay.api;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.3)",
    comments = "Source: ipay.proto")
public class IpayServiceGrpc {

  private IpayServiceGrpc() {}

  public static final String SERVICE_NAME = "IpayService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.ipay.api.Ipay.CreateCustomerRequest,
      com.ipay.api.Ipay.CreateCustomerResponse> METHOD_CREATE_CUSTOMER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "IpayService", "CreateCustomer"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.ipay.api.Ipay.CreateCustomerRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.ipay.api.Ipay.CreateCustomerResponse.getDefaultInstance()));

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
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
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
    public void createCustomer(com.ipay.api.Ipay.CreateCustomerRequest request,
        io.grpc.stub.StreamObserver<com.ipay.api.Ipay.CreateCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CUSTOMER, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_CUSTOMER,
            asyncUnaryCall(
              new MethodHandlers<
                com.ipay.api.Ipay.CreateCustomerRequest,
                com.ipay.api.Ipay.CreateCustomerResponse>(
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
    public void createCustomer(com.ipay.api.Ipay.CreateCustomerRequest request,
        io.grpc.stub.StreamObserver<com.ipay.api.Ipay.CreateCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CUSTOMER, getCallOptions()), request, responseObserver);
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
    public com.ipay.api.Ipay.CreateCustomerResponse createCustomer(com.ipay.api.Ipay.CreateCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CUSTOMER, getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.ipay.api.Ipay.CreateCustomerResponse> createCustomer(
        com.ipay.api.Ipay.CreateCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CUSTOMER, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CUSTOMER = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IpayServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(IpayServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CUSTOMER:
          serviceImpl.createCustomer((com.ipay.api.Ipay.CreateCustomerRequest) request,
              (io.grpc.stub.StreamObserver<com.ipay.api.Ipay.CreateCustomerResponse>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_CREATE_CUSTOMER);
  }

}
