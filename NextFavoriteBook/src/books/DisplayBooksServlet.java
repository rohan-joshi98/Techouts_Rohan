package books;

import java.io.IOException;
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
			BooksObj Bobj = Bdb.getBooks();
			int b_id=Bobj.b_id;
			String a_name = Bdb.getAuthor(b_id);
			
			req.setAttribute("b_id",Bobj.b_id );
			req.setAttribute("b_name",Bobj.b_name );
			req.setAttribute("price",Bobj.price );
			req.setAttribute("a_name", a_name);
			
			System.out.println(Bobj.b_name);

			System.out.println(a_name);
			
			
			
			
			
			RequestDispatcher rd = req.getRequestDispatcher("homePage.jsp");
			rd.forward(req, res);
			
			res.sendRedirect("homePage.jsp");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
