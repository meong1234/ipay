package com.ipay.client;

import com.gojek.ApplicationConfiguration;
import com.gojek.Figaro;
import com.ipay.api.grpc.CreateCustomerRequest;
import com.ipay.api.grpc.CreateCustomerResponse;
import com.ipay.api.grpc.IpayServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.HashSet;

import static java.util.Arrays.asList;

public class IpayClient {

    private final ManagedChannel channel;
    private IpayServiceGrpc.IpayServiceBlockingStub stub;


    public IpayClient() {
        ApplicationConfiguration config = Figaro.configure(new HashSet<>(asList(
            "IPAY_HOST",
            "IPAY_PORT"
        )));

        channel = ManagedChannelBuilder
            .forAddress(config.getValueAsString("IPAY_HOST"), config.getValueAsInt("IPAY_PORT"))
            .usePlaintext()
            .build();

        stub = IpayServiceGrpc.newBlockingStub(channel);
    }


    public CreateCustomerResponse createCustomer(CreateCustomerRequest request) {
        return stub.createCustomer(request);
    }

}
