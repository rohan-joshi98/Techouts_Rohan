package registration;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.LoginDB;

@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String uname = req.getParameter("uname");
		String password = req.getParameter("password");
		

		
		
		LoginDB Ldb = new LoginDB();
		
		try {
			boolean isUser = Ldb.checkRegisterd(uname);
			if(isUser) {
				int hashedPw = Ldb.getHashed(password);
				
				boolean isVerified =Ldb.verifyUser(hashedPw, uname);
				if(isVerified) {
					
					HttpSession session = req.getSession();
					session.setAttribute("username", uname);
					res.sendRedirect("homePage.jsp");
					
					
					
					
					System.out.println("Verified User");
					
				}else {
					res.sendRedirect("Login.html");
					System.out.println("Invalid password");
				}
				
				
			}else {
				res.sendRedirect("Login.html");
				System.out.println("There is no such user, please enter a valid username");
			}
			
			
			
			System.out.print(isUser);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

}
