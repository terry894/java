package day5;

public class TestMain {

	public static void main(String[] args) {
		//���赵�� ������ ��ü�� ����� ����
		//Ŭ������ �������� ;
		//heap�� method�� ������ ����ȴ� 
		//stack��  �ּҰ��� ���� ���� p �� ���� �ȴ�
		Person p; //������ ���� 4byte
		p= new Person();
		System.out.println(p);
		//��ü�� ������ �ִ� ������ ���� �Ҵ� 
		p.name = "ȫ�浿";
		p.age = 20;
		p.eye = 2;
		p.norse = 1;
		p.mouth = 1;
		p.gender= "��";
		
		System.out.println("�̸�:" + p.name);
		System.out.println("����:" + p.age);
		System.out.println("��:" + p.eye);
		System.out.println("��:"+ p.norse);
		
	    p.eating();
	    p.thinking();
	
}
}
