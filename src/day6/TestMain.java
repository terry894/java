package day6;
//import day5.Marine;//5���� ��Ű���� Ŭ������ ȣ��
//main�� Marin�ϰ� ctrl + shift + 5 �ؾ��� 

public class TestMain {
	public static void main(String[] args) {
//      day5.Marine m; �̷������ε� ��밡��	
		Marine m1 = new Marine(); // marine�� ���� ���� m1 
		Marine m2 = new Marine(); // marine�� �Ǵٸ� �������� m2 
		Medic me = new Medic();   // Medic�� ���� ���� me
		
		System.out.println("m2 :" + m2); // m2�� �ּҰ� ���
		m1.�����ϱ�(m2);  //m1 �޼��� attack�� ����Ǿ� m2�� hp�� ��� ����
		m2.status();
		
		me.ġ���ϱ�(m2); //me �޼��� heal�� ����ǿ� m2�� hp�� ȸ��
		m2.status();
		
		m1.�����ϱ�(me); // m1�� attack�� ����ؼ� me�� hp�� ��´�
		me.status();
	
		
		
		//medic
		//������  ������ ���� ġ���ϱ� �޼��� , ġ���
		
								
	}
}
