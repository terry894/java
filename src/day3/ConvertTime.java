package day3;

import java.util.Scanner;

public class ConvertTime {
	public static void main(String[] args) {
		//����ڰ� �Է��� ���� (��) �� �ð������� ȯ�� �ϴ� �ڵ� �ۼ� 
		// ����? 32615
		
		//3�� 2�ð� 25�� 32�� ��� ��� 

		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ʸ� �Է��ϼ���:");  // �� �Է�
		int time = sc.nextInt(); 
		int day = time/(60 * 60 *24); // ��ü �ð��� �Ϸ� ������ ���� ��
		int hour = time%(60*60*24)/(60*60); // �Ϸ� ������ �������� �ð����� ������ �ð�
		int minute = time%3600/60; // 3600���� ������ ������ ���� �ð��� ������ �б����� �ʰ� �ȴ� �ű⿡�� 60�ʸ� ������ ��   
		int second = time%60; // ������ ������ �������� ��
		/*int a = num/day;
		int b = (num-a*day)/hour ;
		int c = (num-(a*day + b*hour))/minute;
		int d = num-(a*day + b*hour + c*minute);
		*/

		if(day != 0)System.out.print(day +"��"); //if���� �ش� ������ ���� ������ ǥ�� ���� �ʵ��� �Ѵ� .
		if(day != 0)System.out.print(hour +"��");
		if(day != 0)System.out.print(minute +"��");
		if(day != 0)System.out.print(second +"��");

		
		
	}

}
