package iopvsoop.Null.NOIF;

import static iopvsoop.common.CSharpUtil.SingleOrDefault;

/**
 * 
 * @author Stefano
 *
 */
public class EmployeeRepositoryNullNOIF {

	private final Employee[] repository = { new Employee("Claudio", "Pattarello", Cluster.Manager, "CLAPAT01"),
			new Employee("Andrea", "Chiarini", Cluster.Leader, "ANDCHI01"),
			new Employee("Matteo", "Baglini", Cluster.Leader, "MATBAG01"), };

	public IPerformer<Employee> get(String number) {
		Employee result = SingleOrDefault(repository, e -> e.getId() == number);
		if (result == null) {
			return new NoPerformer<>();
		}
		return new Performer<>(result);
	}

}// END