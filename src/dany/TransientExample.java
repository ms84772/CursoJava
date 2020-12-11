package dany;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

import oop.Person;

public class TransientExample {

	public static void main(String[] args) {
		Person Dany = new Person("Daniela","Villagran",new Date(),"Something text");

		try {
			FileOutputStream fos = new FileOutputStream(new File("Dany"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			System.out.println(Dany);
			oos.writeObject(Dany);
			
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
