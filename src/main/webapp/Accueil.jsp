<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<p> Page d'accueil </p>
	 <p><c:out value="Bonjour !" /></p>
	<a href ="Login.jsp">Connectez vous !</a>
	
</body>
</html>