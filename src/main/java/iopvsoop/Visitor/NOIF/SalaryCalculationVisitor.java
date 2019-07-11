package iopvsoop.Visitor.NOIF;

/**
 * 
 * @author Stefano
 *
 */
public class SalaryCalculationVisitor implements IEmployeeVisitor<Double> {

	public Double visit(Director employee) {
		return employee.getDays() * 100.0;
	}

	public Double visit(Manager employee) {
		return employee.getDays() * 80.0;
	}

	public Double visit(Executive employee) {
		return employee.getDays() * 80.0;
	}

	public Double visit(Leader employee) {
		return employee.getDays() * 45.0;
	}

	public Double visit(OfficeWorker employee) {
		return employee.getDays() * 23.0;
	}

}// END