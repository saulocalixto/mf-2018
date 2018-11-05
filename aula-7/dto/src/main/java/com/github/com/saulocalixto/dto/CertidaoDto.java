package com.github.com.saulocalixto.dto;

/**
 * Created by Saulo Calixto on 05/11/18.
 */
public class CertidaoDto {

    /**
     * Representa o identificador.
     */
    private IdentificadorDto identificador;

    /**
     * Representa o tipo da certidão.
     */
    private CertidaoTipoDto tipo;

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

    public CertidaoTipoDto getTipo() {
        return tipo;
    }

    public void setTipo(CertidaoTipoDto tipo) {
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
