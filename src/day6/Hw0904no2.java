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
        
		//���� �� �� �ߺ�����
		while (arr != 2) {
			for (int i = 0; i < a.length; i++) {
				a[i] = (int) (Math.random() * 10);
			}
			if (a[0] != a[1] && a[1] != a[2] && a[0] != a[2]) {
				arr += 1;
			}
		}
		
		//�߱����� 
		Scanner sc = new Scanner(System.in);
		while (scount != 3) {

			System.out.println("���ڸ� ���� �Է��ϼ���");
			int b = sc.nextInt();// . = heap�� �ִ� �޼ҵ� �ҷ����� 
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
			System.out.println("��:" + del + "��Ʈ����ũ:" + scount);
			count++;
		}
		System.out.println(count + "ȸ���� ������ϴ�.");
	}
}
