<%@page import="com.te.springmvc.employee.Employee"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<label>Below Employee present in Database</label>
<% Employee emp = (Employee) request.getAttribute("abc");%>
<%= emp %>
</body>
</html>