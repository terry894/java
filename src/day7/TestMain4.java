package day7;

public class TestMain4 {
	public static void main(String[] args) {
		//Parent p1 = new Parent(); // stack - p1 heap - Parent�޼���� ����
		//Parent p1 ; // heap�� �޸� ������ ������ �ʱ� ����
		//Child c1 = new Child(); c1�̶�� �������� �޸� ����
		//p1 = c1; // �̷���� p1 �� heap�� �� �ִ� �޸𸮰� ���� 
		//Parent p1 = new Child(); // ��Ӱ����϶� �����ϴ� c1�̶�� �������� �޸� ����� new Parent()-> heap �޸� ����
		//g.c ���̻� �������� �ʴ� �޸𸮸� ó������
		//��ü����ȯ 
		//Child c1 = new Child();
		//Parent p2;
		//p2=c1; //�θ����� ������ �ڽ��� �������� �Ҵ� 
		//Child c2;
		//c2 = (Child)p2; // �ڽ��� �θ��� �������� ������ ������ (Child)�� ������ ����ȯ�ؼ� �����ϰ���  
		//c2.Ŭ������();// 
		
		Terran t;
		Marine m = new Marine();		
		Medic me = new Medic();
		Ghost g = new Ghost();
		
//		t=m;
//		t.�̵��ϱ�();
//		
//		System.out.println("------------");
//		t=me;
//		t.�̵��ϱ�();
		SiegeTank st = new SiegeTank();
		//t=m;
		System.out.println(m);
		st.�����ϱ�(m);
		st.�����ϱ�(me);
		st.�����ϱ�(g);
		
		me.ġ���ϱ�(m);
		me.ġ���ϱ�(me);
		me.ġ���ϱ�(st);
		
	}

}
