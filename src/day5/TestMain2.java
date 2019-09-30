package day5;

public class TestMain2 {
	
	public static void main(String[] args) {
		Car c = new Car();
		c.color = "red";
		c.handle = 1;
		c.manufacturer = "spider488";
		c.type = "페라리";
		c.wheel = 4;
		c.speed = 0;
		
		System.out.println("핸들: " + c.handle);
		System.out.println("바퀴: " + c.wheel);
		System.out.println("차종: " + c.type);
		System.out.println("속도: " + c.speed);
		
		c.start();
		c.stop();
		c.overspeed();
		
		
	}
}
