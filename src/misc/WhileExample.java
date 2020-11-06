package misc;

public class WhileExample {

	public static void main(String[] args) {
		int i =0;
		String[] names = {"Mau","Jim","Dany","Aby","Sam"};
		while(i<names.length) {
			if(names[i].equals("Dany")) {
				//break;
				i++;
				continue;
			}
			System.out.println(names[i]);
			i++;
		}
		
//		do {
//			System.out.println("do while example");
//			System.out.println(i);
//			i++;
//		}while(i<0);
//		

	}

}
