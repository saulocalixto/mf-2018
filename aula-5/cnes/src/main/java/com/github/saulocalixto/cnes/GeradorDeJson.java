package com.github.saulocalixto.cnes;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class GeradorDeJson {

    public GeradorDeJson(String nomeJson) {
        this.nomeJson = nomeJson;
    }

    private String nomeJson;


    public void graveArquivoJson(List<Estabelecimento> lista) throws IOException {
        Gson gson = new Gson();
        File arquivo = new File("./webapp/src/".concat(nomeJson).concat(".json"));
        try (Writer writer = new FileWriter(arquivo)) {
            gson.toJson(lista, writer);
        } catch(IOException e) {
            throw new IOException("Ocorreu um erro ao gravar o arquivo json: " + e.getMessage());
        }
    }
}
