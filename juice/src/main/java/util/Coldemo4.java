package util;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Coldemo4 {

	public static void main(String[] args) {
		TreeMap<String, String> JD = new TreeMap<String, String>();

		JD.put("s10", "Akash");
		JD.put("s60", "Hari");

		JD.put("s30", "Adhi");
		JD.put("s20", "Ela");

		JD.put("s50", "Ganesh");
		JD.put("s40", "Muthu");

		System.out.println(JD);
		System.out.println(JD.get("s20"));

		Set<Map.Entry<String, String>> J = JD.entrySet();

		Iterator<Map.Entry<String, String>> iter = J.iterator();

		while (iter.hasNext()) {

		Map.Entry<String,String> JDS=iter.next();
		System.out.println(JDS.getKey()+" : "+JDS.getValue());
		
			
		}

	}

}
