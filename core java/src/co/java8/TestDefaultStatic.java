package co.java8;

public class TestDefaultStatic {
	
public static void main (String[]args) {
	 DefaultStaticInterface  ds = new  DefaultStaticInterface () {

		@Override
		public void abstractmethod() {
			System.out.println("Abstract method");
			
			
		}
		 
	 };
	 ds.abstractmethod();
	 ds.defaultmethod();
	 DefaultStaticInterface .staticMethod();
}
}
