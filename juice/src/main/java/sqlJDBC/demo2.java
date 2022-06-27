package sqlJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class demo2 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/bird","root","beetroot");
		
		System.out.println(con);
         String sql="update users set love=0";
         Statement stmt=con.createStatement();
         int noofrowschanged=stmt.executeUpdate(sql);
	      
         System.out.println("No of rows updated...:"+noofrowschanged);
         
         
         
         
         
         
         
         
         
	}

}
