package day1;
//�ش� ���� Ŭ���� f2������ �̸� ���� ����
public class VarEx1 {
	public static void main(String[] args) {
		//����
		//�ڷ��� ������
		byte b = -128; //127������ ����  -128 ~ 127 ���� ǥ�� -128 = 10000000 ���� 0 ��� ���ڸ���
		long m = 200L; // L �� long�� ǥ�� 
		//�ε��Ҽ���- �����̴� �Ҽ��� float:���� ���ƴٴϴ�
		//�Ǽ��� - float, double 
		//�ƽ�Ű - 0 - 48 , A - 65 , a - 97 ������ �˾Ƶ���
		//������ - char - 2byte ���� ��� 
		//�ڷ��� ������ = ���(�׻� ������ ��)
		float f1 = 3.141592f; // f�� float�� ǥ��
		double d1 = 1.231212;
	    System.out.println("b : " + b ); 
	    System.out.println("f1 : " + f1);
	    System.out.println("d1 : " + d1);
		b = 10; // = �Ҵ� ������ 
		System.out.println(b);
		b= 11; 
		System.out.println(b);
		
		int c; 
		c = 100;
		System.out.println(c);
		
		//������ �����ϸ鼭 ���� ���� - �ʱ�ȭ
		//int c = 100;
		
		short k = 30; // 16bite �ڷ��� ���� k �� 30 �� �Ҵ�  
		System.out.println(k); 
		 
		byte b1 = 10;  
		byte b2 = 20;
		System.out.println(b1 + b2); 
		
	}
}
