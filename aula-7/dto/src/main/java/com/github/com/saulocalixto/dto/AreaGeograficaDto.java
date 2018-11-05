package com.github.com.saulocalixto.dto;

/**
 * Created by aluno on 05/11/18.
 */
public class AreaGeograficaDto {

    /**
     * Representa o coigo.
     */
    private int codigo;

    /**
     * Representa o alternativo.
     */
    private String alternativo;

    /**
     * Representa a descrição.
     */
    private String descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAlternativo() {
        return alternativo;
    }

    public void setAlternativo(String alternativo) {
        this.alternativo = alternativo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
