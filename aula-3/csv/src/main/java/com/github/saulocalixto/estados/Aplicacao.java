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

		String caminho = args[0];
		Leitura leitura = new Leitura();
		List<String> listaUniversidades = leitura.pegarDadosDeArquivo(caminho);

		Universidades universidades = new Universidades();

		universidades.imprimeQtdDeUniversidadesPorEstado(listaUniversidades);
	}
}
