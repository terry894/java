package day7;

public class SiegeTank extends Terran{
     
	int attack; 
	//�⺻�����ڴ� Ŭ�����̸��� �Ȱ��� �̸��� ������.
	//������ :��ü�� �ʱ�ȭ�� ����ϴ� �޼���
	SiegeTank() {
		hp = 100;
		attack = 10;
	}
	
//	SiegeTank(int hp) {
//		//�⺻�����ڸ� �����ϰ�  
//		this();//������ �ҷ��� 
//		//�̰͸� �����ض�.
//		this.hp = hp;
//		//�⺻�����ڿ� ������ �������� ���� �ٲ� ���� ����. ������ ù���ο� �;� �Ѵ�.
//	}
	
//	SiegeTank(int hp, int x, int y) { // ������ �����ε� 
//		this(hp); // �ȿ� ���� �����ڸ� �ְ� �װ͸� �����ϰ� �������� �״�� �ض�.
//		this.x=x;
//		this.y=y;
//		this();
//		this.hp = hp;
//		this.x = x;
//		this.y = y;
//	}
	

	void �����ϱ�(Terran x) // �Ű������� ���������� ����  �׷��� ���� ������ 
	{ //�ڽ��� �������� �θ� ������ ���� ���� Terran x ���� 
	  //�̰� ���� �ٸ� ���ֵ� ���ݰ��� 
		//Medic x, Marine x �� ���� �޼ҵ� ���� �ʿ���� 
	    System.out.println(x);
	    x.hp -= attack; 
	    x.status();
	}



}

	

