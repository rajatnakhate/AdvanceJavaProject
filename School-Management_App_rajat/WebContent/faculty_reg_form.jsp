<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Faculty Registration Form</title>
</head>
<body>
	<spr:form action="fac_reg.htm" method="post" commandName="faculty" >
	<table align="center" >
		<tr>
			<td>
				<h2 style="color:green;">Faculty Name:</h2>
			</td>
			<td>
				<spr:input path="facultyName"/>
			</td>
		</tr>
		<tr>
			<td>
				<h2 style="color:green;">Faculty Pass:</h2>
			</td>
			<td>
				<spr:password path="facultyPass"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<h2 style="color:orange;">Form No:</h2>
			</td>
			<td>
				<spr:password path="formNo"/>
			</td>
		</tr>
		<tr>
			<td>
				<h3 style="color:red;"><a href="index.jsp" >Back</a></h3>
			</td>
			<td>
				<input type="submit"  value="Register" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>