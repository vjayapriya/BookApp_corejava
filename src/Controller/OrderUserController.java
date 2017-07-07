package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.OrderDAO;
import model.Book;
import model.Order;

@WebServlet("/OrderUserController")
public class OrderUserController extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("OrderUserController");
 String userid=request.getParameter("userId");
	String bookid =request.getParameter("bookId");
		String Quantity =request.getParameter("quantity");
		
		out.println("userId="+ userid);
		out.println("bookId="+ bookid);
		out.println("quantity="+ Quantity );
		int userid1 = Integer.parseInt(userid);
		int bookid1 =Integer.parseInt(bookid);
		int quantity1=Integer.parseInt(Quantity);
		OrderDAO userDAO =new OrderDAO();
		
		Order user = new Order();

		user.setBookId(bookid1);
		user.setUserId(userid1);
		user.setQuantity(quantity1);
 out.println(user);
 try{
		userDAO.register(user);
	}catch(Exception e){
		e.printStackTrace();
	}
 response.sendRedirect("listorder.jsp");

	}




	

}
