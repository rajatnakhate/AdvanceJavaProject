<%@page import="com.cdac.dto.Faculty"%>
<%@page import="java.util.Set"%>
<%@page import="com.cdac.dto.Marks"%>
<%@page import="com.cdac.dao.MarksDao"%>
  <%@ include file="header.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add mark</title>
</head>
<body>
<spr:form action="addmarksData.htm" method="post" commandName="mark" >
<table style="text-align: center;">
<tr>
<td>Form Number:</td>
<td>

	<spr:input path="formNo" /><br>
	</td>
	</tr>
	
	<tr>
	<td>English:</td>
<td>
		<spr:input path="English"/>
</td>
	</tr>
		<tr>
		<td>Maths:</td>
<td>
		<spr:input path="Maths"/>
</td>
	</tr>
			<tr>
			<td>Economics:</td>
<td>
		<spr:input path="Economics"/>
</td>
	</tr>
			<tr>
			<td>Science:</td>
<td>
		<spr:input path="Science"/>
</td>
	</tr>
			<tr>
			<td>History:</td>
<td>
		<spr:input path="History"/>
</td>
	</tr>
				<tr>
				<td>Geography:</td>
<td>
		<spr:input path="Geography"/>
</td>
	</tr>
	
</table>
<tr>
	<spr:button>Add</spr:button>
	</tr>
</spr:form>
</body>
</html>