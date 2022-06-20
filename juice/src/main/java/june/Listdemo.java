package june;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Listdemo {

	public static void main(String[] args) {
		

	
	List<String> list=new ArrayList<>();
		
		list.add("BENZ");
		list.add("AUDI");
		list.add("LAMBHO");
		
		System.out.println("Original size..:"+list.size());
		list.add("FERRARI");
		System.out.println("modified...add..:"+list.size());
		list.remove(0);
		System.out.println("modified..remove..:"+list.size());
		
		System.out.println(list.get(1));
		
		System.out.println(list);
		
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println( "\ud83d\ude0e"+ "\ud83d\ude0e"+ "\ud83d\ude0e"+ "\ud83d\ude0e"+ "\ud83d\ude0e"+"\ud83d\ude0e"+ "\ud83d\ude0e"+ "\ud83d\ude0e");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\uD83D\uDE00+ "+"\uD83D\uDE00+ "+"\uD83D\uDE00+ "+"\uD83D\uDE00+ ");
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println( "\ud83d\udd2b"+ "\ud83d\udd2b"+ "\ud83d\udd2b"+ "\ud83d\udd2b");
		ListIterator<String> lit=list.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("\ud83d\udcf1"+"\ud83d\udcf1"+"\ud83d\udcf1"+"\ud83d\udcf1");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		System.out.println("\ud83d\udca3"+ "\ud83d\udca3"+"\ud83d\udca3"+"\ud83d\udca3"); //GRINNING FACE EMOJI
	System.out.println("\ue30f");
	}

	}

