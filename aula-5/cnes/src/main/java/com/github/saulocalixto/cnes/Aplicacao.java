package com.github.saulocalixto.cnes;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 * Created by aluno on 01/10/18.
 */
public class Aplicacao {
    private static final String caminhoPadrao = "ftp://ftp.datasus.gov.br/cnes/BASE_DE_DADOS_CNES_201809.ZIP";
    public static void main(String[] args) throws IOException {

        String caminhoArquivo = args.length > 0
                ? args[0]
                : caminhoPadrao;

        CarregaArquivo dado = new CarregaArquivo();
        List<Estabelecimento> lista = dado.pegarLeitor(caminhoArquivo);
        Gson gson = new Gson();

        try (Writer writer = new FileWriter("estabelecimentos.json")) {
            gson.toJson(lista, writer);
        }

    }
}
