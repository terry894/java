package day6;

public class Human {
	//�̸�,���� , ���� , ��ȭ��ȣ,����
    //�Ա�(), ���ϱ�(), ������(), ���º���()
	
	//ȫ�浿  20  ��  010-1234-578 ����
	
	int age;
	String name, sex, phone, job;
	
	Human(){
		name = "ȫ�浿";
		age = 20;
		sex = "��";
		phone = "010-1234-5678";
		job = "����";		
	}
	
    Human(int age, String name, String sex, String phone, String job) {
    	//���� ���콺 -> source ->generate .. using field �� ������� 
		this.age = age;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.job = job;
	}

//	Human(String name, int age, String phone, String job, String sex)
//	{ 
//		this.name = name;
//		this.age = age;
//		this.job = job;
//		this.phone = phone;
//		this.sex = sex;
//	}
	
	void eating() { //�Դ°��� ��Ÿ���� �޼���
		System.out.println("����");
	}
	
	void talking() { //���ϴ� �޼���
		System.out.println("��¼����¼��");
	}
	void breathing() { //������ �޼���
		System.out.println("����");
	}
	void status() { //���¸� ��Ÿ���� �޼���
		System.out.println("�̸�: " + name);
		System.out.println("����: " + job);
		System.out.println("����: " + age);
		System.out.println("��ȭ��ȣ: "  + phone);
	}
	
}
