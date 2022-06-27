package sqlJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class demo3 {

public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/bird","root","beetroot");
		
		System.out.println(con);
     //    String sql="update users set love=0";
    //     Statement stmt=con.createStatement();
      //   int noofrowschanged=stmt.executeUpdate(sql);
	      
     //    System.out.println("No of rows updated...:"+noofrowschanged);
         
         String sql="update users set love=? where uid=?";
         PreparedStatement stmt=con.prepareStatement(sql);
         stmt.setInt(1, 3);
 		stmt.setInt(2, 4);
 		
 		int noofrowschanged=stmt.executeUpdate();		
 		System.out.println("No of rows updated...:"+noofrowschanged);
 		
 		
 		
	}

}
