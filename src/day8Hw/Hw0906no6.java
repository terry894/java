package day8Hw;

public class Hw0906no6 {
	public static void main(String[] args) {

		Object str2 = new Object();
		String str = new String("java");
		String str1 = new String("java"); 

		if (str.equals(str1)) { 
			// String Ŭ�������� �������̵� �ϱ⶧���� objectŬ������ equals�޼���� ���̰� �ִ�
			//str ���������� ����� str1 ���������� ������ ���Ѵ�
			System.out.println("�����ѳ���");
		} else {
			System.out.println("�ٸ� ����");
		}
		
		System.out.println(str.toString());
		//�Ұ�� str�� �ּҰ��� ���;� ������ 
		//toString()�޼��带 �̿��ؼ� ���� "java" ���
		//object Ŭ�������� �������̵� �Ͽ� ����ߴ�.
		System.out.println(str2.toString());


	}
}
