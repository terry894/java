package day2;

public class StatementEx8 {
	public static void main(String[] args) {
		int kor = 80;
		int eng = 70;
		int mat = 20;
		int sum = kor + eng + mat; // �հ�
		float avg = sum / 3.0f; // float Ÿ���� ������ ������ �����ϱ⶧���� int�� ���� ��ū ���� ���� �� �� ����
		// 3.0f(�����°��� �Ǽ�)�� �����ϸ� sum�� float�� �������� �ʾƵ� �Ǽ��� ��� ����
		System.out.println("����:" + sum);
		System.out.println("���:" + avg);

		// ��� 60�� �̻��̸� �հ� �ƴϸ� ���հ�
		// ��Ȳ�� �ٶ� �ٸ� ������ �����Ͼ� �� ���
        // ���� �б⹮
		/*
		if(����) {
			����1;
		}else if {
			����2;
		} else {
			����3 
		}
		*/
		if( avg>= 60) // ���� ����� 60�� �Ѵ´ٸ� �հ�, �ƴϸ� ���հ�
		{
			System.out.println("����� �հ��Դϴ�."); //�հ��Դϴ� ���
		}
		else {
			System.out.println("����� ���հ��Դϴ�."); //���հ��Դϴ� ���
		}
	

	}
}
