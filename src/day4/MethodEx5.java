package day4;

public class MethodEx5 { // class s.
	static int add(int c, int d) { // method add s.
		System.out.println("c : " + c + ", d : " + d);
		c++; // (���� c�� 1�� ����)
		System.out.println("1 ������ c : " + c);
		return c + d; // ���� (c+d)���� ���� �޼��忡 ����
		// = // (int e = c+d) // retern e  
	}

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		System.out.println("a : " + a + ", b : " + b); // 100�� 200 
		int result = add(a, b); //result�� return�� c+d�� ����  
		System.out.println("a : " + a);  //100
		System.out.println("result : " + result); //300�� ��µ�  
	}
}


//call by name : �̸����� ȣ�� PrintStar();�Ű����� �ҷ�����
//Call by value: ���� �ǿ� ȣ�� add(100,200);���� �����ؼ� ȣ�� - ���� ������ ���� 
//�Ϲ� ������ ȣ�� ��  ��� ���� ������ ���� 
//Call by reference: arraySum(m): ���������� �ָ�� - ������ ���� heap�� �ִ� ������ ���Ҽ��� ���� 
//���� ������ ȣ�� �� ��� �޼ҵ� �ȿ��� ���� ������ �������� 