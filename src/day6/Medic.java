package day6;

public class Medic {
//getter setter �� �̷�����ִ� Ŭ������ - JavaBean �� - VO 
	int hp, attack, sight, moveSpeed, attackSpeed, defence , heal ;
	int x, y;
	private int mp; //class�ȿ����� ��� �� �� �ִ� ����
    
	Medic() { //���� ���� �ʱ�ȭ �ϴ� ������
		heal = 5;
		hp = 100;
		mp =20;
		attack = 3;
		sight = 4;
		moveSpeed = 2;
		attackSpeed = 2;
		defence = 2;
		x = 0;
		y = 0;

	}
	void ġ���ϱ� (Marine x ){ // ������ ������ �޾� hp�� ���� ȸ�������ִ� ���� 
		
		mp -= 5;
		System.out.println("ġ���մϴ�");
		
		x.hp += heal ; // �ش� ��ü�� ���� ���� heal��ŭ hp�� �߰� 
		if(x.hp >100) // ���� 100�� �ѱ�ٸ� 100���� ����
			x.hp =100;
	}
	
	//�������콺 - source - generate getter setter - access modify
	
	public int getMp() {//���� ��ȯ �ϴ� ������ �ϴ� �޼���
		return this.mp; 
	}
	public void setMp(int mp) {//���� ���� �ϴ¿����� �ϴ� �޼���
		this.mp = mp;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	
	void status() // ���¸� ��Ÿ���� �޼���
	{
		System.out.println("ü��:" + hp );
		System.out.println("(x,y):" + x + " :" + y );
	    System.out.println("����:" + defence);
	}
	void �����ϱ�() {
		System.out.println("�ٹ��� �̻� ...");
	}
	void ��ġ���() {
		System.out.println("Hold....");
	}
}
