package sqlJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Demo10 {
      
	
	
	public static void main(String[] args) throws Exception {
		
	//Step1 - Load the Driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2 - Establish Connection
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/bird","root","beetroot");
			
			System.out.println(con);
			//Step 3 - Execute sql statement
			
			String sql="{call pro3(?,?)}";
			
			CallableStatement cs=con.prepareCall(sql);
			cs.setString(1, "Steve");
			cs.registerOutParameter(2, Types.INTEGER);
			
			cs.execute();
			//step 4 - process result
			int love=cs.getInt(2);
			System.out.println("Love Status..:"+love);
			
		}
	}
