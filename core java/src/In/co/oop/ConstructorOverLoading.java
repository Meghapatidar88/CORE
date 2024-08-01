package In.co.oop;

public class ConstructorOverLoading {
	public ConstructorOverLoading (){
		
	System.out.println("i'm Default Constructor");
		
	}
	public ConstructorOverLoading (int a) {
		//this();
		System.out.println("i'm parameterized Constructor");
		
		
		
	}
	public ConstructorOverLoading (int a,int b) {
		//this(a);
		System.out.println("i'm two parameterized Constructor");
	}
	public ConstructorOverLoading (int a, int b,int c) {
		//this(a,b);
		System.out.println("i'm three parameterized Constructor");
	}
	public static void main(String[] args) {
		
		
	ConstructorOverLoading  c = new ConstructorOverLoading();
		

}}
