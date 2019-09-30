package day4;

public class MethodEx1 {
	// printStar() : method, (function)
	static void printStar(int count) { // 변수가 아닌 코드에 이름 주기
		// parameter, argument, 인자
		// 실행시킬 때 전달해준 값이 이 변수에 할당되어 있다.
		System.out.println("매개변수 count : " + count);
		for (int j = 1; j <= count; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			} // for 1 e.
			System.out.println();
		} // for 2 e.
	} // Star e.

	static void printGuGuDan(int dan) { // GuGuDan s.

		System.out.println("구구단 " + dan + "단 출력");
		// int dan = 7;
		for (int j = 1; j <= 9; j++) { // for s.
			System.out.println(dan + " * " + j + " = " + (dan * j));
		} // for e.
	} // GuGuDan e.

	public static void main (String[] args) {
// 별찍기
		printStar(3);
		printStar(5);
		printStar(7);

		// 구구단 2단 출력 : 기존의 방식
		System.out.println("구구단 2단 출력");
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + (2 * i));
		}
		System.out.println("---------------");
// 구구단 출력 : 매개 변수 방식
		printGuGuDan(1);
	}

}

