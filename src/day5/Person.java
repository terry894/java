package day5;
//class : object�� �����ϱ� ���� ���赵 

//1. member ����
//2. member method

//object : �繰
//��Ʋ -class
//�ؾ -��ü
public class Person {
	String name;
	int age;
	String gender;
	int eye;
	int norse;
	int mouth;

	// ������ : ��ü�� �ʱ�ȭ�� ���  ��������� ���ÿ� �ʱ�ȭ 
	// Ŭ������� ����
	// ����Ÿ���� ������ void Ű���嵵 ������� �ʴ´�. 
	// �ƹ��� �Ű������� ���� �����ڸ� �⺻������ 
	// ���� �������� ������ JVM�� ��� �⺻�ļ��ڴ� �����ϴ� ������ ���� 
	// �׺����� �⺻������ �ʱ�ȭ  ex) int=0 ,float=0.0f
	
	Person() { 
		name = "ȣ����";
		age = 100;
		eye = 2;
		norse = 1;
		mouth = 1;
		gender = "��";
		System.out.println("�̺κ��� ������....");
	}
	
	Person(String a ){//�ʱ�ȭ�� ���� �ϴ� ���
		name = a;
		eye = 2;
		norse = 1;
		mouth = 1;
		gender = "��";
		System.out.println("String �Ű������� ���� ������ ....");
		
	}
	
	Person(String a , int b)
	{
		name = a;
		age =b;
		eye = 2;
		norse = 1;
		mouth = 1;
		gender = "��";
		System.out.println("String �Ű������� 2�� ���� ������ ....");
		
	}

	void eating() {
		System.out.println("�ȳȳ�");
	}

	void talking() {
		System.out.println("�����,,����");
	}

	void thinking() {
		System.out.println("��������");
	}

}
