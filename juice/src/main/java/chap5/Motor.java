package chap5;

public class Motor {

	public static void main(String[] args) {
	
		scoty G=new scoty();
		G.disk();
	}}

class scoty{
	
	
	public scoty() {
		
	System.out.println("this is speed");	
	}
	
	public void cletch() {
		
		System.out.println("pangali go speed");
	}
	
	public  void cut() {
		
		System.out.println("move speed to edge");
	}
	
public void disk() {
	
	Bike H=new Bike();
	H.skit(this);
	H.wheel(this);
	H.skit(new scoty());
}}
class Bike{
	
	public void wheel(scoty f)
	{
		f.cletch();
		
	}

	public void skit(scoty t) {
		
		t.cut();
	}
	
}
		
		
		
		
