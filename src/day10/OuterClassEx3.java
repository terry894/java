package day10;

public class OuterClassEx3 {
	private int a = 10;// new�ؾ� �����ִ� ����
	static int b = 20; // �ܺο� �մ�Static������ ���ٰ���
	static final int C = 30;

	public void printAll() {
//		int k = 0; //��������	
	class LocalInnerClass {
			int d = 10;// new�ؾ� �����ִ� ����
//			static int e = 20; // �ܺο� �մ�Static������ ���ٰ���
			static final int F = 30;
			public void print() {
			    System.out.println(" a: " + a); 
				System.out.println(" b: " + b);// �̳�Ŭ������ �ƿ���Ŭ������ ���� ��밡��
				System.out.println(" c: " + C);
				System.out.println(" d: " + d);
              //System.out.println(" e: " + e);
				System.out.println(" f: " + F);

		}
	}
	//localinnerclass�� �޼��忡 ������������ �����Ҽ��մ�
	//��뵵 �ż��� ���������� ���
	LocalInnerClass lic = new LocalInnerClass();
	lic.print();
	}// printAll
	public static void main(String[] args) {
		OuterClassEx3 oce3 = new OuterClassEx3();
		oce3.printAll();
	}
	
}// outerclass
