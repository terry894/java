package day3;

import java.util.Scanner;

public class Hw0830no4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���: ");
		int year = sc.nextInt();
		if (year%400 == 0 )
		{
			System.out.println("�����Դϴ�.");
		}
		else if ( year%400 != 0 && year%100 ==0)
		{
			System.out.println("������ �ƴմϴ�.");
		}
		else if (year%100%4 == 0 )
		{
			System.out.println("�����Դϴ�.");
		}
		else
			System.out.println("������ �ƴմϴ�.");
	}
}
