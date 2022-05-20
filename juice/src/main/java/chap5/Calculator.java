package chap5;
public class Calculator {	
public static void main(String args[])
{
	
	Test1	 calc =new  Test1();
	
	calc.add1(10, 20);
	int result=calc.add2(100,20);
	
	System.out.println(result);
	
	calc.add3(10,20);
	
	calc.add4(10,20,100,300,10);
	
	calc.add5(new int[] {10,20,30,40});
	
}}
	
 class Test1
{
	
	 void add1(int i,int j) {
	
	int sum=i+j;
	System.out.println(sum);
	 }
	
	int add2(int i,int j) {
		
		return i+j;
	}

	void add3(int i,int j) {
		display(i+j);
	}
	
	void display(int h) {
		System.out.println("The result is..:"+h);
	}
	
	void add4(int ...i) {
		int result=0;
		for(int s:i) {
			result=result+s;
		}
		System.out.println("The result is ...:%d"+ result);
	}
	
	void add5(int i[]) {
		int result=0;
		for(int s:i) {
			result=result+s;
		}
		System.out.println("The result is ...:%d"+ result);

		
		
		
	}
}
		
		
		
		
		
		

	


