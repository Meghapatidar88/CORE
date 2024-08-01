package co.camparator;

import java.util.Comparator;

public class OderByName implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		
		int nameComparison = o1.getName().compareTo(o2.getName());
		if (nameComparison!=0) {
			return nameComparison;
			
		}
		
		int salaryComparison = Integer.compare(o1.getSalary(),o2.getSalary());
		if (salaryComparison!=0) {
			return salaryComparison;
		}
		return Integer.compare(o1.getId(), o2.getId());
		
		}
	
	

}
