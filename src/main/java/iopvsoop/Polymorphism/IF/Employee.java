package iopvsoop.Polymorphism.IF;

/**
 * 
 * @author Stefano
 *
 */
public class Employee {
	//
	private String name;
	//
	private String last;
	//
	private long id;
	//
	private ClusterEnum clusterEnum;
	//
	private int days;

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ClusterEnum getClusterEnum() {
		return clusterEnum;
	}

	public void setClusterEnum(ClusterEnum clusterEnum) {
		this.clusterEnum = clusterEnum;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

}// END
