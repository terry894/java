package day8;

public class SmartPhone {
	String productName, PhoneNumber;
	static String company; //Ŭ������ new SmartPhone �ϱ⵵ ���� �ڸ��������ϴ� ���� 
	int price;

	//�Ű����� ������
	public SmartPhone(String productName, String phoneNumber, String company, int price) {
		super();
		this.productName = productName;
		PhoneNumber = phoneNumber;
		this.company = company;
		this.price = price;
	}
	//����, �߽�, �����ϱ� 
	
	public void receive() {
		System.out.println("�층");
		
	}

	public static void playGame() {
		System.out.println("�л�");
		
	}
		
	public void send(String number) { // new���ص� �޸𸮿� �ö�  
		System.out.println(number + "�� ��ȭ");	
	}

}
