package InheritanceOOp;                          //OVERRIDDING

public class TestShappp {
	public static void main(String[] args) {
		
	

	OverCircle c = new OverCircle();
      c.setRadius(20);
      OverRactangle r =new OverRactangle();
      r.setLength(30);
      r.setWidth(40);
      OverTriangle t = new OverTriangle();
      t.setBase(70);
      t.setHight(40);
      System.out.println("Area of OverCircle" + c.area());
      System.out.println("Area of OverTriangle " + c.area());
      System.out.println("Area of OverRactangle" + c.area());
      
	}}
	