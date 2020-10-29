package mvc.controller;

import java.util.List;

import mvc.dao.PersonDao;
import mvc.model.Person;

public class PersonController {
	private PersonDao personDao = new PersonDao();
	
	public List<Person> getAllPerson(){
		List<Person> personList = personDao.getAllPerson();
		return personList;
	}

	public Person getPersonById(int id){
		Person person = personDao.getPersonById(id);
		return person;
	}
	
	public long addPerson(Person person){
		return personDao.addPerson(person);
	}
	
	public long updatePerson(Person person){
		return personDao.updatePerson(person);
	}
	
	public long deletePerson(int id){
		return personDao.deletePerson(id);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
