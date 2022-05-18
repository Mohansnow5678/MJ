package testpro;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
int temp;
boolean isprime=true;


Scanner mark=new Scanner(System.in);
System.out.println("Enter the number :");

int Dude=mark.nextInt();


for(int i=2;i<=Dude/2;i++)
{
	
	temp=Dude % i;
	if(temp==0) 
	{
	isprime=false;
	break;
	
		
		
	}
	
}

	if(isprime)
		System.out.println(Dude+"\nIs prime");
	else
		System.out.println(Dude+"\nNot prime");
		
		
	}


}