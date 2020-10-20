package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDB {
	String DB_DRIVER="com.mysql.jdbc.Driver";
	String DB_URL="jdbc:mysql://localhost:3306/NextFavoriteBook";
	
	String USER = "root";
	String PASSWORD ="shawrma@2554";
	
	public int getHashed(String password) throws ClassNotFoundException, SQLException {
		
		
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "SELECT p_id FROM Passwords WHERE pass in(?) ";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, password);
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			int hashed = rs.getInt(1);
			System.out.println(hashed);
			return hashed;
		}else {
			return 0;
		}
		

	}
	
	
	
	
	
	
	
	
	
	
	public boolean checkRegisterd(String uname) throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "SELECT 1 FROM Users WHERE username=?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, uname);
		try {
			
			ResultSet rs = st.executeQuery();

			if(rs.next()) {
				return true;
			}else {
				System.out.println("No such user");
				return false;
			}
			
		}catch(Exception e) {
			System.out.println("No such user");
			return false;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean verifyUser(int hashed, String uname) throws SQLException, ClassNotFoundException {
		
	
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "SELECT username FROM Users WHERE p_id=? and username=?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		
		st.setInt(1, hashed);
		st.setString(2, uname);
		
		ResultSet isUser = st.executeQuery();
		System.out.println("The user verification block");
		if(isUser.next()){
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
