package day2;

import java.util.Scanner;

public class StatementEx10 {
	public static void main(String[] args) {
		System.out.print("�����Է�:");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		System.out.println("����:" + score);
		
		switch(score/10) {//score���� ��  �ش� case���� �´´ٸ� �ش��ϴ� �� case�� ����
		case 10: // break�� ������� �ʰ� case 9 �� ���� �ϰ� ó�� 
		case 9: //score/10 �� �߱⶧���� 90���뿡 �ش� 
			System.out.println("A����"); 
			break;
		case 8://score/ 10 �� �߱⶧���� 80���뿡 �ش� 
			System.out.println("B����");
		    break;
		case 7:	
			System.out.println("C����"); 
		    break;
		case 6:
			System.out.println("D����"); 
		    break;
		default:
			System.out.println("F����"); 
		    break;
	
		   
		}
		
	}//main

}//class
