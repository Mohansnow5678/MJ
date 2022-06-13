package june;

import java.security.spec.RSAPublicKeySpec;

public class Suoerwithcons {

	public static void main(String[] args) {
		ConsBot cb=new ConsBot("hjbfdj");
		
		
	}
	

}

abstract class Constop{
	public Constop() {
		System.out.println("TOP");
	}
}

abstract class Consmed extends Constop
{
	public Consmed(int i) {
		System.out.println("meds");
		

	}
}

class ConsBot extends Consmed
{
	public ConsBot(String s) {
		
		super(100);
		System.out.println("Bottom");
	}
	
}


