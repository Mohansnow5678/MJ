package testpro;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import java.io.File;

public class Nestedloop {
	static Logger logger = Logger .getLogger(Nestedloop.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<5;j++)
				
				logger.info(i+ " "+ j);
		}
		
	}

}
