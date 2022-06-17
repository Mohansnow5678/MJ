package demoenum;

public enum Fruits {

	
	apple,mango("a good mango"),jack,pumpkin,jubee,strawberry,orange,pome;
	String details;
	
	
	private Fruits() {}
	
	private Fruits(String details) {
		this.details=details;
		
	}
}
