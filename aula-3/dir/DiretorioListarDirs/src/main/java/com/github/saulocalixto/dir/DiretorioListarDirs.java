package com.github.saulocalixto.dir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Paths.*;

/**
 * Created by Saulo A. Calixto on 17/09/18.
 */
public class DiretorioListarDirs  {

    public static void main(String[] args) throws IOException   {
        String caminho = args.length > 0 ? args[0] : ".";

        System.out.println("A partir de: " + caminho);

        Path caminhoInicial = get(caminho);
        Files.walkFileTree(caminhoInicial, new Visitor());
    }
}
