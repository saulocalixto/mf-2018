/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.saulocalixto.codigo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Paths.get;

public class ContaLinhas {
    public static void main(String[] args) throws IOException {
        String sufixo = args.length > 0 ? args[0] : "*";
        String caminho = args.length > 1 ? args[1] : ".";

        Path caminhoInicial = get(caminho);

        Visitor visitor = new Visitor();

        visitor.setSufixo(sufixo);

        Files.walkFileTree(caminhoInicial, visitor);

        System.out.println("Total de linhas: " + visitor.getContador());
    }
}
