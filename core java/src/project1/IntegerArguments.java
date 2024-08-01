package project1;

public class IntegerArguments {
	public static void main(String[] args) {
		int a =Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]); 
		int sum =a+b;
		
		System.out.println("Sum is"+ sum);
		
		//int b = Integer.parseInt (args[1]);	
		//float a= Float.parseFloat (args[0]);
	   
	    float c =(float)(a+b);
		System.out.print(c);//if you convert args into int then it work 
//		float a=10.5f;
//		int b=20;
//		float c= a+b;
//		System.out.println(c);
	}

}
