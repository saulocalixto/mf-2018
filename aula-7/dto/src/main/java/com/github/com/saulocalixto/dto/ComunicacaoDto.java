package com.github.com.saulocalixto.dto;

/**
 * Created by aluno on 05/11/18.
 */
public class ComunicacaoDto {

    /**
     * Representa o indivíduo.
     */
    private IndividuoDto individuo;

    /**
     * Representa o meio.
     */
    private MeioDto meio;

    /**
     * Representa a preferência.
     */
    private PreferenciaDto preferencia;

    /**
     * Representa o detalhe.
     */
    private String detalhe;

    /**
     * Representa o uso.
     */
    private UsoDto uso;

    public IndividuoDto getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDto individuo) {
        this.individuo = individuo;
    }

    public MeioDto getMeio() {
        return meio;
    }

    public void setMeio(MeioDto meio) {
        this.meio = meio;
    }

    public PreferenciaDto getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(PreferenciaDto preferencia) {
        this.preferencia = preferencia;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public UsoDto getUso() {
        return uso;
    }

    public void setUso(UsoDto uso) {
        this.uso = uso;
    }
}
