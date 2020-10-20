package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InitDB {
	final static String USER ="root";
	final static String PASSWORD="shawrma@2554";
	
	final static String DB_DRIVER = "com.mysql.jdbc.Driver";
	final static String DB_URL="jdbc:mysql://localhost:3306/NextFavoriteBook";
	
	
	public void setInit(int uId, String uname) throws ClassNotFoundException, SQLException {
		
		
		
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL= "INSERT INTO personal_info (u_id, username) VALUES (?,?)";
		
		PreparedStatement st= con.prepareStatement(SQL);
		st.setInt(1, uId);
		st.setString(2, uname);
		
		st.executeUpdate();
		
		
		
	}
		
}
