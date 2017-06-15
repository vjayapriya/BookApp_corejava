package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import util.ConnectionUtil;


public class UserTestConnectionUtil {

	public static void main(String[] args)throws Exception {
		 
{
        /*Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db", "root", "root");*/
        
        Connection conn = ConnectionUtil.getConnection();
        System.out.println(conn);

	}

	}}
