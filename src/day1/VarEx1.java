package day1;
//해당 파일 클릭후 f2누르면 이름 변경 가능
public class VarEx1 {
	public static void main(String[] args) {
		//변수
		//자료형 변수명
		byte b = -128; //127까지만 저장  -128 ~ 127 까지 표시 -128 = 10000000 음수 0 대신 한자리더
		long m = 200L; // L 로 long형 표시 
		//부동소수점- 움직이는 소수점 float:떠서 돌아다니다
		//실수형 - float, double 
		//아스키 - 0 - 48 , A - 65 , a - 97 정도는 알아두자
		//문지형 - char - 2byte 전부 양수 
		//자료형 변수명 = 상수(항상 동일한 값)
		float f1 = 3.141592f; // f로 float형 표시
		double d1 = 1.231212;
	    System.out.println("b : " + b ); 
	    System.out.println("f1 : " + f1);
	    System.out.println("d1 : " + d1);
		b = 10; // = 할당 연산자 
		System.out.println(b);
		b= 11; 
		System.out.println(b);
		
		int c; 
		c = 100;
		System.out.println(c);
		
		//변수를 선언하면서 값을 대입 - 초기화
		//int c = 100;
		
		short k = 30; // 16bite 자료형 변수 k 에 30 을 할당  
		System.out.println(k); 
		 
		byte b1 = 10;  
		byte b2 = 20;
		System.out.println(b1 + b2); 
		
	}
}
