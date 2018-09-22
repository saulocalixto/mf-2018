package com.github.saulocalixto.dir;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Paths.get;

public class TesteDiretorioListaArquivos {

    private static Path path;

    @BeforeAll
    public static void antesDeTudo() {
        path = get(".");
    }

    @Test
    public void testaListarArquivos() throws Exception {
        Files.walkFileTree(path, new Visitor());
    }
}
