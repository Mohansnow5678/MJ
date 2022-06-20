package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;



public class Coldemo2 {

	public static void main(String[] args) {
		List<Pencil> list = new ArrayList<Pencil>();
		list.add(new Pencil("A"));
		list.add(new Pencil("C"));
		list.add(new Pencil("D"));
		list.add(new Pencil("Y"));
		list.add(new Pencil("P"));
		list.add(new Pencil("G"));
		System.out.println("Before sorting..:" + list);
		Collections.sort(list,new MyComparator());
		System.out.println("After sorting...:" + list);
		HashSet<Pencil> sharp = new HashSet<Pencil>(list);
		System.out.println(sharp);
	
		TreeSet<Pencil> ts=new TreeSet<Pencil>();
		ts.addAll(sharp);
		
		System.out.println(ts);
	
	
	
	}

}

class MyComparator implements Comparator<Pencil> {

	@Override
	public int compare(Pencil o1, Pencil o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}

}

class Pencil implements Comparable<Pencil> {

	String company;

	public Pencil(String company) {
		this.company = company;
	}

	@Override
	public int compareTo(Pencil o) {

		return this.company.compareTo(o.company);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.company;
	}

}