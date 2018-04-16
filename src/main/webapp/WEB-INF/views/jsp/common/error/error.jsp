<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Error Page</title>
</head>
<body>
<h2>Error !</h2>
<div>
	<c:out value="${name}"></c:out>
	<h3><c:out value="${message }"></c:out></h3> 
</div>
</body>
</html>