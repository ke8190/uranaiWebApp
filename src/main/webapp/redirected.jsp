<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>リダイレクト</title>
</head>
<body>
	<% String randValue = request.getParameter("rand"); %>
	<h1>乱数の結果は、奇数でした。</h1>
	<p>参考：<%= randValue %></p>
</body>
</html>