<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Portal</title>
</head>
<body>

<form action="RegisterServlet" method="post">
	Name: <input type="text" name="name"><br/>
	Email: <input type="text" name="email"><br/>
	Password: <input type="password" name="password"><br/>
	Motto: <input type="text" name="motto"><br/>
	
	<input type="hidden" name="action" value="login">
	<input type="submit" value="Log In">
</form>

${message}

</body>
</html>