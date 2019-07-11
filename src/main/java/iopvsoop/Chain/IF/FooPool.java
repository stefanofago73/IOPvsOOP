package iopvsoop.Chain.IF;

import iopvsoop.common.Foo;

/**
 * 
 * @author Stefano
 *
 */
public class FooPool {
	private final Foo[] foos;
	private int index;

	public FooPool(final Foo[] foos) {
		this.foos = foos;
	}

	public Foo get() {
		Foo foo = foos[index];
		index++;
		if (index == foos.length) {
			index = 0;
		}
		return foo;
	}

}// END