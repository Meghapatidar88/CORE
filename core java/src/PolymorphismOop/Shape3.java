package PolymorphismOop;
                                      
public class Shape3 {
	public Shape3 () { //default 
		
	}
	public double area() {
		return(0);
		
	}
	public static Shape3 getShape3(int i) { //value ko static rakhne ke liye
		if(i == 1) {
			return new ractangle3(5,6);
	}
	if (i == 2) {
		return new circle3(4);
}
     if(i== 3) {
    	 return new triangle3 (10,30);
     }
     return new Shape3();
		
	}
	}


