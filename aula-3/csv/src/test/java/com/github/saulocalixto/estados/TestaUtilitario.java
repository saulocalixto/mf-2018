package com.github.saulocalixto.estados;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class TestaUtilitario {
    private static final String CAMINHO_PADRAO =
            "http://repositorio.dados.gov.br/educacao/"
                    + "CADASTRO%20DAS%20IES_2011.csv";
    private static List<String> lista;
    private static UtilitarioUniversidades mock;
    private static Leitura leitura;


    @BeforeAll
    public static void antesDeTudo() {
        lista = new ArrayList<>();
        lista.add("Teste1");
        lista.add("Teste2");
        mock = mock(UtilitarioUniversidades.class);
        leitura = new Leitura();
    }

    @Test
    public void testaImprimeUniversidadesPorEstado() throws IOException {
        leitura.pegarDadosDeArquivo(CAMINHO_PADRAO);
        mock.imprimeUniversidadesPorEstado(leitura.pegarDadosDeArquivo(CAMINHO_PADRAO));

        verify(mock, times(1))
                .imprimeUniversidadesPorEstado(leitura.pegarDadosDeArquivo(CAMINHO_PADRAO));
    }
}
