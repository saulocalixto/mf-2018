/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.saulocalixto.dir;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by Saulo A. Calixto on 17/09/18.
 */
public class Visitor extends SimpleFileVisitor<Path> {

    /**
     * Esse método faz parte da classe SimpleFileVisitor,
     * esse método passa por cada arquivo dentro de um determinado
     * diretório e subdiretório nos possibilitando imprimir
     * o caminho de cada um dos arquivos.
     *
     * @param file O arquivo encontrado dentro do diretório.
     * @param attrs Atributos adicionais passados à classe.
     */
    @Override
    public final FileVisitResult visitFile(final Path file,
                                           final BasicFileAttributes attrs) {
        System.out.println(file.toAbsolutePath());
        return FileVisitResult.CONTINUE;
    }
}
