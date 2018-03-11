package testingjava;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestExceptionHandling {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection(DBType.ORADB);
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery("select * from Countries");
			rs.last();
			System.out.println("Total No. of Rows :" + rs.getRow());
		}catch (SQLException e) {
			//System.err.println(e);
			DBUtil.showErrorMessage(e);
			
		}
		finally {
			conn.close();
		}
	}

}
