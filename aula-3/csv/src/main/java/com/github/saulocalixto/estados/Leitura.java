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

    /**
     * Representa o caminho do arquivo.
     */
    private String caminhoArquivo;

    /**
     * Representa instância da classe
     * BufferedReader, usada para ler
     * o arquivo.
     */
    private BufferedReader bf;


    /**
     * Com o caminho do arquivo ele o pega e
     * faz a leitura do arquivo, devolvendo seus dados.
     * @param caminho O caminho onde se encontra o arquivo.
     * @return Retorna uma lista com os dados das universidades
     * encontradas no arquivo.
     * @throws IOException Exceção disparada quando
     * há algum erro de leitura.
     */
    public final List<String> pegarDadosDeArquivo(final String caminho)
            throws IOException {

        this.caminhoArquivo = caminho;
        this.bf = pegarLeitor();

        List<String> listaDasLinhasDoArquivo = new ArrayList<>();
        try {
            String linha = bf.readLine();
            while (linha != null) {
                listaDasLinhasDoArquivo.add(linha);
                linha = bf.readLine();
            }
        } catch (Exception e) {
            throw new IOException();
        }

        return listaDasLinhasDoArquivo;
    }

    /**
     * Retorna instância do leitor do arquivo.
     * @throws IOException Se houver exceção ao ler o arquivo.
     * @return Leitor de arquivos.
     */
    private BufferedReader pegarLeitor()
            throws IOException {
        try {
            URL oracle = new URL(caminhoArquivo);
            InputStreamReader is = new InputStreamReader(oracle.openStream());
            return new BufferedReader(is);
        } catch (IOException e) {
            throw new IOException("Caminho inválido.");
        }
    }
}
