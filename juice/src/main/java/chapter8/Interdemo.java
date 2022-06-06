package chapter8;

public class Interdemo {

	public static void main(String[] args) {

		new FInterOne() {
			@Override
			public void met() {
				System.out.println("anonymous inner class met called..");
			}
		}.met();

		FInterOne one=Interdemo::mymethod;
		one.met();

		FInterOne oneLambda = () -> {
			System.out.println("Logic in Lambda Called");
		};
        oneLambda.met();
        
        FInterOne watha=new MyFInterOneImpl();
        watha.met();
        
	}

	public static void mymethod() {
		System.out.println("my method called...");
	}
}

class MyFInterOneImpl implements FInterOne {
	@Override
	public void met() {
		System.out.println("Mama calling mamu");
	}
}

interface FInterOne {
	public void met();
}
