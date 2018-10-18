package br.com.estudio.qualidadevida.constantes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.estudio.qualidadevida.exception.PilatesAppSystemException;

public class Constantes {
	
	public static String FORMAT_DATE = "dd/MM/yyyy";

	public static Date converterStringDate(final String data) throws PilatesAppSystemException {
		try {
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date date = formatter.parse(data.toString());
			return date;
		} catch (Exception e) {
			throw new PilatesAppSystemException("Erro ao converter data");
		}
	}
	
	public static Date converterStringHora(final String hora) throws PilatesAppSystemException  {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			Date dateTime = sdf.parse(hora);
			return dateTime; 
			
		} catch (ParseException e) {
            throw new PilatesAppSystemException("Erro ao converter hora");
		}
	}
}
