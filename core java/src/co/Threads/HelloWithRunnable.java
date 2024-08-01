package co.Threads;

public class HelloWithRunnable implements Runnable {
	
	String name = null;
	public  HelloWithRunnable(String name) {
		this.name = name;
		
	}

	@Override
	public void run() {
		for (int i = 1; i<=10; i++) {
			System.out.println(i + name);
			
		}
		
		
	}
	public void main (String []args) {
		Thread t1 = new Thread(new HelloWithRunnable("ram"));
		Thread t2 = new Thread (new HelloWithRunnable("shyam"));
		    t1.setPriority(10);
		    t1.start();
		    t2.start();
		    for  (int i = 0; i<5; i++) {
		    	System.out.println(i+"main");
		    }
	}
	

}
