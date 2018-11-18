package com.github.com.saulocalixto.dto;

/**
 *
 * @author Saulo Calixto
 */
public class UtilizacaoTeste extends TestePadrao {
    @Override
    protected String nomeSchema() {
        return "utilizacaoSchema";
    }

    @Override
    protected String nomeArquivo() {
        return "utilizacao";
    }
}
