package sqlJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class demo4 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bird", "root", "beetroot");

		System.out.println(con);

		String sql = "update users set uid=? where love=?";
		PreparedStatement stmt = con.prepareStatement(sql);

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the uid..:");
			int uid = scan.nextInt();
			System.out.println("Please enter the love value..:");
			int love = scan.nextInt();
			stmt.setInt(1, love);
			stmt.setInt(2, uid);
			int noofrowschanged = stmt.executeUpdate();

			// step 4 - process result

			System.out.println("No of rows updated...:" + noofrowschanged);
		}
	}
}