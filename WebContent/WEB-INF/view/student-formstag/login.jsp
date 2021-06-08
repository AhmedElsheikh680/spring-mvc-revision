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
		<form:options items="${myStudent.countryOptions }"/>
		</form:select><br>
		
		Choose Your Lang:<br>
		<form:radiobutton path="lang" value="Java" />Java<br>
		<form:radiobutton path="lang" value="PHP"/>PHP<br>
		<form:radiobutton path="lang" value="JavaScript"/>JavaScript<br>
		
		Players:<br>
		<form:checkbox path="players" value="Messi"/>Messi<br>
		<form:checkbox path="players" value="CR7"/>CR7<br>
		<form:checkbox path="players" value="Salah"/>Salah<br>
		
		<br><input type="submit" value="Done" />
		
	</form:form>
</body>
</html>