package co.exception;

public class Exceptioncheck {
	

	public static void main(String[] args) {
		
		
	
	int a=10;
	int b = 0;
	int c = a/b;
	System.out.println(c);
             //check the exception
	try {
	}catch (Exception e) {
    e.printStackTrace();
	System.err.println(e.getMessage());
	}

	}

}
