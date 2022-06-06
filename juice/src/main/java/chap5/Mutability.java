package chap5;

public class Mutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
        int n=100;
		
		int k=n;
		
		n=n+100;
		
		System.out.println(n);
		
		System.out.println(k);
		

		String str="hello";
		
		String temp=str;
		
		str=str+"world............";
		
		System.out.println(str);
		System.out.println(temp);			
	
		
		
		
		
		
		world G=new world();
		world gold=G;
		G.size=900;
		System.out.println(gold.size);
		System.out.println(G.size);
		
	}}



class world{
	
	int size=10;
}



