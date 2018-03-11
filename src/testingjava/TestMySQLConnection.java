package testingjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySQLConnection {

	static String username = "mysqluser";
	static String password = "Password01";
	static String dbUrl = "jdbc:mysql://192.168.192.128:3306/world";
	
	
	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(dbUrl, username, password);
			System.out.println("MySQL connection success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		finally {
			conn.close();
		}
	}

}
