package project1;

public class helloifelse {
	public static void main(String[]args) {
		if(args.length==1) {
			System.out.println("Hello"+args[0]);
			
		}else {
			System.out.println("Parameter name is required");
		}
		
	}

}
