package day2;

import java.util.Scanner;

public class Hw0830No11 {
	public static void main(String[] args) {

		//����ڷκ��� ���� �Է¹޴� ��� 2����
		//1. System.in.read() :ASCII
		//2. Scanner sc = new Scanner(System.in) :����
		//
		Scanner sc = new Scanner(System.in);
		int LineNum = sc.nextInt();
		String str = "";
		
		for (int i = 1; i <= LineNum; i++) {
			str += "*";// str= str + "*"
			System.out.println(str);
		}
	}
}
