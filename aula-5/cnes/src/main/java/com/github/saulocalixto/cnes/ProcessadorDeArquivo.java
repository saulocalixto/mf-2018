package com.github.saulocalixto.cnes;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by Saulo Calixto.
 */
public class ProcessadorDeArquivo {

    private final String DELIMITADOR = ";";
    private final int CODIGO_ESTABELECIMENTO = 1;
    private final int RAZAO_SOCIAL = 5;
    private final int LATITUDE = 39;
    private final int LONGITUDE = 40;

    /**
     * Retorna instância do leitor do arquivo.
     * @throws IOException Se houver exceção ao ler o arquivo.
     * @return Leitor de arquivos.
     */
    public List<Estabelecimento> obtenhaListaDeEstabelecimentos(String caminhoArquivo)
            throws IOException {

        try(ZipInputStream is = new ZipInputStream(new URL(caminhoArquivo).openConnection().getInputStream())) {

            List<Estabelecimento> lista = new ArrayList();
            ZipEntry arquivoCsvObtido;

            while((arquivoCsvObtido = is.getNextEntry()) != null) {

                String fileName = arquivoCsvObtido.getName();

                if(fileName.startsWith("tbEstabelecimento")) {

                    processeArquivoCsv(is, lista);

                    return lista;
                }
            }

            is.closeEntry();
            is.close();

            return lista;

        } catch (IOException e) {
            throw new IOException("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }

    private void processeArquivoCsv(ZipInputStream is, List<Estabelecimento> lista) throws IOException {
        InputStreamReader reader = new InputStreamReader(is);

        try(BufferedReader bufferReader = new BufferedReader(reader)) {

            bufferReader.readLine();

            leiaLinha(lista, bufferReader);

        } catch(IOException e) {
            throw new IOException("Ocorreu um erro ao ler o arquivo csv: " + e.getMessage());
        }
    }

    private void leiaLinha(List<Estabelecimento> lista, BufferedReader bufferReader) throws IOException {
        String linha;
        while ((linha = bufferReader.readLine()) != null) {

            int count = 0;
            Estabelecimento estabelecimento = new Estabelecimento();
            StringTokenizer linhaTokenizada = new StringTokenizer(linha, DELIMITADOR, true);

            processeLinha(count, estabelecimento, linhaTokenizada);

            lista.add(estabelecimento);
        }
    }

    private void processeLinha(int count, Estabelecimento estabelecimento, StringTokenizer linhaSplit) {
        if (linhaSplit.hasMoreTokens()) {
            preenchaEstabelecimento(estabelecimento, linhaSplit);
        }
    }

    private void preenchaEstabelecimento(Estabelecimento estabelecimento, StringTokenizer linhaSplit) {
            linhaSplit.nextToken();
            String codigo = pegueValor(linhaSplit, CODIGO_ESTABELECIMENTO);
            estabelecimento.setCodigoEstabelecimento(codigo);

            String razao = pegueValor(linhaSplit, RAZAO_SOCIAL - CODIGO_ESTABELECIMENTO);
            estabelecimento.setRazaoSocial(razao);

            String latitude = pegueValor(linhaSplit, LATITUDE - RAZAO_SOCIAL);
            estabelecimento.setLatitude(latitude);

            String longitude = pegueValor(linhaSplit, LONGITUDE - LATITUDE);
            estabelecimento.setLongitude(longitude);
    }

    private String pegueValor(StringTokenizer st, int indexToken) {

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