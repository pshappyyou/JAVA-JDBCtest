package testingjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestManageDBResource {

	
	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		try {
			
			conn = DBUtil.getConnection(DBType.MYSQLDB);
			//conn = DriverManager.getConnection(dbUrl, username, password);
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
