package misc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import oop.Person;

public class ReadSerialiExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("mauricio");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person per = (Person) ois.readObject();
			
			System.out.println(per);

		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}

	}

}
