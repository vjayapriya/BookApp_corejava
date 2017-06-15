package test;

import java.sql.Connection;

import util.ConnectionUtil;



public class OrderTestConnectionUtil {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  /*Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db", "root", "root");*/
              
        Connection con = ConnectionUtil.getConnection();
        System.out.println(con);

	}

}
