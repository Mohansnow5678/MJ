package chap5;

public class ConsDemo {

	
	public ConsDemo() {
		
	}
	public ConsDemo(int i) {
		System.out.println(i);
	}
	
	public ConsDemo(Machi poo) {
		
	}
	public static void main(String[] args) {
		new ConsDemo(5);
		new ConsDemo();
		new ConsDemo(new Machi());
	}

}


class Machi{
	
}
