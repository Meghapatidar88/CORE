package co.exception;

public class GenericCatch {
	
public static void main(String[] args) {
	 String name = "megha";
	 
	 try {
		 System.out.println(name.length());
		 System.out.println(name.charAt(7));
		 
		 
	// }catch (Exception e) {
		// System.err.println("Error" + e.getMessage());
		 
	 }catch (StringIndexOutOfBoundsException e) {
		 System.out.println("String abhi choti h");
		 
	 }catch (RuntimeException e) {
		System.out.println("Error" + e.getMessage());
	 }
	 
	
}
}
