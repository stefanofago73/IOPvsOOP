package iopvsoop.Polymorphism.IF;

/**
 * 
 * @author Stefano
 *
 */
public class SalaryCalculatorEnum {

	public double calculate(Employee employeeEnum) {
		
		switch (employeeEnum.getClusterEnum()) {
		case Director:
			return employeeEnum.getDays() * 100;
		case Executive:
			return employeeEnum.getDays() * 80;
		case Manager:
			return employeeEnum.getDays() * 60;
		case Leader:
			return employeeEnum.getDays() * 45;
		case OfficeWorker:
			return employeeEnum.getDays() * 23;
		}
		return -1;
	}
	
}//END
