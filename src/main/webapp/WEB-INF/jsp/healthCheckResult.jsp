<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="model.Health" %>
<% 
	//リクエストスコープに保存されたHealthインスタンスを取得
	Health health = (Health)request.getAttribute("health");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>健康診断</title>
</head>
<body>
	<h1>健康診断の結果</h1>
		<p>身長：<%= health.getHeight() %><br>
		<p>体重：<%= health.getWeight() %><br>
		<p>BMI：<%= health.getBmi() %><br>
		<p>体型：<%= health.getBodyType() %>
		</p>
		
		<a href="HealthCheck">戻る</a>
</body>
</html>