package chapter8;



public class Inherit2 {


	public static void main(String[] args) {
		//Hall1 hall=new BirthDayHall();
		
		//hall=new MarriageHall();
		BaBdPaintBrush G=new BaBdPaintBrush();
		G.doPaint(1);
		 PaintBrush J=new PaintBrush();
		 J.doPaint(new BluePaint());
		 BadDog K=new BadDog();
		 K.play("stick");
		 GoodDog H=new GoodDog();
		 H.play(new  Biscuit2());
	
	}
}
abstract class Hall1{
	
}
class BirthDayHall extends Hall1{
	
}
class MarriageHall extends Hall1{
	
}
class BaBdPaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("red color");
		}
		else if(i==2) {
			System.out.println("blue color");
		}
	}
}
class PaintBrush{
	public void doPaint(Paintt p) {
		System.out.println(p);
	}
}
abstract class Paintt{}
class BluePaint extends Paintt{}
class GreenPaint extends Paintt{}
class BadDog{
	public void play(String item) {
		if(item.equals("stick")) {
			System.out.println("running......");
		}
		else if(item.equals("stone")) {
			System.out.println("biting....");
		}
		else if(item.equals("biscuit")) {
			System.out.println("enjoying...");
		}
	}
}
class GoodDog{
	public void play(Item item) {
		item.display();
	}
}
abstract class Item{
	public abstract void display();
}
class Stone1 extends Item{
	@Override
	public void display() {
		System.out.println("biting...............");
	}
}
class Stick2 extends Item{
	@Override
	public void display() {
		System.out.println("running....");
	}
}
class Biscuit2 extends Item{
	@Override
	public void display() {
		System.out.println("enjoying....");
	}
}