package chap5;

public class Methodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car.fuel="This is petrol";
		System.out.println(car.fuel);
		
		
		car bmw=new car();
		bmw.fuel="hello";
		bmw.engine="taulo";
		
		System.out.println(car.fuel);
		System.out.println(car.fuel);
	    bmw.engine("nitrogen air");
	    
	    
	    car gt=new car();
	    gt.engine="turbo";
	  System.out.println(car.fuel);
	  System.out.println(gt.engine);
	  
	  System.out.println();
		
		
	}

}


class car
{
	static String fuel;
	
	String engine;
	
	public void engine(String air)
	{
            String airs=air;
            System.out.println(airs);            
		
	}
}





