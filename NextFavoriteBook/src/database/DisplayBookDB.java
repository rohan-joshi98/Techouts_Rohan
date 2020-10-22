package database;

import java.sql.*;
import books.BooksObj;

public class DisplayBookDB {
	
	String DB_DRIVER="com.mysql.jdbc.Driver";
	String DB_URL="jdbc:mysql://localhost:3306/NextFavoriteBook";
	
	String USER = "root";
	String PASSWORD ="shawrma@2554";
	
	
	public ResultSet getBooks() throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "SELECT * FROM bookrecords LIMIT 1";
		
		Statement st= con.createStatement();
		ResultSet rs = st.executeQuery(SQL);
		//BooksObj Books = null;
		rs.next();
		
		return rs;
		
//		
//		while(rs.next()) {
//			int b_id =rs.getInt(1);
//			String b_name = rs.getString(2);
//			float price = rs.getFloat(3);
//			String intro= rs.getString(4);
//			int a_id=rs.getInt(5);
//			
//			System.out.println(b_id);
//			
//			Books=new BooksObj(b_id,b_name,price,intro,a_id);
//			
//			
//			
//		}
	
		
		
		
		
		//return Books;
		
	}
	
	
	
	public String getAuthor(int b_id) throws ClassNotFoundException, SQLException {
		
		Class.forName(DB_DRIVER);
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "SELECT a_fname, a_lname FROM authors where b_id=?";
		PreparedStatement st= con.prepareStatement(SQL);
		st.setInt(1, b_id);
		
		ResultSet rs= st.executeQuery();
		rs.next();
		String name = rs.getString(1)+" "+rs.getString(2);
		return name;
		
		
	}
	
	
	
}
