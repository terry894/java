package day6;

//��� �ڹٺ����� ��� �ʱ�ȭ �ؾߵȴ�.
public class SuperMan extends Person {
	int ��������;

	SuperMan() {
		// super(); //�θ��� �����ڸ� ȣ�� ���� ��ܿ� ������� ����������
		// �׻� �ڽ� �����ڴ� �θ� �����ڸ� ȣ��
		this.�������� = 1; // this. �� ����
		System.out.println("SuperMan �⺻ ������");
		// ��������� ����Ű�� this
//super.name = "��";//�θ� ����Ű�� Ű���� 

	}

	// PersonŬ������ Ȯ���� ������ �ִ��Ϳ� ����� �߰�
	// Person Ŭ������ ���� �޼��带 ������ ����
	SuperMan(String name, int age, int ��������) {
		super(name,age); //�θ��� �Ű����� �����ڸ� ȣ���Ѵ� 
		this.�������� = ��������;
		System.out.println("SuperMan �Ű����� 3��¥�� ������ ");
	}

	public void �����ϱ�() {
		System.out.println("������ ~~~~");
	}

	public void �������߻�() {
		System.out.println("����������~~");
	}

}
