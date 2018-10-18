package br.com.estudio.qualidadevida.exception;

import java.io.Serializable;

import javax.ws.rs.core.Response.Status;
public class PilatesAPIException extends Exception implements Serializable {

	/**
	 * Atributo serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/** Atributo para registro do status http */
	private final Status status;
	/**
	 * Construtor da classe CadastroUsuarioAPIException
	 */
	PilatesAPIException() {
		super();
		this.status = Status.OK;
	}

	/**
	 * Construtor da classe CadastroUsuarioAPIException
	 * 
	 * @param message
	 * @param cause
	 * @param status
	 */
	public PilatesAPIException(String message, Throwable cause, Status status) {
		super(message, cause);
		this.status = status;
	}

	/**
	 * Construtor da classe CadastroUsuarioAPIException
	 * 
	 * @param message
	 * @param status
	 */
	public PilatesAPIException(String message, Status status) {
		super(message);
		this.status = status;
	}

	/**
	 * Construtor da classe CadastroUsuarioAPIException
	 * 
	 * @param cause
	 * @param status
	 */
	public PilatesAPIException(Throwable cause, Status status) {
		super(cause);
		this.status = status;
	}

	/**
	 * @return o valor do atributo status
	 */
	public final Status getStatus() {
		return this.status;
	}

}
