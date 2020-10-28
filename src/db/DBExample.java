package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DBExample {
	public static void main(String[] args) {
		String svr = "localhost";
		String port = "5432";
		String uid = "db_user";
		String pwd = "12345";
		String db = "curso_db";
		String url = "jdbc:postgresql://"+svr+":"+port+"/"+db+"";
		Connection con = null;
		int count=0;
		try{
			con = DriverManager.getConnection(url, uid, pwd);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from person");
			while(rs.next()) {
				System.out.print(rs.getInt("id")+"\t");
				System.out.print(rs.getString("first_name")+"\t");
				//System.out.print(rs.getString("middle_name")+"\t");
				System.out.print(rs.getString("last_name")+"\t");
				System.out.print(rs.getTimestamp("dob")+"\n");
				count++;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Total number of records: "+count);
	}
}
