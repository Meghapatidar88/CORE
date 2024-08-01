package co.camparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestE2 {
	public static void main(String[] args) {
		
		List<Employee2> l =new ArrayList<>();
		
		
		l.add(new Employee2(1,"Megha",8000));
		l.add(new Employee2(3,"himanshi",1600));
		l.add(new Employee2(6,"zaid",1000));
		l.add(new Employee2(5,"swati",9000));
		l.add(new Employee2(4,"rupali",4000));
		l.add(new Employee2(2,"kirti",3900));
		
		System.out.println("Originam list:");
		  for(Employee2 e :l) {
			  System.out.println(e);
		  }
		
		Collections.sort(l,new OderByName());
		
		System.out.println("\nSorted list;");
		for(Employee2 e:l) {
		System.out.println(e);	
		}
	}

}
