package june;

public class Superwithvar {

	public static void main(String[] args) {
		varbot vb=new varbot();
		System.out.println(vb.top);
		
		vb.met();
		
	}

}

class Vartop{
	
}

class varmed extends Vartop{
	
}

class varbot extends varmed{
	int top=10;
	public void met() {
		System.out.println("local"+top);
		
		
	}
}



