package co.exception;

public class IndexOutOfBound {
	public static void main(String[] args) {
		
		String s ="megha";
		//System.out.println(s.length()); 
		//System.out.println(s.charAt(8));
		try {
			System.out.println(s.length());
			System.out.println(s.charAt(7));
		}catch 
		(StringIndexOutOfBoundsException e) {
			System.out.println("length choti h");
		}
	}

}
