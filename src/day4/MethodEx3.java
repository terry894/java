package day4;

public class MethodEx3 { // class s.

	static int add(int a, int b) { // method add s.
		// main method에 값을 돌려 주기 위해 void 대신 변수 c의 자료형
		int c = a + b; // 32비트 정수형 변수 c에 변수(a+b)의 값 대입
		return c; // main method에 변수 c의 값을 돌려 줌.
	} // add e.

	static int add(int a, int b, int c) { // method add s.
		// 동명이인 가능. but, 메서드의 형태가 달라야 함.
		int d = a + b + c;
		return d;
	} // add e.

	static float add(int a, float b) { // float로 반환 한다. 메소드 오버로딩
		float c = a + b; 
		return c;
	}

	static int sum(int a, int b, int c, int d) {
		int e = a + b + c + d;
		return e;
	}

	static float avg(int a, int b, int c, int d) {
		// int e = a+b+c+d;
		// float result = e/4.0f; // 방법 01
		float result = sum(a, b, c, d) / 4.0f; // 방법 02
		// 위에서 썼던 거 재사용 가능 ex)sum 함수
		return result;
	}

	static float avg2(int a, int b, int c, int d) { // 평균내기 그외 방식
		float e = sum(a, b, c, d) / 4.0f; // 방법 03
		// 4.0f, 4f 둘 다 가능??
		// float e = (a+b+c+d)/4.0f; // 방법 04
		return e;
	}

	public static void main(String[] args) { // main method s.
		int result1 = add(100, 200); // 100과 200을 더한 값을 변수 result1에 대입하시오.
		System.out.println(result1); // result1 메시지 출력
		int result2 = add(100, 200, 300); // 100과 200과 300을 더한 값을 변수
		System.out.println(result2);
		float result3 = add(100, 200.0f);
		System.out.println(result3); // 

		int value = sum(100, 200, 300, 400); 
		float value2 = avg(100, 200, 300, 350);
		float value3 = avg2(100, 200, 300, 350);
		System.out.println("합계 : " + value);
		System.out.println("평균 : " + value2);
		System.out.println("평균 : " + value3);

	}
}
