package day1;

public class VarEx2 {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		int c = b1 + b2 ; //�ڷ����� ������ �ִ� �����Ͱ� ��ġ�� �����÷ο� �߻� ���� �� ū �ڷ����� ��ƾ� �Ѵ�.
		System.out.println(b1 + b2); // ��� �� 30
		System.out.println("-----");
		int a = 100;
		long b = 20011111111L; //long�� ������ 1233Ló�� long������� ����
		//����ȯ (�ڷ���) 
		int k =(int)(a + b); //ū �ڷ����� ���� �ڷ����� ������ �����÷ο� �߻� 
		//������ ����ȯ�ϸ� ©���� ������ ���� ��� �����Ͱ� ����
	}
}
