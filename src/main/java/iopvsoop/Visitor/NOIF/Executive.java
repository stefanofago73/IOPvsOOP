package iopvsoop.Visitor.NOIF;

/**
 * 
 * @author Stefano
 *
 */
public class Executive extends Employee {
	
	public <T> T ask(IEmployeeVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
}// END