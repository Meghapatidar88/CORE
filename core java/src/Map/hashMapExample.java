package co.Map;

import java.util.HashMap;
import java.util.Map;

public class hashMapExample {
 
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(1,"one");
		m.put(2,"Two");
		m.put(3,"three");
		m.put(4,"four");
		
		System.out.println(m);
		System.out.println(m.get(2));
	
		for(Object obj :m.entrySet()) {
			Map.Entry entry = (Map.Entry)obj;
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println("key:" + key + "=" + "value:" + value);
			
		}
		for(Object value : m.values()) {
			System.out.println("value:" + value);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
