package day5;

public class MethodEx9 {
	public static void main(String[] args) {
		System.out.println(Math.random()); 
		//random() random ���� ��ȯ���ִ� �Լ�
		int a = 10;
		int b = 20;
		int temp = 0;
		
		System.out.println("a:"+ a + ", b:" + b);
		
		temp = a;
		a = b;
		b =temp;// �ΰ��� �ڹٲٴ� ��� 
	}
}
