package iopvsoop;

import static iopvsoop.common.CSharpUtil.Pass;
import static iopvsoop.common.CSharpUtil.TryParse;
import static iopvsoop.common.CSharpUtil.action;

import org.junit.Assert;
import org.junit.Test;

import iopvsoop.Chain.IF.FooPool;
import iopvsoop.Chain.NOIF.FooPoolChain;
import iopvsoop.Math_.NOIF.FooPoolMath;
import iopvsoop.Null.IF.EmployeeRepositoryNullIF;
import iopvsoop.Polymorphism.IF.ClusterEnum;
import iopvsoop.Polymorphism.IF.Employee;
import iopvsoop.Polymorphism.IF.SalaryBenefitCalculatorEnum;
import iopvsoop.Polymorphism.IF.SalaryCalculatorEnum;
import iopvsoop.Polymorphism.NOIF.Leader;
import iopvsoop.State.IF.AlreadyUsedPromocodeException;
import iopvsoop.State.IF.ExpiredPromocodeException;
import iopvsoop.State.IF.NotValidPromocodeException;
import iopvsoop.State.IF.PromocodeStatusIF;
import iopvsoop.State.NOIF.ConvertNumberStatusNOIF;
import iopvsoop.State.NOIF.PromocodeStatusNOIF;
import iopvsoop.Status.IF.FooSingletonLazyFactoryIF;
import iopvsoop.Status.NOIF.FooSingletonLazyFactoryNOIF;
import iopvsoop.Visitor.NOIF.SalaryBenefitCalculationVisitor;
import iopvsoop.Visitor.NOIF.SalaryCalculationVisitor;
import iopvsoop.common.CSharpUtil.Action;
import iopvsoop.common.Foo;
import iopvsoop.common.IntHolder;
import iopvsoop.common.PropocodeException;

/**
 * 
 * @author Stefano
 *
 */
public class Tests {

	@Test
	public void test_FooPool_IF() {
		Foo foo0 = new Foo();
		Foo foo1 = new Foo();
		Foo foo2 = new Foo();
		Foo[] foos = new Foo[] { foo0, foo1, foo2 };
		FooPool fooPool = new FooPool(foos);
		Assert.assertEquals(foo0, fooPool.get());
		Assert.assertEquals(foo1, fooPool.get());
		Assert.assertEquals(foo2, fooPool.get());
		Assert.assertEquals(foo0, fooPool.get());
	}

	@Test
	public void test_FooPool_NOIF() {
		Foo foo0 = new Foo();
		Foo foo1 = new Foo();
		Foo foo2 = new Foo();
		Foo[] foos = new Foo[] { foo0, foo1, foo2 };
		FooPoolMath fooPool = new FooPoolMath(foos);
		Assert.assertEquals(foo0, fooPool.get());
		Assert.assertEquals(foo1, fooPool.get());
		Assert.assertEquals(foo2, fooPool.get());
		Assert.assertEquals(foo0, fooPool.get());
	}

	@Test
	public void test_FooPoolChain_NOIF() {
		Foo foo0 = new Foo();
		Foo foo1 = new Foo();
		Foo foo2 = new Foo();
		Foo[] foos = new Foo[] { foo0, foo1, foo2 };
		FooPoolChain fooPool = new FooPoolChain(foos);
		Assert.assertEquals(foo0, fooPool.get());
		Assert.assertEquals(foo1, fooPool.get());
		Assert.assertEquals(foo2, fooPool.get());
		Assert.assertEquals(foo0, fooPool.get());
	}
	
	@Test
	public void test_salaryCalculator_IF() {
		SalaryCalculatorEnum salaryCalculator = new SalaryCalculatorEnum();
		Employee employee = new Employee();
		employee.setDays(10);
		employee.setClusterEnum(ClusterEnum.Leader);
		double result = salaryCalculator.calculate(employee);
		Assert.assertEquals(450.0, result, 0.0);
	}

	@Test
	public void test_salaryCalculator_NOIF() {
		Leader leader = new Leader();
		leader.setDays(10);
		double result = leader.salary();
		Assert.assertEquals(450.0, result, 0.0);
	}

	@Test
	public void SalaryEmployeeVisitorCalculator_NOIF() {

		SalaryCalculationVisitor visitor = new SalaryCalculationVisitor();

		iopvsoop.Visitor.NOIF.Leader leader = new iopvsoop.Visitor.NOIF.Leader();
		leader.setDays(10);

		iopvsoop.Visitor.NOIF.OfficeWorker worker = new iopvsoop.Visitor.NOIF.OfficeWorker();
		worker.setDays(10);

		double leaderSalary = leader.ask(visitor);
		Assert.assertEquals(450.0, leaderSalary, 0.0);

		double workerSalary = worker.ask(visitor);
		Assert.assertEquals(230.0, workerSalary, 0.0);

	}

