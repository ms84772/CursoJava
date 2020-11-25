package threads;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadExample extends Thread{
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	private String name;
	private Date timeOfSpawn;
	
	public void executeThreadLogic() {
		System.out.println(String.format("The thread %s is running its logic at %S", this.name,df.format(new Date())));
	}

	public void run() {
		this.executeThreadLogic();
	}
	public ThreadExample() {
		
	}

	public ThreadExample(String name, Date tos) {
		this.name = name;
		this.timeOfSpawn = tos;
	}
	
	public Date getTimeOfSpawn() {
		return timeOfSpawn;
	}
	public void setTimeOfSpawn(Date timeOfSpawn) {
		this.timeOfSpawn = timeOfSpawn;
	} 

}
