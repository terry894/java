package day4;
//�޼ҵ� �����ε�  (�����ε� - ��������) 
//�̸��� ������ Ÿ���̳� ���� �ٸ����� �����ε� �̴�.
//add(100);
//add(100, 200);
//add(100, 300.0f, 200);
//���»���� �ڷ����� �Ű澲�� ���� ���ϴ� ��� ����ϱ� ���� ex)println()
public class MethodEx7 {
	static int arraySum(int[] m) // ���������� �ٸ� �޸� ������ ���� ������ �̸��� ���� �ص��ȴ�.
	//�迭�� ���޹����� �Ű������� int[] ó�� �迭�� �����ؾߵ� 
	{
		int sum =0 ; 
		for (int i = 0; i < m.length; i++) {
			sum +=m[i];
		}
		return sum; // �迭�ȿ� �ִ� ���� ���� ��ȯ 
	}
	static float arrayAvg(int[] m) {
//		int sum =0 ;
//		for (int i = 0; i < m.length; i++) {
//			sum +=m[i];
//		}// sum�� �迭�ȿ� �ִ� ���� ���� ���� 
//		return (float)sum/m.length; //(����ȯ) cast ������ 
	 return arraySum(m)/(float)m.length; // �޼ҵ带 �̿��� �����ϰ� ǥ�� 
	}
	public static void main(String[] args) {
		int[] m = {10,20,30,40,50}; // �迭 ����
		
		int sum = arraySum(m); // ��ȯ���� ���� ���� sum�� �� 
		
		float avg = arrayAvg(m); 
		System.out.println("�迭����� �հ�:" + sum); //sum�� ���
		System.out.println("�迭����� ���:" + avg); //avg�� ���
	}

}
