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
    private static final String NOME_JSON_PADRAO = "estabelecimentos";
    public static void main(String[] args) throws IOException {

        String caminhoArquivo = args.length > 0
                ? args[0]
                : caminhoPadrao;

        String nomeJson = args.length > 1
                ? args[1]
                : NOME_JSON_PADRAO;

        ProcessadorDeArquivo processador = new ProcessadorDeArquivo();
        List<Estabelecimento> lista = processador.obtenhaListaDeEstabelecimentos(caminhoArquivo);

        gereArquivoJson(nomeJson, lista);
    }

    private static void gereArquivoJson(String nomeJson, List<Estabelecimento> lista) throws IOException {
        Gson gson = new Gson();

        try (Writer writer = new FileWriter(nomeJson.concat(".json"))) {
            gson.toJson(lista, writer);
        } catch(IOException e) {
            throw new IOException("Ocorreu um erro ao gravar o arquivo json: " + e.getMessage());
        }
    }
}
