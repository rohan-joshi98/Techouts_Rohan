package database;

import java.sql.*;
import books.BooksObj;

public class DisplayBookDB {
	
	String DB_DRIVER="com.mysql.jdbc.Driver";
	String DB_URL="jdbc:mysql://localhost:3306/NextFavoriteBook";
	
	String USER = "root";
	String PASSWORD ="shawrma@2554";
	
	
	public BooksObj getBooks() throws ClassNotFoundException, SQLException {
		Class.forName(DB_DRIVER);
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "SELECT * FROM bookrecords LIMIT 1";
		
		Statement st= con.createStatement();
		ResultSet rs = st.executeQuery(SQL);
		BooksObj Books = null;
		while(rs.next()) {
			int b_id =rs.getInt(1);
			String b_name = rs.getString(2);
			float price = rs.getFloat(3);
			String intro= rs.getString(4);
			int a_id=rs.getInt(5);
			Books=new BooksObj(b_id,b_name,price,intro,a_id);
			
		}
		
		
		
		return Books;
		
	}
	
	
	
	public String getAuthor(int b_id) throws ClassNotFoundException, SQLException {
		
		Class.forName(DB_DRIVER);
		Connection con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
		
		String SQL = "SELECT t2.a_fname, t2.a_lname FROM "
				+ "authors T2 INNER JOIN bookrecords T1"
				+ "ON t1.a_id =t2.a_id";
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery(SQL);
		String name = rs.getString(1)+" "+rs.getString(2);
		return name;
		
		
	}
	
	
	
}
