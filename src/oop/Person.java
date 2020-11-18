package oop;

import java.util.Date;

public class Person {
	private String firstName;
	private String lastName;
	private Date dob;
	
	int heads;
	
	public String eat() {
		return "Person "+ getFirstName() +" eats";
	}
	
	public String eat(String food) {
		return "Person "+ getFirstName() +" eats "+ food;
	}
	
	public Person() {
		System.out.println("the constructor is being called");
	}
	public Person(String fn, String ln, Date dobC) {
		this.firstName=fn;
		this.lastName=ln;
		this.dob=dobC;
	}
	
	public Person(String fn, String ln) {
		this.firstName=fn;
		this.lastName=ln;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	public String toString() {
		
		return "First Name: " +this.firstName + "\n"+
				"Last Name: " +this.lastName + "\n"+
				"Brithdate: " +this.dob+ "";
				
		
	}
	
	

}
