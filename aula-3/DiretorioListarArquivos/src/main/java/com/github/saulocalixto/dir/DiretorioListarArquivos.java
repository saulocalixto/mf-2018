package com.github.saulocalixto.dir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Paths.get;

/**
 * Created by Saulo A. Calixto on 17/09/18.
 */
public class DiretorioListarArquivos {
    public static void main(String[] args) throws IOException {
        String caminho = args.length > 0 ? args[0] : ".";

        System.out.println("A partir de: " + caminho);

        Path caminhoInicial = get(caminho);
        Files.walkFileTree(caminhoInicial, new Visitor());
    }
}
