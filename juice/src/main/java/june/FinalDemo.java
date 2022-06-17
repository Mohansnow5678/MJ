package june;

import javax.sound.midi.MetaEventListener;

public class FinalDemo {

	public static void main(String[] args) {
              Fincla fc=new Fincla();
              fc.x=200;
              fc.s=900;
      fc.met(39);
      
   //   System.out.println(met);
	}

}

 class Fincla
{
	 int x=100;
	int s=10;
	
	final void met() {
		
	}
	final void met (int i) {
		
	}
	
}

class SubFInal extends Fincla{
	//void met() {
	
//}

}