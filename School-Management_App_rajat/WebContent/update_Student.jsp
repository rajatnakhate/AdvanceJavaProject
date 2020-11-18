<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration form</title>
</head>
<body>

<spr:form action="update_student.htm" method="post" commandName="student">
<table>
	
	
			<th><h2 style="color: orange;text-align: center;"> Student Application Form</h2></th>
			
			<tr>
				<td>FormNo:</td>
				<td><spr:input path="formNo"/></td>
			</tr>
			<tr>
				<td>StudentName</td>
				<td><spr:input path="studentName"/></td>
			</tr>
	
				<tr>
				<td>DateOfBirth:</td>
				<td><spr:input path="dateOfBirth"/></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><spr:radiobutton path="gender" value="male"/>Male</td>
				<td><spr:radiobutton path="gender" value="female"/>Female</td>
			</tr>
			<tr>
				<td>City</td>
				<td><spr:select path="city">
						<spr:option value="pune">Pune</spr:option>
						<spr:option value="mumbai">Mumbai</spr:option>
						<spr:option value="kolhapur">Nagpur</spr:option>
						<spr:option value="akola">Akola</spr:option>
						<spr:option value="sangli">Sangli</spr:option>
						<spr:option value="nanded">Nanded</spr:option>
						<spr:option value="ratnagiri">Ratnagiri</spr:option>
				
				</spr:select></td>
			</tr>
			<tr>
				<td>MobNo:</td>
				<td><spr:input path="mobNo"/></td>
			</tr>
			
			
			
			
			<tr>
				<td>BloodGroup</td>
				<td><spr:select path="bloodGroup">
						<spr:option value="o+">O+</spr:option>
						<spr:option value="o-">O-</spr:option>
						<spr:option value="a+">A+</spr:option>
						<spr:option value="a-">A-</spr:option>
						<spr:option value="ab+">AB+</spr:option>
						<spr:option value="ab-">AB-</spr:option>
						<spr:option value="b-">B-</spr:option>
						<spr:option value="b+">B+</spr:option>
				
				</spr:select></td>
			</tr>
			<tr>
				<td>FeeAmount:</td>
				<td><spr:input path="feeAmount"/></td>
			</tr>
			
			
			
				<td><spr:button style="background-color:green">Update</spr:button></td>
			</tr>
			
	
	</table>


</spr:form>

</body>
</html>