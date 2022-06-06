package chapter8;

public class Interdemo3 {
	public static void main(String[] args) {
	
		String val=new FInterThree() {			
			@Override
			public String met(int i, String s) {
				// TODO Auto-generated method stub
				return i+":"+s;
			}
		}.met(10, "anonymous");
	
		System.out.println("Value....:"+val);
		
		//Method Referencing
		FInterThree three=new Interdemo3()::mymethod3;
		val=three.met(1000, "method ref");
		System.out.println("value...:"+val);
		//Lambda
		FInterThree threeLambda=(int num,String str)->{return num+":"+str;};
		val=threeLambda.met(101010234, "lambda world");
		System.out.println("value..:"+val);
	}
	
	public String mymethod3(int i,String s) {
		return i+":"+s;
	}
	
	

	}

/*

class MyFInterOneImpl implements FInterOne{
	@Override
	public void met() {
		System.out.println("met normal old implementation called...");
	}
}
class MyFInterTwoImpl implements FInterTwo{
	@Override
	public int met() {
		return 10000;
	}
}                                         */

interface FInterThree{
	
	public String met(int i,String s);
}