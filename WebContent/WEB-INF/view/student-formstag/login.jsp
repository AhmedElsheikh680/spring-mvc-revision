<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Login</title>
</head>
<body>
	<form:form action="processLogin" modelAttribute="myStudent">
		FirstName: <form:input path="fName" placeholder="First Name"/><br>
		LastName: <form:input path="lName" placeholder="Last Name" /><br>
		Age:<form:input path="age" placeholder="Age"/><br>
		Country: <form:select path="country">
			<option value="Egypt" label="Eg" />
			<option value="Giza" label="Gi"/>
			<option value="Mansoura" label="Ma" />
		</form:select><br>
		
		
		<br><input type="submit" value="Done" />
		
	</form:form>
</body>
</html>