package testpro;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		
   int fn,f=0;
   
   
        Scanner pop=new Scanner(System.in);

System.out.println("Enter the Number between 10");

		fn=pop.nextInt();
		
	while(fn<=10)	
	{
	f=f+fn;
	
	fn++;
	}
	
 System.out.format("sum of the numbers from the While loop: %d", + f);
	
	}
}
