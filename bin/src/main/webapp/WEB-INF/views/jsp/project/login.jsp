<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<jsp:include page="../common/header.jsp"></jsp:include>
</head>
<body>
	<div class="panel panel-default">
		<div class="panel-heading">Login</div>
		<div class="panel-body">
			<form class="form-inline" action="/action_page.php">
				<div class="form-group">
					<label class="sr-only" for="email">Email address:</label> <input
						type="email" class="form-control" id="email">
				</div>
				<div class="form-group">
					<label class="sr-only" for="pwd">Password:</label> <input
						type="password" class="form-control" id="pwd">
				</div>
				<div class="checkbox">
					<label><input type="checkbox"> Remember me</label>
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>