package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExamProgram {
//���ڸ� ���̽���
	//����ȭ: �ݺ��۾��� ���δ�, ������忡 �ִ� ���� ��� 
	//����: ������ (�����)�� �ٽþ��°�
	//���Ҿ�: ������� ����� ����
	//Ž�ٿ�: ��������� ����ä���
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
	
	//��ü�� �Ѿ�������� static�Լ� ��� �ν��Ͻ� �Լ�������..
	
	public static void main(String[] args) throws IOException {

		
		FileInputStream fin = new FileInputStream("res/data.txt");
		Scanner sc = new Scanner(fin);
// ����: �ڵ带 �ٽþ��°��� �ƴ϶� ����� ����ִ� �Լ��� ȣ�� 
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
//=========������ ����
		int cnt = 0;
		for(int i = 0; nums[i] != -1; i++) 
			cnt++;
//=========������ ��
		int sum = sum(nums);

//=======������ ��� 
		printSumAndAvg(sum,cnt); //�ּ���� �Լ������� �˾ƺ��� �ְ� �Լ����� ¥���Ѵ�.
	
	}
}
