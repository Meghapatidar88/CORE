package co.queues;

import java.util.PriorityQueue;

public class PriorityQueueExaple {
	public static void main(String[] args) {
		 
		
		PriorityQueue p = new PriorityQueue();
//		    p.add(1);
//		    p.add(2.3);
//		    p.add(6);
//		    p.add('A');
//		    System.out.println(p);

		//in priortyQueue if you add a data type first then you don't add other data 
	    //Type in this if you add it give ClassCastException at Runtime
	
		//Example we add String first in this program so we cannot add other data type
		//If we add int first so we cannot add String or other data type
		
		   PriorityQueue q = new PriorityQueue();
		   
		   q.offer("one");
		   q.offer("Three");
		   q.offer("two");
		   q.offer("five");
		System.out.println(q);

		System.out.println((q.peek()));
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
		Object ele  = q.element();
		System.out.println(ele);
		
		ele = q.remove();
		
		System.out.println(q);
		
		System.out.println(ele);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
