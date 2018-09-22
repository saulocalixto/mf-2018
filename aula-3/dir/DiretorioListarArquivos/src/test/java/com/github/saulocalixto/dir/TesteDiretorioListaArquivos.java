/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.saulocalixto.dir;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;

import static java.nio.file.Paths.get;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @author saulocalixto
 */
public class TesteDiretorioListaArquivos {

    private static Path path;
    private static Visitor visitor;

    @BeforeAll
    public static void antesDeTudo() {
        path = get(".");
        visitor = mock(Visitor.class);
    }

    @Test
    public void testaListarArquivos() throws Exception {

        Mockito.doCallRealMethod().when(visitor).visitFile(path, Files.getFileAttributeView(path,
                BasicFileAttributeView.class)
                .readAttributes());

        assertEquals(visitor.visitFile(path, Files.getFileAttributeView(path,
                BasicFileAttributeView.class)
                .readAttributes()), FileVisitResult.CONTINUE);
    }

    @Test
    public void testaMainComArgs() throws IOException {

        DiretorioListarArquivos.main(new String[]{"/home"});
    }

    @Test
    public void testaMainSemArgs() throws IOException {

        DiretorioListarArquivos.main(new String[0]);
    }
}
