package com.github.com.saulocalixto.dto;

/**
 * Created by aluno on 12/11/18.
 */
public class MunicipioDto {
    private String codigo;
    private String estado;
    private String municipio;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}
