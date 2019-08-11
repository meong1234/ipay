package com.ipay;

import com.ipay.api.Ipay;
import com.ipay.client.IpayClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IpayApplication {
    private static final Logger logger = LoggerFactory.getLogger(IpayApplication.class);

    public static void main(String[] args) throws Exception {
        logger.info("Starting ipay client");

        IpayClient ipayClient = new IpayClient();

        Ipay.CreateCustomerRequest createCustomerRequest = Ipay.CreateCustomerRequest.newBuilder()
            .setName("some-random-name")
            .setEmail("randomemail@email.com")
            .setPhonenumber("somephoenumber")
            .build();

        Ipay.CreateCustomerResponse response = ipayClient.createCustomer(createCustomerRequest);
        if (response.getReply().getSuccess()) {
            logger.info("success");
        }
    }
}
