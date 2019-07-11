package iopvsoop.Null.IF;

import static iopvsoop.common.CSharpUtil.SingleOrDefault;

/**
 * 
 * @author Stefano
 *
 */
public class EmployeeRepositoryNullIF {

	 private final Employee[] repository =
	        {
	            new Employee("Claudio", "Pattarello", Cluster.Manager,  "CLAPAT01"),
	            new Employee("Andrea", "Chiarini", Cluster.Leader,  "ANDCHI01"),
	            new Employee("Matteo", "Baglini", Cluster.Leader,  "MATBAG01"),
	        };
	 
	 public Employee getOrNull(String number)
     {
        return SingleOrDefault(repository, e->e.getId()==number);
     }
	 
	 
}//END