package day4;

public class MethodEx1 {
	// printStar() : method, (function)
	static void printStar(int count) { // ������ �ƴ� �ڵ忡 �̸� �ֱ�
		// parameter, argument, ����
		// �����ų �� �������� ���� �� ������ �Ҵ�Ǿ� �ִ�.
		System.out.println("�Ű����� count : " + count);
		for (int j = 1; j <= count; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			} // for 1 e.
			System.out.println();
		} // for 2 e.
	} // Star e.

	static void printGuGuDan(int dan) { // GuGuDan s.

		System.out.println("������ " + dan + "�� ���");
		// int dan = 7;
		for (int j = 1; j <= 9; j++) { // for s.
			System.out.println(dan + " * " + j + " = " + (dan * j));
		} // for e.
	} // GuGuDan e.

	public static void main (String[] args) {
// �����
		printStar(3);
		printStar(5);
		printStar(7);

		// ������ 2�� ��� : ������ ���
		System.out.println("������ 2�� ���");
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + (2 * i));
		}
		System.out.println("---------------");
// ������ ��� : �Ű� ���� ���
		printGuGuDan(1);
	}

}

