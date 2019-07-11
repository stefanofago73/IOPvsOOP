package iopvsoop.Null.NOIF;

/**
 * 
 * @author Stefano
 *
 */
public class Employee {
	
	private String name;
	private String last;
	private String id;
	private Cluster cluster;

	public Employee(String name,
	String last,
	Cluster cluster,
	String id){
		this.name=name;
		this.last=last;
		this.id=id;
		this.cluster=cluster;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Cluster getCluster() {
		return cluster;
	}

	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
	}

}// END
