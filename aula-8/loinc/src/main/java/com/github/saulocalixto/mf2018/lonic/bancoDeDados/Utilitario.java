package com.github.saulocalixto.mf2018.lonic.bancoDeDados;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class Utilitario {

    private static BufferedReader bf;

    public static String crieScriptDeCriacaoDeBanco() {
        instancieBufferReader("./src/main/resources/create.sql");
        return bf.lines().collect(Collectors.joining());
    }

    public static List<String> crieScriptParaPopularTabela() {
        instancieBufferReader("./src/main/resources/data.sql");
        return bf.lines().collect(Collectors.toList());
    }

    private static void instancieBufferReader(String path) {
        try {
            bf = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
