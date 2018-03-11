package testingjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestOracleConnection {

	static final String dbUrl = "jdbc:oracle:thin:@192.168.192.128:1521:xe";
	static final String username = "hr";
	static final String password = "hr";
	
	
	public static void main(String[] args) throws SQLException {

		Connection conn = DriverManager.getConnection(dbUrl, username, password);
		System.out.println("Connection to Oracle Established Successfully");
	}

}
