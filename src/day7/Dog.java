package day7;

public class Dog extends Mammal{
	String  name;
	int head;
	
	Dog()
	{
		species = "Ǫ��";
		name = "�����";
		color = "�Ͼ��";
		head = 1;
		tail = 1;
		age = 3;
		
	}
	
	@Override
	public void eating() {
		System.out.println("��� �ȳ� ");
	}
	
	@Override
	public void sleeping() {
		System.out.println("����");
	}
    public void running() {
    	System.out.println("����");
    }
	
}
