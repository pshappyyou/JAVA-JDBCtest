package testingjava;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTableResultSetDemo {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		try(
				Connection conn = DBUtil.getConnection(DBType.ORADB);
				
				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				
				ResultSet rs = stmt.executeQuery("Select Department_ID, Department_Name, Manager_Id, Location_Id from Departments");
				
				
				)
		{
			rs.absolute(6);
			
			rs.updateString("Department_Name",  "Information Technology");
			rs.updateRow();
			
			System.out.println("Record Updated Successfully");
			
			rs.moveToInsertRow();
			rs.updateInt("Department_ID", 999);
			rs.updateString("Department_Name", "Training");
			rs.updateInt("Manager_ID", 200);
			rs.updateInt("Location_ID", 1800);
			rs.insertRow();
			System.out.println("Record Inserted Successfully");
			
		}
	}

}
