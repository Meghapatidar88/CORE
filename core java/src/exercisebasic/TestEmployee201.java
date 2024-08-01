package exercisebasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployee201 {
	
	public static void main(String[] args) {
		
		List employee = new ArrayList<>();
		
		employee.add(new EmployeeP201("megha","patidar"));
		employee.add(new EmployeeP201("megha","patidar"));
		employee.add(new EmployeeP201("joy","solanki"));
		employee.add(new EmployeeP201("shivika","sekhawat"));
		
		//sorting
		
		//Collections.sort(employee .new EmployeeP201Comparator());
		
	
		//printing sorted employee
		for (Object emp : employee) {
			System.out.println(emp);
		}
		
	}

}
