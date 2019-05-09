<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<jsp:include page="../common/header.jsp"></jsp:include>
</head>
<body>
	<p>My-App</p>
	<div class="panel panel-default">
		<div class="panel-heading">Login</div>
		<div class="panel-body">
			<form:form class="form-inline" action="login" method="post" commandName="Login">			
				<div class="form-group">
					<label class="sr-only" for="name">Email address:</label> 
					<form:input path="loginValue" name="name" class="form-control"/>
				</div>
				<div class="form-group">
					<label class="sr-only" for="pwd">Password:</label>
					<form:password path="loginPassword" class="form-control"/>
				</div>
				<div class="checkbox">
					<label><input type="checkbox"> Remember me</label>
				</div>
				<button type="submit" class="btn btn-default" value="Submit">Submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>
