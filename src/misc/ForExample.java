package misc;

public class ForExample {
	
	public static void main(String [] args) {
		
		String[] names = {"Mau","Jim","Dany","Aby","Sam"};
		
		for(int i =0;i<names.length;i++) {
			if(names[i].equals("Dany")) {
				//break;
				continue;
			}
			System.out.println(names[i]);
		}
	}
}
