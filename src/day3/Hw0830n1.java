package day3;
//�ڹ��� ���� �ü���ʹ� ������� �����ڵ�� ���� ����� �ҷ���
// ex) Hello.class ������ �ٸ� �ü������ ���� ���� 
// �������Ϸ��� hello.class ������ �ҽ��� �̾Ƴ������� 
import java.util.Scanner;

public class Hw0830n1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��?");
		int input = sc.nextInt();

		int a = input / 50000;
		int b = input % 50000/10000;
		int c = input % 10000/ 5000;
		int d = input % 5000/1000;
		int e = input % 1000/500;
		int f = input % 500/100;
		int g = input % 100/50;
 		int h = input % 50/10;

		System.out.println("50000����" + a);
		System.out.println("10000����" + b);
		System.out.println("5000����" + c);
		System.out.println("1000����" + d);
		System.out.println("500����" + e);
		System.out.println("100����" + f);
		System.out.println("50����" + g);
		System.out.println("10����" + h);
    
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
