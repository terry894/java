package day6;

public class Marine {
	int hp, attack, sight, moveSpeed, attackSpeed, defence;
	int x,y;
	//�⺻�����ڴ� Ŭ�����̸��� �Ȱ��� �̸��� ������.
	//������ :��ü�� �ʱ�ȭ�� ����ϴ� �޼���
	public Marine() {
		hp = 100;
		attack = 3;
		sight = 4;
		moveSpeed = 2;
		attackSpeed = 2;
		defence = 2;
		x = 0;
		y = 0;
	}
	
	Marine(int hp) {
		//�⺻�����ڸ� �����ϰ�  
		this();//������ �ҷ��� 
		//�̰͸� �����ض�.
		this.hp = hp;
		//�⺻�����ڿ� ������ �������� ���� �ٲ� ���� ����. ������ ù���ο� �;� �Ѵ�.
	}
	
	Marine(int hp, int x, int y) { // ������ �����ε� 
		this(hp); // �ȿ� ���� �����ڸ� �ְ� �װ͸� �����ϰ� �������� �״�� �ض�.
		this.x=x;
		this.y=y;
//		this();
//		this.hp = hp;
//		this.x = x;
//		this.y = y;
	}
	
	void status()
	{//���¸� ��Ÿ���� �޼���
		System.out.print("ü��:" + hp + "\t");
		System.out.print("(x,y):" + x + " :" + y + "\t" );
	    System.out.print("����:" + defence);
	}
	
	
	void �����ϱ�(Marine x) // �Ű������� ���������� ����  �׷��� ���� ������ 
	{
	    System.out.println("�޼��� ������ Marine:" + x );	 // ���踦 �������ذͰ� ���� 
	    System.out.println("�ѶѶ�");
	    x.hp -= attack; 
	}
	void �����ϱ�(Medic x) { // Medic�� ���� �ϴ� �޼���
		System.out.println("�ѶѶ�~~");
		x.hp -= attack;
	}
	void �����ϱ�() {
		System.out.println("�ٹ��� �̻� ...");
	}
	void ��ġ���() {
		System.out.println("Hold....");
	}
	void ������() {
		moveSpeed += 3;
		attackSpeed +=3;
		System.out.println("�ѶѶ�~~");
	}
}
