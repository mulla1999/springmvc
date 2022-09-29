<%@page import="com.te.springmvc.employee.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee data updated</h1>
	<%
	Object data = request.getAttribute("update");
	%>
	<h1><%=data%></h1> 
</body>
</html>