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
		<form:input path="fName" placeholder="First Name"/>
		<form:input path="lName" placeholder="Last Name" />
		<form:input path="age" placeholder="Age"/>
		<input type="submit" value="Done" />
	</form:form>
</body>
</html>