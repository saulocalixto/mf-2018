package com.github.com.saulocalixto.dto.dtos;

import com.github.com.saulocalixto.dto.Parser.ParserDto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aluno on 05/11/18.
 */
@XmlRootElement(name = "Comunicado")
public class ComunicacaoDto extends ParserDto<ComunicacaoDto> {

    /**
     * Representa o indivíduo.
     */
    private IndividuoDto individuo;

    /**
     * Representa o meio.
     */
    private CodigoDescricaAlternativaDto meio;

    /**
     * Representa a preferência.
     */
    private CodigoDescricaoDto preferencia;

    /**
     * Representa o detalhe.
     */
    private String detalhe;

    /**
     * Representa o uso.
     */
    private CodigoDescricaAlternativaDto uso;

    public IndividuoDto getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDto individuo) {
        this.individuo = individuo;
    }

    public CodigoDescricaAlternativaDto getMeio() {
        return meio;
    }

    public void setMeio(CodigoDescricaAlternativaDto meio) {
        this.meio = meio;
    }

    public CodigoDescricaoDto getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(CodigoDescricaoDto preferencia) {
        this.preferencia = preferencia;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public CodigoDescricaAlternativaDto getUso() {
        return uso;
    }

    public void setUso(CodigoDescricaAlternativaDto uso) {
        this.uso = uso;
    }
}
