package misc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		
	}
	
	static void iterateInArray(Object[] items) {
		for(Object object : items) {
			System.out.println(object);
			printDate();
		}		
	}
	
	
	static void printDate() {
		DateFormat df = new SimpleDateFormat("yyyy MM dd HH:mm:ss.SSS");
		
		System.out.println(df.format(new Date()));
	}
	
}
