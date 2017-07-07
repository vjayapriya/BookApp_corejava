package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogoutUserController")
public class LogoutUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LogoutUserController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("LogoutUserController");
		
		HttpSession session= request.getSession();
		
		session.invalidate();
		
		response.sendRedirect("login.jsp");
	}


}
