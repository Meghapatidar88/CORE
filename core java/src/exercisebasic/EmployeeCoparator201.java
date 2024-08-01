package exercisebasic;

import java.util.Comparator;

public class EmployeeCoparator201 implements Comparator<EmployeeP201>{

	@Override
	public int compare(EmployeeP201 o1, EmployeeP201 o2) {
		int lastNameComparison =
				o1.getFirstName().compareTo(o2.getLastName());
		
		//if lastname are equal,sort by fistname
		if(lastNameComparison ==0) {
		return 
		o1.getFirstName().compareTo(o2.getFirstName());
		}
		return lastNameComparison;
		
		
		}

}
