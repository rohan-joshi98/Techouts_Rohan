<%@ page import = "registration.LoginServlet" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<div class="Wrapper">
		<div id="header">
			<%@include file="header.jsp" %>
		</div>
		<div id="menu">
			<ul>
				<li>Welcome 
				<% String uname = (String) session.getAttribute("username");
					out.println(uname);%></li>
				<li><a href="profile">Profile</a></li>
				<li><a href="Cart.jsp">Cart</a></li>
				<li><a href="Logout.jsp">Logout</a></li>
				
				
			</ul>
		</div>
		
		<div id="books">
		<% RequestDispatcher rd = request.getRequestDispatcher("displayBooks"); %>>
			<ul>
			<% String b_name =(String) request.getAttribute("b_name");
						String a_name = (String)request.getAttribute("a_name");
						Float price= (Float)request.getAttribute("price");%>
				<li><a><% out.println(b_name+" "+a_name+" "+price);%></a></li>
			</ul>
		
		</div>
	</div>
</body>
</html>