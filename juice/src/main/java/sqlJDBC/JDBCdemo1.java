package sqlJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCdemo1 {

	public static void main(String[] args) throws Exception {
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/bird","root","beetroot");
		
		System.out.println(con);

	}

}
