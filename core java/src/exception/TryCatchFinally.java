package co.exception;

public class TryCatchFinally {
	public static void main(String[] args) {
		
		String name ="Megha";
		try {
			System.out.println(name.charAt(3));
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("String choti hai");
			
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("i'm always excuted");
		}
	}

}
