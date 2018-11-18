package com.github.com.saulocalixto.dto.dtos;

import com.github.com.saulocalixto.dto.Parser.ParserDto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Saulo Calixto on 05/11/18.
 */
@XmlRootElement(name = "Certidao")
public class CertidaoDto extends ParserDto<CertidaoDto> {

    /**
     * Representa o identificador.
     */
    private IdentificadorDto identificador;

    /**
     * Representa o tipo da certidão.
     */
    private CodigoDescricaoDto tipo;

    /**
     * Representa o cartório.
     */
    private String cartorio;

    /**
     * Representa o livro.
     */
    private int livro;

    /**
     * Representa a folha.
     */
    private int folha;

    /**
     * Representa o termo.
     */
    private int termo;

    public IdentificadorDto getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDto identificador) {
        this.identificador = identificador;
    }

    public CodigoDescricaoDto getTipo() {
        return tipo;
    }

    public void setTipo(CodigoDescricaoDto tipo) {
        this.tipo = tipo;
    }

    public String getCartorio() {
        return cartorio;
    }

    public void setCartorio(String cartorio) {
        this.cartorio = cartorio;
    }

    public int getLivro() {
        return livro;
    }

    public void setLivro(int livro) {
        this.livro = livro;
    }

    public int getFolha() {
        return folha;
    }

    public void setFolha(int folha) {
        this.folha = folha;
    }

    public int getTermo() {
        return termo;
    }

    public void setTermo(int termo) {
        this.termo = termo;
    }
}
