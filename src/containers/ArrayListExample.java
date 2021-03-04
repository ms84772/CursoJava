package containers;

import java.util.ArrayList;


public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Abi");
		names.add("Dany");
		names.add("Mau");
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		//System.out.println(names.get(3));
		
		System.out.println("--------");
		for(int i=0;i<3;i++) {
			System.out.println(names.get(i));
		}
		System.out.println("--------");
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		System.out.println("--------");
		
		for(String i :names){
			System.out.println(i);
		}
		
		System.out.println("--------");
		names.stream().forEach(item -> doSomething(item));
		
	}
	
	public static void doSomething(String value) {
		System.out.println("this is the string: "+value);
	}

}
