package profile;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.ProfileDB;



@WebServlet(urlPatterns="/profile")
public class ProfileServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		

		String user = (String) req.getSession().getAttribute("username");
		
		System.out.println(user);
		ProfileDB Pdb = new ProfileDB();
		
		int uId;
		try {
			uId = Pdb.getUserID(user);
			
			int isProfile= Pdb.checkProfile(user, uId);
			if(isProfile==1) {
				System.out.println("isProfile: "+isProfile);
				String fname = Pdb.getFname(user);
				//fname cookie
				Cookie cookie1 = new Cookie("fname",fname);
				
				String lname = Pdb.getLname(user);
				//lname cookie
				Cookie cookie2 = new Cookie("lname",lname);
				
				String add1 = Pdb.getAdd1(user);
				//add1 cookie
				Cookie cookie3 = new Cookie("add1",add1);
				
				String add2 = Pdb.getAdd2(user);
				//add2 cookie
				Cookie cookie4 = new Cookie("add2", add2);
				
				int zip = Pdb.getzip(user);
				String add3 = Pdb.getAdd3(zip);
				System.out.println(add3);
				//add3 cookie
				Cookie cookie5= new Cookie("add3", add3);
				
				String contact = Pdb.getContact(user);
				//contact cookie
				Cookie cookie6 = new Cookie("contact", contact);
				
				
				res.addCookie(cookie1);
				res.addCookie(cookie2);
				res.addCookie(cookie3);
				res.addCookie(cookie4);
				res.addCookie(cookie5);
				res.addCookie(cookie6);
				
				
				res.sendRedirect("Profile.jsp");
				
				
				
				
			}else {
				res.sendRedirect("addAndEdit.jsp");
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	

}
