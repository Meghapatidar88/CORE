package co.Sets;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashExaple {
	
	public static void main(String[] args) {
		LinkedHashSet s = new LinkedHashSet();
		s.add("Welcome");
		s.add("to");
		s.add("Greek");
		s.add(4);
		s.add("Greek");
		
		System.out.println(s);

		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
			
		}
		//System.out.println(set);
		
	}

}
