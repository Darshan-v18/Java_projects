package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/employees_database";
		int rowsAffected;

		try {
			Connection conn = DriverManager.getConnection(url, "root", "darshanv");
			
			java.sql.Statement statement = conn.createStatement();
			
//			rowsAffected=statement.executeUpdate("insert into employees_tbl (id,name,dept,salary)"
//					+"values(1000,'Robert','Sales',65000);");
			
			rowsAffected=statement.executeUpdate("Update employees_tbl SET salary=6000 WHERE id=700");
			
			
				System.out.println("Executed an insert statement-Rows Affected: "+rowsAffected);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
