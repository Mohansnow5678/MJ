package chap5;

public class Style {

	public static void main(String[] args) {
	
				Fan khaitan=new Fan();
	   
				 khaitan.setup();
			}
		}
		class Fan{
			public Fan() {
				System.out.println("fan object created...");
			}
			public void on() {
				System.out.println("fan switched on...");
			}
			public void setup() {
				Room myRoom=new Room();
				myRoom.fix(this);//this keyword represents the current object
				//myRoom.fix(new Fan());
			}
		}
		class Room{
			public void fix(Fan f) {
				f.on();
			}
		}

		
		
		
		
	/*	package ch6to10;
		public class ThisDemo2 {
			String s;
			public ThisDemo2(String s) {
				this.s=s;
			}
			public static void main(String[] args) {
				//this keyword cannot be used inside a static method
				ThisDemo2 obj=new ThisDemo2("some value...");
				obj.printS("aaaaaaaaaa");
			}
			
			public void printS(String s) {
				System.out.println(this.s);
			}
		}



        */






		
		
		
		
	