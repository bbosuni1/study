package test2;

public class Account {
	
	private String account; // 계좌 번호 정보 변수
	private int balance;	// 잔액 정보 변수
	private double interestRate; // 이자율 변수
	
	// 기본 생성자
	public Account() {}
	
	// 사용자 정의 생성자
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
		return balance * interestRate; 	// 잔액 * 이자율 = 이자금액
	}
	
	// 입금하기 위한 메소드
	public void deposit(int money) {
		balance += money; // deposit() 입력된 정수(입금액)이  balance(잔액 정보)에 입력되게 하는 메소드
	}
	
	// 출금하기 위한 메소드
	public void withdraw(int money) {
		balance -= money; // withdraw() 입력된 정수(출금액)이  balance(잔액 정보)에 입력되게 하는 메소드
											// 문제에선 사용되지 않는다.
	}
	
	
	
}
