package com.ipay.service;

import com.ipay.api.grpc.CreateCustomerRequest;
import com.ipay.api.grpc.CreateCustomerResponse;
import com.ipay.api.grpc.IpayServiceGrpc;
import com.ipay.api.grpc.ServiceGenericReply;
import io.grpc.stub.StreamObserver;

import java.util.UUID;

public class IpayServiceImpl extends IpayServiceGrpc.IpayServiceImplBase {

    @Override
    public void createCustomer(CreateCustomerRequest request, StreamObserver<CreateCustomerResponse> responseObserver) {
        ServiceGenericReply reply = ServiceGenericReply.newBuilder()
            .setSuccess(true)
            .build();

        CreateCustomerResponse response = CreateCustomerResponse.newBuilder()
            .setReply(reply)
            .setCustomerId(UUID.randomUUID().toString())
            .setName(request.getName())
            .setEmail(request.getEmail())
            .setPhonenumber(request.getPhonenumber())
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
