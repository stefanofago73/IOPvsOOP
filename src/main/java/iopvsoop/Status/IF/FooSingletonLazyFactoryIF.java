package iopvsoop.Status.IF;

import iopvsoop.common.Foo;

/**
 * 
 * @author Stefano
 *
 */
public class FooSingletonLazyFactoryIF {

	private Foo foo;

	public Foo get() {
		if (foo == null)
			foo = new Foo();
		return foo;
	}

}// END
