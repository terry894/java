package day7;

public class Terran {

	int hp, sight, moveSpeed, attackSpeed, defence;
	int x,y;
	
	
	void status()
	{//���¸� ��Ÿ���� �޼���
		System.out.print("ü��:" + hp + "\t");
		System.out.print("(x,y):" + x + " :" + y + "\t" );
	    System.out.print("����:" + defence);
	}
	
	void �̵��ϱ�() {
		System.out.println("���깫��");
	}
	
	void �����ϱ�() {
		System.out.println("�ٹ��� �̻� ...");
	}
	void ��ġ���() {
		System.out.println("Hold....");
	}
}
