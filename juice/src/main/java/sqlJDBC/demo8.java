package sqlJDBC;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.sql.Statement;

public class demo8 {

	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/bird","root","beetroot");
		
		System.out.println(con);
		//Step 3 - Execute sql statement
		
		String sql="{call pro1(?)}";
		
		CallableStatement cs=con.prepareCall(sql);
		cs.registerOutParameter(1, Types.INTEGER);
		
		cs.execute();
		//step 4 - process result
		int countofcolumns=cs.getInt(1);
		System.out.println("No of columns..:"+countofcolumns);
		
	}
}