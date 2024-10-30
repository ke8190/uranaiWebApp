<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="ex.Fluit" %>
<% 
	Fluit fluit =  (Fluit)session.getAttribute("fluit");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>7章 練習問題</title>
</head>
<body>
	<p>果物：<%= fluit.getName() %><br>
	<p>値段：<%= fluit.getPrice() %>
</body>
</html>