package PolymorphismOop;

public class Test3shap {
	public static void main(String[] args) {
		
		Shape3 s1 = Shape3.getShape3(1);
		Shape3 s2 = Shape3.getShape3(2);
		Shape3 s3 =Shape3.getShape3(3);
		
		System.out.println("area of circle="+s1.area());
		System.out.println("area of triangle=" +s2.area());
		System.out.println("area of ractangle="+s3.area());
		
	
	}

}
