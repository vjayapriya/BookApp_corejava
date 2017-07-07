
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;
import util.ConnectionUtil;

public class UserDAO {
	public void register(User user) throws Exception {
		String sql = "insert into person(name,emailid,password) values (?,?,?)";

		Connection con = ConnectionUtil.getConnection();
		System.out.println("Conn:" + con);
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setString(2, user.getEmailid());
		pst.setString(3, user.getPassword());
		int rows = pst.executeUpdate();
		System.out.println(rows);

		System.out.println("UserDAO-> register: " + user);
	}

	public User login(String emailid, String password) throws Exception {
		String sql = "select id,name,emailid,password from person where emailid = ? and password = ? ";
		User user = null;
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, emailid);
		pst.setString(2, password);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String emailid1 = rs.getString("emailid");
			String password1 = rs.getString("password");

			user = new User();
			user.setId(id);
			user.setName(name);
			user.setEmailid(emailid1);
			user.setPassword(password1);
			System.out.println(user);
		}
		return user;

	}

}
