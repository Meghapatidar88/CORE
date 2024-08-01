package InheritanceOOp;

public class TestSRCT {
	public static void main(String[] args) {
		Circle c = new Circle();
		Triangle t = new Triangle();
		Rectangle s = new Rectangle();

	     c.setRadius(20);
	     t.setBase(40);
	     t.setHight(30);
	     s.setLength(40);
	     s.setWidth(60);
		System.out.println("area of circle" + c.area());
		System.out.println("area of triangle" + t.area());
		System.out.println("area of ractangle" + s.area());
		System.out.println("borderwith"+ t.getBase());
	}

}
