/*
 * © 2016 Porto Seguro S.A. - Copyright - Todos os direitos reservados.
 */
package br.com.estudio.qualidadevida.exception;


/**
 * Classe responsável por por encapsular um erro de exceção da camada DAO da entidade usuário.
 * 
 * @author CDS-Arquitetura
 * @since 15 de nov de 2016 18:05:55
 * @version 1.0
 */
public class PilatesDaoException extends Exception {

	/**
	 * Atributo serialVersionUID
	 */
	private static final long serialVersionUID = -209806032835078973L;

	/**
	 * Construtor da classe UserAppDaoException
	 */
	public PilatesDaoException() {
		super();
	}

	/**
	 * Construtor da classe UserAppDaoException
	 *
	 * @param message
	 */
	public PilatesDaoException(String message) {
		super(message);
	}

	/**
	 * Construtor da classe UserAppDaoException
	 *
	 * @param cause
	 */
	public PilatesDaoException(Throwable cause) {
		super(cause);
	}

	/**
	 * Construtor da classe UserAppDaoException
	 *
	 * @param message
	 * @param cause
	 */
	public PilatesDaoException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Construtor da classe UserAppDaoException
	 *
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public PilatesDaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
