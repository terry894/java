package day6;

public class TestMain5 {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person("ȫ�浿",20,"��",175.0f,60.0f);
		// person �����ڰ� ����������� 
		//"ȫ�浿",20,"��",175.0f,60.0f �� �ʱ�ȭ�� �������� p2
		System.out.println(p1.name);// p1 ���������� ����Ű�� ������� name ȣ��
	    System.out.println(p2.name);
	    System.out.println(p2.cm);
	 	
	}

}
