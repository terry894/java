package day10;

public class OuterClassEx3 {
	private int a = 10;// new해야 쓸수있는 변수
	static int b = 20; // 외부에 잇는Static변수는 접근가능
	static final int C = 30;

	public void printAll() {
//		int k = 0; //지역변수	
	class LocalInnerClass {
			int d = 10;// new해야 쓸수있는 변수
//			static int e = 20; // 외부에 잇는Static변수는 접근가능
			static final int F = 30;
			public void print() {
			    System.out.println(" a: " + a); 
				System.out.println(" b: " + b);// 이너클래스은 아우터클래스의 변수 사용가능
				System.out.println(" c: " + C);
				System.out.println(" d: " + d);
              //System.out.println(" e: " + e);
				System.out.println(" f: " + F);

		}
	}
	//localinnerclass는 메서드에 범위내에서만 생존할수잇다
	//사용도 매서드 범위내에서 사용
	LocalInnerClass lic = new LocalInnerClass();
	lic.print();
	}// printAll
	public static void main(String[] args) {
		OuterClassEx3 oce3 = new OuterClassEx3();
		oce3.printAll();
	}
	
}// outerclass
