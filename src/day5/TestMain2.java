package day5;

public class TestMain2 {
	
	public static void main(String[] args) {
		Car c = new Car();
		c.color = "red";
		c.handle = 1;
		c.manufacturer = "spider488";
		c.type = "���";
		c.wheel = 4;
		c.speed = 0;
		
		System.out.println("�ڵ�: " + c.handle);
		System.out.println("����: " + c.wheel);
		System.out.println("����: " + c.type);
		System.out.println("�ӵ�: " + c.speed);
		
		c.start();
		c.stop();
		c.overspeed();
		
		
	}
}
