package misc;

public class SwitchExample {
	static final int mauAge = 48;
	static final int jamesAge = 50;
	static final int fuffiAge = 4;
	static final int samAge = 15;
	static final int hugoAge = 51;
	static final int manuelAge = 50;

	public static void main(String[] args) {
		
		int controlAge = 3;

		switch(controlAge) {
		case mauAge:
			System.out.println("ControlAge is equals to Mauricio");
			break;
		case jamesAge | manuelAge:
			System.out.println("ControlAge is equals to James and Manuel");
			break;
		case fuffiAge:
			System.out.println("ControlAge is equals to Fuffi");
			break;
		case samAge:
			System.out.println("ControlAge is equals to Sam");
			break;
		case hugoAge:
			System.out.println("ControlAge is equals to Hugo");
			break;
		default:
			System.out.println("ControlAge is equals not equal to anything");
			break;
		}

	}

}
