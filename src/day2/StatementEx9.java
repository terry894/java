package day2;

import java.util.Scanner;

public class StatementEx9 {
	public static void main(String[] args)  {
    //1. ����ڷ� ���� ������ �Է¹޴´�.
	//2. �� ���� �Ǵ��Ͽ� �޼����� ����Ѵ�.
	System.out.print("�����Է�:");
//	int score = System.in.read(); �������
	Scanner sc = new Scanner(System.in);
	int score = sc.nextInt();// ����ڷκ��� �� �Է¹ޱ�
	
	System.out.println("����:" + score);
	if(score>=90) //score�� 90���̻��϶� 
	{
		System.out.println("A����");
	}
	else if(score>=80) //score�� 80�� �̻��϶�
	{
		System.out.println("B����");	
	}
	else if(score>=70) // score�� 70�� �̻��϶�
	{
		System.out.println("C����");
	}
	else if(score>=60)// score�� 60�� �̻��϶�
	{
		System.out.println("D����");
	}
	else // �׿��� ��� �϶�
	{
		System.out.println("f����");
	}
	
	}
}
