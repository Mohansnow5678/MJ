package chapter8;

public class Inheritdemo {

	public static void main(String[] args) {

        superclass H=new subclass();
        System.out.println(H.name);
        H.met();

		
	}
}




abstract class superclass{

final	 String name="KIKI";
	
final	public void met() {
		
		System.out.println("STart");
	}

abstract void abmet();
	
}

class subclass extends superclass{

public void abmet() {
		System.out.println("Quit...");
	}
}


