package day8Hw;

public class Hw0906no5 {
	public static void main(String[] args) {
		Object ob1 = new Object();
		Object ob2 = new Object();
		
		System.out.println(ob2.toString());
		//ob2�ȿ� ����մ� �ּҰ�(���ڿ�)�� ��µȴ�
		if(ob1.equals(ob2)) {
			System.out.println("��ü�� �����ϴ�");
		}
		else {
			System.out.println("��ü�� �ٸ���");
		}
		//ob1 , ob2�� �ٸ� �ּҰ��� ������ �հ� �ٸ� ��ü�� ����Ű�� ������ �� ������ ���ϸ� ��ü�� �ٸ��� 
		
		if(ob1.toString().equals(ob2.toString())) 
		{
			System.out.println("��ü�� �����ϴ�");
		}
		else {
			System.out.println("��ü�� �ٸ���");
		}
		//ob1 , ob2�� �ٸ� �ּҰ��� ������ �հ� �ٸ� ��ü�� ����Ű�� ������ �ȿ� �ִ� �ּҰ��� �ٸ��� �������� ������ ��ü�� �ٸ���
		
		
	}

}
