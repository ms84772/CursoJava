package zoo;
public class Animal {
	private String name;
	public String eat() {
		return "Animal "+ this.name + " eats";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
