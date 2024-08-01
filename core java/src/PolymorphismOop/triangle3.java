package PolymorphismOop;

public class triangle3 extends Shape3{
	private int base;
	private int hight;
	
	public triangle3() {
		
	}
	public triangle3(int base, int hight) {
		this.base =base;
		this.hight = hight;
		
	}
	public double area() {
		return base*hight;
	}

}

