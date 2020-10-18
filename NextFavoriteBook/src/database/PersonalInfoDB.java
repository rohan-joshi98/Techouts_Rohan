package database;
import java.sql.*;

import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import database.LoginDB;

public class PersonalInfoDB {

	final static String USER ="root";
	final static String PASSWORD="shawrma@2554";
	
	final static String DB_DRIVER = "com.mysql.jdbc.Driver";
	final static String DB_URL="jdbc:mysql://localhost:3306/NextFavoriteBook";
	

	
	
	
	public void ifPresent(String uname) throws ClassNotFoundException, SQLException {
		
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL ="IF exists(SELECT * FROM Personal_Information WHERE usename=?)";
		
		PreparedStatement st = con.prepareStatement(SQL);
		
		st.setString(1, uname);
		
		
		ResultSet rs = st.executeQuery();
		
		
		
	}
	
}
