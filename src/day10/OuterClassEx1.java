package day10;

public class OuterClassEx1 {
	private int a =10;
	private int b =20;
	private final int C=30;
	//�ƿ�Ŀ Ŭ������ �̳� Ŭ������ ���� �Ұ�
	
	//��������� ������ġ�� ���� ����ϴ� 
	//Member inner Class
	class InnerClass{//innerŬ������ new�ؼ� ����Ҽ�����
		int d = 40;
		//new �� �����Ҽ����� ������ heap ��ü�� �ö��� �ʰ� ���� inner���� ������ static������ ���������.
//		static int e =50; �̳ʷ����� static������ ���������� ����������. 
		static final int F = 60; //final ���� = ���
		public void print() { 
			System.out.println(" a: " + a); //�̳�Ŭ������ �ƿ���Ŭ������ ���� ��밡�� 
			System.out.println(" b: " + b);
			System.out.println(" c: " + C);
			System.out.println(" d: " + d);
//			System.out.println(" e: " + e);
			System.out.println(" f: " + F);			
			
		}

		
		
	}
	public static void main(String[] args) {
		OuterClassEx1 oce = new OuterClassEx1();
		System.out.println(oce.a);
		
		
		OuterClassEx1.InnerClass ic = oce.new InnerClass();//�ȿ� �ִ� innerŬ���� ���� 
		//OterClassEx1.InnerClass ic = oce.new InnerClass();
		System.out.println(ic.d);
		ic.print();
	}

}
