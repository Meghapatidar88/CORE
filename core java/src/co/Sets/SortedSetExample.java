package co.Sets;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample { //asending order
	public static void main(String[] args) {
		   //Sortedset output by default ASC oder
		SortedSet s = new TreeSet();
		
		s.add(9);   
		s.add(20);
		s.add(4);
		
		System.out.println("Last:"+ s.last());
		System.out.println("First:" + s.first());
		
		System.out.println(s);
		
//		for(Object ele :s){
//			
//			System.out.println(ele);
//		}
		
		Iterator it = s.iterator ();
		while (it.hasNext()) {
		System.out.println(it.next());}
		
		
		
		
		
		
		
		
		
	}

}
