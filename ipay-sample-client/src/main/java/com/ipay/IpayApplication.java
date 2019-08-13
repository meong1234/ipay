package com.ipay;

import com.ipay.api.grpc.CreateCustomerRequest;
import com.ipay.api.grpc.CreateCustomerResponse;
import com.ipay.client.IpayClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IpayApplication {
    private static final Logger logger = LoggerFactory.getLogger(IpayApplication.class);

    public static void main(String[] args) throws Exception {
        logger.info("Starting ipay client");

        IpayClient ipayClient = new IpayClient();

        CreateCustomerRequest createCustomerRequest = CreateCustomerRequest.newBuilder()
            .setName("some-random-name")
            .setEmail("randomemail@email.com")
            .setPhonenumber("somephoenumber")
            .build();

        CreateCustomerResponse response = ipayClient.createCustomer(createCustomerRequest);
        if (response.getReply().getSuccess()) {
            logger.info("success");
        }
    }
}
