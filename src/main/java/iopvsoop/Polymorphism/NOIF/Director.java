package iopvsoop.Polymorphism.NOIF;

/**
 * 
 * @author Stefano
 *
 */
public class Director extends Employee {

	@Override
	public double salary() {
		return getDays()*100.0;
	}

}//END
