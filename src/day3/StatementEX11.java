package day3;

import java.util.Scanner;//ctrl + shift + o : import�� �߰��ϰų� ���� �Ҽ��ִ�.

public class StatementEX11 {
	public static void main(String[] args) {
		// ����ڷκ��� �¾ ������ �Է¹޾� ��� ���� ���ߴ� ���α׷�
		
		
        // � �� ���� ���ߴ� ���α׷� �ۼ� 
		
		// 4 5 6  7 8  9 10  11 0 1 2 3
		// ��  ��  ��  ��  ��    ��    ��    ��   ��  ��  ��  ��
		// ��  ��  ȣ  ��  ��    ��    ��    ��   ��  ��  ��  ��
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int num = sc.nextInt(); // ������ �Է� �޴´� 
		int a = num%12;// �Է¹��� ���� 12�� ������ ������ ���� ���� a �� ����
		System.out.println(a); 
		
		switch(a){ //�Է¹��� ���� ���� �ش��ϴ� ������ ���
		   case 0:
		      System.out.println("��"); //�������� 0�̸� �� ���
		      break;
		   case 1:
			      System.out.println("��");//�������� 1�̸� �� ���
			      break;// �����ϰ� ���������� 
		   case 2:
			      System.out.println("��");//�������� 2�̸� �� ���
			      break;
		   case 3:
			      System.out.println("��");
			      break;
		   case 4:
			      System.out.println("��");
			      break;
		   case 5:
			      System.out.println("��");
			      break;
		   case 6:
			      System.out.println("ȣ");
			      break;
		   case 7:
			      System.out.println("��");
			      break;
		   case 8:
			      System.out.println("��");
			      break;
		   case 9:
			      System.out.println("��");
			      break;
		   case 10:
			      System.out.println("��");
			      break;
		   case 11:
			      System.out.println("��");
			      break;
			     
		
		   
		}
	}
}
