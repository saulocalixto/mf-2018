package com.github.saulocalixto.cnes;

import com.google.gson.Gson;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by aluno on 01/10/18.
 */
public class ObtentorDeDados {
    private ZipEntry arquivoCsvObtido;
    /**
     * Retorna instância do leitor do arquivo.
     * @throws IOException Se houver exceção ao ler o arquivo.
     * @return Leitor de arquivos.
     */
    public void pegarLeitor(String caminhoArquivo)
            throws IOException {
        try {
            URL url = new URL(caminhoArquivo);
            ZipInputStream is = new ZipInputStream(url.openConnection().getInputStream());
            Gson gson = new Gson();

        while((arquivoCsvObtido = is.getNextEntry()) != null){
            String fileName = arquivoCsvObtido.getName();
            String linha;
            if(fileName.startsWith("tbEstabelecimento")) {
                InputStreamReader reader = new InputStreamReader(is);
                BufferedReader bufferReader = new BufferedReader(reader);
                List<Estabelecimento> lista = new ArrayList();
                bufferReader.readLine();
                    while ((linha = bufferReader.readLine()) != null) {
                        Estabelecimento estabelecimento = new Estabelecimento();
                        String[] linhaDividida = linha.split(";");
                        estabelecimento.setCodigoEstabelecimento(linhaDividida[0]);
                        estabelecimento.setRazaoSocial(linhaDividida[5]);
                        estabelecimento.setLatitude(linhaDividida[39]);
                        estabelecimento.setLongitude(linhaDividida[40]);
                        lista.add(estabelecimento);
                    }
                try (Writer writer = new FileWriter("Output.json")) {
                    gson.toJson(lista, writer);
                    return;
                }
            }
        }
        is.closeEntry();
        is.close();

        } catch (IOException e) {
            throw new IOException("Caminho inválido.");
        }
    }
}
