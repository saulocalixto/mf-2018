/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.saulocalixto.estados;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

/***
 * @author Saulo A. Calixto
 */
public class Universidades {

    private final int ESTADO_SIGLA = 9;
    private final int TAMANHO_SIGLA = 2;

    /**
     * Imprime a quantidade de universidades por estado.
     * Inicialmente recebe uma lista com as informações de todas as universidades, com essa lista as informações
     * são tratadas para ser apresentado ao usuário somente o que interessa.
     * @param arquivo O arquivo com as informações das universidades.
     */
    public void imprimeQtdDeUniversidadesPorEstado(List<String> arquivo) {


        List<String[]> universidades = arquivo
                .stream()
                .filter(x -> x.split(";").length > 10)
                .map(linha -> linha.split(";"))
                .collect(Collectors.toList());


        trataListaParaImpressao(universidades);
    }

    private void trataListaParaImpressao(List<String[]> universidades) {

        System.out.println("Universidades por estados:");

        universidades
                .stream()
                .filter(linha -> linha[ESTADO_SIGLA].length() == TAMANHO_SIGLA)
                .map(linha -> new QuantidadeDeUniversidadesPorEstados(universidades
                        .stream()
                        .filter(qtd ->
                                qtd[ESTADO_SIGLA].equals(linha[ESTADO_SIGLA])).count(), linha[ESTADO_SIGLA]))
                .distinct()
                .sorted(Comparator.comparing(QuantidadeDeUniversidadesPorEstados::getQuantidade).reversed())
                .forEach(linha -> System.out.println(linha.toString()));
    }
}


