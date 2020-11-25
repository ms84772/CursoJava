package threads;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import mvc.model.Person;

public class RunnableExample extends Person implements Runnable {
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	private String name;
	private Date timeOfSpawn;
	
	public RunnableExample() {
		
	}
	
	public RunnableExample(String name, Date dob) {
		this.name=name;
		this.timeOfSpawn = dob;
	}
	
	public Date getTimeOfSpawn() {
		return timeOfSpawn;
	}

	public void setTimeOfSpawn(Date timeOfSpawn) {
		this.timeOfSpawn = timeOfSpawn;
	}

	public void executeThreadLogic() {
		System.out.println(String.format("The thread %s is running its logic at %S", this.name,df.format(new Date())));
	}
	
	@Override
	public void run() {
		executeThreadLogic();
		
	}
	
	
	

}
