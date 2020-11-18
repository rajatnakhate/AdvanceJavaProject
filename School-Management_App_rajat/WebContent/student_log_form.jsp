<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Login Form</title>
</head>
<body>
	<spr:form action="stud_log.htm" method="post" commandName="student" >
	<table align="center" >
		<tr>
			<td>
				<h2 style="color:green;">Student Name:</h2>
			</td>
			<td>
				<spr:input path="studentName"/>
			</td>
		</tr>
		<tr>
			<td>
				<h2 style="color:green;">Student Pass:</h2>
			</td>
			<td>
				<spr:password path="mobNo"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<h3 style="color:red;"><a href="index.jsp" >Back</a></h3>
			</td>
			<td>
				<input type="submit"  value="Login" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>