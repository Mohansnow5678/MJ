package demoenum;

public class Useenum {

	public static void main(String[] args) {
		System.out.println(Fruits.mango.details);
         met(Fruits.mango );

	     System.out.println(Fruits.valueOf("mango").details);
	}
public  static void met(Fruits fruit) {
	
	System.out.println(fruit.details);
	
}
}
