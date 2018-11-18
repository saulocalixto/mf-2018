package com.github.com.saulocalixto.dto.dtos;

import com.github.com.saulocalixto.dto.Parser.ParserDto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Nome")
public class NomeDto extends ParserDto<NomeDto> {
    private String id;
    private IndividuoDto individuo;
    private String titulos;
    private String nomes;
    private String sobrenomes;
    private String sufixos;
    private CodigoDescricaoDto preferido;
    private CodigoDescricaoDto usoCondicional;

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

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getSobrenomes() {
        return sobrenomes;
    }

    public void setSobrenomes(String sobrenomes) {
        this.sobrenomes = sobrenomes;
    }

    public String getSufixos() {
        return sufixos;
    }

    public void setSufixos(String sufixos) {
        this.sufixos = sufixos;
    }

    public CodigoDescricaoDto getPreferido() {
        return preferido;
    }

    public void setPreferido(CodigoDescricaoDto preferido) {
        this.preferido = preferido;
    }

    public CodigoDescricaoDto getUsoCondicional() {
        return usoCondicional;
    }

    public void setUsoCondicional(CodigoDescricaoDto usoCondicional) {
        this.usoCondicional = usoCondicional;
    }
}
