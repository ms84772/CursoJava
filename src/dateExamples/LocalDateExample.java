package dateExamples;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateExample {

	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
				

		LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
	    
	    LocalTime myTime = LocalTime.now();
	    System.out.println(myTime);
	    
	    Date date = new Date();
	    
	    System.out.println(date);
	    
	    
	    System.out.println(df.format(date));
	    
	    try {
			Date myDOB = df.parse("06/05/1972");
			
			System.out.println(myDOB);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    

	}

}
