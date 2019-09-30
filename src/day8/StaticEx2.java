package day8;

public class StaticEx2 {
	int a = 10;
	static int b = 20;

	static {//static 블록
		int c = 30;
		System.out.println("static block: " + c);
	}
	StaticEx2() {
		System.out.println("기본생성자");
	}
	static void print() {
		System.out.println("b:" + b);
	}
	//클래스를 읽을때 static메모리와 스테틱 블록 이랑 변수 메서드 들어온다

}
