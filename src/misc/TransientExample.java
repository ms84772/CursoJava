package misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

import oop.Person;

public class TransientExample {
	
	public static void main(String[] args) {
		Person mauricio = new Person("Mauricio", "Sahagun", new Date(), "Some text anyway is not going to be written in the drive");
		try {
			FileOutputStream fos = new FileOutputStream(new File("mauricio"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			System.out.println(mauricio);
			oos.writeObject(mauricio);
			
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		
		
	}

}
