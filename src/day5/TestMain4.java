package day5;

public class TestMain4 {
	public static void main(String[] args) {

		Marine m1 = new Marine();

		System.out.println(m1.hp);

		Marine m2 = new Marine(500);

		System.out.println(m2.hp);
// Ã¼·Â,x,y
		
		
		Marine m3 = new Marine(500,100,200);

		System.out.println("hp : "+m3.hp);
		System.out.println(" x : "+m3.x);
		System.out.println(" y : "+m3.y);
	}
}
