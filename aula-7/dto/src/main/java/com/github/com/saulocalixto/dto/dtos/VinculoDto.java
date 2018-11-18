package com.github.com.saulocalixto.dto.dtos;

import com.github.com.saulocalixto.dto.Parser.ParserDto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "Vinculo")
public class VinculoDto extends ParserDto<VinculoDto> {
    private IdentificadorDto identificador;
    private IndividuoDto individuo;
    private CodigoDescricaoDto relacionamento;
    private Date dataInicio;
    private Date dataFinal;

    public IdentificadorDto getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDto identificador) {
        this.identificador = identificador;
    }

    public IndividuoDto getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDto individuo) {
        this.individuo = individuo;
    }

    public CodigoDescricaoDto getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(CodigoDescricaoDto relacionamento) {
        this.relacionamento = relacionamento;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
