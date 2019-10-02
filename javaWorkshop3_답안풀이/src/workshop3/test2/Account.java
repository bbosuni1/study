package workshop3.test2;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "계좌정보 : " + account + " 현재 잔액 : " + balance;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	public double calculateInterest() {
		return balance * interestRate;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		balance -= money;
	}
}
