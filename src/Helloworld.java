/*
 * This is the hello world class
 * that has just one main method with
 * some parameters that print hello world
 * and the two parameters
 */

// This is a hello world class program
public class Helloworld {
	// Here is the main method of the class
	public static void main(String [] args) {
		System.out.println("Hello world"); //here is the first line of main method
		System.out.println(args[0]);
		System.out.println(args[1]);
		String name = "Mauricio";
		String lastName = "Sahagun";
		int myNum = 5;
		float myFloatNum = 5.99f;
		double myDouble = 5.66;
		char myLetter = '{';
		boolean myBool = false;
		String myText = "Hello";
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		String firstName="";
		System.out.println(firstName);
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(myDouble);
	}
}
