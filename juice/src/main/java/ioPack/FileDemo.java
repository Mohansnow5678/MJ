package ioPack;

import java.io.FileInputStream;

public class FileDemo {

	public static void main(String[] args) {
		try {

			FileInputStream fs = new FileInputStream("C:\\Users\\mohanasundaram.v\\git\\repository3\\juice\\src\\main\\java\\jude.txt");
			System.out.println(fs.available());
//			System.out.println((char) fs.read());
//			System.out.println((char) fs.read());
//			System.out.println((char) fs.read());
//			System.out.println((char) fs.read());
//			System.out.println((char) fs.read());
//			System.out.println((char) fs.read());
//            System.out.println((char) fs.read());
//			System.out.println((char) fs.read());
//			System.out.println((char) fs.read());
//            System.out.println(fs.read());
//            int available=fis.available();
//			byte b[]=new byte[available];
//			
//			fis.read(b);
//			System.out.println(fis.available());
//			String s=new String(b,0,available);
//			System.out.println(s);
			
			byte c[]=new byte[4];
			
			//D=no of bytes read
			int D=0;                                                     
			while((D=fs.read(c))!=-1) {
				System.out.println(D);
				String s=new String(c,0,D);
				System.out.println(s);
		}

		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}