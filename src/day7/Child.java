package day7;

public class Child extends Parent{
	Child(){
		//overriding������ �޾Ѵµ� ���Ӱ� �ٽþ�
		super();//�θ��� �⺻ ������ ȣ�� 
		System.out.println("ChildŬ������ �⺻ ������");
	}
	@Override//�޼ҵ��̸��� �߸��� ��츦 �����ϱ����ؼ� ���
	//�����Ϸ��� �ش�޼ҵ尡 �մ��� �θ�� ���� ã�ƺ���.
	//����� �̸��� Ʋ���� �ַ��߻�
	//annotation�̶�� �Ѵ� 
	public void �뷡�θ���() {
		
		System.out.println("DNA~~~~~");
	}
	public void Ŭ������() {
		System.out.println("��¦��¦");
	}
}
