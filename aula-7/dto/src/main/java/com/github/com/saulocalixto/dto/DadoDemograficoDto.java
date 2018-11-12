package com.github.com.saulocalixto.dto;

import java.util.Date;

/**
 * Created by aluno on 12/11/18.
 */
public class DadoDemograficoDto {
    private IndividuoDto individuo;
    private Date datadeNascimento;
    private Date nascimentoAcuracia;
    private DataSeguimento nascimentoSegmento;
    private NascimentoPluralidadeDto nascimentoPluralidade;
    private NascimentoOrdemDto nascimentoOrdem;
    private Date obito;
    private String obitoAcuracia;
    private ObitoFonteDto obitoFonte;
    private SexoDto sexo;
    private String mae;
    private String pai;
    private SituacaoFamiliarDto situacaoFamiliar;
    private RacaDto raca;
    private String comentario;
    private NacionalidadeDto nacionalidade;
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

    public DataSeguimento getNascimentoSegmento() {
        return nascimentoSegmento;
    }

    public void setNascimentoSegmento(DataSeguimento nascimentoSegmento) {
        this.nascimentoSegmento = nascimentoSegmento;
    }

    public NascimentoPluralidadeDto getNascimentoPluralidade() {
        return nascimentoPluralidade;
    }

    public void setNascimentoPluralidade(NascimentoPluralidadeDto nascimentoPluralidade) {
        this.nascimentoPluralidade = nascimentoPluralidade;
    }

    public NascimentoOrdemDto getNascimentoOrdem() {
        return nascimentoOrdem;
    }

    public void setNascimentoOrdem(NascimentoOrdemDto nascimentoOrdem) {
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

    public ObitoFonteDto getObitoFonte() {
        return obitoFonte;
    }

    public void setObitoFonte(ObitoFonteDto obitoFonte) {
        this.obitoFonte = obitoFonte;
    }

    public SexoDto getSexo() {
        return sexo;
    }

    public void setSexo(SexoDto sexo) {
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

    public SituacaoFamiliarDto getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    public void setSituacaoFamiliar(SituacaoFamiliarDto situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }

    public RacaDto getRaca() {
        return raca;
    }

    public void setRaca(RacaDto raca) {
        this.raca = raca;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public NacionalidadeDto getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(NacionalidadeDto nacionalidade) {
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
