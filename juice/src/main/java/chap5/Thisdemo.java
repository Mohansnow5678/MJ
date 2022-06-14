package chap5;

public class Thisdemo {

	public static void main(String[] args) {
		
		M1 v=new M1();
		
		v.shout1();
		
		
	}

}


 class M1{

	 public void shout(){
		System.out.println("put get wet");
		 
	 }
	 
	public void shout1(){
		
		M2  D = new M2();
		D.lot(this);
	}
	 
	 
}
 
  class M2{
	 
	  public void lot(M1 G) {
		  
		  G.shout();
	  }
	  
	  
 }
