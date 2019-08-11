package com.ipay;

import com.gojek.ApplicationConfiguration;
import com.gojek.Figaro;
import com.ipay.interceptor.LogInterceptor;
import com.ipay.service.IpayServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;
import io.grpc.ServerServiceDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

import static java.util.Arrays.asList;

public class IpayApplication {
    private static final Logger logger = LoggerFactory.getLogger(IpayApplication.class);

    public static void main(String[] args) throws Exception {
        logger.info("Starting ipay monolith application");

        ApplicationConfiguration config = Figaro.configure(new HashSet<>(asList(
            "PORT"
        )));

        IpayServiceImpl IpayService = new IpayServiceImpl();
        ServerServiceDefinition serviceDefinition = ServerInterceptors.intercept(IpayService, new LogInterceptor());

        Server server = ServerBuilder
            .forPort(config.getValueAsInt("PORT"))
            .addService(serviceDefinition)
            .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received shutdown request");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));

        server.awaitTermination();
    }
}
