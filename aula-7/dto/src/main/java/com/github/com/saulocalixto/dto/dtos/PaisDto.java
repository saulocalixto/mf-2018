package com.github.com.saulocalixto.dto.dtos;

import com.github.com.saulocalixto.dto.Parser.ParserDto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aluno on 12/11/18.
 */
@XmlRootElement(name = "Pais")
public class PaisDto extends ParserDto<PaisDto> {

    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
