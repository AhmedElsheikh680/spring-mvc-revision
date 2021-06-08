<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Student Info</title>
</head>
<body>
	<h1>Student Info</h1>
	<h3>FirstName: ${myStudent.fName }</h3>
	<h3>LastName: ${ myStudent.lName}</h3>
	<h3>Age: ${ myStudent.age}</h3>
	
	<h3>Country: ${myStudent.country}</h3>
	
	<h3>Lang: ${ myStudent.lang}</h3>
	<p>Players: 
		<c:forEach  items="${ myStudent.players}" var="temp">
		${temp }
		</c:forEach>
	</p>
</body>

</html>