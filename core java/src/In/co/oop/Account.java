package In.co.oop;

public class Account {
	
	
	private int accountno;
	private String AccountType;
	private double balance;
	
	
	
	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int account) {
		this.accountno = accountno;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		this.AccountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount>200) {
			 balance +=amount;
			 System.out.println("Diposit successful. New balance :" + balance);
		}else {
			 System.out.println("Invalid diposit amount");				
		} 
	}
		
			public void withdraw(double amount) {
				if(amount>0  && amount<=balance) {
					balance-= amount;
					System.out.println("Withdrawal successful. New balance : "+ balance);
				}else {
					System.out.println("Invalid withdrawal amount or insufficient balance.");
				}
		} public static void main(String[]args) {
			Account a =new Account();
			a.accountno =97564;
			a.AccountType ="saving";
			a.balance =25000;
			a.deposit(3000);
			a.withdraw(5000);
			System.out.println("Accountno"+"="+a.accountno);
			System.out.println("AccountType"+"="+a.AccountType);
			System.out.println("balance"+"="+a.balance);
			System.out.println();
			
		}
			
}
			
			
			
				
			
	
	


