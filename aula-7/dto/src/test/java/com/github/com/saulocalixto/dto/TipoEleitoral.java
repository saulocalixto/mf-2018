package com.github.com.saulocalixto.dto;

/**
 *
 * @author Saulo Calixto
 */
public class TipoEleitoral extends TestePadrao {
    @Override
    protected String nomeSchema() {
        return "tipoEleitoralSchema";
    }

    @Override
    protected String nomeArquivo() {
        return "tipoEleitoral";
    }
}
