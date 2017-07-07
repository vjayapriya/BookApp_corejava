
<%@page import="model.Order"%>
<%@page import="java.util.List"%>
<%@page import="dao.OrderDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ORDER LISTS</title>
</head>
<body>

<%
OrderDAO orderDAO=new OrderDAO();
List<Order> orderList =orderDAO.listorder();
%>
<table border="1">
		<thead>
			<tr>
				<th>userId</th>
				<th>userName</th>
				<th>bookId</th>
				<th>quantity</th>
				<th>Status</th>
				<th>OrderedDate</th>
				
				
			</tr>
		</thead>

	<%
		for (Order b : orderList) {
			out.println("<tr>");
			out.println("<td>" + b.getUserId() + "</td>");
			out.println("<td>" + b.getUsername() + "</td>");
			out.println("<td>" + b.getBookId() + "</td>");
			out.println("<td>" + b.getQuantity() + "</td>");
			out.println("<td>" + b.getStatus() + "</td>");
			out.println("<td>" + b.getOrderedDate() + "</td>");

			out.println("</tr>");
		}
	%>

</body>
</html>