package banking;

public class BankingApp {

	private int balance;

	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		if (amount > 0 && amount < balance)
			balance -= amount;
	}

	public void transfer(BankingApp receiver, int amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
}