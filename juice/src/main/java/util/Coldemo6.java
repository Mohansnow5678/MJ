package util;

import java.util.Map;
import java.util.WeakHashMap;

public class Coldemo6 {

	public static void main(String[] args) {
		
		
		
Map<String,String> map=new WeakHashMap<String, String>();
		
		String key1=new String("a10");
		String key2=new String("a20");
		
		map.put(key1, "RAT");
		map.put(key2, "CAT");
		
	//	System.out.println(map);
		key2=null;
	//	System.out.println(map);
	System.gc();
		
		System.out.println(map);
	}
}
		
		
		
		
		
		
		
		
		
		
