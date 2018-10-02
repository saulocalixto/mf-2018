package com.github.saulocalixto.cnes;

import java.io.IOException;

/**
 * Created by aluno on 01/10/18.
 */
public class Aplicacao {
    private static final String caminhoPadrao = "http://mirror.nbtelecom.com.br/apache/maven/maven-3/3.5.4/binaries/apache-maven-3.5.4-bin.zip";
    public static void main(String[] args) throws IOException {

        String caminhoArquivo = args.length > 0
                ? args[0]
                : caminhoPadrao;

        ObtentorDeDados dado = new ObtentorDeDados();
        dado.pegarLeitor(caminhoArquivo);

    }
}
