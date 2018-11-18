package com.github.saulocalixto.dto.grpc.server;


import com.github.saulocalixto.dto.grpc.MostreIndividuoGrpc;
import com.github.saulocalixto.dto.grpc.ServiceIndividuo;
import io.grpc.stub.StreamObserver;

public class MostreIndividuoImpl extends MostreIndividuoGrpc.MostreIndividuoImplBase {
    @Override
    public void imprimeIndividuo(ServiceIndividuo.Individuo request, StreamObserver<ServiceIndividuo.Resposta> responseObserver) {
        System.out.println(request.toString());
        final ServiceIndividuo.Resposta resposta = ServiceIndividuo.Resposta.newBuilder()
                .setMensagem("Recebi seu arquivo, be cool!").build();
        responseObserver.onNext(resposta);
        responseObserver.onCompleted();
    }
}
