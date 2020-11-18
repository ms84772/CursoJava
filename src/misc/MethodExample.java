package misc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import zoo.GermanSheppard;

public class MethodExample {
	static String[] names = {"Mau","James","Abi","Dany","Luis"};
	
	static Integer[] ages= {10,20,30,40,50};
	
	static Double[] prices= {10.99,20.99,30.99,40.99,50.99};
	
	static Boolean[] truesAndFalses= {true,false,true,true,false};
	
	public static void main(String[] args) {
//		for(String name : names) {
//			System.out.println(name);
//		}
//		
//		for(int age : ages) {
//		System.out.println(age);
//	}
	
//		for(int age : ages) {
//		System.out.println(age);
//	}
	
//		for(int age : ages) {
//		System.out.println(age);
//	}
	
		iterateInArray(names);
		iterateInArray(ages);
		
		iterateInArray(prices);
		
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		iterateInArray(truesAndFalses);
		System.out.println(getFullName("Mauricio", "Sahagun",   48));
		System.out.println(getFullName("Jaime",    "Lopez",     50));
		System.out.println(getFullName("Abi",      "Lopez",     19));
		System.out.println(getFullName("Dany",     "Villagran", 19));
		GermanSheppard fuffi = getGermanSheppard();
		
		System.out.println(fuffi.eat());
		System.out.println(fuffi.eat("carrots"));
		System.out.println(fuffi.getName());
		System.out.println(fuffi.getPedigree());
		System.out.println(fuffi.getDob());
		

		GermanSheppard otherDog = getGermanSheppard("scoobi", "no", new Date());
		System.out.println(otherDog.eat());
		System.out.println(otherDog.eat("scoobi cookies"));
		System.out.println(otherDog.getName());
		System.out.println(otherDog.getPedigree());
		System.out.println(otherDog.getDob());
		
		GermanSheppard snoopy = getGermanSheppard("snoopi", "yes", new Date());
		System.out.println(snoopy.eat());
		System.out.println(snoopy.eat("woodstock"));
		System.out.println(snoopy.getName());
		System.out.println(snoopy.getPedigree());
		System.out.println(snoopy.getDob());
		
		System.out.println(getGermanSheppard("Lassi", "yes", new Date(), 80));
	}
	
	static void iterateInArray(Object[] items) {
		for(Object object : items) {
			System.out.println(object);
			printDate();
			System.out.println(getTheDate());
		}		
	}
	
	
	static void printDate() {
		DateFormat df = new SimpleDateFormat("yyyy MM dd HH:mm:ss.SSS");
		
		System.out.println(df.format(new Date()));
	}
	
	static String getTheDate() {
		
		return new Date().toString();
	}
	
	static int getNumber() {
		int rs = 10;
		return rs;
	}

	static Date getDate() {
		return new Date();
	}
	
	
	static String getFullName(String firstName, String lastName, int age) {
		return firstName + " " + lastName + " is "+age+ " years old";
	}
	
	
	static GermanSheppard getGermanSheppard() {
		GermanSheppard dog = new GermanSheppard();
		dog.setDob(new Date());
		dog.setName("Fuffi");
		dog.setPedigree("yes");
		return dog;
	}
	
	static GermanSheppard getGermanSheppard(String name, String pedigree, Date dob) {
		GermanSheppard dog = new GermanSheppard();
		dog.setDob(dob);
		dog.setName(name);
		dog.setPedigree(pedigree);
		return dog;
	}
	
	static String getGermanSheppard(String name, String pedigree, Date dob, int age) {
		GermanSheppard dog = new GermanSheppard();
		dog.setDob(dob);
		dog.setName(name);
		dog.setPedigree(pedigree);
		return dog.getName() + " " + 
			dog.getPedigree() + " " + 
			dog.getDob() + " " +
			dog.eat() + " " + 
			dog.eat("cereal");
	}
	
	
	
}
