<%@page import="com.cdac.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
	
	<table align="center" >
		<% 
		
		List<Student> slist = (List<Student>)request.getAttribute("studList");
		for(Student stu:slist){
		
		%>
		<tr>
			<td>
				<%=stu.getStudentName()%>
			</td>
			<td>
				<%=stu.getDateOfBirth()%>
			</td>
			<td>
				<%=stu.getGender()%>
			</td>
			<td>
				<%=stu.getCity()%>
			</td>
			
			<td>
				<%=stu.getMobNo()%>
			</td>
			
			<td>
				<%=stu.getFeeAmount()%>
			</td>
			
			<td>
				<a href="student_update_form.htm?formNo=<%=stu.getFormNo()%>">Update</a>
			</td>
			
		</tr>
		<% } %>
		<tr>
			<td>
				<a href="student_home.jsp" >Back</a>
			</td>
			
		</tr>
	</table>
	
</body>
</html>