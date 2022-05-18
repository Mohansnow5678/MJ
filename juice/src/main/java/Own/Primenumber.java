package Own;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int i,j;

		
	for(i=2;i<100;i++)
	{
		for(j=2;j<i;j++)
		{
			if(i%j==0)
				break;
		}	
  if(i==j)
	{
	//	System.out.println("\t\n" + i);
		System.out.print(i+" ");
	}}
	
	
	/**
	
	for(int i=0;i<=100;++i) {
		if(i==0 || i==2 || i==3 || i==5 || i==7)
		{
			System.out.print(i+" ");
		}
		else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
		System.out.print(i+" ");
			}}
	
	**/
	
	
	}}
