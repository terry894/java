package day1;
//연산자
//1.증감연산자 : ++, -- 
public class OperEx1 {
	public static void main(String[] args) {
		int a = 100;
//		a = a+1; // 4가지 단계를 한다
		a--;// 속도가 더 빠르다 
//	    a+=1;
		System.out.println("a:" + a); 
		
		int b = 10; // b에 10 할당 
		int c = 20;
		
		c = ++b; // b가 1증가하고 c에 할당 , b++ b가 c에 할당된 다음 1증가 
		System.out.println("b:"+b+"c:"+c); // b: 11 c: 11
	}

}
