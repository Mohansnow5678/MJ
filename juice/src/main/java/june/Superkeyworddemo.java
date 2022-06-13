package june;

public class Superkeyworddemo {

	public static void main(String[] args) {
		Medium M=new Medium();
		M.topMet();
	}

}

abstract class TopTopstar{
	public void  topMet() {
		System.out.println("Top top met method called");
	}
	
}

abstract class Topstar extends TopTopstar{
	public void topmet() {
		super.topMet();
		
		System.out.println("top Met method called");
	}
	
}

abstract class Top   extends Topstar{
	final public void topMet() {
		super.topMet();
		System.out.println("top met sub Method called");
		
		
	}
	
}

class Medium  extends Top{
	
}

