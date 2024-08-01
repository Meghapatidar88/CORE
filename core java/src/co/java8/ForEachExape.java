package co.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachExape {
	public static void main(String[] args) {
		
		List<String>List = new ArrayList<String>();
		List.add("Ram");
		List.add("Shyam");
		List.add("mohan");
		List.add("krishna");
		List.forEach(li -> System.out.println(li));
	}

}
