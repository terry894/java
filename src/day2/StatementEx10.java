package day2;

import java.util.Scanner;

public class StatementEx10 {
	public static void main(String[] args) {
		System.out.print("성적입력:");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		System.out.println("성적:" + score);
		
		switch(score/10) {//score변수 가  해당 case문에 맞는다면 해당하는 각 case문 실행
		case 10: // break를 사용하지 않고 case 9 와 동일 하게 처리 
		case 9: //score/10 을 했기때문에 90점대에 해당 
			System.out.println("A학점"); 
			break;
		case 8://score/ 10 을 했기때문에 80점대에 해당 
			System.out.println("B학점");
		    break;
		case 7:	
			System.out.println("C학점"); 
		    break;
		case 6:
			System.out.println("D학점"); 
		    break;
		default:
			System.out.println("F학점"); 
		    break;
	
		   
		}
		
	}//main

}//class
