package day2;

//��� 
//�ݺ��� 
//���ǹ� 
public class StatementEx1 {
	public static void main(String[] args) {
		// ������ 3��
		// ctrl + shift + f �ڵ� �鿩����
		int a = 0;
		for (int i = 1; i <= 9; i++) // for�� (�ʱ��;���ǽ�;������){}
		// �ʱ�� : for������ ���� ������ �ʱⰪ�� �Ҵ�
		// ���ǽ� : ���ǽ��� ������� �������� true�̸�
		// ���๮���� �����ϰ� false�̸� ������ ����������
		// ������: for������ ���� ������ ����, ���� ó�� ���ش� .
		//�������� int i 
		{
			a++;
		//	System.out.println(a + " 3 * " + a + " = " + (3 * a));
			System.out.println(i + " 3 * " + i + " = " + (3 * i));
		}
		
		//System.out.println("i:" + i); �������� ���� ������ ����
		System.out.println("--------------");
		
		// 19�� 
		/*
		for ( int b =1 ; b<=19 ; b++)
		{
			for (int i = 1 ; i<=19 ; i++)
			System.out.println(b + " * " + i + " = " + (b * i));
			
		}
		
		
		for (int j =1 ; j <=100 ; j ++)
		{
			System.out.println(j);
			
		}
		*/
		int sum =0; 
		for( int i = 1; i<101; i++) {
			//sum = sum + i
			sum +=i; //sum�� �Լ��ؼ� ���� ���� ������Ŵ sum = sum + i
 		} 
		System.out.println("1���� 100�� ������ : " + sum);
		sum =0;
		for( int i = 1; i<101; i+=2) { // i = 1 ,3 ,5 ,7 ,9 ,11 ....
			
			//sum = sum + i
			sum +=i;
		}
		System.out.println("1���� 100�� Ȧ�� ������ : " + sum);
		
	}
}
