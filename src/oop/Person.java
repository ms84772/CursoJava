package oop;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable  {
	private String firstName;
	private String lastName;
	private Date dob;
	private String transExample;
	
	
	
	public String getTransExample() {
		return transExample;
	}

	public void setTransExample(String transExample) {
		this.transExample = transExample;
	}


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
	public Person(String fn, String ln, Date dobC, String trans) {
		this.firstName=fn;
		this.lastName=ln;
		this.dob=dobC;
		this.transExample = trans;
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
		
		return "First Name:    \t" +this.firstName + "\n"+
				"Last Name:    \t" +this.lastName + "\n"+
				"Brithdate:    \t" +this.dob+ "\n"+ 
				"TransExample: \t" + this.transExample;
				
		
	}
	
	

}
