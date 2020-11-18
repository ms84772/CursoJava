package zoo;
public class AnotherZoo {
	public static void main(String[] args) {
		Animal mau = new Animal();
		mau.setName("Mauricio");
		System.out.println(mau.getName());
		System.out.println(mau.blood);
		
		Animal jaime = new Animal();
		jaime.setName("Jaime");
		System.out.println(jaime.getName());
		System.out.println(jaime.blood);
		
		System.out.println("+++++++++++++++++++++++");
		jaime.blood="Blue blood";
		System.out.println(jaime.blood);
		System.out.println(mau.blood);
		
		System.out.println("+++++++++++++++++++++++");
		
		Animal.blood="yellow blood";
		System.out.println(jaime.blood);
		System.out.println(mau.blood);
		mau.setName("Manuel");
		mau.setHeads(5);
		System.out.println(mau.getName() +" has "+mau.getHeads()+" heads");
	}
}
