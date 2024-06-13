package co.exception;

import java.lang.invoke.StringConcatException;

import org.w3c.dom.ranges.RangeException;

public class MultipleCatchBlock {
	
	public static void main(String[] args) {
		 String name =null;
		 
		 try {
			
			 System.out.println("Length of name is"+name.length());
			 System.out.println("character of name"+ name.charAt(4));
			 
		 }catch (StringIndexOutOfBoundsException e) {
			 System.out.println("String abhi choti h");
		
		// }catch(NullPointerException e) {
		//	 System.out.println("Sunder sa nam nahi h");
			
		 }catch (RuntimeException e) {
			 System.out.println("mai megha hu");
			 
			 
		 }finally {
			 System.out.println("pandit hu me");
			
		 }
		 
		 
	}

}
