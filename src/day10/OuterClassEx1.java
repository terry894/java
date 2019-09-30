package day10;

public class OuterClassEx1 {
	private int a =10;
	private int b =20;
	private final int C=30;
	//아우커 클래스는 이너 클래스에 접근 불가
	
	//멤버변수와 같은위치에 놓고 사용하는 
	//Member inner Class
	class InnerClass{//inner클래스는 new해서 사용할수없음
		int d = 40;
		//new 로 생성할수없기 때문에 heap 자체에 올라가지 않고 따라서 inner에서 생성한 static공간을 만들수없다.
//		static int e =50; 이너래스는 static변수를 독립적으로 가질수없다. 
		static final int F = 60; //final 변수 = 상수
		public void print() { 
			System.out.println(" a: " + a); //이너클래스은 아우터클래스의 변수 사용가능 
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
		
		
		OuterClassEx1.InnerClass ic = oce.new InnerClass();//안에 있는 inner클래스 사용법 
		//OterClassEx1.InnerClass ic = oce.new InnerClass();
		System.out.println(ic.d);
		ic.print();
	}

}
