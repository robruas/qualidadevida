package br.com.estudio.qualidadevida.exception;
public class PilatesAppBusinessException extends Exception {

	/**
	 * Atributo serialVersionUID
	 */
	private static final long serialVersionUID = -209806032835078973L;

	/**
	 * Construtor da classe CvcAppBusinessException
	 */
	public PilatesAppBusinessException() {
		super();
	}

	/**
	 * Construtor da classe CvcAppBusinessException
	 *
	 * @param message
	 */
	public PilatesAppBusinessException(String message) {
		super(message);
	}

	/**
	 * Construtor da classe CvcAppBusinessException
	 *
	 * @param cause
	 */
	public PilatesAppBusinessException(Throwable cause) {
		super(cause);
	}

	/**
	 * Construtor da classe CvcAppBusinessException
	 *
	 * @param message
	 * @param cause
	 */
	public PilatesAppBusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Construtor da classe CvcAppBusinessException
	 *
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public PilatesAppBusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
