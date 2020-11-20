package oop;

import java.util.Date;

public class PersonController {
	
	public static void main(String [] args) {
		Person p1 = new Person();
		p1.setDob(new Date());
		p1.setFirstName("Manuel");
		p1.setLastName("Sahagun");
		p1.heads = 3;
		
		
		System.out.println(p1);
		System.out.println(p1.eat());
		System.out.println(p1.eat("carrtos"));
		
		Person p2 = new Person("Jaime","Lopez", new Date(),"Transient Example text");
		System.out.println(p2);
		System.out.println(p2.eat());
		System.out.println(p2.eat("meat"));
		
		
		
		Person p3 = new Person("Hugo","Sahagun");
		System.out.println(p3);
		p3.setDob(new Date());
		System.out.println(p3.eat());
		System.out.println(p3.eat("mushrooms"));
	}
	
}
