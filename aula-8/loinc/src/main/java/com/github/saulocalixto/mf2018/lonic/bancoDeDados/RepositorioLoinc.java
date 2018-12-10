package com.github.saulocalixto.mf2018.lonic.bancoDeDados;

import com.github.saulocalixto.mf2018.lonic.negocio.Loinc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Saulo Calixto on 26/11/18.
 */
@Repository
public class RepositorioLoinc {

    /**
     * Jdbc para fazer conexão com o banco de dados.
     */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Cria a tabela 'loinc'.
     */
    public void crieTabela() {
        String sql = Utilitario.crieScriptDeCriacaoDeBanco();
        jdbcTemplate.execute(sql);
    }

    /**
     * Popula a tabela 'loinc'.
     */
    public void populeTabela() {
        for (String insert: Utilitario.crieScriptParaPopularTabela()) {
            jdbcTemplate.execute(insert);
        }
    }

    /**
     * Consulta na tabela loinc utilizando a coluna LOINC_NUM.
     * @param loincNum Valor para filtrar a consulta.
     * @return Lista de objetos retornados na consulta.
     */
    public List<Loinc> consultePorLoincNum(String loincNum) {
        return retorneListaComResultado("SELECT LOINC_NUM, LONG_COMMON_NAME, " +
                "SHORTNAME FROM loinc WHERE LOINC_NUM = ?", loincNum);
    }

    /**
     * Consulta na tabela loinc utilizando a coluna LONG_COMMON_NAME.
     * @param longName Valor para filtrar a consulta.
     * @return Lista de objetos retornados na consulta.
     */
    public List<Loinc> consultePorLongName(String longName) {
        return retorneListaComResultado("SELECT LOINC_NUM, LONG_COMMON_NAME, " +
                "SHORTNAME FROM loinc WHERE LONG_COMMON_NAME = ?", longName);
    }

    /**
     * Consulta na tabela loinc utilizando a coluna SHORTNAME.
     * @param shortName Valor para filtrar a consulta.
     * @return Lista de objetos retornados na consulta.
     */
    public List<Loinc> consultePorShortName(String shortName) {
        return retorneListaComResultado("SELECT LOINC_NUM, LONG_COMMON_NAME, " +
                "SHORTNAME FROM loinc WHERE SHORTNAME = ?", shortName);
    }

    private List<Loinc> retorneListaComResultado(String sql, String condicao) {
        Loinc loinc = new Loinc();

        List<Loinc> lista = jdbcTemplate.query(
                sql, new Object[] { condicao },
                (rs, rowNum) -> preencheLoinc(loinc, rs));

        return lista;
    }

    private Loinc preencheLoinc(Loinc loinc, ResultSet rs) throws SQLException {
        loinc.setLoincNum(rs.getString("LOINC_NUM"));
        loinc.setLongName(rs.getString("LONG_COMMON_NAME"));
        loinc.setShortname(rs.getString("SHORTNAME"));
        return loinc;
    }
}
