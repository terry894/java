package day4;

public class MethodEx4 {
	// �޼��� ȣ�� ���
	// 1. call by name : printStar();
	// 2. call by Value : add(100,200);
	// 3. call by reference : arraySum(int[] m); �������� �ֱ�
	static int arraySum(int[] a){
		
		System.out.println("arraySum �޼��� ���� a : "+a);
		System.out.println("a[2] : "+a[2]);
		a[2] = 100; // �迭 m�� ����° ���� 100���� �����
		System.out.println("a[2] : " +a[2]);
	return 0;
	}
	
	public static void main(String[] args) {
		int[] m = { 10, 20, 30, 40 };
		System.out.println("���� �޼��忡�� m : "+m); //�迭 ������ �ּҰ��� ���
		
		System.out.println("m[2] : "+m[2]); // 30�� ��µ�
		
		arraySum(m);//call by reference �� ȣ�� 
		
		System.out.println("�޼��� ȣ�� �� m[2] : "+m[2]); // 100���� ��µ� 
//		int sum = m[0] + m[1] + m[2] + m[3];
//		float avg = sum / 4.0f;

//		System.out.println("�迭�� �հ� : " + sum);
//		System.out.println("�迭�� ��� : " + avg);
	}
//		�迭�� �հ� : 100
//		�迭�� ��� : 25.0
}


