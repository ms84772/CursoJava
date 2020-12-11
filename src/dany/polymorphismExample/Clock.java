package dany.polymorphismExample;

public class Clock {
	
	private int hours;
	private int minutes;
	private int seconds;
	public int getHours() {
		return hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public String displayTime(){
		return this.getHours()+ ":" + this.getMinutes() + ":" + this.getSeconds();
	} 
}
