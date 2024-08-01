package co.collection.framework;

import java.util.ArrayList;

public class ListbyCollection {
	
	public static void main(String[] args) {
		
		ArrayList name = new ArrayList();
		
		for(int i = 0; i<5; i++) {
		name.add("No # " + i);
//		}
		System.out.println("Names =" + name.size());
	  Object o = name.get(0);
//  String names  = (String) o;
//	 String name = (String) name.get(0);
//		System.out.println("First Name is" +names);
		 for (Object ele:name);
		 System.out.println(name);
	}

}}
