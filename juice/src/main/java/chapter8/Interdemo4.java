package chapter8;

public class Interdemo4 {

	public static void main(String[] args) {
		
		MyAccount myaccount=new MyAccount();
		myaccount.balance=1000;
		MyAccount my=new FInterFour() {
			@Override
			public MyAccount transfer(MyAccount act, int amt) {
			    act.balance=(act.balance-amt);
				return act;
			}
		}.transfer(myaccount, 400);
		
		System.out.println("BALANCE::"+my.balance);
			
			
		FInterFour four=new Interdemo4()::mymethod4;
		MyAccount ac=four.transfer(myaccount, 100);
		System.out.println("Method ref...:"+ac.balance);	
			
		
		FInterFour fourLambda=(myc,amt)->{
			myc.balance=(myc.balance-amt);
			return myc;
		};
		ac=fourLambda.transfer(myaccount, 300);
		System.out.println("value..lambda..:"+ac.balance);
	}		
		
public MyAccount mymethod4(MyAccount act,int amt) {
	act.balance=(act.balance-amt);
	return act;		
}
}



interface FInterFour{
	public MyAccount transfer(MyAccount act,int amt);
}
class MyAccount{
	
	int balance;
	
}