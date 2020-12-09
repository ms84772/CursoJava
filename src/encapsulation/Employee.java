package encapsulation;

import java.util.Date;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Setting the id for the object to:"+id +" set on " + new Date());
		this.id = id;
	}
	public String getFirstName() {
		
		return firstName;
	}
	public void setFirstName(String firstName) {
		System.out.println("Setting the firsname for the object to:"+firstName +" set on " + new Date());
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		System.out.println("Setting the lastname for the object to:"+lastName +" set on " + new Date());
		this.lastName = lastName;
	}
	
	

}
