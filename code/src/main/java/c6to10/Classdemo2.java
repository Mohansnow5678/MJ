package c6to10;

public class Classdemo2 {

	public static void main(String[] args) {
		Test obj = new Test();
		obj.met();
        obj.met2();
        int result=obj.met3();
        System.out.println("dude    "   +obj.met3());
        System.out.println("dude 1        " +result);
	}

}

class Test {

 private	int i ;

	void met() {
		int meti = 10;
		System.out.println(i);
		System.out.println(meti);

	}

	void met2() {
System.out.println(i);
	}

	int met3() {

		return 10;

	}

}


