<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="wrapper"> 
	<% Cookie cookies[] = request.getCookies();
	String fname=null;
	String lname = null;
	String add1 = null;
	String add2= null;
	String add3= null;
	String contact = null;
	


		for(Cookie c: cookies){
			switch(c.getName()){
			case "fname":
				fname =c.getValue();
				break;
			case "lname":
				lname=c.getValue();
				break;
			case "add1":
				add1=c.getValue();
				break;
			case "add2":
				add2=c.getValue();
				break;
			case "add3":
				add3=c.getValue();
				break;
			case "contact":
				contact = c.getValue();
				break;
			}
			
		}
	
	
	%>
	<div id="back"> 
		<a href="homePage.jsp">Back</a>
	
	</div>
	<div>
		<a href="addAndEdit.jsp">Add/Edit</a>
	</div>
		<div id="personalInfo">
			
			<div id="name">
				<h3> Name: <%out.println(fname); %></h3> <h3><%out.println(lname); %></h3>
			</div>
			<div id="address">
				<h3>Address: <% out.println(add1+" "+add2+" "+add3); %></h3>
			</div>
			<div>
				<h3>Mobile: <% out.println(contact); %></h3>
			</div>
		</div>
	
	</div>

</body>
</html>