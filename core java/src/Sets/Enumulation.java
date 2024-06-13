package co.Sets;

import java.util.Enumeration;
import java.util.Vector;

public class Enumulation {
public static void main(String[] args) {
	Vector List = new Vector();
	List.addElement("Megha");
	List.addElement("Himanshi");
	List.addElement("raman");
	System.out.println(List);
	Enumeration a=List.elements();
	while(a.hasMoreElements()) {
		System.out.println(a.nextElement());
	}
}
}
 