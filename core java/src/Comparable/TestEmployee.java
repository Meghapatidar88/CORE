package co.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		 list.add(new Employee(2 ,"a" ,1000));
		 list.add(new Employee(4, "c" , 3000));
		 list.add(new Employee(3 ,"e" ,4000));
		 list.add(new Employee(1 ,"b" ,5000));
		 list.add(new Employee(6 ,"d" ,6000));
		 list.add(new Employee(5 ,"f" ,2000));
		
		Collections.sort (list);
		
		for(Object object : list) {
		System.out.println(object);
		
		 
	}

}}
