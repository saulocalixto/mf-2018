package com.github.com.saulocalixto.dto;

import java.util.Date;

/**
 * Created by aluno on 12/11/18.
 */
public class EnderecoDto {
    private String id;
    private IndividuoDto individuo;
    private String bairro;
    private String distrito;
    private MunicipioDto municipio;
    private EstadoDto estado;
    private String cep;
    private String caixapostal;
    private PaisDto pais;
    private EnderecoTipo tipo;
    private Date dataInicial;
    private Date dataInicialAcuracia;
    private Date dataFinal;
    private Date dataFinalAcuracia;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IndividuoDto getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDto individuo) {
        this.individuo = individuo;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public MunicipioDto getMunicipio() {
        return municipio;
    }

    public void setMunicipio(MunicipioDto municipio) {
        this.municipio = municipio;
    }

    public EstadoDto getEstado() {
        return estado;
    }

    public void setEstado(EstadoDto estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCaixapostal() {
        return caixapostal;
    }

    public void setCaixapostal(String caixapostal) {
        this.caixapostal = caixapostal;
    }

    public PaisDto getPais() {
        return pais;
    }

    public void setPais(PaisDto pais) {
        this.pais = pais;
    }

    public EnderecoTipo getTipo() {
        return tipo;
    }

    public void setTipo(EnderecoTipo tipo) {
        this.tipo = tipo;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataInicialAcuracia() {
        return dataInicialAcuracia;
    }

    public void setDataInicialAcuracia(Date dataInicialAcuracia) {
        this.dataInicialAcuracia = dataInicialAcuracia;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Date getDataFinalAcuracia() {
        return dataFinalAcuracia;
    }

    public void setDataFinalAcuracia(Date dataFinalAcuracia) {
        this.dataFinalAcuracia = dataFinalAcuracia;
    }
}
