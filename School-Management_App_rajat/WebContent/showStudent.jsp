<%@page import="com.cdac.dto.Student"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="header.jsp" %>
      <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>students</title>
</head>
<body>
<% List<Student> li=(List<Student>)request.getAttribute("student");
			for(Student a:li){
				
				%>
				
				<table>
					<tr>
					<td><%=a.getFormNo() %></td>
					<td><%=a.getStudentName() %></td>
					<td><%=a.getCity() %></td>
					<td><%=a.getMobNo() %></td>
					<td><a href="AddMarks.htm?formno=<%=a.getFormNo()%>" style="text-decoration: none;">Add Marks</a>
					</td><br><br>
					</tr>
				
				
				</table>
				
				
				
		<%} %>	
		<h3><a href="faculty_home.jsp">Back To Home</a></h3>


</body>
</html>