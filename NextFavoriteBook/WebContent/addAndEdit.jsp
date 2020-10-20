<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add and Edit</title>
</head>
<body>
	<div class="wrapper">
		<div id="personalInfoFOrm">
			<form action="editPersonalInfo" method="POST">
				<div id="name">
					First Name<input type="text" placeholder="fname" name="fname">
					
					Last Name<input type="text" placeholder="lname" name="lname">
		
				</div>
				<div id="address">
					Address 1<input type="text" placeholder="Address Line 1" name="add1">
					Address 2<input type="text" placeholder="Apartment Num" name="add2">
					
					Zip<input type="text" placeholder="zip" name="zip">
		
				</div>
				<div id="contact">
					Contact <input type="text" placeholder="contact number" name="contact">
				</div>
				<div id="submit">
				 	<button type="submit">Submit Changes</button>
				</div>
			
			</form>
		
		</div>
	
	</div>

</body>
</html>