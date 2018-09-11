package com.github.saulocalixto.estados;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Aplicacao {

	public static void main(String args[]) {
		
		String caminho = args[0];
		System.out.println(caminho);
		BufferedReader bf = getBufferedReader(caminho);
		ArrayList<String> estados = getTodosEstados(bf);
		
		for(String estado : estados){
			System.out.println(estado);
		}

	}

	private static ArrayList<String> getTodosEstados(final BufferedReader br) {

        	ArrayList<String> estados = new ArrayList<>();
        	try {
            		String linha = br.readLine();
            		while (linha != null) {
                		estados.add(linha.replaceAll(" ", ""));
                		linha = br.readLine();
            		}
        	} catch (Exception e) {
            		return null;
        	}

        	return estados;
    	}

	private static BufferedReader getBufferedReader(final String urlString)
            throws MalformedURLException, IOException {
        	try {
			URL oracle = new URL(urlString);
        		InputStreamReader is = new InputStreamReader(oracle.openStream());
        		return new BufferedReader(is);
		} catch (MalformedURLException mf) {
			System.out.println("Erro de leitura.");
		} catch(IOException e) {
			System.out.println("Erro de leitura.");
		}
    	}

}
