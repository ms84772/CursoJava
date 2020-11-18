package zoo;
public class Animal {
	
	public static String blood="red blood";
	private String name;
	private int heads;
	
	
	public String eat() {
		return "Animal "+ this.name + " eats";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHeads() {
		return this.heads;
	}
	
	public void setHeads(int theHeads) {
		this.heads = theHeads;
	}
}
