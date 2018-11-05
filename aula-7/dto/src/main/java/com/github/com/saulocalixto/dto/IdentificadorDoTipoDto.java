package com.github.com.saulocalixto.dto;

/**
 * Created by Saulo Calixto on 05/11/18.
 */
public class IdentificadorDoTipoDto {

    /**
     * Representa o código.
     */
    private String codigo;

    /**
     * Representa a descricao.
     */
    private String descricao;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
