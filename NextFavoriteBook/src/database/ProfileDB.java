package database;

import java.sql.*;
//import java.util.ArrayList;

public class ProfileDB {
	
	private final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private final String DB_URL="jdbc:mysql://localhost:3306/NextFavoriteBook";
	
	private final String USER ="root";
	private final String PASSWORD="shawrma@2554";
	
	public int getUserID(String uname) throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL="SELECT u_id FROM personal_info WHERE username =?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, uname);
		
		ResultSet rs = st.executeQuery();
		int u_id;
		if(rs.next()) {
			return u_id=rs.getInt(1);
		}else {
			return 0;
		}
		
		
		

	}
	
	
	
	
	
	public int checkProfile(String uname, int uId) throws ClassNotFoundException, SQLException {
		
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "SELECT * FROM personal_info WHERE username=?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, uname);

		
		ResultSet rs = st.executeQuery();
		
		
		if(rs.next()) {
			return 1;
		}else {
			return 0;
		}
		
		
	}
	
	
	public String getFname(String uname) throws ClassNotFoundException, SQLException {
		
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		
		String SQL ="SELECT fname FROM personal_info WHERE username =?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, uname);
		
		ResultSet rs = st.executeQuery();
		rs.next();
		
		String fname = rs.getString(1);
		
		return fname;
		
	}
	
	
	
	
	
	public String getLname(String uname) throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		
		String SQL ="SELECT lname FROM personal_info WHERE username =?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, uname);
		
		ResultSet rs = st.executeQuery();
		rs.next();
		
		String lname = rs.getString(1);
		
		return lname;
	}
	
	
	
	public String getAdd1(String uname) throws ClassNotFoundException, SQLException {
		
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		
		String SQL ="SELECT add1 FROM personal_info WHERE username =?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, uname);
		
		ResultSet rs = st.executeQuery();
		rs.next();
		
		String add1 = rs.getString(1);
		
		return add1;
		
		
		
	}
	
	public String getAdd2(String uname) throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		
		String SQL ="SELECT add2 FROM personal_info WHERE username =?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, uname);
		
		ResultSet rs = st.executeQuery();
		rs.next();
		
		String add2 = rs.getString(1);
		
		return add2;
		
		
		
	}
	
	
	
	
	
	
	public String getContact(String uname) throws ClassNotFoundException, SQLException {
		
		
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		
		String SQL ="SELECT contact FROM personal_info WHERE username =?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, uname);
		
		ResultSet rs = st.executeQuery();
		rs.next();
		
		String contact = rs.getString(1);
		
		return contact;
	}
	
	public int getzip(String uname) throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL= "SELECT zip_code FROM personal_info WHERE username =?";
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, uname);
		ResultSet rs = st.executeQuery();
		rs.next();
		
		int zip_code = rs.getInt(1);
		return zip_code;
		
	}
	
	public String getAdd3(int zip) throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "SELECT * FROM zip WHERE zip_id =?";
		PreparedStatement st = con.prepareStatement(SQL);
		st.setInt(1, zip);
		ResultSet rs = st.executeQuery();
		rs.next();
		String add3;
		if(rs.next()) {
			add3 =String.valueOf(rs.getInt(1))+rs.getString(2);
			return add3;
		}else {
			return add3="empty";
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
