
package util;
import java.sql.Connection;
import java.sql.DriverManager;

public class UserConnectionUtil {
	public static Connection getConnection() throws Exception {

		Connection con = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db", "root", "root");

		} catch (Exception e) {
			throw new Exception(e);
		}

		return con;

	}

}
