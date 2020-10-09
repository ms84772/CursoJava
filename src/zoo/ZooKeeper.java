package zoo;
import java.util.Date;
public class ZooKeeper {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setName("Mauricio");
		System.out.println(animal.eat());

		Dog dog = new Dog();
		dog.setName("Fuffi");
		dog.setDob(new Date());
		System.out.println(dog.eat());
		System.out.println(dog.eat("winnies"));
		System.out.println("This dog born in: "+ dog.getDob());

		GermanSheppard germanShppeard = new GermanSheppard();
		germanShppeard.setName("el Partor");
		germanShppeard.setPedigree("Muy fino");
		
		System.out.println(germanShppeard.eat());
		System.out.println(germanShppeard.eat("winnies"));
		System.out.println("This dog born in: "+ germanShppeard.getDob());
	}
}



