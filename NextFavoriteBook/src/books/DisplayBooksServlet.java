package books;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
			ArrayList<BooksObj> book = Bdb.getBooks();
			//book.next();
			//int b_id=book.;
			//System.out.println(b_id);
			//String a_name = Bdb.getAuthor(b_id);
			

				req.setAttribute("book", book);
//				req.setAttribute("b_name",book.getString(2));
//				req.setAttribute("price",book.getFloat(3) );
			//	req.setAttribute("a_name", a_name);
			

			
			
			
			
			
			RequestDispatcher rd = req.getRequestDispatcher("Books.jsp");
			rd.forward(req, res);
			
			//res.sendRedirect("homePage.jsp");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
