package sqlJDBC;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demo11 {

	static Logger logger = Logger.getLogger(Demo11.class);

	public static void main(String[] args) throws Exception {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bird", "root", "beetroot");

		logger.info("Message:" + Con);
		
		String sql="select * from users";
		Statement stmt=Con.createStatement();
		boolean result=stmt.execute(sql);
		
		//step 4 - process result
		
		logger.warn("Message:" + result);
	}
}

	