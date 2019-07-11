package iopvsoop.Chain.NOIF;

import java.util.Arrays;
import java.util.function.Supplier;

import iopvsoop.common.Foo;

/**
 * 
 * This is only a prototype idea, demonstrating the danger/magic
 * of inner lambdas
 * 
 * @author Stefano
 *
 */
public class FooPoolChain {

	private Supplier<Foo> provider;

	public FooPoolChain(Foo[] foos) {
		
		if(foos==null||foos.length>3){
			throw new IllegalArgumentException("No more of 3 Foo...");
		}
		
		// Here, I use a little trick to by-pass generic-array-construction limit in Java
		final Supplier<Foo>[] fooRoot = array(provider);

		provider = () -> {
			provider = () -> {
				provider = () -> {
					provider = fooRoot[0];
					return foos[2];
				};
				return foos[1];
			};
			return foos[0];
		};

		fooRoot[0] = provider;
	}

	public Foo get() {
		return provider.get();
	}


	//======================================================================
	//
	//
	//
	//======================================================================
	
	@SafeVarargs
	private final Supplier<Foo> [] array(Supplier<Foo> ... toReturn){
		return toReturn;
	}
	
}// END
