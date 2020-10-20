package profile;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.EditPersonalDB;


@WebServlet(urlPatterns="/editPersonalInfo")
public class EditServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String uname=(String) req.getSession().getAttribute("username");
		String fname = req.getParameter("fname");
		String lname= req.getParameter("lname");
		String add1 = req.getParameter("add1");
		String add2= req.getParameter("add2");
		String zip = req.getParameter("zip");
		String contact = req.getParameter("contact");
		System.out.println("*****"+uname+"*****");
		EditPersonalDB Epdb= new EditPersonalDB();
		int uId;
		try {
			uId= Epdb.setId();
			if(uId==0) {
				uId=1;
			}else {
				uId=uId+1;
			}
			System.out.println("uId"+uId);
			if(fname!=null) {
				Epdb.setFname(uname, fname);
				System.out.println("Fname set to "+fname);
			}
			
			if(lname !=null) {
				Epdb.setLname(lname, uname);
				System.out.println("Lastname set to "+lname);
			}
			
			if(add1!=null) {
				Epdb.setAdd1(add1, uname);
				System.out.println("add1 set");
			}
			
			if(add2!=null) {
				Epdb.setAdd2(add2, uname);
				System.out.println("add2 set");
			}
			
			if(zip!= null) {
				Epdb.setZip(zip, uname);
				System.out.println("zip set");
			}
			
			if(contact != null) {
				Epdb.setContact(contact, uname);
				System.out.println("contact set");
			}
			
			res.sendRedirect("profile");
		
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}