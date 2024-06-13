package co.marksheet;

public class Empolyee {
    int id;
    String name;
    int salary;
    
    
    public Empolyee(int id, String name,int salary) {
    	this.id =id;
    	this.name =name;
    	this.salary =salary;
    	
    	
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
	public boolean equals(Object obj) {
		if((boolean) (obj== null)) {
		return false;
		
	}
		if(!(obj instanceof Empolyee)) {
			return false;
		}
	 Empolyee e = (Empolyee)obj;{
	 boolean b = this.id == e.id && this.name==e.name && this.salary==e.salary;
	 
	 return b ;
	 
	 }
	}
	 @Override
	public int hashCode() {
		 String str = id+name +salary;
		 return str.hashCode();	}
	@Override
	public String toString() {
		 return "id" +id +"name"+name +"salary"+salary;
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
