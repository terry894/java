package day4;

public class MethodEx4 {
	// 메서드 호출 방식
	// 1. call by name : printStar();
	// 2. call by Value : add(100,200);
	// 3. call by reference : arraySum(int[] m); 참조변수 주기
	static int arraySum(int[] a){
		
		System.out.println("arraySum 메서드 안쪽 a : "+a);
		System.out.println("a[2] : "+a[2]);
		a[2] = 100; // 배열 m의 세번째 값이 100으로 변경됨
		System.out.println("a[2] : " +a[2]);
	return 0;
	}
	
	public static void main(String[] args) {
		int[] m = { 10, 20, 30, 40 };
		System.out.println("메인 메서드에서 m : "+m); //배열 변수의 주소값이 출력
		
		System.out.println("m[2] : "+m[2]); // 30이 출력됨
		
		arraySum(m);//call by reference 로 호출 
		
		System.out.println("메서드 호출 후 m[2] : "+m[2]); // 100으로 출력됨 
//		int sum = m[0] + m[1] + m[2] + m[3];
//		float avg = sum / 4.0f;

//		System.out.println("배열의 합계 : " + sum);
//		System.out.println("배열의 평균 : " + avg);
	}
//		배열의 합계 : 100
//		배열의 평균 : 25.0
}


