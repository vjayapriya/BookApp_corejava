<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bookapp register</title>
</head>
<body>
	<h3>Bookapp-Application</h3>
	<h4>Create a New Account</h4>
	<form action="RegisterUserController">
		Name:<input type="text" name="name" required autofocus /> <br>
		Email:<input type="email" name="email" required /> <br>
		Password:<input type="password" name="password" required /> <br>
			<button type=submit>Create Account</button>
		<button>Login</button>
	</form>
 <a href="login.jsp">sign in</a> 
	
</body>
</html>