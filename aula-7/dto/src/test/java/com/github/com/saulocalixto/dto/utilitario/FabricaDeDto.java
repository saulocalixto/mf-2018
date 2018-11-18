package com.github.com.saulocalixto.dto.utilitario;

import com.github.com.saulocalixto.dto.dtos.*;

import java.util.Date;

public abstract class FabricaDeDto {
    public static IdentificadorDto crieIdentificador() {
        IdentificadorDto identificador = new IdentificadorDto();
        identificador.setArea(100);
        identificador.setCertidaoTipo(crieCodigoDescricao());
        identificador.setData(new Date());
        identificador.setDesignacao("designacao");
        identificador.setEmissor("emissor");
        identificador.setId("6234452365265sd65fa6556");
        identificador.setTipo(crieCodigoDescricaoString());
        identificador.setIndividuo(crieIndividuo());
        return identificador;
    }

    public static CodigoDescricaoDto crieCodigoDescricao() {
        CodigoDescricaoDto codigoDescricao = new CodigoDescricaoDto();
        codigoDescricao.setCodigo(100);
        codigoDescricao.setDescricao("descricao");
        return codigoDescricao;
    }

    public static CodigoDescricaoStringDto crieCodigoDescricaoString() {
        CodigoDescricaoStringDto codigoDescricao = new CodigoDescricaoStringDto();
        codigoDescricao.setCodigo("100");
        codigoDescricao.setDescricao("descricao");
        return codigoDescricao;
    }

    public static CodigoDescricaAlternativaDto crieCodigoDescricaoAlternativa() {
        CodigoDescricaAlternativaDto codigoDescricao = new CodigoDescricaAlternativaDto();
        codigoDescricao.setCodigo(100);
        codigoDescricao.setDescricao("descricao");
        codigoDescricao.setAlternativo("alternativa");
        return codigoDescricao;
    }

    public static IndividuoDto crieIndividuo() {
        IndividuoDto individuo = new IndividuoDto();
        individuo.setId("0239skdlfj2029");
        return individuo;
    }

    public static CertidaoDto crieCertidao() {
        CertidaoDto objeto = new CertidaoDto();

        objeto.setCartorio("cartorio");
        objeto.setFolha(15);
        objeto.setLivro(20);
        objeto.setTermo(30);
        objeto.setTipo(crieCodigoDescricao());
        objeto.setIdentificador(crieIdentificador());
        return objeto;
    }

    public static ComunicacaoDto crieComunicacao() {
        ComunicacaoDto objeto = new ComunicacaoDto();

        objeto.setDetalhe("detalhes");
        objeto.setIndividuo(crieIndividuo());
        objeto.setMeio(crieCodigoDescricaoAlternativa());
        objeto.setPreferencia(crieCodigoDescricao());
        objeto.setUso(crieCodigoDescricaoAlternativa());
        return objeto;
    }

    public static PaisDto criePais() {
        PaisDto objeto = new PaisDto();

        objeto.setCodigo(500);
        objeto.setNome("Brasil");

        return objeto;
    }

    public static EstadoDto crieEstado() {
        EstadoDto objeto = new EstadoDto();

        objeto.setCodigo("562");
        objeto.setNome("Goiás");

        return objeto;
    }

    public static MunicipioDto crieMunicipio() {
        MunicipioDto objeto = new MunicipioDto();

        objeto.setCodigo("3571");
        objeto.setMunicipio("Goiânia");
        objeto.setEstado(crieEstado().getNome());

        return objeto;
    }

    public static DadoDemograficoDto crieDadoDemografico() {
        DadoDemograficoDto objeto = new DadoDemograficoDto();

        objeto.setComentario("comentário");
        objeto.setDataDeEntradaPais(new Date());
        objeto.setDatadeNascimento(new Date());
        objeto.setMae("Mãe");
        objeto.setIndividuo(crieIndividuo());
        objeto.setNacionalidade(crieCodigoDescricao());
        objeto.setNascimentoOrdem(crieCodigoDescricao());
        objeto.setNascimentoAcuracia(new Date());
        objeto.setPai("Pai");
        objeto.setSituacaoFamiliar(crieCodigoDescricao());
        objeto.setSexo(crieCodigoDescricaoAlternativa());
        objeto.setRaca(crieCodigoDescricao());
        objeto.setObitoFonte(crieCodigoDescricao());
        objeto.setObitoAcuracia("Obito Acurácia");
        objeto.setNascimentoSegmento(crieCodigoDescricaoString());
        objeto.setNascimentoPluralidade(crieCodigoDescricao());
        objeto.setObito(new Date());
        objeto.setMunicipio(crieMunicipio());
        objeto.setEstado(crieEstado());
        objeto.setPais(criePais());

        return objeto;
    }

    public static EnderecoDto crieEndereco() {
        EnderecoDto objeto = new EnderecoDto();

        objeto.setBairro("Bairro");
        objeto.setCaixapostal("45665656");
        objeto.setCep("74000000");
        objeto.setDataFinal(new Date());
        objeto.setDataInicial(new Date());
        objeto.setDataFinal(new Date());
        objeto.setDataFinalAcuracia(new Date());
        objeto.setDistrito("Distrito");
        objeto.setEstado(FabricaDeDto.crieEstado());
        objeto.setId("654a65sd55");
        objeto.setIndividuo(FabricaDeDto.crieIndividuo());
        objeto.setMunicipio(FabricaDeDto.crieMunicipio());
        objeto.setPais(FabricaDeDto.criePais());
        objeto.setTipo(FabricaDeDto.crieCodigoDescricao());

        return objeto;
    }

    public static EnderecoLinhaDto crieEnderecoLinha() {
        EnderecoLinhaDto objeto = new EnderecoLinhaDto();

        objeto.setEndereco(FabricaDeDto.crieEndereco());
        objeto.setLinha("Linha");
        objeto.setOrdem(5);

        return objeto;
    }

    public static NomeDto crieNome() {
        NomeDto objeto = new NomeDto();

        objeto.setId("243645sda");
        objeto.setIndividuo(FabricaDeDto.crieIndividuo());
        objeto.setNomes("Nomes");
        objeto.setPreferido(FabricaDeDto.crieCodigoDescricao());
        objeto.setSobrenomes("sobrenomes");
        objeto.setSufixos("sufixos");
        objeto.setTitulos("titulos");
        objeto.setUsoCondicional(FabricaDeDto.crieCodigoDescricao());

        return objeto;
    }

    public static TipoEleitoralDto crieTipoEleitoral() {
        TipoEleitoralDto objeto = new TipoEleitoralDto();

        objeto.setIdentificador(FabricaDeDto.crieIdentificador());
        objeto.setSessao(15);
        objeto.setZona(20);

        return objeto;
    }

    public static UtilizacaoDto crieUtilizacao() {
        UtilizacaoDto objeto = new UtilizacaoDto();

        objeto.setDataFinal(new Date());
        objeto.setDataInicio(new Date());
        objeto.setIdentificador(FabricaDeDto.crieIdentificador());
        objeto.setNome(FabricaDeDto.crieNome());
        objeto.setUso(FabricaDeDto.crieCodigoDescricaoAlternativa());

        return objeto;
    }

    public static VinculoDto crieVinculo() {
        VinculoDto objeto = new VinculoDto();

        objeto.setDataFinal(new Date());
        objeto.setDataInicio(new Date());
        objeto.setIdentificador(FabricaDeDto.crieIdentificador());
        objeto.setIndividuo(FabricaDeDto.crieIndividuo());
        objeto.setRelacionamento(FabricaDeDto.crieCodigoDescricao());

        return objeto;
    }
}
