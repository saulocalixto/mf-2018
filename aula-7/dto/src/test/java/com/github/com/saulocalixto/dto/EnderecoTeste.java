package com.github.com.saulocalixto.dto;

import com.github.com.saulocalixto.dto.utilitario.UtilitarioCompareSchema;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Saulo Calixto
 */
public class EnderecoTeste extends TestePadrao {
    @Override
    protected String nomeSchema() {
        return "enderecoSchema";
    }

    @Override
    protected String nomeArquivo() {
        return "endereco";
    }
}
