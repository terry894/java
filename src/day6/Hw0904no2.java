package day6;

import java.util.Scanner;

public class Hw0904no2 {
	public static void main(String[] args) {
		int[] a = new int[3];
		int scount = 0;
		int bcount = 0;
		int del = 0;
		int count = 0;
		int arr = 1;
        
		//추출 할 수 중복제거
		while (arr != 2) {
			for (int i = 0; i < a.length; i++) {
				a[i] = (int) (Math.random() * 10);
			}
			if (a[0] != a[1] && a[1] != a[2] && a[0] != a[2]) {
				arr += 1;
			}
		}
		
		//야구게임 
		Scanner sc = new Scanner(System.in);
		while (scount != 3) {

			System.out.println("세자리 수를 입력하세요");
			int b = sc.nextInt();// . = heap에 있는 메소드 불러오기 
			scount = 0;
			bcount = 0;

			for (int j = 0; j < a.length; j++) {
				if (a[j] == b / 100 || a[j] == b % 100 / 10 || a[j] == b % 10) {
					bcount++;
				}
			}
			if (a[0] == b / 100) {
				scount++;}
			if (a[1] == b % 100 / 10) {
				scount++;}
			if (a[2] == b % 10) {
				scount++;}
			del = bcount - scount;
			System.out.println("볼:" + del + "스트라이크:" + scount);
			count++;
		}
		System.out.println(count + "회만에 맞췄습니다.");
	}
}
