package day8Hw;

import java.util.Scanner;

public class Hw0906no8 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("�ֹι�ȣ �Է�:? ");
		String number = num.next();
//		System.out.println(number);
		
		System.out.print(number.substring(0, 2)+"�� "+number.substring(2, 4)+"�� "+number.substring(4, 6)+"�� "+"  ");
		char[] ch = number.toCharArray();
		if(ch[6] == '1' || ch[6] == '3')
		{
			System.out.println("�����̽ó׿�");
		}
		else if(ch[6] == '2' || ch[6] == '4')
		{
			System.out.println("�����̽ó׿�");
		}
		System.out.println();
		
		
		
	}
}
