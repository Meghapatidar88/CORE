package co.marksheet;

import java.util.ArrayList;
import java.util.List;

public class TestEmpolyee {
	public static void main(String[] args) {
		
		
		Empolyee e1 =new Empolyee(1, "megha",2000);
		
		 List l= new ArrayList();
		 l.add(e1);
		 
		 Empolyee e = new Empolyee(1,"megha",2000);
		 System.out.println(l.contains(e));
		 
		 
		
		
		
		
		
		
		
		
		
		
	}

}
