package sqlJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class demo5 {
	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/bird","root","beetroot");
		
		System.out.println(con);
		//Step 3 - Execute sql statement
		
		String sql="select * from users";
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(sql);
		
		//step 4 - process result
		
		while(rs.next()) {
			System.out.println(rs.getInt("uid")+":"+rs.getString("uname"));
		}
	}
}
