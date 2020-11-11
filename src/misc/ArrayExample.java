package misc;
public class ArrayExample {
	public static void main(String[] args) {
		String[] names = {"Mau","James","Abi","Dany","Luis", "another"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		names[3] = "Hugo";
		System.out.println("++++++++++++++++++++");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		for(String s: names) {
			System.out.println(s);
		}
		int[] ages = {10,20,11,23,45};
		for(int age : ages ) {
			System.out.println(age);
		}
		double[] prices = {10.99,12.99,3.99,4.50,6.34};
		for(double price : prices) {
			System.out.println("The prices is: "+price);
		}
		Object[] objects = {"Mauricio",34,12.50, true};
		for(Object o : objects) {
			System.out.println(o);
		}
	}
}
