



package day7;
//implements Flyable �̶�� �������̽��� �ο� 
public class Horse extends Mammal implements Flyable{
	
	@Override//������ �ش���� ������ ����
	public void eating() {
		System.out.println("������ �ȳ�");
	}
	
	@Override
	public void sleeping() {
		System.out.println("���� �ڿ�");
	}
	
	
	
	public void runnung() {
		System.out.println("������~~");
	}

	@Override
	public void fly() {
		System.out.println("�޷��޷� ���ƿ�");
		// TODO Auto-generated method stub
		
	}

}
