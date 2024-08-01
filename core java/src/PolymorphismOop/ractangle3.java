package PolymorphismOop;

public class ractangle3 extends Shape3 {
	private int length;
	private int width;
	
	public ractangle3() {
		
	}
	public ractangle3(int length,int width) {
		this.length =length;
		this.width =width;
		
	}
	public double area() {
		return length*width;
			
	}

}
