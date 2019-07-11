package iopvsoop.Polymorphism.NOIF;

/**
 * 
 * @author Stefano
 *
 */
public class Leader extends Employee{

	@Override
	public double salary() {
		return getDays()*45.0;
	}

}//END
