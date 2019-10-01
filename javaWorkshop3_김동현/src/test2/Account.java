package test2;

public class Account {
	
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {}

	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	};
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	// 이자 계산용 메소드
	
	public double calculateInterest() {
		return balance * interestRate;
	}
	
	// 입금하기 위한 메소드
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금하기 위한 메소드
	public void withdraw(int money) {
		balance -= money;
	}
	
	
	
}
