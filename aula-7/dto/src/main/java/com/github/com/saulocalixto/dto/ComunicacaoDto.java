package com.github.com.saulocalixto.dto;

/**
 * Created by aluno on 05/11/18.
 */
public class ComunicacaoDto {

    /**
     * Representa o indivíduo.
     */
    private String individuo;

    /**
     * Representa o meio.
     */
    private int meio;

    /**
     * Representa a preferência.
     */
    private String preferencia;

    /**
     * Representa o detalhe.
     */
    private String detalhe;

    /**
     * Representa o uso.
     */
    private int uso;

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public int getMeio() {
        return meio;
    }

    public void setMeio(int meio) {
        this.meio = meio;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public int getUso() {
        return uso;
    }

    public void setUso(int uso) {
        this.uso = uso;
    }
}
