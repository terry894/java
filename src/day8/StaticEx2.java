package day8;

public class StaticEx2 {
	int a = 10;
	static int b = 20;

	static {//static ���
		int c = 30;
		System.out.println("static block: " + c);
	}
	StaticEx2() {
		System.out.println("�⺻������");
	}
	static void print() {
		System.out.println("b:" + b);
	}
	//Ŭ������ ������ static�޸𸮿� ����ƽ ��� �̶� ���� �޼��� ���´�

}
