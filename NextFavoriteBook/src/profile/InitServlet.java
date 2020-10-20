package profile;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.InitDB;
@WebServlet(urlPatterns="/init")
public class InitServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String uname=(String) req.getAttribute("uname");
		System.out.println(uname+"*********");
		int uId = (int) req.getAttribute("uId");
		
		InitDB Idb = new InitDB();
		try {
			
			
			Idb.setInit(uId,uname);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.getSession().invalidate();
		res.sendRedirect("login.html");
		
	}

}
