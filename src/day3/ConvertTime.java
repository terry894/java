package day3;

import java.util.Scanner;

public class ConvertTime {
	public static void main(String[] args) {
		//사용자가 입력한 값을 (초) 을 시간단위로 환산 하는 코드 작성 
		// 몇초? 32615
		
		//3일 2시간 25분 32초 결과 출력 

		
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요:");  // 초 입력
		int time = sc.nextInt(); 
		int day = time/(60 * 60 *24); // 전체 시간을 일로 나누면 몫이 일
		int hour = time%(60*60*24)/(60*60); // 일로 나누고 나머지를 시간으로 나누면 시간
		int minute = time%3600/60; // 3600으로 나누고 나머지 값은 시간을 제외한 분까지의 초가 된다 거기에서 60초를 나누면 분   
		int second = time%60; // 분으로 나누고 나머지는 초
		/*int a = num/day;
		int b = (num-a*day)/hour ;
		int c = (num-(a*day + b*hour))/minute;
		int d = num-(a*day + b*hour + c*minute);
		*/

		if(day != 0)System.out.print(day +"일"); //if문은 해당 변수에 값이 없을때 표시 되지 않도록 한다 .
		if(day != 0)System.out.print(hour +"시");
		if(day != 0)System.out.print(minute +"분");
		if(day != 0)System.out.print(second +"초");

		
		
	}

}
