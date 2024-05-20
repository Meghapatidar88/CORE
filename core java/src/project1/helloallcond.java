package project1;

public class helloallcond {
	public static void main(String[]args) {
		int size=args.length;
		if(size==0) {
			S.o.p("Usage:java HelloAll n1 n2 n3..");
			
			
		}else {
			for(int i=0; i<size;i++) {
				S.o.p(i+"=Hello"+args[i]);
				
			}
		}
	}

}
