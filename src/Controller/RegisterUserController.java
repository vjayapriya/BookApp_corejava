package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import model.User;
@WebServlet("/RegisterUserController")
public class RegisterUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("RegisterUserServlet");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		out.println("Name="+name);
		out.println("email="+email);
		out.println("password="+password);
		
		
		UserDAO userDAO=new UserDAO();
		User user=new User();
		user.setName(name);
		user.setEmailid(email);
		user.setPassword(password);
		out.println("user="+ user);
		try{
			userDAO.register(user);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	}



