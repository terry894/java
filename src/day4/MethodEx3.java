package day4;

public class MethodEx3 { // class s.

	static int add(int a, int b) { // method add s.
		// main method�� ���� ���� �ֱ� ���� void ��� ���� c�� �ڷ���
		int c = a + b; // 32��Ʈ ������ ���� c�� ����(a+b)�� �� ����
		return c; // main method�� ���� c�� ���� ���� ��.
	} // add e.

	static int add(int a, int b, int c) { // method add s.
		// �������� ����. but, �޼����� ���°� �޶�� ��.
		int d = a + b + c;
		return d;
	} // add e.

	static float add(int a, float b) { // float�� ��ȯ �Ѵ�. �޼ҵ� �����ε�
		float c = a + b; 
		return c;
	}

	static int sum(int a, int b, int c, int d) {
		int e = a + b + c + d;
		return e;
	}

	static float avg(int a, int b, int c, int d) {
		// int e = a+b+c+d;
		// float result = e/4.0f; // ��� 01
		float result = sum(a, b, c, d) / 4.0f; // ��� 02
		// ������ ��� �� ���� ���� ex)sum �Լ�
		return result;
	}

	static float avg2(int a, int b, int c, int d) { // ��ճ��� �׿� ���
		float e = sum(a, b, c, d) / 4.0f; // ��� 03
		// 4.0f, 4f �� �� ����??
		// float e = (a+b+c+d)/4.0f; // ��� 04
		return e;
	}

	public static void main(String[] args) { // main method s.
		int result1 = add(100, 200); // 100�� 200�� ���� ���� ���� result1�� �����Ͻÿ�.
		System.out.println(result1); // result1 �޽��� ���
		int result2 = add(100, 200, 300); // 100�� 200�� 300�� ���� ���� ����
		System.out.println(result2);
		float result3 = add(100, 200.0f);
		System.out.println(result3); // 

		int value = sum(100, 200, 300, 400); 
		float value2 = avg(100, 200, 300, 350);
		float value3 = avg2(100, 200, 300, 350);
		System.out.println("�հ� : " + value);
		System.out.println("��� : " + value2);
		System.out.println("��� : " + value3);

	}
}
