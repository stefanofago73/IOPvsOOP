package iopvsoop.Status.NOIF;

import java.util.function.Supplier;

import iopvsoop.common.Foo;

/**
 * 
 * @author Stefano
 *
 */
public class FooSingletonLazyFactoryNOIF {

	private Supplier<Foo> provider;

	public FooSingletonLazyFactoryNOIF(Supplier<Foo> computation) {
		provider = () -> {
			Foo foo = computation.get();
			provider = () -> foo;
			return foo;
		};
	}

	public Foo get() {
		return provider.get();
	}

}// END
