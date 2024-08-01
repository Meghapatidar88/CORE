package project1;

public class fibonacciSeries {
	public static void main(String[] args) {
		
		int n =10; //number of terms to generate
		int firstTerm = 0, secondTerm = 1;
		
		System.out.println(" Fibonacci Series up "+ n + " terms:");
		
		for(int i = 1; i<=n;i++) {
			System.out.println(firstTerm + "  ");
			
			//computr the next term
			int nextTerm =firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			
			
		}
	}

}
