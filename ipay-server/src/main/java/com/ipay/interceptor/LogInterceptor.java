package com.ipay.interceptor;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.logstash.logback.marker.Markers.append;

public class LogInterceptor implements ServerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LogInterceptor.class);

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {

        logger.info("method "+call.getMethodDescriptor().getFullMethodName());

        logger.info(
            append("method", call.getMethodDescriptor().getFullMethodName()).and(
            append("attribute", call.getAttributes().toString())),
            "INCOMING REQUEST");

        return next.startCall(call, headers);
    }
}
