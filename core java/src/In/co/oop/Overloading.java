package In.co.oop;
                       //define two or more methods of same name,provided that their argument
                       //list or parameters are different
public class Overloading {
	public void Mymethod() {
		System.out.println("HelloWorld");}
		
		 public void Mymethod(int a,int b) {
			int c =a+b;
			System.out.println("sum of two Integer:"+c);
			
		}
		public void Mymethod(int a,int b ,int c) {
	  int d =a+b+c;
	  System.out.println("sum of three Integer"+d);
	  
		}
	
 
}
