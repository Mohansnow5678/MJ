package chapter8;

public class Inherit5 {

	public static void main(String[] args) {
		
		Mohanplug indianPlug=new Mohanplug();
		Americanplug A=new LenovoPlug();
		
		Mohansocket indianSocket=new Mohansocket();
		IndianAdapter adapter=new IndianAdapter(A);
		indianSocket.roundpinhole(adapter);


}}

abstract class Indianplug{
	
	public abstract void roundpin();
}

abstract class Indiansocket{
	
	public abstract void roundpinhole(Indianplug ip);
}

abstract class Americanplug{
	
	public abstract void slabpin();
}
abstract class Americansocket{
	
	public abstract void slabpinhole(Americanplug ap);
}

class Mohanplug extends Indianplug{
	@Override
	public void roundpin() {
		System.out.println("Mohan plug working....");
	}}	
	
class Mohansocket extends Indiansocket
{

	@Override
	public void roundpinhole(Indianplug ip) {
		ip.roundpin();
	}}

class IndianAdapter extends Indianplug{

	Americanplug ap;
public IndianAdapter() {
	
}
		public IndianAdapter(Americanplug ap) {
			this.ap=ap;
		}
		@Override
		public void roundpin() {
			ap.slabpin();
			
		}}


class LenovoPlug extends Americanplug{
	@Override
	public void slabpin() {
		
	System.out.println("American slab pin plug working..");	
	}
}


