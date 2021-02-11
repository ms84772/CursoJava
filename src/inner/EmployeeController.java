package inner;

import java.util.Date;


public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Employee emp = new Employee();
		emp.setFirstName("Mauricio");
		emp.setLastName("Sahagun");
		emp.setDob(new Date());
		
		Employee.Address address = emp.new Address();
		
		address.setCity("Plano");
		address.setState("TX");
		address.setStreet1("1432 Debond Dr");
		address.setZipCode("75075");
		
		
		Department department = new Department();
		
		
		
		

	}

}
