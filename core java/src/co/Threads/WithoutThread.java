package co.Threads;

public class WithoutThread {
	String name = null;
	public WithoutThread(String name) {
		this.name = name;
		
				
		
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(name);
			
		}
	}
	public static void main(String[]args) {
		
		WithoutThread t = new WithoutThread("Ram");
		WithoutThread t1 = new WithoutThread("Shyam");
		    t.run();
		    t1.run();
	}

}
