package day3;

import java.util.Scanner;

//�Է��� ���� 3�� ������� �ƴ��� Ȯ��
public class StatementEx12 {
	public static void main(String[] args) {
		// ����ڷκ��� ���ڸ� �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���:");
		int num = sc.nextInt();//���� �Է¹޴´�

		// 3�� ������� �ƴ����� �����ؼ� ���ڸ� ���
		if (num % 3 == 0) { // 3���� ������ �� �������� 0�̶�� 
			System.out.println(num+"3�� ��� �Դϴ�"); // �̺κ� ���
		} else {
			System.out.println(num+"3�� ����� �ƴմϴ�"); // �׷��� ���� ��� �̺κ� ��� 
		}
	}
}
