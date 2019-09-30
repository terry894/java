package day4;

public class MethodEx2 { // class s.

	static void max(int a, int b) { // parameter max s.
		System.out.println("a : " + a); // "a : a"
		System.out.println("b : " + b); // "b : b"
		int bigNumber = 0; // 32bit 정수형 변수 bigNumber에 상수 0 대입
		if (a >= b)
			bigNumber = a; // 한 줄이라 {} 생략
		// 만약 a가 b보다 크다면 bigNumber에 변수 a을 대입
		else
			bigNumber = b;
		// 그 외에 경우에는 bigNumber에 변수 b를 대입
		System.out.println("큰 수 :" + bigNumber);
		// "큰 수 : (대입된)bigNumber"
	} // max e.

	static void min(int a, int b) { // parameter min s.
		System.out.println("a : " + a);
		System.out.println("b : " + b);
//		int smallNumber = 0;
//		if (a <= b)
//			smallNumber = a;
//		else
//			smallNumber = b;
//		System.out.println("작은 수 : " + smallNumber);
		System.out.println("작은 수 : " + ((a <= b) ? a : b)); // 삼황 연산자로 대체 가능.
	} // min e.

	static int hap(int a, int b) {
		// void 대신에 리턴할 값의 자료형을 쓴다 (자료형 : int, float, char, boolean 등) (자료형이 없다면 void)
		int c = a + b;
		System.out.println("합 : " + c);
		// return : 현재 작업을 중단하고 이 값을 메인 메서드에게 전달시킨다.
		return c;
	} // hap e.

	static int minus(int a, int b) { // parameter minus s.
		// void 대신에 return c의 자료형값 대입
		int c = a - b; // 32bit 상수형 변수 c에 (a-b)의 값 대입
		System.out.println("빼기 : " + c); // "빼기 : c(a-b)"
		return c; // 변수 c의 값을 메인 메서드에게 전달 시킴
	}

	public static void main(String[] args) { // main method s.
		// "큰 수 : 200" 구하기 - parameter 방식
		max(100, 200);

		System.out.println();
		System.out.println("---------");
		System.out.println();
		// 단 구별
		// 작은 수 : 200 구하기 - parameter 방식
		min(200, 300);

		System.out.println();
		System.out.println("---------");
		System.out.println();
		// 단 구별
		// 100과 200 더한 값 구하기 - 기존 방식
		hap(100, 200);
		System.out.println("---------"); // 단 구별
		// 100과 200 더한 값 - parameter 방식
		int result = hap(100, 200);
		// parameter 방식으로 구한 값을 새로운 함수에 대입시키기
		System.out.println("result : " + result);
		// 300-50의 값 구하기
		int result2 = minus(300, 50);
		System.out.println("result2 : " + result2);
		// 위에서 void 대신에 자료형을 넣지 않는다면 이 수식은 작동하지 않는다. 오류가 난다.
		
		
		// 메서드의 형식 & 메서드의 구분 : 메서드 시그니쳐 / 메서드 바디
		// static 리턴값의 자료형 메서드명 (자료형 매개변수명, 자료형 매개변수명, ...) //(메서드 시그니쳐 부분) {
		// return 값
		// } //(메서드 바디 부분)
	}
}
