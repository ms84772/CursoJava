package exceptions;

public class ArrayException {

	public static void main(String[] args) {

//		String[] names = {"Abi","Dany","Mau"};
//		
//		System.out.println(names[10]);
//
//		System.out.println("other stuff going on");
		

		try {
			String[] names = {"Abi","Dany","Mau","four","five","six","seven","eight","nine","ten","eleven"};
			
			System.out.println(names[15]);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("other stuff going on");
		
	}

}
