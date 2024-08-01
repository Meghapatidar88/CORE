package co.camparator;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		
		List l = new ArrayList<Employee>();         
		l.add(new Employee(1,"Himanshi",1500));
		l.add(new Employee(3,"Megha",1600));
		l.add(new Employee(4,"Raman",2000));
		l.add(new Employee(2,"Shailja",5000));
		
		System.out.println(l);
		//Collections.sort(l);{
		Collections.sort(l,new OderByIDASc());
		Collections.sort(l,new OderSalaryAsc());
		
		for(Object object:l) 
			System.out.println(object);
			
		}
		
	}
	
	
	
	
	
	
	
	
	

