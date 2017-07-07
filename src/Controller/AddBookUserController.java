package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import dao.UserDAO;
import model.Book;


@WebServlet("/AddBookUserController")
public class AddBookUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("AddBookServlet");
		
		String name =request.getParameter("BookName");
		String price =request.getParameter("price");
		String published_date =request.getParameter("published_date");
		String author_id =request.getParameter("author_id");
		
		out.println("Name="+ name);
		out.println("price="+ price);
		out.println("published_date="+ published_date);
int price1 = Integer.parseInt(price);
LocalDate published_date1 =LocalDate.parse(published_date);
int author_id1 =Integer.parseInt(author_id);

		BookDAO userDAO =new BookDAO();
		
		Book user = new Book();

		user.setName(name);
		user.setPrice(price1);
		user.setPub_date(published_date1);
		user.setAutuor_id(author_id1);
 out.println(user);
 try{
		userDAO.register(user);
	}catch(Exception e){
		e.printStackTrace();

	}
	}


}
