package com.github.saulocalixto.codigo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;

import static java.nio.file.Paths.get;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestaContaLinhas {

    private Path path;
    private Visitor visitor;

    @BeforeEach
    public void antesDoTeste() {

        path = get(".");
    }

    @Test
    public void testaVisitGetContador() {
        Visitor visitor = mock(Visitor.class);
        visitor.setSufixo(".java");

        when(visitor.getContador()).thenReturn(5);

        int resultado = visitor.getContador();

        assertEquals(resultado, 5);
    }

    @Test
    public void testaVisitFile() throws Exception {
        visitor = mock(Visitor.class);
        visitor.setSufixo(".java");

        doNothing().when(visitor.visitFile(path, Files.getFileAttributeView(path,
                BasicFileAttributeView.class)
                .readAttributes()));

        when(visitor.visitFile(path, Files.getFileAttributeView(path,
                BasicFileAttributeView.class)
                .readAttributes())).thenReturn(FileVisitResult.CONTINUE);
        FileVisitResult resultado = visitor.visitFile(path, Files.getFileAttributeView(path,
                BasicFileAttributeView.class)
                .readAttributes());
        assertEquals(FileVisitResult.CONTINUE, resultado);
    }
}
