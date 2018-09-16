/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.mf.pratica;

import java.util.Locale; 
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
*
* @author Saulo A. Calixto
*
*/
public class Nome {

	/**
	*
	* Método principal da classe Nome que apenas imprime o dia da semana
	* baseado na configuração da máquina do usuário.
	*
	*/
	public static void main(String args[]) {
		Locale linguaCorrente = Locale.getDefault();
		Calendar calendario = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE", linguaCorrente);
		String dayOfWeek = dateFormat.format(calendario.getTime());
		System.out.println(dayOfWeek);
	}
}
