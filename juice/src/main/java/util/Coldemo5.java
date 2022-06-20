package util;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Coldemo5 {

	public static void main(String[] args) {

	Properties p=new Properties();
	
	p.put("a10", "cat");
	p.put("a50", "goat ");
	p.put("a20", "sheep");
	p.put("a60", "tiger");
	p.put("a40", "lion");
	p.put("a30", "giraf");
	
	
	System.out.println(p);	
		
	System.out.println(p.get("a50"));	
		
	Set s=p.entrySet();
	
	Iterator it=s.iterator();
	
	while(it.hasNext()) {
		
		Map.Entry me=(Map.Entry)it.next();
		System.out.println(me.getKey()+" : "+me.getValue());
	}
	
	}

}
