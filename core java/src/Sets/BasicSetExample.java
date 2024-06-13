package co.Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BasicSetExample {
	public static void main(String[] args) {
		
		
		//set output always in RandomOder
		
		Set s =new HashSet();
		
		s.add("zero");
		s.add("one");
		s.add("two");
		s.add("three");	 
		
		System.out.println(s);
		 
		//use Iterator
		
		Iterator it = s.iterator(); //iterator use while loop
		while (it.hasNext()) {
			
			System.out.println(it.next());
			
			it.remove();
			
		}
		
		System.out.println(s +"it.remove() remove all element");
		
		System.out.println("-----------");
		
		Set s2 = new HashSet();
		
		s2.add(40);
		s2.add(15);
		s2.add(1);
		s2.add(28);
		s2.add(null);
		s2.add(null);
		
		System.out.println(s2);
		
		Iterator it1 = s2.iterator();
		
		while (it1.hasNext()){
			
			System.out.println(it1.next());
			
			 it1.remove();
			
		}
		System.out.println(s2+"remove all");
		
	}

}
