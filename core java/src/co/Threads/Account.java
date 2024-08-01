package co.Threads;

public class Account {
	
	private int balance =0;
	public int getBalance() {
		try {
			Thread.sleep(200);
			
		}catch(InterruptedException e){}
		return balance;
	}
     public void setBlance(int balance) {
    	 try {
    		 Thread.sleep(200);
    		 
    	 }catch(InterruptedException e) {}
    	 this.balance = balance;
     }

public synchronized void deposit(String msg,int amt) {
	int bal =getBalance();
	bal = bal +amt;
	setBlance(bal);
	System.out.println(msg +"New balance" +bal);
}}
