package com.github.com.saulocalixto.dto.dtos;

import com.github.com.saulocalixto.dto.Parser.ParserDto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by aluno on 12/11/18.
 */
@XmlRootElement(name = "DadoDemografico")
public class DadoDemograficoDto extends ParserDto<DadoDemograficoDto> {
    private IndividuoDto individuo;
    private Date datadeNascimento;
    private Date nascimentoAcuracia;
    private CodigoDescricaoStringDto nascimentoSegmento;
    private CodigoDescricaoDto nascimentoPluralidade;
    private CodigoDescricaoDto nascimentoOrdem;
    private Date obito;
    private String obitoAcuracia;
    private CodigoDescricaoDto obitoFonte;
    private CodigoDescricaAlternativaDto sexo;
    private String mae;
    private String pai;
    private CodigoDescricaoDto situacaoFamiliar;
    private CodigoDescricaoDto raca;
    private String comentario;
    private CodigoDescricaoDto nacionalidade;
    private MunicipioDto municipio;
    private EstadoDto estado;
    private PaisDto pais;
    private Date dataDeEntradaPais;

    public IndividuoDto getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDto individuo) {
        this.individuo = individuo;
    }

    public Date getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(Date datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }

    public Date getNascimentoAcuracia() {
        return nascimentoAcuracia;
    }

    public void setNascimentoAcuracia(Date nascimentoAcuracia) {
        this.nascimentoAcuracia = nascimentoAcuracia;
    }

    public CodigoDescricaoStringDto getNascimentoSegmento() {
        return nascimentoSegmento;
    }

    public void setNascimentoSegmento(CodigoDescricaoStringDto nascimentoSegmento) {
        this.nascimentoSegmento = nascimentoSegmento;
    }

    public CodigoDescricaoDto getNascimentoPluralidade() {
        return nascimentoPluralidade;
    }

    public void setNascimentoPluralidade(CodigoDescricaoDto nascimentoPluralidade) {
        this.nascimentoPluralidade = nascimentoPluralidade;
    }

    public CodigoDescricaoDto getNascimentoOrdem() {
        return nascimentoOrdem;
    }

    public void setNascimentoOrdem(CodigoDescricaoDto nascimentoOrdem) {
        this.nascimentoOrdem = nascimentoOrdem;
    }

    public Date getObito() {
        return obito;
    }

    public void setObito(Date obito) {
        this.obito = obito;
    }

    public String getObitoAcuracia() {
        return obitoAcuracia;
    }

    public void setObitoAcuracia(String obitoAcuracia) {
        this.obitoAcuracia = obitoAcuracia;
    }

    public CodigoDescricaoDto getObitoFonte() {
        return obitoFonte;
    }

    public void setObitoFonte(CodigoDescricaoDto obitoFonte) {
        this.obitoFonte = obitoFonte;
    }

    public CodigoDescricaAlternativaDto getSexo() {
        return sexo;
    }

    public void setSexo(CodigoDescricaAlternativaDto sexo) {
        this.sexo = sexo;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public CodigoDescricaoDto getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    public void setSituacaoFamiliar(CodigoDescricaoDto situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }

    public CodigoDescricaoDto getRaca() {
        return raca;
    }

    public void setRaca(CodigoDescricaoDto raca) {
        this.raca = raca;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public CodigoDescricaoDto getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(CodigoDescricaoDto nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public MunicipioDto getMunicipio() {
        return municipio;
    }

    public void setMunicipio(MunicipioDto municipio) {
        this.municipio = municipio;
    }

    public EstadoDto getEstado() {
        return estado;
    }

    public void setEstado(EstadoDto estado) {
        this.estado = estado;
    }

    public PaisDto getPais() {
        return pais;
    }

    public void setPais(PaisDto pais) {
        this.pais = pais;
    }

    public Date getDataDeEntradaPais() {
        return dataDeEntradaPais;
    }

    public void setDataDeEntradaPais(Date dataDeEntradaPais) {
        this.dataDeEntradaPais = dataDeEntradaPais;
    }
}
