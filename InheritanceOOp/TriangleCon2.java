package InheritanceOOp;

public class TriangleCon2 extends shapeCon2{
	private int base;
	private int hight;
	 
	public TriangleCon2(int base , int hight) {
		this.base = base;
		this.hight = hight;
		
		
	}
	public int getBase() {
		return base;
		
	}
	public int getHight() {
		return hight;
	}
	public double area() {
		return base *hight /2;		
	}

}
