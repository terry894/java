package day3;
//자바의 장점 운영체제와는 상관없이 같은코드로 같은 결과를 불러옴
// ex) Hello.class 가지고도 다른 운영체제에서 실행 가능 
// 디컴파일러로 hello.class 에서도 소스를 뽑아낼수있음 
import java.util.Scanner;

public class Hw0830n1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마?");
		int input = sc.nextInt();

		int a = input / 50000;
		int b = input % 50000/10000;
		int c = input % 10000/ 5000;
		int d = input % 5000/1000;
		int e = input % 1000/500;
		int f = input % 500/100;
		int g = input % 100/50;
 		int h = input % 50/10;

		System.out.println("50000원권" + a);
		System.out.println("10000원권" + b);
		System.out.println("5000원권" + c);
		System.out.println("1000원권" + d);
		System.out.println("500원권" + e);
		System.out.println("100원권" + f);
		System.out.println("50원권" + g);
		System.out.println("10원권" + h);
    
		int i =0;
		int num = 100000;
		int check = 1;
		while (num > 10) {
			if (check == 1) {
				num = num / 2;
				check = 0;
			} else {
				num = num / 5;
				check = 1;
			}
			i = input / num;
			System.out.println(i);
			input = input - i*num;
		}
	}
}
