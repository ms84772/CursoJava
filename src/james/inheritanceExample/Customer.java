package james.inheritanceExample;

import zoo.Person;

public class Customer extends Person{

	private int customerId;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String talk() {
		return "The custumer "+this.getFirstName() + " talks";
	}
	
	public String buy() {
		return "The custumer "+this.getFirstName() + " buys stuff from our store";
	}
	
	
}
