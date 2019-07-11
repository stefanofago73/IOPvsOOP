package iopvsoop.State.NOIF;

import iopvsoop.common.PropocodeException;

/**
 * 
 * @author Stefano
 *
 */
public class AlreadyUsedPromocodeException extends PropocodeException{

	public AlreadyUsedPromocodeException() {
		super();
	}

	public AlreadyUsedPromocodeException(String message, Throwable cause) {
		super(message, cause);
	}

	public AlreadyUsedPromocodeException(String message) {
		super(message);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4334905027817663777L;

}
