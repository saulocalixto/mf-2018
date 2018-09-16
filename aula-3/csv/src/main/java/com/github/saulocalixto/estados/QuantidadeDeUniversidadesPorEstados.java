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

    private long quantidade;
    private String sigla;

    QuantidadeDeUniversidadesPorEstados(long quantidade, String sigla) {
        this.quantidade = quantidade;
        this.sigla = sigla;
    }

    public long getQuantidade() {
        return quantidade;
    }

    /**
     * Sobreescreve toString() da classe para imprimir os dados da sigla e quantidade já formatados.
     * @return Retorna a string que representa o objeto em questão.
     */
    @Override
    public String toString() {
        return sigla + " - " + quantidade;
    }

    /**
     * Sobreescreve o equals da classe para que apenas a sigla seja considerada na comparação.
     * @param obj Objeto a ser comparado.
     * @return Um valor booleano informando se os arquivos são iguais ou não.
     */
    @Override
    public boolean equals(Object obj) {
        final QuantidadeDeUniversidadesPorEstados objeto = (QuantidadeDeUniversidadesPorEstados)obj;
        return this.sigla.equals(objeto.sigla);
    }

    /**
     * Sobreescreve método hashCode para facilitar a comparação de objetos, informando que a chave é a sigla.
     * @return Retorna um inteiro que representa o hashcode do objeto.
     */
    @Override
    public int hashCode() {
        int hashno = 7;
        hashno = 13 * hashno + (sigla == null ? 0 : sigla.hashCode());
        return hashno;
    }
}
