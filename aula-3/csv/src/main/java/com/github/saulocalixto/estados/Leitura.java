/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.saulocalixto.estados;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saulo A. Calixto
 *
 */
public class Leitura {

    private String caminhoArquivo;
    private BufferedReader bf;


    /**
     * Com o caminho do arquivo ele o pega e faz a leitura do arquivo, devolvendo seus dados.
     * @param caminhoArquivo O caminho onde se encontra o arquivo.
     * @return Retorna uma lista com os dados das universidades encontradas no arquivo.
     * @throws IOException Exceção disparada quando há algum erro de leitura.
     */
    public List<String> pegarDadosDeArquivo(String caminhoArquivo) throws IOException {

        this.caminhoArquivo = caminhoArquivo;
        this.bf = getBufferedReader();

        List<String> estados = new ArrayList<>();
        try {
            String linha = bf.readLine();
            while (linha != null) {
                estados.add(linha);
                linha = bf.readLine();
            }
        } catch (Exception e) {
            throw new IOException();
        }

        return estados;
    }

    private BufferedReader getBufferedReader()
            throws IOException {
        try {
            URL oracle = new URL(caminhoArquivo);
            InputStreamReader is = new InputStreamReader(oracle.openStream());
            return new BufferedReader(is);
        } catch(IOException e) {
            throw new IOException();
        }
    }
}
