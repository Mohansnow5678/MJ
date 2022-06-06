package chap5;

public class Inerouter {

	public static void main(String[] args) {
   Pepsi pepsiCo=new Pepsi();
   
		pepsiCo.Sellcola();
		
		Kalimark kali=new Kalimark();
		
		kali.Sellcola();
		
	}

}

class Pepsi{
    public  void Sellcola() {
    	Kalimark.Campcola c=new Kalimark().new Campcola();
    	c.makecola();
    	System.out.println("PEPSI FILLS COLA ");
    	
    }
		
	}


class Kalimark{
	
	public void Sellcola() {
		Campcola C=new Campcola();
		C.makecola();
		System.out.println("kalimark fills cola in bovonto bottle");
		
	}



class Campcola{
	
	public void makecola() {
		System.out.println("campcola makes cola");
	}
}
}