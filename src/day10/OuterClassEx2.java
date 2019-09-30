package day10;

public class OuterClassEx2 {
	private int a = 10;// new해야 쓸수있는 변수
	static int b = 20; // 외부에 잇는Static변수는 접근가능
	static final int C = 30;

//static 변수와 같은 위치 static
//Outer Class가 new하지 않아도 직접사용가능
//OuterClass가 new 해야 쓸수있는 변수는 접근X ex)a
//new 해야 쓸수있는 변수 = 인스턴스변수 
	static class InnerClass2 {

		int d = 40;
		// new 로 생성할수없기 때문에 heap 자체에 올라가지 않고 따라서 inner에서 생성한 static공간을 만들수없다.
		// static int e =50; 이너래스는 static변수를 독립적으로 가질수없다.
		static final int F = 60; // final 변수 = 상수

		public void print() {
//		System.out.println(" a: " + a); 
			System.out.println(" b: " + b);// 이너클래스은 아우터클래스의 변수 사용가능
			System.out.println(" c: " + C);
			System.out.println(" d: " + d);
//		System.out.println(" e: " + e);
			System.out.println(" f: " + F);

		}

		public static void main(String[] args) {
			InnerClass2 ic2 = new InnerClass2();
			ic2.print();
		}

	}
}
