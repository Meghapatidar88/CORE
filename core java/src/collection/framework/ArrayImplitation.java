package co.collection.framework;

import java.util.ArrayList;

public class ArrayImplitation {
	
	public static void main(String[] args) {
		 
		ArrayList a = new ArrayList();
		a.add("one");
		a.add("two");
		a.add("three");
		
		Integer i = new Integer(0);
		a.add(i);
		
		Integer value = (Integer)a.get(3);
		 System.out.println("Index#3 value =" + value);
		
	}

}
