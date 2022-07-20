package c6to10;

public class Classdemo3 {
	
	public static void main(String[] args) {
		
	
Bank b=new Bank();


System.out.println(b.depositcash());
System.out.println(b.getmoney());
System.out.println(b.get());
	}
}

class Bank {
	int i = 7;

	boolean depositcash() {

		if (i > 10) {
			return true;
		} else {
			return false;
		}}
	
	long getmoney() {
		
		return 10;
	}
	
	String get() {
		return "ram";
	}
	
}