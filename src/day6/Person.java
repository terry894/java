package day6;
//person Ŭ������ �ʱ�ȭ �ϰ� getter, setter ����
//�ڹ��� �ֻ��� Ŭ���� 
public class Person extends Object{
	//��� Ŭ������ ���� Ŭ������ Object�� �ִ� �������� 
	String name;
	String sex;
	int age;
	float cm;
	float kg;
	
	Person(){
		System.out.println("PersonŬ������ �⺻������");
	}//�Ű������� �ִ� �����ڰ� ������ ���� ����� �־�� �Ѵ�. 
	public Person(String name ,int age) {
		this.name = name ;
		this.age = age;
		System.out.println("�Ű����� 2��¥�� ������");
	}
	Person(String name, int age, String sex, float cm, float kg) {
		super(); //objectŬ������ ������ ȣ��, �����Ѵ�
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.cm = cm;
		this.kg = kg;
		System.out.println("PersonŬ������ �Ű����� ������");
	}//�Ű������� �ִ� ������ - ��������� �ʱ�ȭ ��  

	

}
