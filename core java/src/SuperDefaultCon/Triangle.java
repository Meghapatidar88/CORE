package SuperDefaultCon;

public class Triangle extends ShapS {
	private int base;
	private int hight;
	
	public Triangle(int base,int hight,String colour,int borderwidth) {
		super (colour,borderwidth);
		this.base = base;
		this .hight = hight;
	}
	public int getbase() {
		return base;
	}
	public int gethight() {
		return hight;
	}
	
	
	

}
