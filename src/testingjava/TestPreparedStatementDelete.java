package testingjava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestPreparedStatementDelete {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection(DBType.ORADB);
		
		String sql = "Delete from NewEmployees where Employee_id = ?";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Employee_ID : ");
		int empno = scanner.nextInt();
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1,  empno);
		
		int result = pstmt.executeUpdate();
		
		if (result == 1) {
			System.out.println("Employee Record removed successfully");
			
		}else
		{
			System.out.print("Emplyee Record fail");
			
		}
		
		scanner.close();
		pstmt.close();
		conn.close();
			
	}

}
