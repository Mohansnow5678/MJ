package testpro;

import java.util.Scanner;

public class Reverseanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=0,reversenum=0;
		System.out.println("Enter the value:");
		Scanner cold=new Scanner(System.in);
		num=cold.nextInt();
		while( num !=0 )
		{
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			
			num=num/10;
			
		}
		System.out.println("Reverse of Input is :"+ reversenum);
		
	}

}
