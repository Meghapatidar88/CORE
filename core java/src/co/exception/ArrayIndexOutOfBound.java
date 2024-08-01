package co.exception;

public class ArrayIndexOutOfBound {
	public static void main(String[] args) {
		
		String S[] = {"himanshi"};
		//System.out.println(S.length);
	//System.out.println(S[10]);
		try {
			System.out.println(S.length);
			System.out.println(S[10]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			System.err.println(e.getMessage());
		}
	}
}
