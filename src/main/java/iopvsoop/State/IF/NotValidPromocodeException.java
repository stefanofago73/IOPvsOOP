package iopvsoop.State.IF;

import iopvsoop.common.PropocodeException;

/**
 * 
 * @author Stefano
 *
 */
public class NotValidPromocodeException extends PropocodeException{

	public NotValidPromocodeException() {
		super();
	}

	public NotValidPromocodeException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotValidPromocodeException(String message) {
		super(message);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5827850872215679444L;

}
