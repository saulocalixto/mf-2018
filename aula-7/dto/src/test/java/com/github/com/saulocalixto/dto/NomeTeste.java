package com.github.com.saulocalixto.dto;

/**
 *
 * @author Saulo Calixto
 */
public class NomeTeste extends TestePadrao {
    @Override
    protected String nomeSchema() {
        return "nomeSchema";
    }

    @Override
    protected String nomeArquivo() {
        return "nome";
    }
}
