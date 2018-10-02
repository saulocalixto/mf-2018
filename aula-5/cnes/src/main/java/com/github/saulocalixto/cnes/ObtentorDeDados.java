package com.github.saulocalixto.cnes;

import java.io.*;
import java.net.URL;
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

        ZipEntry zipEntry = is.getNextEntry();
        while((arquivoCsvObtido = is.getNextEntry()) != null){
            String fileName = arquivoCsvObtido.getName();
            File newFile = new File("unzipTest/" + fileName);
        }
        is.closeEntry();
        is.close();

        } catch (IOException e) {
            throw new IOException("Caminho inválido.");
        }
    }
}
