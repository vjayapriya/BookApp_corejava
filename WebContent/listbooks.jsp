<!DOCTYPE html>
<%@page import="model.User"%>
<%@page import="model.Book"%>
<%@page import="dao.BookDAO"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Books</title>
</head>
<body>
<%
User user = (User) session.getAttribute("Logged_in_User");
//out.println("User:"+ user);
if (user == null ) {
	
	response.sendRedirect("login.jsp");
	
}
else
{
%>
Welcome<%=user.getName() %>  ( <a href="LogoutUserController" > Logout </a>)

<h3>List Books</h3>
<tbody>
</tbody>

<%
BookDAO bookDAO=new BookDAO();
List<Book>bookList=bookDAO.listbook();
//out.println("Books:"+bookList);
%>
<table border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>price</th>
				<th>published_date</th>
				<th>AuthorName</th>
				
			</tr>
		</thead>

	<%
		for (Book b : bookList) {
			out.println("<tr>");
			out.println("<td>" + b.getId() + "</td>");
			out.println("<td>" + b.getName() + "</td>");
			out.println("<td>" + b.getPrice() + "</td>");
			out.println("<td>" + b.getPub_date() + "</td>");
			out.println("<td>" + b.getAutuor_id() + "</td>");
			out.println("</tr>");
		}
	%>
	
</table>
<a href="order.jsp">Add Order</a>
<%} %>
</body>
</html>