<%@page import="model.Book"%>
<%@page import="java.util.List"%>
<%@page import="dao.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD BOOK</title>
</head>
<body>
<h3>ADD BOOK</h3>
	
	<form action="AddBookUserController">
		<br> Book Name:<input type="test" name="BookName" required /> <br>
		Price:<input type="number" name="price" required /> <br>
				PublishedDate:<input type="date" name="published_date" required /> <br>
		Author_Id:<input type="test" name="author_id" required/> <br>
		<button type=submit>Login</button>
	</form>


</body>
</html>