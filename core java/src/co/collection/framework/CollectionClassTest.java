package co.collection.framework;


import java.util.ArrayList;
import java.util.Collection;

public class CollectionClassTest {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
	    c.add("megha");
		c.add(10);
		c.add(true);
		c.add(0);
	c.add(10.8);
//	c.add("nn");
//	c.addAll(c);
//c.clear();
	// c.containsAll(c);
	// c.isEmpty();
//	 c.iterator();
 //c.remove(0);
	// c.removeAll(c);
	 //c.retainAll(c);
 //c.size();
	// System.out.println("remove all element"+c.isEmpty()); //all element print in collection
		
		for(Object Object:c) { //value ko collection se bahar nikalne ke liye
		System.out.println(Object);
		
		
		//}
		//System.out.println(((ArrayList) c).get(1));
	}

}
