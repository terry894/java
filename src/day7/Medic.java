package day7;

public class Medic extends Terran{
//getter setter �� �̷�����ִ� Ŭ������ - JavaBean �� - VO 
    int heal;
	private int mp; //class�ȿ����� ��� �� �� �ִ� ����
    
	Medic() { //���� ���� �ʱ�ȭ �ϴ� ������
		heal = 5;
		hp = 100;
		mp =20;
		sight = 4;
		moveSpeed = 2;
		defence = 2;

	}
	void ġ���ϱ� (Terran x ){ // ������ ������ �޾� hp�� ���� ȸ�������ִ� ���� 
		
		mp -= 5;
		System.out.println("ġ���մϴ�");
		
		x.hp += heal ; // �ش� ��ü�� ���� ���� heal��ŭ hp�� �߰� 
		if(x.hp >100) // ���� 100�� �ѱ�ٸ� 100���� ����
			x.hp =100;
	}
	
	//�������콺 - source - generate getter setter - access modify
//	
//	public int getMp() {//���� ��ȯ �ϴ� ������ �ϴ� �޼���
//		return this.mp; 
//	}
//	public void setMp(int mp) {//���� ���� �ϴ¿����� �ϴ� �޼���
//		this.mp = mp;
//	}

}
