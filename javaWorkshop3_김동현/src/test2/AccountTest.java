package test2;

public class AccountTest {

	public static void main(String[] args) {
		
		// 객체 생성
		Account account = new Account("441-0290-1230" , 500000, 0.073);
		
		// 계좌 정보 출력
		// 문제에서 toString을 재정의 하여 출력하라고 하지 않았음으로 get을 이용하여 출력한다.
		System.out.println("계좌 정보 : " + account.getAccount() + " 현재 잔액 : "+ account.getBalance());
		
		// 20000원 입금 
		// Account 클래스의 deposit 메소드를 이용하여 금액 추가
		account.deposit(20000);
		
		// 계좌 변경 정보 출력
		System.out.println("계좌 정보 : " + account.getAccount() + " 현재 잔액 : "+ account.getBalance());

		// 이자 출력
		// Account 클래스의 account.calculateInterest() 에 계산되어 있는 이자 금액
		System.out.println(account.calculateInterest());
		
		
	}

}
