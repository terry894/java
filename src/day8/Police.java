package day8;

public class Police {
	String name;
	String position;
	int age;
	Weapon w;// A has a B �� ��� ��� 
	
	Police(){
		name ="������";
		position = "����";
		age =20;
	}
	
	Police(Weapon w){
		name ="������";
		position = "����";
		age =20;
		this.w = w;
        //this.g = g; // �����ڸ� ���� ���������� �ʱ�ȭ ���� ������ null���� �� ���� 
	}

	public void setW(Weapon w) { // ���߿� ������ �ְ� ������ setter��� 
		this.w = w;
	}

	public void Patrol(){
		System.out.println("�θ��� �θ���");
	}
	public void donutEating() {
		System.out.println("�ȳ�");
	}
	public void arrest() {
	System.out.println("����� ������� ���...");	
	}
	public void attack() {
		if(w!=null) w.fire();
		else System.out.println("�Ѿ��� ");
		//has a b �϶�
	    //��Ӵ�� ��� fire()w
//		System.out.println("����");
		}
	}
	
	
	

