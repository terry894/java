package day3;

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		// ���Ǳ�

		// 1. ����� 2. �ѵѴٹ�Ŀ�� 3.���� 4.���� 5.���̴�

		System.out.println("----------------");
		System.out.println("�Ծ�� ���Ǳ�");
		System.out.println("----------------");
		System.out.println("�޴�");
		System.out.println("1. �����  2. �ѵ� �ٹ� Ŀ��  3. ����");
		System.out.println("2,000��          500��                   1,200��");
		System.out.println("4. ����     5. ���̴�");
		System.out.println("1,000��          900��");

		System.out.println("----------------");
		// 2. ����ڷκ��� ���� �Է¹޴´�

		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ���:");
		int money = sc.nextInt(); // �ݾ��� �Է¹޴´�
		System.out.println(money);

		// 3. ����ڰ� �޴��� �����Ѵ�.

		System.out.print("�޴��� �����ϼ���:");
		int menu = sc.nextInt(); //�޴��� �Է� �޴´�
		System.out.println(menu);

		// 4. ������ �����Ѵ�.

		System.out.print("������ �Է��ϼ���:");
		int num = sc.nextInt(); // ������ �Է¹޴´�
		System.out.println(num);

		int choice = 0; //�ش� �ϴ� �޴��� �ݾ��� �� ���� ���� 
		int total = 0; // �ش��ϴ� �޴��� ������ ���� �� ���� ���� 
		String name = "";
		switch (menu) {
		case 1:
			name = "�����";
			choice = 2000; // �ش��ϴ� �޴��� �ݾ��� ���� choice�ȿ� ����
			break;
		case 2:
			name = "�ѵ� �ٹ�Ŀ��";
			choice = 500;
			break;
		case 3:
			name = "����";
			choice = 1200;
			break;
		case 4:
			name = "����";
			choice = 1000;
			break;
		case 5:
			name = "���̴�";
			choice = 900;
			break;

		}
		total = choice * num; //��ü�ݾ��� ������ �޴��� �ݾ� * ���� 
		System.out.println("total:" + total); // ��ü �ݾ� ��� 

		// 5. �ܾ��� ����ϴٸ� 6�� ���� �ϸ� 7
		System.out.println("----------------");
		if (money >= total) { // 6. ������ ���Ḧ �����Ѵ�. ������ �޴��� ��ü �ݾ��� �Է��� �ݾ׺��� ������
			System.out.println("�ֹ��Ͻ� ���ᰡ ���Խ��ϴ�");
			System.out.println(name + ": " + num);
		} else { // �ܾ��� �����ϸ� 7�� 
			System.out.println("�ܾ��� �����մϴ�");
			System.out.println("�ٽ� �̿��� �ּ���");
		}

		// 8. �ܵ��� ��ȯ�Ѵ�.
		System.out.println("----------------");
		int remoney;
		remoney = money - total;
		System.out.println("�ܵ��� ��ȯ �մϴ�");
		System.out.println(remoney);

	}
}
