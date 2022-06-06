package chapter8;

public class Interdemo2 {

	public static void main(String[] args) {

		
		//Anonymous
		int value = new FInterTwo() {

			@Override
			public int met() {
				// TODO Auto-generated method stub
				return 100002;
			}
		}.met();
		System.out.println("Value of first inter...anonymous.:" + value);
		
		//MethoD Referencing
		FInterTwo two = new Interdemo2()::mymethod2;
		value = two.met();
		System.out.println("Value of first inter-method ref..:" + value);

		//Lambda
		
		FInterTwo twolam=()->{return 20202;};
		value=twolam.met();
		System.out.println("Value of first Inner lambda:"+value);
		
		FInterTwo Ji=new MyFInterTwoImpl()	;
		  value=Ji.met();
		  System.out.println("value first inter JI::"+value);
		  
	}

	public int mymethod2() {
		return 101010;
	}

}

class MyFInterTwoImpl implements FInterTwo {
	@Override
	public int met() {
		return 100005;
	}
}

interface FInterTwo {
	public int met();
}
