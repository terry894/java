package day1;
//������
//1.���������� : ++, -- 
public class OperEx1 {
	public static void main(String[] args) {
		int a = 100;
//		a = a+1; // 4���� �ܰ踦 �Ѵ�
		a--;// �ӵ��� �� ������ 
//	    a+=1;
		System.out.println("a:" + a); 
		
		int b = 10; // b�� 10 �Ҵ� 
		int c = 20;
		
		c = ++b; // b�� 1�����ϰ� c�� �Ҵ� , b++ b�� c�� �Ҵ�� ���� 1���� 
		System.out.println("b:"+b+"c:"+c); // b: 11 c: 11
	}

}
