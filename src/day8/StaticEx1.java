package day8;

public class StaticEx1 {
	public static void main(String[] args) {//�����޼ҵ� new�����ʾƵ� ���ٰ����� ��
		//public: ��𿡼��� �����ϴ�
		//static: �ν��Ͻ����� ���ٰ�����
		//void: ���ϰ��� ����
		//String[] args: args��� ���ڿ��� �Ű������� ���´�
//static������ �޼���� �ٷλ�밡�� SmartPhone.company
		SmartPhone.company = "�Ͽ���";
		SmartPhone sp;
		System.out.println(SmartPhone.company);//new �����ʾƵ� �̹� �޸𸮿� �ö�� 
	
		SmartPhone.playGame();
//		System.out.println(SmartPhone.productName);//���ٺҰ�
		SmartPhone sp1 = new SmartPhone("������ ��å10", "010-1234-5678","�ﾫ",1248500 );
		SmartPhone sp2 = new SmartPhone("����������", "010-1111-5678","�ﾫ",2248500 );
		
		sp1.send("010-2222-3333");
		
		System.out.println("����ȸ��: " + sp1.company);
		System.out.println("����ȸ��: " + sp2.company);
		
		sp1.company="����";
		
		
		System.out.println("----------------------");
		//�ν��Ͻ��� ���������� static ������ �������� �ϳ� ��� 
		System.out.println("����ȸ��: " + sp1.company);
		System.out.println("����ȸ��: " + sp2.company);
		
	}
}
