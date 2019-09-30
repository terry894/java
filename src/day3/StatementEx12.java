package day3;

import java.util.Scanner;

//입력한 값이 3의 배수인지 아닌지 확인
public class StatementEx12 {
	public static void main(String[] args) {
		// 사용자로부터 숫자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요:");
		int num = sc.nextInt();//수를 입력받는다

		// 3의 배수인지 아닌지를 판정해서 문자를 출력
		if (num % 3 == 0) { // 3으로 나눴을 때 나머지가 0이라면 
			System.out.println(num+"3의 배수 입니다"); // 이부분 출력
		} else {
			System.out.println(num+"3의 배수가 아닙니다"); // 그렇지 않을 경우 이부분 출력 
		}
	}
}
