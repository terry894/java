package day7;

public class Parent {
	String name, gender,job;
	int age;
	
	Parent(){
		System.out.println("부모의 기본 생성자");
	}
	
	Parent(String name ){
		this.name= name;
		System.out.println("부모의 매개변수 있는 생성자");
	}
	
	
	public void 노래부르기 () {
		System.out.println("내나이가 어때서 ~~~");
	}
	
	public void 숨쉬기() {
		System.out.println("후~");
	}
	
	public void 먹기()
	{
		System.out.println("쩝");
	}
	
	public void 잔소리하기() {
		System.out.println("맞는 말이지만 듣기 싫은 말");
	}
}
