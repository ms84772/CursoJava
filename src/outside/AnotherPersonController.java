package outside;

import java.util.Date;

import oop.Person;

public class AnotherPersonController {

	public static void main(String[] args) {
		Person p1 = new Person("Mauricio","Sahagun",new Date(),"transient Example text");
		p1.setFirstName("Manuel");
		//p1.heads = 5;
		

	}

}
