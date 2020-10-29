package mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import db.DBConnection;
import mvc.model.Person;

public class PersonDao {
	private Connection conn;

	public PersonDao() {
		conn = DBConnection.getConnection();
	}
	
	public long addPerson(Person person) {
		long key = 0;
		String query = "insert into person (first_name, last_name,dob) values(?,?,?)";
		try{
			PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, person.getFirstName());
			stmt.setString(2, person.getLastName());
			stmt.setObject(3, new java.sql.Date(person.getDob().getTime()).toLocalDate());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next()) {
				key = rs.getLong(1);
				System.out.println("Here is the gen key: "+key);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return key;
	}

	public long updatePerson(Person person) {
		long key = 0;
		String query = "update person set first_name=?, last_name=?, dob=? where id=?";
		try{
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, person.getFirstName());
			stmt.setString(2, person.getLastName());
			stmt.setObject(3, person.getDob().getTime());
			stmt.setInt(4, person.getId());
			key = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return key;
	}
	
	public long deletePerson(int id) {
		long key = 0;
		String query = "delete from person where id=?";
		try{
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, id);
			key = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return key;
	}
	
	public Person getPersonById(int id) {
		Person per = new Person();
		String query = "select * from person where id=?";
		try{
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				per.setId(rs.getInt("id"));
				per.setFirstName(rs.getString("first_name"));
				per.setLastName(rs.getString("last_name"));
				per.setDob(rs.getTimestamp("dob"));
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return per;
	}
	
	public List<Person> getAllPerson() {
		List<Person> personList = new ArrayList<>();
		String query = "select * from person";
		try{
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Person per = new Person();
				per.setId(rs.getInt("id"));
				per.setFirstName(rs.getString("first_name"));
				per.setLastName(rs.getString("last_name"));
				per.setDob(rs.getTimestamp("dob"));
				personList.add(per);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return personList;
	}
	
	public CachedRowSet getAllPersonCRS() {
		String query = "select * from person";
		CachedRowSet rowset=null;
		try{
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			RowSetFactory factory = RowSetProvider.newFactory();
			rowset = factory.createCachedRowSet();
			rowset.populate(rs);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowset;
	}
	
}
