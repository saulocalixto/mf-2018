package com.github.saulocalixto.cnes;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by aluno on 01/10/18.
 */
public class CarregaArquivo {

    private final String DELIMITADOR = ";";
    private final int CODIGO_ESTABELECIMENTO = 0;
    private final int RAZAO_SOCIAL = 5;
    private final int LATITUDE = 39;
    private final int LONGITUDE = 40;

    /**
     * Retorna instância do leitor do arquivo.
     * @throws IOException Se houver exceção ao ler o arquivo.
     * @return Leitor de arquivos.
     */
    public List<Estabelecimento> pegarLeitor(String caminhoArquivo)
            throws IOException {
        try(ZipInputStream is = new ZipInputStream(new URL(caminhoArquivo).openConnection().getInputStream())) {

            List<Estabelecimento> lista = new ArrayList();
            ZipEntry arquivoCsvObtido;

            while((arquivoCsvObtido = is.getNextEntry()) != null) {

                String fileName = arquivoCsvObtido.getName();

                if(fileName.startsWith("tbEstabelecimento")) {

                    InputStreamReader reader = new InputStreamReader(is);

                    try(BufferedReader bufferReader = new BufferedReader(reader)) {
                        bufferReader.readLine();
                        String linha;

                        while ((linha = bufferReader.readLine()) != null) {

                            int count = 0;
                            Estabelecimento estabelecimento = new Estabelecimento();
                            StringTokenizer linhaTokenizada = new StringTokenizer(linha, DELIMITADOR, true);

                            tratarLinha(count, estabelecimento, linhaTokenizada);

                            lista.add(estabelecimento);
                        }
                    }

                    return lista;
                }
            }

            is.closeEntry();
            is.close();

            return lista;

        } catch (IOException e) {
            throw new IOException("Caminho inválido.");
        }
    }

    private void tratarLinha(int count, Estabelecimento estabelecimento, StringTokenizer linhaSplit) {
        if (linhaSplit.hasMoreTokens()) {
            PreencheEstabelecimento(estabelecimento, linhaSplit);
        }
    }

    private void PreencheEstabelecimento(Estabelecimento estabelecimento, StringTokenizer linhaSplit) {

            String codigo = pegarValor(linhaSplit, CODIGO_ESTABELECIMENTO);
            estabelecimento.setCodigoEstabelecimento(codigo);

            String razao = pegarValor(linhaSplit, RAZAO_SOCIAL);
            estabelecimento.setRazaoSocial(razao);

            String latitude = pegarValor(linhaSplit, LATITUDE - RAZAO_SOCIAL);
            estabelecimento.setLatitude(latitude);

            String longitude = pegarValor(linhaSplit, LONGITUDE - LATITUDE);
            estabelecimento.setLongitude(longitude);
    }

    private String pegarValor(StringTokenizer st, int indexToken) {

        String value = "";
        while(indexToken > 0) {
            value = st.nextToken();
            if(!DELIMITADOR.equals(value)) {
                indexToken--;
            }
        }

        if(value == "") {
            value = st.nextToken();
        }

        if (DELIMITADOR.equals(value))
            value = null;
        else if (st.hasMoreTokens())
            st.nextToken();
        return value.replace("\"", "");
    }
}