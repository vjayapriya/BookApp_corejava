<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ORDER</title>
</head>
<body><%
User user = (User) session.getAttribute("Logged_in_User");
//out.println("User:"+ user);
if (user == null ) {
	
	response.sendRedirect("login.jsp");
	
}
else
{
%>
Welcome<%=user.getName() %>  ( <a href="LogoutUserController" > Logout </a>)

<h3>Order Books</h3>
<form action=OrderUserController>
userId:<input type="number" name="userId" value="<%=user.getId()%>" required/>
<br/>
select Book:
<select name="bookId" required>
<option value="1"> Select</option>
<option value="2"> Core Java</option>
<option value="3"> MySql</option>
</select>
<br/>
Quantity: <input type="number" name="quantity" min="1" required/>
<br/>
<button type="submit">Submit</button>
</form>
<%} %>
</body>
</html>