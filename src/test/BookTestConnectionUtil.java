package test;

import java.sql.Connection;

import util.ConnectionUtil;


public class BookTestConnectionUtil {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		{
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection conn = ConnectionUtil.getConnection();

	        System.out.println(conn);

		}
	}

}
