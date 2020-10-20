package database;
import java.sql.*;

public class EditPersonalDB {

	final static String USER ="root";
	final static String PASSWORD="shawrma@2554";
	
	final static String DB_DRIVER = "com.mysql.jdbc.Driver";
	final static String DB_URL="jdbc:mysql://localhost:3306/NextFavoriteBook";
	
	public int setId() throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL="SELECT COUNT(*) FROM personal_info";
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(SQL);
		rs.next();
		int count=rs.getInt("COUNT(*)");
		
		return count;
		
		
	}
	
	
	public void setFname(String uname, String fname) throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL ="UPDATE personal_info SET fname=? WHERE username=?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, fname);
		st.setString(2,uname);
		
		st.executeUpdate();
		
		
	}
	
	public void setLname(String Lname, String uname) throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "UPDATE personal_info SET lname=? WHERE username=?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, Lname);
		st.setString(2,uname);
		st.executeUpdate();
		
		
	}
	
	
	public void setAdd1(String add1, String uname) throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL ="UPDATE personal_info SET add1=? WHERE username=?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, add1);
		st.setString(2, uname);
		st.executeUpdate();
		
	}
	
	
	public void setAdd2(String add2, String uname) throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "UPDATE personal_info SET add2 =? WHERE username=?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, add2);
		st.setString(2, uname);
				
		st.executeUpdate();
		
		
	}
	
	
	
	public void setZip(String zip, String uname) throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL ="UPDATE personal_info SET zip_code=? WHERE username=?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, zip);
		st.setString(2, uname);
		st.executeUpdate();
		
		
	}
	
	
	public void setContact(String contact, String uname) throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "UPDATE personal_info SET contact=? WHERE username=?";
		
		PreparedStatement st = con.prepareStatement(SQL);
		st.setString(1, contact);
		st.setString(2, uname);
		st.executeUpdate();
		
		
	}
	
	
	
	
	
	
	
}
