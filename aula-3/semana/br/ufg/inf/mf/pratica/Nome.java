package br.ufg.inf.mf.pratica;

import java.util.Locale; 
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Nome {
	public static void main(String args[]) {
		Locale linguaCorrente = Locale.getDefault();
		Calendar calendario = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE", linguaCorrente);
		String dayOfWeek = dateFormat.format(calendario.getTime());
		System.out.println(dayOfWeek);
	}
}
