package iopvsoop.Polymorphism.IF;

/**
 * 
 * @author Stefano
 *
 */
public class SalaryBenefitCalculatorEnum {

	private final SalaryCalculatorEnum inner;

    public SalaryBenefitCalculatorEnum(final SalaryCalculatorEnum inner)
    {
        this.inner = inner;
    }

    public double calculate(Employee employeeEnum)
    {
        double result = inner.calculate(employeeEnum);

        switch (employeeEnum.getClusterEnum())
        {
		case Director:
                return benefit(result, 3);
            case Executive:
                return benefit(result, 5);
            case Manager:
                return benefit(result, 5);
            case Leader:
                return benefit(result, 10);
            case OfficeWorker:
                return benefit(result, 20);
        }
        return -1;
    }

    private static double benefit(
    		final double result, 
    		final int ratio)
    {
        return result + result / 100 * ratio;
    }
    
}//END