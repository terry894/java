package day4;

public class MethodEx2 { // class s.

	static void max(int a, int b) { // parameter max s.
		System.out.println("a : " + a); // "a : a"
		System.out.println("b : " + b); // "b : b"
		int bigNumber = 0; // 32bit ������ ���� bigNumber�� ��� 0 ����
		if (a >= b)
			bigNumber = a; // �� ���̶� {} ����
		// ���� a�� b���� ũ�ٸ� bigNumber�� ���� a�� ����
		else
			bigNumber = b;
		// �� �ܿ� ��쿡�� bigNumber�� ���� b�� ����
		System.out.println("ū �� :" + bigNumber);
		// "ū �� : (���Ե�)bigNumber"
	} // max e.

	static void min(int a, int b) { // parameter min s.
		System.out.println("a : " + a);
		System.out.println("b : " + b);
//		int smallNumber = 0;
//		if (a <= b)
//			smallNumber = a;
//		else
//			smallNumber = b;
//		System.out.println("���� �� : " + smallNumber);
		System.out.println("���� �� : " + ((a <= b) ? a : b)); // ��Ȳ �����ڷ� ��ü ����.
	} // min e.

	static int hap(int a, int b) {
		// void ��ſ� ������ ���� �ڷ����� ���� (�ڷ��� : int, float, char, boolean ��) (�ڷ����� ���ٸ� void)
		int c = a + b;
		System.out.println("�� : " + c);
		// return : ���� �۾��� �ߴ��ϰ� �� ���� ���� �޼��忡�� ���޽�Ų��.
		return c;
	} // hap e.

	static int minus(int a, int b) { // parameter minus s.
		// void ��ſ� return c�� �ڷ����� ����
		int c = a - b; // 32bit ����� ���� c�� (a-b)�� �� ����
		System.out.println("���� : " + c); // "���� : c(a-b)"
		return c; // ���� c�� ���� ���� �޼��忡�� ���� ��Ŵ
	}

	public static void main(String[] args) { // main method s.
		// "ū �� : 200" ���ϱ� - parameter ���
		max(100, 200);

		System.out.println();
		System.out.println("---------");
		System.out.println();
		// �� ����
		// ���� �� : 200 ���ϱ� - parameter ���
		min(200, 300);

		System.out.println();
		System.out.println("---------");
		System.out.println();
		// �� ����
		// 100�� 200 ���� �� ���ϱ� - ���� ���
		hap(100, 200);
		System.out.println("---------"); // �� ����
		// 100�� 200 ���� �� - parameter ���
		int result = hap(100, 200);
		// parameter ������� ���� ���� ���ο� �Լ��� ���Խ�Ű��
		System.out.println("result : " + result);
		// 300-50�� �� ���ϱ�
		int result2 = minus(300, 50);
		System.out.println("result2 : " + result2);
		// ������ void ��ſ� �ڷ����� ���� �ʴ´ٸ� �� ������ �۵����� �ʴ´�. ������ ����.
		
		
		// �޼����� ���� & �޼����� ���� : �޼��� �ñ״��� / �޼��� �ٵ�
		// static ���ϰ��� �ڷ��� �޼���� (�ڷ��� �Ű�������, �ڷ��� �Ű�������, ...) //(�޼��� �ñ״��� �κ�) {
		// return ��
		// } //(�޼��� �ٵ� �κ�)
	}
}
