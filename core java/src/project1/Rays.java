package project1;

public class Rays {
	public void sayhello() {
		System.out.println("hello sir");
		
		
	}
	public static int add(int a, int b) {
		return a+b;
	
	}
	public static void multi(int m,int n) {
	int multi=m*n;
	System.out.println(multi);

}
	public static void division(int c,int d) {
		int division= c/d;
		System.out.println(division);
			
	}
		
		
	
	public static void main(String[]args) {
		Rays F=new Rays();
		F.sayhello();
		F.multi(18, 30);
		F.division(50, 5);
		System.out.println(F.add(10,30));
	}
	}
	
	
