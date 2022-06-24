package ioPack;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Url {
	public static void main(String[] args) throws FileNotFoundException {
		URLConnection urlcon = null;
		// urlcon.getInputStream();
		
		try {
			URL url = new URL("http://www.google.com/search?q=collections");
			urlcon = url.openConnection();
		
		// try with resources...
		

				BufferedInputStream fis = new BufferedInputStream(urlcon.getInputStream());
				FileOutputStream fos = new FileOutputStream("newfilebyte.html"); 

			byte[] b = new byte[128];
			int bytesread = 0;
			while ((bytesread = fis.read(b)) != -1) {
				// String s=new String(b,0,bytesread);
				fos.write(b, 0, bytesread);
			}
		} catch (IOException e) {
			
			System.out.println("There is a FileNotFound Exception, pls check file existance");
		
		} 
		catch (IOException e) {
			
			System.out.println("URL - There is a IO Exception");
			
		} 
	
	}
}
