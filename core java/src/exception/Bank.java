package co.exception;

public class Bank {
	
	double balance;
	
 public double getBalance() {
	  return balance;
 }
 public void setBalance(double balance) {
	 this.balance = balance;
 }
                   //BALANCE DEPOSITE
  public void deposite(double ammount) {
	  balance +=ammount;
  }
                     //BALANCE WITHDRAW
  
  public double withdrow(double ammount)throws BankException {
	   if(balance <2000) {
		   throw new BankException("Balance can't be less then 2000");
		   
	   }
	   if(ammount > balance) {
		  throw new BankException("Insufficient balance"+ "your withdrow ammount is more than balance" ) ;
		  
	   }
	   balance -=ammount;
	   return balance;
	   
  }
}
