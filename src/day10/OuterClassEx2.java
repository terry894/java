package day10;

public class OuterClassEx2 {
	private int a = 10;// new�ؾ� �����ִ� ����
	static int b = 20; // �ܺο� �մ�Static������ ���ٰ���
	static final int C = 30;

//static ������ ���� ��ġ static
//Outer Class�� new���� �ʾƵ� ������밡��
//OuterClass�� new �ؾ� �����ִ� ������ ����X ex)a
//new �ؾ� �����ִ� ���� = �ν��Ͻ����� 
	static class InnerClass2 {

		int d = 40;
		// new �� �����Ҽ����� ������ heap ��ü�� �ö��� �ʰ� ���� inner���� ������ static������ ���������.
		// static int e =50; �̳ʷ����� static������ ���������� ����������.
		static final int F = 60; // final ���� = ���

		public void print() {
//		System.out.println(" a: " + a); 
			System.out.println(" b: " + b);// �̳�Ŭ������ �ƿ���Ŭ������ ���� ��밡��
			System.out.println(" c: " + C);
			System.out.println(" d: " + d);
//		System.out.println(" e: " + e);
			System.out.println(" f: " + F);

		}

		public static void main(String[] args) {
			InnerClass2 ic2 = new InnerClass2();
			ic2.print();
		}

	}
}
