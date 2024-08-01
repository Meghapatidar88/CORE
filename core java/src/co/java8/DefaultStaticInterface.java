package co.java8;

public interface  DefaultStaticInterface {
	public void abstractmethod ();
	public default void defaultmethod () {
		System.out.println("Default Method");
		
	}
	public static void staticMethod() {
		System.out.println("Static Method");
	}

}
