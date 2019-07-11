package iopvsoop.Math_.NOIF;

import iopvsoop.common.Foo;

/**
 * 
 * @author Stefano
 *
 */
public class FooPoolMath {
	private final Foo[] foos;
	private int index;

	public FooPoolMath(final Foo[] foos) {
		this.foos = foos;
	}

	public Foo get() {
		int idx = index;
		index = (index+1) % foos.length;
		return foos[idx];
	}

}// END
