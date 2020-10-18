package registration;

import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.RegistrationDB;


@WebServlet(urlPatterns="/register")
public class RegistrationServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) {
		
		String uname = req.getParameter("uname");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		
		RegistrationDB Rdb = new RegistrationDB();
		try {
			int uID = Rdb.getUserID();
			uID = uID +1;
			
			
			int hashedPass = Rdb.getHashedPassword(password);
			
			Rdb.addPass(hashedPass, password);
			Rdb.addToUser(uname, email, hashedPass);
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
