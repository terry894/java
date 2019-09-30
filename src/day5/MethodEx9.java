package day5;

public class MethodEx9 {
	public static void main(String[] args) {
		System.out.println(Math.random()); 
		//random() random 값을 반환해주는 함수
		int a = 10;
		int b = 20;
		int temp = 0;
		
		System.out.println("a:"+ a + ", b:" + b);
		
		temp = a;
		a = b;
		b =temp;// 두값을 뒤바꾸는 방법 
	}
}
