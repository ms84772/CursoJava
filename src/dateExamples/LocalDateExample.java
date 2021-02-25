package dateExamples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateExample {

	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy   y  Y w W");
				

		LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
	    
	    LocalTime myTime = LocalTime.now();
	    System.out.println(myTime);
	    
	    Date date = new Date();
	    
	    System.out.println(date);
	    
	    
	    System.out.println(df.format(date));

	}

}
