package com.github.saulocalixto.dir;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Paths.get;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class TestaDiretorioListaDirs {


    private static Path path;
    private static Visitor visitor;

    @BeforeAll
    public static void antesDeTudo() {
        path = get(".");
        visitor = mock(Visitor.class);
    }

    @Test
    public void testaListarArquivos() throws Exception {

        Mockito.doCallRealMethod().when(visitor).postVisitDirectory(path, new IOException());

        assertEquals(visitor.postVisitDirectory(path, new IOException()), null);
    }

    @Test
    public void testaMainComArgs() throws IOException {

        DiretorioListarDirs.main(new String[]{"/home"});
    }

    @Test
    public void testaMainSemArgs() throws IOException {

        DiretorioListarDirs.main(new String[0]);
    }
}
