package iopvsoop.Visitor.NOIF;

/**
 * 
 * @author Stefano
 *
 */
public class Director extends Employee {

	public <T> T ask(IEmployeeVisitor<T> visitor) {
		return visitor.visit(this);
	}

}// END
