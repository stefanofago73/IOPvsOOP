package iopvsoop.Polymorphism.NOIF;

/**
 * 
 * @author Stefano
 *
 */
public abstract class Employee {
	//
	private String name;
	//
	private String last;
	//
	private long id;
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

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public abstract double salary() ;

	
}// END