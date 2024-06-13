package co.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class BeforeAfterG {
	public static void main(String[] args) {
		
//		
//		 ArrayList l = new ArrayList();
//		 l.add("one");
//		 l.add("two");
//		 l.add("three");
//		 
//		 String str = (String)l.get(l);
//		 System.out.println(str);
//		 Iterator it = l.iterator();
//		 while (it.hasNext()) {
//			 String val = (String) it.hasNext();
//		 }
		ArrayList<String> l = new ArrayList<String>();
		l.add("one");
		l.add("two");
		
		String str = l.get(l);
		System.out.println(str);
		
		Iterator<String> it = l.iterator();
		
		while(it.hasNext()) {
           String val = it.next();		
		
		
		
		
	}

}
