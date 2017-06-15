package test;

import dao.UserDAO;
import model.User;

public class UserTestDAO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        User user = new User();
        user.setName("Naresh");
        user.setEmailid("12345678901234567890123");
        user.setPassword("pass123");
 
        UserDAO userDAO = new UserDAO();
        userDAO.register(user);
 
    }
	}


