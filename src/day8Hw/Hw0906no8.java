package day8Hw;

import java.util.Scanner;

public class Hw0906no8 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("주민번호 입력:? ");
		String number = num.next();
//		System.out.println(number);
		
		System.out.print(number.substring(0, 2)+"년 "+number.substring(2, 4)+"월 "+number.substring(4, 6)+"일 "+"  ");
		char[] ch = number.toCharArray();
		if(ch[6] == '1' || ch[6] == '3')
		{
			System.out.println("남성이시네요");
		}
		else if(ch[6] == '2' || ch[6] == '4')
		{
			System.out.println("여성이시네요");
		}
		System.out.println();
		
		
		
	}
}
