package chapter8;



/*


public class Box {

	public static void main(String[] args) {
		
		
		
		A superob=new A();
		B subob=new B();
		
		superob.i=10;
		superob.j=10;
		subob.k=5;
		
		superob.showij();
		subob.sum();
		subob.showk();
		
		superob.i=23;
		superob.j=12;
		subob.k=13;

		superob.showij();
		subob.showk();
		subob.sum();
		 
	
	
	}
}
	
	class A {
		int i, j;
		
		void showij() {
		System.out.println("i and j: " + i + " " + j);
		}
		
	}
		// Create a subclass by extending class A.
	
	class B extends A {
		int k;
		
		void showk() {
		System.out.println("k: " + k);
		}
		
		void sum() {
		System.out.println("i+j+k: " + (i+j+k));
		}
		}
	
	
	*/
	/*
	
class Inherit {
public static void main(String args[]) {
BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
double vol;
vol = myBox1.volume();
System.out.println("Volume of myBox1 is " + vol);
System.out.println("Weight of myBox1 is " + myBox1.weight);
System.out.println();
vol = myBox2.volume();
System.out.println("Volume of myBox2 is " + vol);
System.out.println("Weight of myBox2 is " + myBox2.weight);
}
}

class Box {
double width;
double height;
double depth;
// construct clone of an object
Box(Box ob) { // pass object to constructor
width = ob.width;
height = ob.height;
depth = ob.depth;
}
// constructor used when all dimensions specified
Box(double w, double h, double d) {
width = w;
height = h;
depth = d;
}
// constructor used when no dimensions specified
Box() {
width = -1; // use -1 to indicate
height = -1; // an uninitialized
depth = -1; // Box
}
// constructor used when cube is created
Box(double len) {
width = height = depth = len;
}
// compute and return volume
double volume() {
return width * height * depth;
}
}
// Here, Box is extended to include weight.
class BoxWeight extends Box {
double weight; // weight of Box





BoxWeight(double w, double h, double d, double m) {
width = w;
height = h;
depth = d;
weight = m;
}
}

*/






/*

class A {
A() {
System.out.println("Inside A's constructor.");
}
}



// Create a subclass by extending class A.
class B extends A {
B() {
System.out.println("Inside B's constructor.");
}
}
// Create another subclass by extending B.
class C extends B {
C() {
System.out.println("Inside C's constructor.");
}
}
class Inherit {
public static void main(String args[]) {
C c = new C();


}}


*/

public class Inherit{
	
	
	public static void main(String[] args) {
		
		int a=10;
		System.out.println(a--                  );
		System.out.println(a);
	}
}















