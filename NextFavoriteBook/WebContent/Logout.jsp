<%@ page import="registration.LoginServlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log out</title>
</head>

<body>
	<div class="wrpapper">
		<div id="msg">
			<% session.invalidate(); 
			response.sendRedirect("login.html");%>
		</div>
	</div>
</body>
</html>