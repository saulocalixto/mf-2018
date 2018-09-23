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
public class UtilitarioUniversidades {

    /**
     * Posição onde se encontra a sigla do estado.
     */
    private static final int ESTADO_SIGLA = 9;

    /**
     * Tamanho da sigla.
     */
    private static final int TAMANHO_SIGLA = 2;

    /**
     * Separador dos dados.
     */
    private static final String SEPARADOR = ";";

    /**
     * Imprime a quantidade de universidades por estado.
     * Inicialmente recebe uma lista com as informações de
     * todas as universidades, com essa lista as informações
     * são tratadas para ser apresentado ao usuário somente o que interessa.
     * @param arquivo O arquivo com as informações das universidades.
     */
    public final void
    imprimeUniversidadesPorEstado(final List<String> arquivo) {

        System.out.println("Quantidade de universidades por estado:");

        trataListaParaImpressao(arquivo).
                forEach(linha -> System.out.println(linha.toString()));
    }

    /**
     * Trata a lista para mostrar as quantidades
     * de universidades por estados.
     * @param arquivo O arquivo com as informações das universidades.
     * @return Lista com a quantidade de universidades por estado.
     */
    private List<QuantidadeDeUniversidadesPorEstados>
        trataListaParaImpressao(final List<String> arquivo) {

        List<String[]> universidades = arquivo
                .stream()
                .filter(x ->
                        x.split(SEPARADOR).length > ESTADO_SIGLA)
                .map(linha -> linha.split(SEPARADOR))
                .collect(Collectors.toList());

        return universidades
                .stream()
                .filter(linha ->
                        linha[ESTADO_SIGLA].length()
                                == TAMANHO_SIGLA)
                .map(linha ->
                        new QuantidadeDeUniversidadesPorEstados(universidades
                        .stream()
                        .filter(qtd ->
                                qtd[ESTADO_SIGLA].equals(
                                        linha[ESTADO_SIGLA])).count(),
                                        linha[ESTADO_SIGLA]))
                .distinct()
                .sorted(Comparator
                        .comparing(QuantidadeDeUniversidadesPorEstados
                                ::getQuantidade)
                        .reversed())
                .collect(Collectors.toList());
    }
}


