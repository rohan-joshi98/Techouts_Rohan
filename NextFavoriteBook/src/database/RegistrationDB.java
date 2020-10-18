package database;

import java.sql.*;

public class RegistrationDB {
	
	final static String USER ="root";
	final static String PASSWORD="shawrma@2554";
	
	final static String DB_DRIVER = "com.mysql.jdbc.Driver";
	final static String DB_URL="jdbc:mysql://localhost:3306/NextFavoriteBook";
	

	
	
	public int getUserID() throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "SELECT COUNT(*) FROM Users";
		
		PreparedStatement st = con.prepareStatement(SQL);
		
		ResultSet rs = st.executeQuery();
		rs.next();
		int count = rs.getInt("COUNT(*)");
				
		rs.close();
		return count;
		
		
	}
	
	public int getHashedPassword(String pass) {
		
		int hashed = pass.hashCode();
		
		return hashed;

	}
	
	public void addPass(int hashed, String pass) throws ClassNotFoundException, SQLException {
		
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "INSERT INTO Passwords VALUES(?,?)";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setInt(1, hashed);
		st.setString(2, pass);
		
		int i = st.executeUpdate();
		if(i==1) {
			System.out.println("The record has been updated");
		}
		
		
	}
	
	public void addToUser(String username, String email, int hashed) throws ClassNotFoundException, SQLException {
		
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "INSERT INTO Users VALUES(?,?,?)";
		
		PreparedStatement st = con.prepareStatement(SQL);
		
		st.setString(1, username);
		st.setInt(2, hashed);
		st.setString(3, email);
		
		int i = st.executeUpdate();
		
		if(i==1) {
			System.out.println("The record has been updated");
		}
	}
		
	
	
}
