package misc;

public class IfExample {
	
	
	public static void main(String [] args) {
		
		int mauAge = 48;
		int jamesAge = 50;
		int fuffiAge = 4;
		int samAge = 15;
		int hugoAge = 51;
		int manuelAge = 50;
		
		int controlAge = 3;
		if(controlAge>mauAge) {
			System.out.println("Control age is greater than Mauricio");
		}else if(controlAge>jamesAge) {
			System.out.println("Control age is greater than James");
		}else if(controlAge>fuffiAge) {
			System.out.println("Control age is greater than Fuffi");
		}else if(controlAge>samAge) {
			System.out.println("Control age is greater than Sam");
		}else if(controlAge>hugoAge) {
			System.out.println("Control age is greater than Hugo");
		}else if(controlAge>manuelAge) {
			System.out.println("Control age is greater than Manuel");
		}else{
			System.out.println("nothing else matched");
		}
	}

}
