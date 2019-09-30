package day2;

import java.util.Scanner;

public class StatementEx9 {
	public static void main(String[] args)  {
    //1. 사용자로 부터 성적을 입력받는다.
	//2. 이 값을 판단하여 메세지를 출력한다.
	System.out.print("성적입력:");
//	int score = System.in.read(); 구형방법
	Scanner sc = new Scanner(System.in);
	int score = sc.nextInt();// 사용자로부터 값 입력받기
	
	System.out.println("성적:" + score);
	if(score>=90) //score가 90점이상일때 
	{
		System.out.println("A학점");
	}
	else if(score>=80) //score가 80점 이상일때
	{
		System.out.println("B학점");	
	}
	else if(score>=70) // score가 70점 이상일때
	{
		System.out.println("C학점");
	}
	else if(score>=60)// score가 60점 이상일때
	{
		System.out.println("D학점");
	}
	else // 그외의 경우 일때
	{
		System.out.println("f학점");
	}
	
	}
}
