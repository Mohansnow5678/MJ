package anotate;

public class pass {

	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		System.out.println(laddu.size);
       new Exp().pbr(laddu);
       System.out.println(laddu.size);
	}

}
class Exp{
	public void pbr(Laddu laddu) {
       laddu.size=5;
	}
	public void pbv(int size) {
	size=5;
	
	}}
       
       class Laddu{
    	   int size=10;
       }
       
       
       
       
       
       
       