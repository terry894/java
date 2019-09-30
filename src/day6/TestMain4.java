package day6;

public class TestMain4 {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
//		atm.getName();
        atm.setBalance(99999999); 
        // setBalance를 통해 balance변수에 간접적으로 접근 
		atm.deposit(5000); // 5000 입금
		
		atm.withDraw(10000);//10000 출금
		
		atm.withDraw(3000);
	}
}
