package com.github.com.saulocalixto.dto;

import com.github.com.saulocalixto.dto.utilitario.UtilitarioCompareSchema;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Saulo Calixto
 */
public class DadoDemograficoTeste extends TestePadrao {
    @Override
    protected String nomeSchema() {
        return "dadoDemograficoSchema";
    }

    @Override
    protected String nomeArquivo() {
        return "dadoDemografico";
    }
}
