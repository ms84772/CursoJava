package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterList {
	
	public static void main(String [] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person(1,"Mauricio","Sahagun"));
		personList.add(new Person(2,"Celene","Sandoval"));
		personList.add(new Person(3,"Martin","Munoz"));
		personList.add(new Person(4,"Samantha","Sahagun"));
		personList.add(new Person(5,"Diago","Sierra"));
		
		List<Favorite> favList = new ArrayList<>();
		favList.add(new Favorite(1, "Mauricio"));
		favList.add(new Favorite(3, "Martin"));
		favList.add(new Favorite(4, "Samantha"));
		
		
		Set<Integer> ids = favList.stream().map(Favorite::getId).collect(Collectors.toSet());
		
		List<Person> filteredList = personList.stream()
				.filter(person -> ids.contains(person.getId()))
				.collect(Collectors.toList());
		
		System.out.println(filteredList);
		
	}

}


class Person {
	private int id;
	private String firstName;
	private String lastName;
	
	
	public Person(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String toString() {
		return "{id: "+id+", firstName: "+firstName+", lastName: "+lastName+"}";
	}
}

class Favorite{
	private int id;
	private String name;
	
	
	public Favorite(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Favorite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "{id: "+id+", Name: "+name+"}";
	}
	
}