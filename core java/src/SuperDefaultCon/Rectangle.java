package SuperDefaultCon;

public class Rectangle extends ShapS {
	private int length;
	private int width;
	 
	public Rectangle(int length,int width, String colour,int borderwidth) {
		super(colour,borderwidth);
	  this.length = length;
	  this.width = width; 
	}
	
	
	public int getLength() {
		return length;
		
	}
	public int getWidth() {
		return width;
	}
	
	

}
	
