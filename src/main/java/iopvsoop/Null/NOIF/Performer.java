package iopvsoop.Null.NOIF;

import java.util.function.Consumer;

/**
 * 
 * @author Stefano
 *
 * @param <T>
 */
public class Performer<T> implements IPerformer<T> {

	private T value;

	Performer(T value) {
		this.value = value;
	}

	@Override
	public void ask(Consumer<T> action) {
		action.accept(value);
	}

}// END
