package test2;

public class AccountTest {

	public static void main(String[] args) {
		
		// 객체 생성
		Account account = new Account("441-0290-1230" , 500000, 0.073);
		
		// 계좌 정보 출력
		System.out.println("계좌 정보 : " + account.getAccount() + " 현재 잔액 : "+ account.getBalance());
		
		// 20000원 입금
		account.deposit(20000);
		
		// 계좌 변경 정보 출력
		System.out.println("계좌 정보 : " + account.getAccount() + " 현재 잔액 : "+ account.getBalance());

		// 이자 출력
		System.out.println(account.calculateInterest());
		
		
	}

}
