package day7;

public class Rabit extends Mammal {

	int head;
	
	Rabit()
	{
		species = "����";
		color = "�Ͼ��";
		head = 1;
		tail = 1;
		age = 2;
	}
	
	void jumping() {
		System.out.println("���沱��");
	}
    @Override
	void eating() {
		System.out.println("�ȳ�");
	}
    

	@Override
	void sleeping() {
		System.out.println("����");
	}
}
