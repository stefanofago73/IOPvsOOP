package iopvsoop.Visitor.NOIF;

/**
 * 
 * @author Stefano
 *
 */
public class OfficeWorker extends Employee{

	public <T> T ask(IEmployeeVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
}// END