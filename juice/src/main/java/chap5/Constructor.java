package chap5;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo1 pangu=new demo1();
		
		pangu.list(10,79,"tuij");
		
		System.out.println("\n");
		pangu.list1(new int[] {5,67,89,90});		
	}

}



class demo1{
	
	void  list(int i,int j, String k)
	
	{
		System.out.println("\n"+i +"\n" +j +"\n"+ k);
		
	}
	
	
	void list1(int a[])
	{
		for( int i:a)
		System.out.println(i);
	}
	
}