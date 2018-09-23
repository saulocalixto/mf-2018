/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.saulocalixto.codigo;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.*;

/**
 * Created by Saulo A. Calixto on 17/09/18.
 */
public class Visitor extends SimpleFileVisitor<Path> {

    /**
     * Sufixo do arquivo.
     */
    private String sufixo;

    /**
     * Guarda a quantidade de linhas
     * de um arquivo com determinado
     * sufixo.
     */
    private int contador = 0;

    /**
     * Atribui valor à sufixo.
     * @param sufixoNovo Sufixo do arquivo.
     */
    public void setSufixo(final String sufixoNovo) {
        this.sufixo = sufixoNovo;
    }

    /**
     * Pega quantidade de linhas.
     * @return Quantidade de linhas.
     */
    public int getContador() {
        return contador;
    }

    /**
     * Esse método faz parte da classe SimpleFileVisitor,
     * esse método passa por cada arquivo dentro de um determinado
     * diretório e subdiretório pegando só os arquivos com  um sufixo
     * definido pelo usuário.
     *
     * @param file O arquivo encontrado dentro do diretório.
     * @param attributes Atributos adicionais passados à classe.
     */
    @Override
    public final FileVisitResult visitFile(
            final Path file,
            final BasicFileAttributes attributes)
            throws IOException {
            if (verificaSeArquivoTerminaComSufixo(file)) {
                long qtdLinhas =
                        retorneQuantidadeDeLinhasEmArquivo(file);
                System.out.println(qtdLinhas
                        + " linhas - " + file.toAbsolutePath());
                contador += qtdLinhas;
            }

        return CONTINUE;
    }

    /**
     * Esse método retonar a quantidade de linhas
     * de um arquivo.
     *
     * @param file O arquivo encontrado dentro do diretório.
     * @return A quantidade de linhas do arquivo.
     */
    private long retorneQuantidadeDeLinhasEmArquivo(final Path file) {
        try {
            return Files
                    .lines(file.toAbsolutePath())
                    .count();
        } catch (IOException e) {
            return 0;
        }
    }

    /**
     * Verifica se arquivo tem determinado sufixo.
     *
     * @param file O arquivo encontrado dentro do diretório.
     * @return Se o arquivo tem o sufixo passado.
     */
    private boolean verificaSeArquivoTerminaComSufixo(
            final Path file) {
        return file.toString().endsWith(sufixo);
    }
}
