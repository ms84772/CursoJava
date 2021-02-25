package scan;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");

	    int userName = myObj.nextInt();  // Read user input
	    System.out.println("Username is: " + userName);  // Output user input
	}

}
