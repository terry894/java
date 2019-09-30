package day2;


//5. 비트연산자
public class OperEx5 {
	public static void main(String[] args) {
		byte a =10; // 0000 1010
		byte b =22; // 0001 0110
		
		System.out.println("a&b:" + (a&b)); // 0000 0010
		System.out.println("a|b:" + (a|b)); // 0001 1110
		
		byte c = 13; // 0000 1101
		byte d = 21; // 0001 0101
		
		System.out.println("c&d:" + (c&d)); 
		System.out.println("c|d:" + (c|d)); 
		// c&d ==> // 0000 0101 5 
		// c|d ==> // 0001 1101 29

		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1 & b2 : " + (b1 & b2)); // false값 출력 

	}

}
