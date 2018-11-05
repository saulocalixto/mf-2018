package com.github.com.saulocalixto.dto;

import java.util.Date;

/**
 * Created by Saulo Calixto on 05/11/18.
 */
public class IdentificadorDto {

    /**
     * Representa o id do identificador.
     */
    private String id;

    /**
     * Representa o indivíduo do identificador.
     */
    private String individuo;

    /**
     * Representa a designação.
     */
    private String designacao;

    /**
     * Representa a área.
     */
    private int area;

    /**
     * Representa o emissor.
     */
    private String emissor;

    /**
     * Representa a data.
     */
    private Date data;

    /**
     * Representa o tipo.
     */
    private IdentificadorDoTipoDto tipo;

    /**
     * Representa o tipo de certidão.
     */
    private CertidaoTipoDto certidaoTipo;

    /**
     * Pega o id.
     */
    public String getId() {
        return id;
    }

    public CertidaoTipoDto getCertidaoTipo() {
        return certidaoTipo;
    }

    public void setCertidaoTipo(CertidaoTipoDto certidaoTipo) {
        this.certidaoTipo = certidaoTipo;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Pega o individuo.
     */
    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    /**
     * Pega a designação.
     */
    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public IdentificadorDoTipoDto getTipo() {
        return tipo;
    }

    public void setTipo(IdentificadorDoTipoDto tipo) {
        this.tipo = tipo;
    }
}
