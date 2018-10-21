package com.github.saulocalixto.cnes;

import java.io.IOException;
import java.util.List;

/**
 * Created by Saulo Calixto on 01/10/18.
 */
public class Aplicacao {
    private static final String CAMINHO_PADRAO = "ftp://ftp.datasus.gov.br/cnes/BASE_DE_DADOS_CNES_201809.ZIP";
    private static final String NOME_JSON_PADRAO = "estabelecimentos";
    public static void main(String[] args) throws IOException {

        String caminhoArquivo = args.length > 0
                ? args[0]
                : CAMINHO_PADRAO;

        String nomeJson = args.length > 1
                ? args[1]
                : NOME_JSON_PADRAO;

        ProcessadorDeArquivo processador = new ProcessadorDeArquivo();

        System.out.println("Processando arquivo, espere um bocado...");

        List<Estabelecimento> lista = processador.obtenhaListaDeEstabelecimentos(caminhoArquivo);

        System.out.println("Gerando arquivo Json...");

        GeradorDeJson gravaorJson = new GeradorDeJson(nomeJson);

        gravaorJson.graveArquivoJson(lista);

        System.out.println("Arquivo json gerado em: ./webapp/src/, parabéns!");


    }
}
