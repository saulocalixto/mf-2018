package com.github.com.saulocalixto.dto.dtos;

import com.github.com.saulocalixto.dto.Parser.ParserDto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aluno on 05/11/18.
 */
@XmlRootElement(name = "TipoEleitoral")
public class TipoEleitoralDto extends ParserDto<TipoEleitoralDto> {

    /**
     * Representa o identificador.
     */
    private IdentificadorDto identificador;

    /**
     * Representa a zona.
     */
    private int zona;

    /**
     * Representa a sessao.
     */
    private int sessao;

    public IdentificadorDto getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDto identificador) {
        this.identificador = identificador;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int getSessao() {
        return sessao;
    }

    public void setSessao(int sessao) {
        this.sessao = sessao;
    }
}
