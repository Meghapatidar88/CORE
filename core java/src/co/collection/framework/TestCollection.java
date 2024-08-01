package co.collection.framework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {

		// creates a collection
		Collection c = new ArrayList();

		// Add elements into collection //1
		c.add("Bura mat dekho"); // index#0
		c.add("Bura mt suno"); // index#1
		c.add("bura mt bolo"); // index #2

		// length of collection

		System.out.println("Length of Collection:" + c.size());
		System.out.println(((ArrayList) c).get(1));  //only one index print krne ke liye
		System.out.println(c);                     //ek sath pure index(element) print krne ke liye
		// print all elements of collection
		for (Object ele : c) {          // 1step print all element without {} means array ke bahar
			System.out.println(ele);
		}
		// Covert collection into array

		Object[] oArray = c.toArray();  //2ed step 

		// Print all elements of array
		for (Object ele : oArray) {
			String s = (String) ele;
			System.out.print(s);
		}

	}

}
