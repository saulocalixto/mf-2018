/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.saulocalixto.estados;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Saulo A. Calixto
 *
 */
public class Aplicacao {

	private static final String CAMINHO_PADRAO = "http://repositorio.dados.gov.br/educacao/CADASTRO%20DAS%20IES_2011.csv";

	/**
	 *
	 * Método principal da classe Aplicacao que apenas imprime os dados conseguidos através de um arquivo cujo caminho
	 * é passado como argumento.
	 *
	 * @param args Argumento passado pelo usuário, contém o endereço do arquivo que será lido.
	 *
	 *  @throws IOException Caso o caminho passado no parâmetro não seja válido.
	 */
	public static void main(String args[]) throws IOException {

		String caminho = args.length > 0
				? args[0]
				: CAMINHO_PADRAO;
		Leitura leitura = new Leitura();
		List<String> listaUniversidades = leitura.pegarDadosDeArquivo(caminho);

		UtilitarioUniversidades utilitarioUniversidades = new UtilitarioUniversidades();

		utilitarioUniversidades.imprimeQtdDeUniversidadesPorEstado(listaUniversidades);
	}
}
