package co.exception;




public class TestBank {

	public static void main(String[] args) {

		Bank b = new Bank();

		b.setBalance(1000);
		b.deposite(500);

		try {
			b.withdrow(1000);
			System.out.println(b.getBalance());
		} catch (BankException e) {
			System.out.println(e.getMessage());
		}

	}

}



