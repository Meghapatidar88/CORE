package co.exception;

public class NullPointer {
	public static void main(String[] args) {
		
		String name = null;
		// System.out.println(name.charAt(0));
		 
		 try {
			 System.out.println(name.length());
		 }catch(NullPointerException e) {
			 System.out.println("null pointer exception");
		 }
	}

}
