package james.inheritanceExample;

import java.util.Date;

public class PersonController {

	public static void main(String[] args) {
		Person p = new Person();
		p.setFirstName("Mauricio");
		p.setLastName("Sahagun");
		p.setId(1);
		p.setDob(new Date());
		
		System.out.println(p.talk());
		
		Customer c = new Customer();
		c.setFirstName("Jaime");
		c.setLastName("Lopez");
		c.setId(2);
		c.setDob(new Date());
		c.setCustomerId(1);
		
		System.out.println(c.talk());
		System.out.println(c.buy());
		

	}

}
