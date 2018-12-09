package com.github.saulocalixto.mf2018.lonic;

import com.github.saulocalixto.mf2018.lonic.bancoDeDados.RepositorioLoinc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aplicacao implements CommandLineRunner {
    public static void main(String args[]) {
        SpringApplication.run(Aplicacao.class, args);
    }

    @Autowired
    RepositorioLoinc repositorioLoinc;

    @Override
    public void run(String... args) {
        repositorioLoinc.crieTabela();
        repositorioLoinc.populeTabela();
    }
}
