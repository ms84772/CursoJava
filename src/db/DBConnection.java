package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection conn;
	private static String svr  = "localhost";
	private static String port = "5432";
	private static String uid  = "db_user";
	private static String pwd  = "12345";
	private static String db   = "curso_db";
	private static String url  = "jdbc:postgresql://"+svr+":"+port+"/"+db+"";
	
	
	public static Connection getConnection() {
		if(conn != null) {
			return conn;
		}else {
			try{
				conn = DriverManager.getConnection(url,uid, pwd);
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return conn;
		}
	}

}
