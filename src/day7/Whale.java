package day7;

public class Whale extends Mammal implements Flyable{
	//�������̽��� ������� ���� Ŭ�������� ����Ҽ��ִ�.
	Whale()
	{
		species = "Ǫ��";
		color = "�Ͼ��";
		tail = 1;
		age = 3;
		
	}
@Override
	public void eating() {
		System.out.println("���� �ȳ� ");
	}


@Override
	public void sleeping() {
		System.out.println("�ٴ������� ����");
	}
    public void swimming() {
    	System.out.println("��Ǫ��Ǫ");
    }
	@Override
	public void fly() {
		System.out.println("������ ��");
		// TODO Auto-generated method stub
		
	}
	
}
