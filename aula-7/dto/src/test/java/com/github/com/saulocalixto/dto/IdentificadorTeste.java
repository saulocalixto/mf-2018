package com.github.com.saulocalixto.dto;

/**
 *
 * @author Saulo Calixto
 */
public class IdentificadorTeste extends TestePadrao {
    @Override
    protected String nomeSchema() {
        return "identificadorSchema";
    }

    @Override
    protected String nomeArquivo() {
        return "identificador";
    }
}
