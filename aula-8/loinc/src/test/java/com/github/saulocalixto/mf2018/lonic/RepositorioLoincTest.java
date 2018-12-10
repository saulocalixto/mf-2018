package com.github.saulocalixto.mf2018.lonic;

import com.github.saulocalixto.mf2018.lonic.bancoDeDados.RepositorioLoinc;
import com.github.saulocalixto.mf2018.lonic.negocio.Loinc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration(classes = {Configuracao.class})
public class RepositorioLoincTest {

    @Autowired
    private RepositorioLoinc repositorio;

    private Boolean tabelaExiste = false;

    @Before
    public void masPrimeiro() {
        if(!tabelaExiste) {
            repositorio.crieTabela();
            repositorio.populeTabela();
            tabelaExiste = true;
        }
    }
    
    @Test
    public void consultePorLoincNum() {
        List<Loinc> lista = repositorio.consultePorLoincNum("1000-9");
        Assert.assertEquals(1, lista.size());
    }

    @Test
    public void consultePorLongName() {
        List<Loinc> lista = repositorio.consultePorLongName("DBG Ab [Presence] in Serum or Plasma from Blood" +
                " product unit");
        Assert.assertEquals(1, lista.size());
    }

    @Test
    public void consultePorShortName() {
        List<Loinc> lista = repositorio.consultePorShortName("DBG Ab SerPl BPU Ql");
        Assert.assertEquals(1, lista.size());
    }
}
