package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExamProgram {
//문자를 베이스로
	//집중화: 반복작업을 줄인다, 같은토드에 있는 것을 사용 
	//재사용: 번역된 (결과물)을 다시쓰는것
	//바텀업: 내용부터 만들고 목차
	//탐다운: 목차만들고 내용채우기
	public static void printSumAndAvg(int sum,int cnt) {
		double avg = 0;
		avg = (double)sum / cnt;
		System.out.printf("avg:%f",avg);
		System.out.printf("sum:%d", sum);
	}
	static int sum(int[] nums)
	{
		int sum = 0;
		for(int i = 0; nums[i] != -1; i++) 
			sum += nums[i];
		return sum;
	}
	
	//객체로 넘어가기전까진 static함수 사용 인스턴스 함수전까진..
	
	public static void main(String[] args) throws IOException {

		
		FileInputStream fin = new FileInputStream("res/data.txt");
		Scanner sc = new Scanner(fin);
// 재사용: 코드를 다시쓰는것이 아니라 결과가 들어있는 함수를 호출 
		int[] nums = new int[100];
//		int i = 0;
//		while(sc.hasNext()) {
//			nums[i] = sc.nextInt();
//			i++;
//		}

		for (int i = 0; sc.hasNext(); i++) {
			nums[i] = sc.nextInt();
			nums[i+1] = -1;
		}
		fin.close();
//=========데이터 개수
		int cnt = 0;
		for(int i = 0; nums[i] != -1; i++) 
			cnt++;
//=========데이터 합
		int sum = sum(nums);

//=======데이터 평균 
		printSumAndAvg(sum,cnt); //주석대신 함수명으로 알아볼수 있게 함수명을 짜야한다.
	
	}
}
