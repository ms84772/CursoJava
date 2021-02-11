package inner;

import java.util.Date;

public class Employee {
	
	private String firstName;
	private String lastName;
	private Date dob;
	
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
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String firstName, String lastName, Date dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	
	
	class Address{
		private String street1;
		private String street2;
		private String city;
		private String state;
		private String zipCode;
		
		
		
		public String getStreet1() {
			return street1;
		}
		public void setStreet1(String street1) {
			this.street1 = street1;
		}
		public String getStreet2() {
			return street2;
		}
		public void setStreet2(String street2) {
			this.street2 = street2;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getZipCode() {
			return zipCode;
		}
		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}
		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Address(String street1, String street2, String city, String state, String zipCode) {
			super();
			this.street1 = street1;
			this.street2 = street2;
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;
		}
		
	}
	
}




class Department{
	private int id;
	private String Description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Department(int id, String description) {
		super();
		this.id = id;
		Description = description;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