	@Test
	public void test_SalaryWithBenefitCalculator_IF() {
		SalaryCalculatorEnum salaryCalculator = new SalaryCalculatorEnum();
		SalaryBenefitCalculatorEnum salaryBenefitCalculator = new SalaryBenefitCalculatorEnum(salaryCalculator);
		Employee employee = new Employee();
		employee.setDays(10);
		employee.setClusterEnum(ClusterEnum.Leader);
		double result = salaryBenefitCalculator.calculate(employee);
		Assert.assertEquals(495.0, result, 0.0);
	}

	@Test
	public void test_SalaryEmployeeBenefitVisitorCalculator_NOIF() {
		iopvsoop.Visitor.NOIF.Leader leader = new iopvsoop.Visitor.NOIF.Leader();
		leader.setDays(10);
		SalaryCalculationVisitor salaryCalculation = new SalaryCalculationVisitor();
		SalaryBenefitCalculationVisitor salaryBenefitCalculation = new SalaryBenefitCalculationVisitor(
				salaryCalculation);
		double result = leader.ask(salaryBenefitCalculation);
		Assert.assertEquals(495.0, result, 0.0);
	}

	@Test
	public void test_NullResult_IF() {
		// iopvsoop.Null.IF.Employee employee = new
		// EmployeeRepositoryNullIF().getOrNull("badcode");
		iopvsoop.Null.IF.Employee employee = new EmployeeRepositoryNullIF().getOrNull("CLAPAT01");
		// if (employee!=null)
		Assert.assertEquals("Claudio", employee.getName());
	}

	@Test
	public void test_CentralisedNullResult_NOIF() {
		// iopvsoop.Null.NOIF.IPerformer<iopvsoop.Null.NOIF.Employee> employee =
		// new iopvsoop.Null.NOIF.EmployeeRepositoryNullNOIF().get("badcode");
		iopvsoop.Null.NOIF.IPerformer<iopvsoop.Null.NOIF.Employee> employee = new iopvsoop.Null.NOIF.EmployeeRepositoryNullNOIF()
				.get("CLAPAT01");
		employee.ask(e -> Assert.assertEquals("Claudio", e.getName()));
	}

	@Test
	public void test_ConvertNumber_IF() {
		IntHolder number = new IntHolder();
		if (TryParse("38", number))
			Assert.assertEquals(38, number.value);
		else
			Assert.fail();
	}

	@Test
	public void ConvertNumberWrapIf_NOIF() {
		Action action = action(Assert::fail);
		ConvertNumberStatusNOIF.Parse("38", number -> {
			action.me = () -> Assert.assertEquals(38, number.intValue());
		});
		action.me.run();
	}

	@Test(expected = PropocodeException.class)
	public void CatchExceptions_IF() {

		PromocodeStatusIF promocode = new PromocodeStatusIF();
		try {
			promocode.apply("g128g7d2g");
		} catch (AlreadyUsedPromocodeException exc) {
			Pass("Already used", exc);
		} catch (ExpiredPromocodeException exc) {
			Pass("Expired", exc);
		} catch (NotValidPromocodeException exc) {
			Pass("Not valid", exc);
		}
	}

	@Test(expected = PropocodeException.class)
	public void test_RemoveCatchExceptionsAndUseMessages_NOIF() {
		PromocodeStatusNOIF promocode = new PromocodeStatusNOIF();
		promocode.AlreadyUsed(action(() -> Pass("Already used"))).Expired(action(() -> Pass("Expired")))
				.NotValid(action(() -> Pass("Not valid"))).apply("g128g7d2g");

	}

	@Test
	public void test_FooSingletonLazyFactory_IF() {
		FooSingletonLazyFactoryIF fooFactory = new FooSingletonLazyFactoryIF();
		Foo foo = fooFactory.get();
		Foo foo1 = fooFactory.get();
		Assert.assertEquals(foo, foo1);
	}

	@Test
	public void test_FooSingletonLazyFactory_NOIF() {
		FooSingletonLazyFactoryNOIF fooFactory = new FooSingletonLazyFactoryNOIF(Foo::new);
		Foo foo = fooFactory.get();
		Foo foo1 = fooFactory.get();
		Assert.assertEquals(foo, foo1);
	}

}// END