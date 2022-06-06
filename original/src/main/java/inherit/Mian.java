package inherit;

public class Mian {

	public static void main(String[] args) {

		cat pussy=new cat();
		pussy.name="Waatha";
		pussy.eat();
		pussy.sleep();
		
	}}
class dog {
	
	String name;
	
	public void eat() {
		
		System.out.println("This is Blacky");
	}
	
	
}


class cat  extends dog
{
	
	public void sleep() {
		System.out.println("This is Speaky");
		System.out.println("I am Happy Buddy"+"  "+name);
	}
	
}