package InheritanceOOp;

public class OverCircle extends Shape1{
	private int radius;

	public int getRdius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
	
		return 3.14* radius *radius;
	}
}
