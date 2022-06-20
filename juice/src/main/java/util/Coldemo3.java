package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class Coldemo3 {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();

		hs.add("I");
		hs.add("FEEL");
		hs.add("GUILTY");

		System.out.println(hs);
		hs.remove("I");
		System.out.println(hs.size());
	
		System.out.println(hs);

		System.out.println(hs.isEmpty());

		System.out.println(hs.contains("FEEL"));

		hs.forEach(System.out::println);
		hs.forEach(new MyConsumer());
		hs.forEach((s) -> {
			System.out.println(s);
		});
		hs.forEach(System.out::println);
		hs.forEach(Coldemo3::print);

		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	static void print(String s) {
		System.out.println(s);
	}
}

class MyConsumer implements Consumer<String> {
	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}
