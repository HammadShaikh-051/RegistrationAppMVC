package com.app;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
	private String Uname;
	private String Uemail;
	private String Upass;
	private String Ucity;
	private Connection connect = null;
	private PreparedStatement preparedStatement = null;
	
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getUemail() {
		return Uemail;
	}
	public void setUemail(String uemail) {
		Uemail = uemail;
	}
	public String getUpass() {
		return Upass;
	}
	public void setUpass(String upass) {
		Upass = upass;
	}
	public String getUcity() {
		return Ucity;
	}
	public void setUcity(String ucity) {
		Ucity = ucity;
	}
	
	public int register() {
		int rowsAffected = 0;
		try {
			connect = JdbcUtil.getDBConnection();
			String query = "INSERT INTO UserInfo (Uname, Uemail, Upass, Ucity) VALUES(?, ?, ?, ?);";
			preparedStatement = connect.prepareStatement(query );
			
			preparedStatement.setString(1, Uname);
			preparedStatement.setString(2, Uemail);
			preparedStatement.setString(3, Upass);
			preparedStatement.setString(4, Ucity);
			
			rowsAffected = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				JdbcUtil.closeResource(connect, preparedStatement);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rowsAffected;
	}
	
}
