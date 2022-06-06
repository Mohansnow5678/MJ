package chapter8;

public class Exceptiondemo {

	public static void main(String[] args) {
	
		System.out.println("Before the exception");
		
		try {
			
			
			int a=1/0;
			
		}
		catch(ArithmeticException e)
		{
			
			System.out.println(e);
		new Handler().handle(e);
		
		}
	
		System.out.println("After exception");
		
		
		
		
	}}


class Handler{
	
	
public void handle(ArithmeticException ae) {
	
	
	System.out.println("Please dont divide by zero ");
	
}
	
}