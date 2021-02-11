package abstractExample;

public abstract class Shape {
	
	private int sides;
	
	public abstract String draw();
	
	public String size() {
		return "Size";
		
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public Shape(int sides) {
		super();
		this.sides = sides;
	}

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
