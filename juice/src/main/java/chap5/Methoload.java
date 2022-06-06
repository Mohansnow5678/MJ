package chap5;

//TYPE1

 /*  public class Methoload {

	public static void main(String[] args) 		
	{	
		Methoload G=new Methoload();
		
		G.met("hari");
		G.met(10);
		}
public void met(int a) {
		System.out.println("play crivc");
		}
	public void met(String t) {		
		System.out.println("play crivc");
	}}
	
*/	
	
	// TYPE 2
	
	
	
public class Methoload {

	public static void main(String[] args) 		
	{	
	
		Cat B=new Cat();
		B.play(new Mapla1());
		
	}}
	
	
	
class Cat{
	
	public void play(Mapla1 A) {
		
	System.out.println("uno");
	
}
	public void play(Mapla2 b) {
		
		System.out.println("lino");
		
	}
	public void play(Mapla3 c) {
		System.out.println("piano");
		
		
	}
}

class Mapla1{
	
}
class Mapla2{
}

class Mapla3{
	
}