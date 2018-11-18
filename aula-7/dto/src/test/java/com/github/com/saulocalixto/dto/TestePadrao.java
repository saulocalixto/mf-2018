package com.github.com.saulocalixto.dto;

import com.github.com.saulocalixto.dto.utilitario.UtilitarioCompareSchema;
import org.junit.jupiter.api.Test;

public abstract class TestePadrao {
    @Test
    public void jsonSchemaTest() {
        UtilitarioCompareSchema.valideSchemaJson(nomeSchema() + ".json", nomeArquivo() + ".json");
    }

    @Test
    public void xmlSchemaTest() {
        UtilitarioCompareSchema.valideSchemaXml(nomeSchema() + ".xsd", nomeArquivo() + ".xml");
    }

    protected abstract String nomeSchema();

    protected abstract String nomeArquivo();
}
