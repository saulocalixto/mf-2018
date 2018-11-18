package com.github.com.saulocalixto.dto.dtos;

import com.github.com.saulocalixto.dto.Parser.ParserDto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Saulo Calixto on 05/11/18.
 */
@XmlRootElement(name = "Identificador")
public class IdentificadorDto extends ParserDto<IdentificadorDto> {

    /**
     * Representa o id do identificador.
     */
    private String id;

    /**
     * Representa o indivíduo do identificador.
     */
    private IndividuoDto individuo;

    /**
     * Representa a designação.
     */
    private String designacao;

    /**
     * Representa a área.
     */
    private int area;

    /**
     * Representa o emissor.
     */
    private String emissor;

    /**
     * Representa a data.
     */
    private Date data;

    /**
     * Representa o tipo.
     */
    private CodigoDescricaoStringDto tipo;

    /**
     * Representa o tipo de certidão.
     */
    private CodigoDescricaoDto certidaoTipo;

    /**
     * Pega o id.
     */
    public String getId() {
        return id;
    }

    public CodigoDescricaoDto getCertidaoTipo() {
        return certidaoTipo;
    }

    public void setCertidaoTipo(CodigoDescricaoDto certidaoTipo) {
        this.certidaoTipo = certidaoTipo;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Pega o individuo.
     */
    public IndividuoDto getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDto individuo) {
        this.individuo = individuo;
    }

    /**
     * Pega a designação.
     */
    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public CodigoDescricaoStringDto getTipo() {
        return tipo;
    }

    public void setTipo(CodigoDescricaoStringDto tipo) {
        this.tipo = tipo;
    }
}
