package chap5;


class Fine
{
double width;
double height;
double depth;

// This is the constructor for Box.
Fine() {
System.out.println("Constructing Box");
width = 10;
height = 10;
depth = 10;
}

// compute and return volume
  double volume() {
  return width * height * depth;
   }
   }



public class Constructor1 {

	public static void main(String[] args) {
		Fine mybox1 = new Fine();
		Fine mybox2 = new Fine();
		double vol;
		// get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);

	}}

