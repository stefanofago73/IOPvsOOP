package iopvsoop.common;

import java.util.Arrays;
import java.util.function.Predicate;

/**
 * 
 * @author Stefano
 *
 */
public class CSharpUtil {

	/**
	 * 
	 * @author Processor Object
	 *
	 */
	public static final class Action {
		public Runnable me;
	}

	/**
	 * 
	 * Processor Object Factory
	 * 
	 * @param that
	 * @return Action
	 */
	public static final Action action(Runnable that) {
		Action tmp = new Action();
		tmp.me = that;
		return tmp;
	}

	/**
	 * 
	 * Trick about lunching RuntimeException (not supported in Junit)
	 * 
	 * @param msg
	 * @param exc
	 */
	public static final void Pass(String msg, RuntimeException exc) {
		throw exc;
	}

	/**
	 * 
	 * Trick about Exception in Junit
	 * 
	 * @param msg
	 */
	public static final void Pass(String msg) {
		throw new PropocodeException(msg);
	}

	/**
	 * 
	 * fake Linq method
	 * 
	 * @param elements
	 * @param predicate
	 * @return
	 */
	public static final <T> T SingleOrDefault(T[] elements, Predicate<T> predicate) {
		return Arrays.stream(elements).filter(predicate).findFirst().orElse(null);
	}

	/**
	 * 
	 * fake C# method
	 * 
	 * @param toParse
	 * @param number
	 * @return
	 */
	public static final boolean TryParse(String toParse, IntHolder number) {
		try {
			number.value = Integer.parseInt(toParse);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}// END