package day2;

import java.util.Scanner;

public class Hw0829no12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("����?");
	int num = sc.nextInt();
	
	for(int i = 1 ; i <= num; i++)
	{
		for (int j =1 ; j<=i ; j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
