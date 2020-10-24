<%@ page import="books.BooksObj, java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="wrapper">
	
		<div>
			<a>
			<% 
			
			ArrayList<BooksObj> book = (ArrayList<BooksObj>)request.getAttribute("book"); 
			/* float price = book.price;
			String name = book.b_name;
			
			//String name=(String) request.getAttribute("b_name");
				String author=(String) request.getAttribute("a_name");
				//Float price =(Float) request.getAttribute("price");
				
					out.println(name+" \n"+author+"\n "+price); */
				for(BooksObj b:book){
					out.println(b.b_name+" "+b.intro+" "+b.price);
					out.println(" ");
					
				}
				
			%>
			
			</a>
		</div>
	
	</div>

</body>
</html>