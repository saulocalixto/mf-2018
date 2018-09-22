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

/**
 * Created by Saulo A. Calixto on 17/09/18.
 */
public class Visitor extends SimpleFileVisitor<Path> {

    private String sufixo;
    private int contador = 0;

    public void setSufixo(String sufixo) {
        this.sufixo = sufixo;
    }

    public int getContador() {
        return contador;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) throws IOException {
            if(verificaSeArquivoTerminaComSufixo(file)) {
                long qtdLinhas = retorneQuantidadeDeLinhasEmArquivo(file);
                System.out.println(qtdLinhas + " linhas - " + file.toAbsolutePath());
                contador += qtdLinhas;
            }

        return FileVisitResult.CONTINUE;
    }

    private long retorneQuantidadeDeLinhasEmArquivo(Path file) throws IOException {
        try {
            return Files.lines(file.toAbsolutePath()).count();
        } catch(IOException e) {
            return 0;
        }
    }

    private boolean verificaSeArquivoTerminaComSufixo(Path file) {
        return file.toString().endsWith(sufixo);
    }
}