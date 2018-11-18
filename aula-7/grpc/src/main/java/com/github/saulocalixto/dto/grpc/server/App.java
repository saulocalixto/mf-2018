package com.github.saulocalixto.dto.grpc.server;

import io.grpc.*;

public class App
{
    public static void main( String[] args ) throws Exception {
        Server server = ServerBuilder.forPort(8080)
                .addService(new MostreIndividuoImpl())
                .build();

        server.start();

        System.out.println("Server started");
        server.awaitTermination();
    }
}
