package InheritanceOOp;

public class OverTriangle extends Shape1 {
	private int base;
	private int hight;
	
	public int getBase(){
		return base;
	}
	public void setBase(int base) {
		this.base =base;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight =hight;
			
	}
	@Override
	public double area() {
		
		return base * hight;
	}
}
