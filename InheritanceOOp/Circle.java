package InheritanceOOp;

public class Circle extends Shape { // extends means connect this class to parents class
	private int radius;

	public int getRdius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {
		return 2 * 3.14 * radius;

	}
}
