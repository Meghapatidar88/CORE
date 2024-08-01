package In.co.oop;

import java.time.LocalDate;

public class Person1withdob {
	private String name;
	private static int birthyear;
	private int salary;
	private String dob;
	
	public String getName() {
		return name;
	}
	public void  setName(String name) {
		this.name =name;
	}
	public static int getBirthyear() {
		return birthyear; 
	}
	public void setBirthyear(int Birthyear) {
		this.birthyear = birthyear;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary =salary;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDob() {
		return dob;}
	
	
public static void DOB(int birthyear) {
		
	int CurrentDate =LocalDate.now().getYear();
	int age = CurrentDate -getBirthyear();
	System.out.println("Age:" + age);}

		public static void main(String[]args) {
			Person1withdob p = new Person1withdob();
			p.setName("megha");
			p.setSalary(27000);
			p.setBirthyear(2002);
			p.setDob("02\10\2002");
			System.out.println(p.getName());
			System.out.println(p.getSalary());
			System.out.println(p.getDob());
			System.out.println(p.getBirthyear());}
					
}
