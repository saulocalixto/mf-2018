package com.github.com.saulocalixto.dto.dtos;

import com.github.com.saulocalixto.dto.Parser.ParserDto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "Utilizacao")
public class UtilizacaoDto extends ParserDto<UtilizacaoDto> {
    private NomeDto nome;
    private CodigoDescricaAlternativaDto uso;
    private IdentificadorDto identificador;
    private Date dataInicio;
    private Date dataFinal;

    public NomeDto getNome() {
        return nome;
    }

    public void setNome(NomeDto nome) {
        this.nome = nome;
    }

    public CodigoDescricaAlternativaDto getUso() {
        return uso;
    }

    public void setUso(CodigoDescricaAlternativaDto uso) {
        this.uso = uso;
    }

    public IdentificadorDto getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDto identificador) {
        this.identificador = identificador;
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
