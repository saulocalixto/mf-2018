/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.saulocalixto.estados;

/**
 *  Classe para agrupar os dados das universidades por Estado.
 *
 * @author Saulo A. Calixto
 *
 */
public class QuantidadeDeUniversidadesPorEstados {

    /**
     * Representa a quantidade de universidades
     * que um estado tem.
     */
    private final long quantidade;

    /**
     * Usado para hash code.
     */
    private static final int MULTIPLICADOR_HASHCODE = 7;

    /**
     * Usado para hash code.
     */
    private static final int MULTIPLICADOR_HASHCODE_2 = 13;

    /**
     * Representa a sigla do estado.
     */
    private String sigla;

    /**
     * Construtor padrão da classe.
     * @param quantidadeEstados Quantidade de universidadfes
     *                   por estado.
     * @param siglaEstado Sigla do estado.
     */
    QuantidadeDeUniversidadesPorEstados(final long quantidadeEstados,
                                        final String siglaEstado) {
        this.quantidade = quantidadeEstados;
        this.sigla = siglaEstado;
    }

    /**
     * Retorna a quantidade de universidades
     * do estado em questão.
     * @return Quantidade de universidades no estado.
     */
    public final long getQuantidade() {
        return quantidade;
    }

    /**
     * Sobreescreve toString() da classe para imprimir os dados da sigla
     * e quantidade já formatados.
     * @return Retorna a string que representa o objeto em questão.
     */
    @Override
    public final String toString() {
        return sigla + " - " + quantidade;
    }

    /**
     * Sobreescreve o equals da classe para que apenas
     * a sigla seja considerada na comparação.
     * @param obj Objeto a ser comparado.
     * @return Um valor booleano informando se os arquivos são iguais ou não.
     */
    @Override
    public final boolean equals(final Object obj) {
        final QuantidadeDeUniversidadesPorEstados objeto =
                (QuantidadeDeUniversidadesPorEstados) obj;
        return this.sigla.equals(objeto.sigla);
    }

    /**
     * Sobreescreve método hashCode para facilitar a comparação
     * de objetos, informando que a chave é a sigla.
     * @return Retorna um inteiro que representa o hashcode do objeto.
     */
    @Override
    public final int hashCode() {
        int hashno = MULTIPLICADOR_HASHCODE;
        hashno = MULTIPLICADOR_HASHCODE_2 * hashno + (sigla == null
                ? 0
                : sigla.hashCode());
        return hashno;
    }
}
