package day6;

public class TestMain4 {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
//		atm.getName();
        atm.setBalance(99999999); 
        // setBalance�� ���� balance������ ���������� ���� 
		atm.deposit(5000); // 5000 �Ա�
		
		atm.withDraw(10000);//10000 ���
		
		atm.withDraw(3000);
	}
}
