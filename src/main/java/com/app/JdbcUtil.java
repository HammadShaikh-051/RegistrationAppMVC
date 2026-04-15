package com.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	static {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Driver is Registered Successfully!");
	}
	
	public static Connection getDBConnection() throws SQLException {
		String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=ServletDB;encrypt=false;";
	    String user = "sa";
	    String password = "Admin123";

		return DriverManager.getConnection(url, user, password);
	}
	
	public static void closeResource(Connection connect, Statement statement) throws SQLException {
		if (connect!=null) {
			connect.close();
		}
		if (statement!=null) {
			statement.close();
		}
	}
}
