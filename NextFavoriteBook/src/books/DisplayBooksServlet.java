package books;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DisplayBookDB;


@WebServlet(urlPatterns="/displayBooks")
public class DisplayBooksServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		DisplayBookDB Bdb= new DisplayBookDB();
		
		try {
			ResultSet book = Bdb.getBooks();
			//book.next();
			int b_id=book.getInt(1);
			System.out.println(b_id);
			String a_name = Bdb.getAuthor(b_id);
			

			req.setAttribute("b_name",book.getString(2));
			req.setAttribute("price",book.getFloat(3) );
			req.setAttribute("a_name", a_name);
			
			System.out.println(book.getString(2));

			System.out.println(a_name);
			
			
			
			
			
			RequestDispatcher rd = req.getRequestDispatcher("Books.jsp");
			rd.forward(req, res);
			
			res.sendRedirect("homePage.jsp");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
