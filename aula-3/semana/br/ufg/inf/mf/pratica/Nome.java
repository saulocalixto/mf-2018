package br.ufg.inf.mf.pratica;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Nome {
	public static void main(String args[]) {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE");
		String dayOfWeek = dateFormat.format(c.getTime());
		System.out.println(dayOfWeek);
	}
}
