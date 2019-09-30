package day6;

public class ATM {
	//이 변수는 직접 접근 하지마세요
	private int balance; //접근지정자 , 접근 수정자 , 접근 한정자 
	private String name, accountNo; //String - 클래스
    //balance의 값을 가져오기
	public int getBalance() {
		return balance;
	}
	//balance의 값을 지정하기 메서드를 통하면 로직을 쓸수있기 때문에 
	//set,get메서드를 통해 변수 접근 
	//getter.setter 라고 함 
	public void setBalance( int balance) {
		//ex)if(권한){.......db에 감사기록 남겨}
		this.balance = balance;
		System.out.println("현재 Balance변수 접근중:");
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	//a원 만큼 입금 
	void deposit(int a) {
		balance += a;
		System.out.println(a+"원 입금합니다.");
		System.out.println("현재잔액: " + balance+ "원 입니다.");
	}
	void withDraw(int a) {
		if(balance<a)
		{ //
			System.out.println("잔액이 부독합니다.");
			System.out.println("현재잔액: " + balance+ "원 입니다.");
		}
		else {
		balance -= a;
		System.out.println(a+"원 출금합니다.");
		System.out.println("현재잔액: " + balance+ "원 입니다.");
		}
	}

}
