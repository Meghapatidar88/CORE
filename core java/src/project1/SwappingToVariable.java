package project1;
import java.util.Scanner;

public class SwappingToVariable {
	public static void main (String[]args) {
		//Swapping Two Variable with out using the third variable
		System.out.println("Enter the value of x and y");
	Scanner sc =new Scanner(System.in);
	int x =sc.nextInt();
	int y =sc.nextInt();
	System.out.println("before swapping numbers:"+x +" "+y);
	//After Swapping
	x =x + y;
	y =x - y;
	x =x -y;
	System.out.println("After swapping numbers: "+x +" "+ y);
		
	}

}
