package day4;

public class MethodEx8 {
	static int add(int ... m)//add�޼ҵ� �����ε�
	//m�� �迭�� ����
	//�������� �޼��� - ���� ���������� �ʰ� �������� ���ö� ó���ϱ� ���ؼ�
	{
		int sum =0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i]; //�迭 �������� ���� ���ؾ� �ȴ�.
			
		}
		return sum;
	}
//	static int add(int a, int b, int c)
//	{
//		return a+b+c;
//	}
//	
//	static int add(int a, int b, int c, int d, int e)
//	{
//		
//		return a+b+c+d+e;
//		
	public static void main(String[] args) {
		System.out.println(add(100,200)); // return ���� �ٷ� ��µ� 
		System.out.println(add(100,200,300)); // return ���� �ٷ� ��µ� 
		System.out.println(add(100,200,300,400,500));
	}

}
