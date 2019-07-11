package iopvsoop.Visitor.NOIF;

/**
 * 
 * @author Stefano
 *
 */
public class SalaryBenefitCalculationVisitor implements IEmployeeVisitor<Double> {

	private final IEmployeeVisitor<Double> inner;

	public SalaryBenefitCalculationVisitor(IEmployeeVisitor<Double> inner) {
		this.inner = inner;
	}

	public Double visit(Director employee) {
		return benefit(inner.visit(employee), 3);
	}

	public Double visit(Manager employee) {
		return benefit(inner.visit(employee), 5);
	}

	public Double visit(Executive employee) {
		return benefit(inner.visit(employee), 5);
	}

	public Double visit(Leader employee) {
		return benefit(inner.visit(employee), 10);
	}

	public Double visit(OfficeWorker employee) {
		return benefit(inner.visit(employee), 20);
	}

	private static Double benefit(Double result, int ratio) {
		return result + result / 100 * ratio;
	}

}// END