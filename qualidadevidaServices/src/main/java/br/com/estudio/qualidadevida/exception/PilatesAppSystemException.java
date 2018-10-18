package br.com.estudio.qualidadevida.exception;

public class PilatesAppSystemException extends Exception {

	/**
	 * Atributo serialVersionUID
	 */
	private static final long serialVersionUID = -209806032835078973L;

	/**
	 * Construtor da classe CvcAppSystemException
	 */
	public PilatesAppSystemException() {
		super();
	}

	/**
	 * Construtor da classe CvcAppSystemException
	 *
	 * @param message
	 */
	public PilatesAppSystemException(String message) {
		super(message);
	}

	/**
	 * Construtor da classe CvcAppSystemException
	 *
	 * @param cause
	 */
	public PilatesAppSystemException(Throwable cause) {
		super(cause);
	}

	/**
	 * Construtor da classe CvcAppSystemException
	 *
	 * @param message
	 * @param cause
	 */
	public PilatesAppSystemException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Construtor da classe CvcAppSystemException
	 *
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public PilatesAppSystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
