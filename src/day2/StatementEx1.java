package day2;

//제어문 
//반복문 
//조건문 
public class StatementEx1 {
	public static void main(String[] args) {
		// 구구단 3단
		// ctrl + shift + f 자동 들여쓰기
		int a = 0;
		for (int i = 1; i <= 9; i++) // for문 (초기식;조건식;증감식){}
		// 초기식 : for문에서 사용될 변수의 초기값을 할당
		// 조건식 : 조건식의 결과값은 논리값으로 true이면
		// 수행문장을 실행하고 false이면 완전히 빠져나간다
		// 증감식: for문에서 사용될 변수를 증가, 감소 처리 해준다 .
		//지역변수 int i 
		{
			a++;
		//	System.out.println(a + " 3 * " + a + " = " + (3 * a));
			System.out.println(i + " 3 * " + i + " = " + (3 * i));
		}
		
		//System.out.println("i:" + i); 지역변수 설정 때문에 오류
		System.out.println("--------------");
		
		// 19단 
		/*
		for ( int b =1 ; b<=19 ; b++)
		{
			for (int i = 1 ; i<=19 ; i++)
			System.out.println(b + " * " + i + " = " + (b * i));
			
		}
		
		
		for (int j =1 ; j <=100 ; j ++)
		{
			System.out.println(j);
			
		}
		*/
		int sum =0; 
		for( int i = 1; i<101; i++) {
			//sum = sum + i
			sum +=i; //sum에 게속해서 더한 값을 누적시킴 sum = sum + i
 		} 
		System.out.println("1부터 100의 누적합 : " + sum);
		sum =0;
		for( int i = 1; i<101; i+=2) { // i = 1 ,3 ,5 ,7 ,9 ,11 ....
			
			//sum = sum + i
			sum +=i;
		}
		System.out.println("1부터 100의 홀수 누적합 : " + sum);
		
	}
}
