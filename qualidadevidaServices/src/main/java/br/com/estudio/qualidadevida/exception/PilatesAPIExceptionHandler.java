package br.com.estudio.qualidadevida.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Classe responsável por tratar a exceção para resposta rest.
 * 
 * @author CDS-Arquitetura
 * @since Nov 20, 2016 2:12:07 AM
 * @version 1.0
 */
@Provider
public class PilatesAPIExceptionHandler implements ExceptionMapper<PilatesAPIException>{

	private static final String SISTEMA_INDISPONIVEL = "SISTEMA INDISPONIVEL";

	@Override
	public Response toResponse(PilatesAPIException exception) {

		Status status = Status.INTERNAL_SERVER_ERROR;
		String mensagem = SISTEMA_INDISPONIVEL;

		if (exception != null) {
			status = exception.getStatus();
			mensagem = exception.getMessage();
		}

		return Response.status(status).entity(mensagem).build();
	}

	
}
