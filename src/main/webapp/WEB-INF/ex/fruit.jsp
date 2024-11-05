<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="ex.Fruit" %>
<% 
	Fruit fruit =  (Fruit)application.getAttribute("fruit");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>7章 練習問題</title>
</head>
<body>
	<p>果物：<%= fruit.getName() %><br>
	<p>値段：<%= fruit.getPrice() %>
</body>
</html>