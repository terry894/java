package day6;

public class ATM {
	//�� ������ ���� ���� ����������
	private int balance; //���������� , ���� ������ , ���� ������ 
	private String name, accountNo; //String - Ŭ����
    //balance�� ���� ��������
	public int getBalance() {
		return balance;
	}
	//balance�� ���� �����ϱ� �޼��带 ���ϸ� ������ �����ֱ� ������ 
	//set,get�޼��带 ���� ���� ���� 
	//getter.setter ��� �� 
	public void setBalance( int balance) {
		//ex)if(����){.......db�� ������ ����}
		this.balance = balance;
		System.out.println("���� Balance���� ������:");
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	//a�� ��ŭ �Ա� 
	void deposit(int a) {
		balance += a;
		System.out.println(a+"�� �Ա��մϴ�.");
		System.out.println("�����ܾ�: " + balance+ "�� �Դϴ�.");
	}
	void withDraw(int a) {
		if(balance<a)
		{ //
			System.out.println("�ܾ��� �ε��մϴ�.");
			System.out.println("�����ܾ�: " + balance+ "�� �Դϴ�.");
		}
		else {
		balance -= a;
		System.out.println(a+"�� ����մϴ�.");
		System.out.println("�����ܾ�: " + balance+ "�� �Դϴ�.");
		}
	}

}
