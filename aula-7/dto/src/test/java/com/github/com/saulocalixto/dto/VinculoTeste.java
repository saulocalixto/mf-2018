package com.github.com.saulocalixto.dto;

/**
 *
 * @author Saulo Calixto
 */
public class VinculoTeste extends TestePadrao {
    @Override
    protected String nomeSchema() {
        return "vinculoSchema";
    }

    @Override
    protected String nomeArquivo() {
        return "vinculo";
    }
}
