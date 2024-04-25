<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ENTER EMPLOYEE DETAILS</h1>
	<form:form action="modify" modelAtrribute="employee">
		<form:label path="id">ID:</form:label>
		<form:input path="id"/>
		
		<form:label path="name">NAME:</form:label>
		<form:input path="name"/>
		
		<form:label path="designation">DESIGNATION:</form:label>
		<form:input path="designation"/>
		
		<form:label path="salary">SALARY:</form:label>
		<form:input path="salary"/>
		
		<input type="submit" value="UPDATE EMPLOYEE">
	
	</form:form>
</body>
</html>