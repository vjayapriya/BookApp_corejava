package test;

import dao.UserDAO;
import model.User;

public class UserloginTest1DAO {

	public static void main(String[] args) throws Exception {
	 String emailid="jaya@g.com";
	 String password="12345";
	        UserDAO userDAO = new UserDAO();
	        User u=userDAO.login(emailid, password);
	        System.out.println(u);

	}

}
