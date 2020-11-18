package misc;
public class MethodScopeExample {
	static int numberOfLegs=2;
	public static void myMethod(String[] arguments) {
		int age = 48;
		System.out.println(age);
		System.out.println(numberOfLegs);
		System.out.println(arguments);
		
	}
	public static void main(String[] args) {
		System.out.println(numberOfLegs);
		myMethod(args);
	}
}
