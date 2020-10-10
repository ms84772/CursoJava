package zoo;
import java.util.Date;
public class Dog extends Animal{
	private Date dob; 
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	//Overwriting
	public String eat() {
		return "The dog " + this.getName() + " eats";
	}
	//Overloading
	public String eat(String what) {
		return "The dog " + this.getName() + " eats " + what;
	}
}
