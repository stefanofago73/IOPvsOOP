package iopvsoop.Null.NOIF;

import java.util.function.Consumer;

/**
 * 
 * @author Stefano
 *
 * @param <T>
 */
public interface IPerformer<T>{
	
    void ask(Consumer<T> action);
    
}
