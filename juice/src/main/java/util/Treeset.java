package util;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {

		Set ts = new TreeSet();

		ts.add("jony");
		ts.add("joe");
		ts.add("zebra");
		ts.add("Honey");
		ts.add("hii");
		System.out.println(ts);
		Bcd M = new Bcd();

		System.out.println();
	}
}

class Abc implements Comparable<String> {

	String name;

	@Override
	public int compareTo(String j) {

		return name.compareTo(j);
	}

}

class Bcd implements Comparator<String> {
	String name;

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		System.out.println(o1);
		// System.out.println( o2);
		return o1.compareTo(o1);
	}

}