package day8;

public class SmartPhone {
	String productName, PhoneNumber;
	static String company; //클래스가 new SmartPhone 하기도 전에 자리를차지하는 변수 
	int price;

	//매개변수 생성자
	public SmartPhone(String productName, String phoneNumber, String company, int price) {
		super();
		this.productName = productName;
		PhoneNumber = phoneNumber;
		this.company = company;
		this.price = price;
	}
	//수신, 발신, 게임하기 
	
	public void receive() {
		System.out.println("띠링");
		
	}

	public static void playGame() {
		System.out.println("뿅뿅");
		
	}
		
	public void send(String number) { // new안해도 메모리에 올라감  
		System.out.println(number + "로 전화");	
	}

}
