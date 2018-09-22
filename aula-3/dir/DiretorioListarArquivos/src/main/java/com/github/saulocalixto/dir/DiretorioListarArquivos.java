package com.github.saulocalixto.dir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Paths.get;

/**
 * Created by Saulo A. Calixto on 17/09/18.
 */
public final class DiretorioListarArquivos {

    /**
     * Construtor privado da classe.
     *
     */
    private DiretorioListarArquivos() {
        // Agradar o checkstyle.
    }

    /**
     * Método responsável por listar todos os arquivos encontrados
     * dentro de um diretório ou subdiretório passado pelo usuário.
     *
     * @param args Caminho do diretório. Se nada for informado
     *             o caminho do arquivo será o diretório corrente.
     * @throws IOException Erro apresentando quando caminho passado
     * não for válido.
     */
    public static void main(final String[] args) throws IOException {

        //Estou ciente de que o checkstyle condena essa prática,
        //contudo é bem mais limpo assim.
        String caminho = args.length > 0 ? args[0] : ".";

        System.out.println("A partir de: " + caminho);

        Path caminhoInicial = get(caminho);
        Files.walkFileTree(caminhoInicial, new Visitor());
    }
}
