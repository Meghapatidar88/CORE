package co.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestCon {
	
	public static void main(String[] args) {
		
		List<TestConstenstant> l = new ArrayList<TestConstenstant>();
		l.add(new TestConstenstant("kumari megha","9867544532"));	
		l.add(new TestConstenstant("kumari himanshi","98675445392"));	
		l.add(new TestConstenstant("kumari anjali","986754453562"));	
		l.add(new TestConstenstant("kumari rekha","986754764532"));	
		l.add(new TestConstenstant("kumari babli","9867544536"));	
		l.add(new TestConstenstant("kumari babita","9867544538"));	
		
		l.stream()
		.map(e->e.PhoneNo)
		.filter(e->e.length()==10)
		.distinct()
        .collect(Collectors.collectingAndThen(Collectors.toList(),
        e->{Collections.shuffle(e);
		return e.stream();}))
		.limit(3)
		.forEach (e->{System.out.println("Valid Number"+e);});
		
		
		}	
		
		
		
		
		
		
		
        }	
		
	
	


