package test1.함수;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExamProgram {
//문자를 베이스로
	public static void main(String[] args) throws IOException {

		
		FileInputStream fin = new FileInputStream("res/data.txt");
		Scanner sc = new Scanner(fin);

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
		
		int cnt = 0;
		for(int i = 0; nums[i] != -1; i++) 
			cnt++;

		int sum = 0;
		for(int i = 0; nums[i] != -1; i++) 
			sum += nums[i];

		double avg = 0;
		avg = (double)sum / cnt;

		System.out.printf("sum:%d", sum);
		System.out.printf("avg:%f", avg);

	}

}
