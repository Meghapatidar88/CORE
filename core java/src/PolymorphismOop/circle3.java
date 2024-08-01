package PolymorphismOop;

public class circle3 extends Shape3 {
	private double radius;
	
	public circle3 () { //default constractor
		
	}
	public circle3(double radius) { //constractor
		this.radius = radius;
		
	}
	public double area() {
		return 3.14*radius *radius;
		
	}
	

}
