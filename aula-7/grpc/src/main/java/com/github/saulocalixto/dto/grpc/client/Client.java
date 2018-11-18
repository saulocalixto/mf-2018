package com.github.saulocalixto.dto.grpc.client;

import com.github.saulocalixto.dto.grpc.MostreIndividuoGrpc;
import com.github.saulocalixto.dto.grpc.ServiceIndividuo;
import com.google.protobuf.Timestamp;
import io.grpc.*;

public class Client {
    public static void main( String[] args ) throws Exception {
        // Channel is the abstraction to connect to a service endpoint
        // Let's use plaintext communication because we don't have certs
        final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                .usePlaintext(true)
                .build();

        ServiceIndividuo.Identificador identificador = crieIdentificador();

        MostreIndividuoGrpc.MostreIndividuoBlockingStub stub = MostreIndividuoGrpc.newBlockingStub(channel);

        ServiceIndividuo.Individuo request =
                ServiceIndividuo.Individuo.newBuilder()
                        .setIdentificador(identificador)
                        .build();

        ServiceIndividuo.Resposta response =
                stub.imprimeIndividuo(request);

        System.out.println(response);

        channel.shutdownNow();
    }

    private static ServiceIndividuo.Identificador crieIdentificador() {
        ServiceIndividuo.CodigoDescricao codigoDescricao = ServiceIndividuo.CodigoDescricao.newBuilder()
                .setDescricao("Descricao")
                .setCodigo(500)
                .build();

        ServiceIndividuo.CodigoDescricaoString codigoDescricaoString = ServiceIndividuo.CodigoDescricaoString.newBuilder()
                .setDescricao("Descricao")
                .setCodigo("350")
                .build();

        return ServiceIndividuo.Identificador.newBuilder()
                .setArea(100)
                .setCertidaoTipo(codigoDescricao)
                .setData(Timestamp.newBuilder().build())
                .setTipo(codigoDescricaoString)
                .setEmissor("Estado")
                .setId("52653r4d5f46")
                .build();
    }
}