package com.ipay.service;

import com.ipay.api.Ipay;
import com.ipay.api.IpayServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.UUID;

public class IpayServiceImpl extends IpayServiceGrpc.IpayServiceImplBase {

    @Override
    public void createCustomer(Ipay.CreateCustomerRequest request, StreamObserver<Ipay.CreateCustomerResponse> responseObserver) {
        Ipay.ServiceGenericReply reply = Ipay.ServiceGenericReply.newBuilder()
            .setSuccess(true)
            .build();

        Ipay.CreateCustomerResponse response = Ipay.CreateCustomerResponse.newBuilder()
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
