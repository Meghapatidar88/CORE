package co.camparator;

public class Employee2 implements Comparable<Employee2>{ //kis bhi class me comparator ka use krne ke liye phle compare krna hoga

	int id;
	String name;
	int salary;
	
	public Employee2(int id,String name,int salary) {
		this.id=id;
		this.name = name;
		this.salary = salary;
	}	  
		
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public int getSalary() {
			return salary;
		}
		
		
		@Override
		public int compareTo(Employee2 o) {
		int nameComparison = this.name.compareTo(o.name);
		if (nameComparison!=0) {
			return nameComparison;
		}
		int salaryComparison =Integer.compare(this.salary,o.salary );
		if(salaryComparison!=0) {
		return salaryComparison;
			
			
			}
		return Integer.compare(this.id,o.id);}
		
		
		
		

	@Override
	public String toString() {
		
		return id +" " + name + " "+salary ;
	}

	

}
