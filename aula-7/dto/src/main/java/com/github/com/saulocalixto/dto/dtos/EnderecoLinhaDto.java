package com.github.com.saulocalixto.dto.dtos;

import com.github.com.saulocalixto.dto.Parser.ParserDto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aluno on 12/11/18.
 */
@XmlRootElement(name = "EnderecoLinha")
public class EnderecoLinhaDto extends ParserDto<EnderecoLinhaDto> {
    private EnderecoDto endereco;
    private String linha;
    private int ordem;

    public EnderecoDto getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDto endereco) {
        this.endereco = endereco;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
}
